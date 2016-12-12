/*
 * generated by Xtext 2.10.0
 */
package esir.compilation.generator

import esir.compilation.whileComp.Affectation
import esir.compilation.whileComp.Command
import esir.compilation.whileComp.Commands
import esir.compilation.whileComp.Expr
import esir.compilation.whileComp.ExprAnd
import esir.compilation.whileComp.ExprEq
import esir.compilation.whileComp.ExprNot
import esir.compilation.whileComp.ExprOr
import esir.compilation.whileComp.ExprSimple
import esir.compilation.whileComp.For
import esir.compilation.whileComp.Foreach
import esir.compilation.whileComp.Function
import esir.compilation.whileComp.If
import esir.compilation.whileComp.Lexpr
import esir.compilation.whileComp.Nop
import esir.compilation.whileComp.Program
import esir.compilation.whileComp.While
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WhileCompGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(typeof(Program))){
			fsa.generateFile("result_output.whpp",	e.compile(1,0,0,0,0,0))
		}
	}
	def doGenerate (Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String sortie, int indentAll, int indentFor, int indentWhile, int indentIf, int indentForeach, int indentAff) {
		for (e : resource.allContents.toIterable.filter(typeof(Program))){
			fsa.generateFile(sortie, e.compile(indentAll,indentFor,indentWhile,indentIf,indentForeach,indentAff))
		}
	}
	
	def compile (Program p, int indentAll,int indentFor, int indentWhile, int indentIf, int indentForeach, int indentAff){'''
		�FOR f : p.functions�
		�f.compile(indentAll,indentFor,indentWhile,indentIf,indentForeach,indentAff)�
		�ENDFOR�
		'''
	}
	
	def compile (Function c, int indentAll, int indentFor, int indentWhile, int indentIf, int indentForeach, int indentAff){'''
		function �c.function�:
		read �FOR param: c.definition.read.variable SEPARATOR ' ,'��param��ENDFOR�
		%
		�c.definition.commands.compile(indentAll,indentAll, indentFor,indentWhile,indentIf,indentForeach,indentAff)�
		%
		write �FOR param: c.definition.write.variable SEPARATOR ' ,'��param��ENDFOR�'''	
	}
	
	def compile(Commands coms,int indentBase,int indentAll, int indentFor, int indentWhile, int indentIf, int indentForeach, int indentAff){
//		if(coms.commands != null){
//			coms.commands.add(0,coms.command)
//		}
//		else{
//			coms.command.compile(indentAll)
//		}
//		'''
//		�FOR c: (coms.commands) SEPARATOR ' ;'��("	")��c.compile(indentAll)��ENDFOR�
//		'''
		if(coms.commands.size != 0){
			var res = coms.command.compile(indentBase,indentAll, indentFor,indentWhile,indentIf,indentForeach,indentAff)+" ;\n";
			var size = coms.commands.size;
			println(size);
			var i = 0;
			for(Command c : coms.commands){
				if(i == size - 1){
				res = res + c.compile(indentBase,indentAll,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"";
				}else{
				res = res + c.compile(indentBase,indentAll,indentFor,indentWhile,indentIf,indentForeach,indentAff) + " ;\n"
				i = i + 1;	
				}
			}
			return res;
		}else{
			var res = coms.command.compile(indentBase,indentAll,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"";
			return res;
		}
	}
	
	def compile(Command c, int indentBase,int indentAll,int indentFor, int indentWhile, int indentIf, int indentForeach, int indentAff){
		if(c.command instanceof Affectation){
			var decal ="";
			var i = 0;
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			i = 0;
			while(i < indentAff){
				decal = decal + "\t";
				i = i + 1;
			}
			return decal+(c.command as Affectation).compile
		}
		if(c.command instanceof Nop){
			var decal ="";
			var i = 0;
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			return (decal+"nop")
		}
		if(c.command instanceof While){
			var decal ="";
			var i = 0;
			println(indentAll+" tab")
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			i = 0;
			while(i < indentWhile){
				decal = decal + "\t";
				i = i + 1;
			}
			return (decal+"while "+ (c.command as While).expr.compile + " do\n"+(c.command as While).commands.compile(indentBase,indentAll+indentBase+indentWhile,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+decal+"od\n")
		}
		if(c.command instanceof For){
			var decal ="";
			var i = 0;
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			i = 0;
			while(i < indentFor){
				decal = decal + "\t";
				i = i + 1;
			}
			return (decal+"for "+ (c.command as For).expr.compile + " do\n"+(c.command as For).commands.compile(indentBase,indentAll+indentBase+indentFor,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+decal+"od\n")
		}
		if(c.command instanceof Foreach){
			var decal ="";
			var i = 0;
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			i = 0;
			while(i < indentForeach){
				decal = decal + "\t";
				i = i + 1;
			}
			return (decal+"foreach "+ (c.command as Foreach).expr1.compile +" in "+(c.command as Foreach).expr2.compile+ " do\n"+(c.command as Foreach).commands.compile(indentBase,indentAll+indentBase+indentForeach,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+decal+"od\n")
		}
		if(c.command instanceof If){
			var decal ="";
			var i = 0;
			while(i < indentAll){
				decal = decal + "\t";
				i = i + 1;
			}
			i = 0;
			while(i < indentIf){
				decal = decal + "\t";
				i = i + 1;
			}
			if((c.command as If).commands2 != null){
				return (decal+"if "+ (c.command as If).expr.compile +" then\n"+(c.command as If).commands1.compile(indentBase,indentAll+indentBase+indentIf,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+ decal + "else\n"+(c.command as If).commands2.compile(indentBase,indentAll+indentBase+indentIf,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+decal+ "fi\n")
			}else{
				return (decal+"if "+ (c.command as If).expr.compile +" then\n"+(c.command as If).commands1.compile(indentBase,indentAll+indentBase+indentIf,indentFor,indentWhile,indentIf,indentForeach,indentAff)+"\n"+decal+"fi\n")
			}
		}
	}
	
	def compile(Affectation aff){
//		'''
//		�FOR v: aff.affectations SEPARATOR ' ,'��v��ENDFOR� := �FOR v: aff.valeurs SEPARATOR ' ,'��v��ENDFOR�
//		'''	
		if(aff.affectations.size == 1){
			return ""+aff.affectations.get(0)+" := " + aff.valeurs.get(0).compile; 
		}else{
			val size = aff.affectations.size;
			var i = 0;
			var res = "";
			while (i < size-1){
				res += aff.affectations.get(i) + " ,";
				i = i + 1;
			}
			res += aff.affectations.get(i) + " := ";
			i = 0;
			while (i < size-1){
				res += aff.valeurs.get(i).compile + " ,";
				i = i + 1;
			}
			res += aff.valeurs.get(i).compile;
			return res;
		}
	}
	
	def compile(Expr expr){
	if (expr.exprAnd != null){
			return (expr.exprAnd.compile)
		}else{
			return (expr.exprsimple.compile)
		}
	}
	
	def compile(ExprAnd expr){
	if (expr.exprAnd == null){
			return (expr.exprOr.compile)
		}else{
			return (expr.exprOr.compile + " && " + expr.exprAnd.compile)
		}
	}
	
	def compile(ExprOr expr){
		if (expr.exprOr == null){
			return (expr.exprNot.compile)
		}else{
			return (expr.exprNot.compile + " || " + expr.exprOr.compile)
		}
	}
	
	def compile(ExprNot expr){
		if (expr.not != null){
			return ("!" + expr.exprEq.compile)
		}else{
			return (expr.exprEq.compile)
		}
	}
	
	def compile(ExprEq expr){
		if (expr.expr != null){
			return (expr.expr.compile())
		}else{
			return (expr.exprSimple1.compile + "=?" +expr.exprSimple2.compile)
		}
	}
	
	def compile(ExprSimple expr){
		var ret=""
		if(expr.lexpr != null){
			if(expr.valeur != null){
				ret+= "("+expr.valeur+" "+expr.lexpr.compile+")"
			} else {
				ret+= "("+expr.ope+" "+expr.lexpr.compile+")"
			}
		}
		else if(expr.expr != null){
			ret+= "("+expr.ope+" "+expr.expr.compile+")"
		}
		else{
			ret=expr.valeur
		}
		
/*		if(expr.nil != null){
			ret+= "nil"
		}
		if (expr.variable != null){
			ret+= (expr.variable)
		}
		if(expr.symbol != null && expr.lexpr == null){
			ret+=  (expr.symbol)
		}
		if (expr.cons != null){
			ret+=  ("(cons " + expr.lexpr.compile +")")
		}
		if (expr.list != null){
			ret+=  ("(list " + expr.lexpr.compile +")")
		}
		if (expr.hd != null){
			ret+=  ("(hd " + expr.expr.compile +")")
		}
		if (expr.tl != null){
			ret+=  ("(tl " + expr.expr.compile +")")
		}
		if (expr.symbol != null){
			ret+=  ("("+expr.symbol + expr.lexpr.compile +")")
		}*/
		return ret
	}
		 	
	def compile(Lexpr expr){
		if (expr.lexpr != null){
			return (expr.expr.compile() +" " +expr.lexpr.compile())
		}else{
			return (expr.expr.compile())
		}
	}
}