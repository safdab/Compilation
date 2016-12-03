/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import esir.compilation.whileComp.Affectation;
import esir.compilation.whileComp.Command;
import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Expr;
import esir.compilation.whileComp.ExprAnd;
import esir.compilation.whileComp.ExprEq;
import esir.compilation.whileComp.ExprNot;
import esir.compilation.whileComp.ExprOr;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.For;
import esir.compilation.whileComp.Foreach;
import esir.compilation.whileComp.Function;
import esir.compilation.whileComp.If;
import esir.compilation.whileComp.Lexpr;
import esir.compilation.whileComp.Nop;
import esir.compilation.whileComp.Not;
import esir.compilation.whileComp.Program;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.While;
import esir.compilation.whileComp.Write;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WhileCompGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    for (final Program e : _filter) {
      CharSequence _compile = this.compile(e, 1, 0, 0, 0, 0, 0);
      fsa.generateFile("result_output.whpp", _compile);
    }
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context, final String sortie, final int indentAll, final int indentFor, final int indentWhile, final int indentIf, final int indentForeach, final int indentAff) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    for (final Program e : _filter) {
      CharSequence _compile = this.compile(e, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
      fsa.generateFile(sortie, _compile);
    }
  }
  
  public CharSequence compile(final Program p, final int indentAll, final int indentFor, final int indentWhile, final int indentIf, final int indentForeach, final int indentAff) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _functions = p.getFunctions();
      for(final Function f : _functions) {
        CharSequence _compile = this.compile(f, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function c, final int indentAll, final int indentFor, final int indentWhile, final int indentIf, final int indentForeach, final int indentAff) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _function = c.getFunction();
    _builder.append(_function, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("read ");
    {
      Definition _definition = c.getDefinition();
      Read _read = _definition.getRead();
      EList<String> _variable = _read.getVariable();
      boolean _hasElements = false;
      for(final String param : _variable) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(param, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    Definition _definition_1 = c.getDefinition();
    Commands _commands = _definition_1.getCommands();
    String _compile = this.compile(_commands, indentAll, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    {
      Definition _definition_2 = c.getDefinition();
      Write _write = _definition_2.getWrite();
      EList<String> _variable_1 = _write.getVariable();
      boolean _hasElements_1 = false;
      for(final String param_1 : _variable_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" ,", "");
        }
        _builder.append(param_1, "");
      }
    }
    return _builder;
  }
  
  public String compile(final Commands coms, final int indentBase, final int indentAll, final int indentFor, final int indentWhile, final int indentIf, final int indentForeach, final int indentAff) {
    EList<Command> _commands = coms.getCommands();
    int _size = _commands.size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      Command _command = coms.getCommand();
      String _compile = this.compile(_command, indentBase, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
      String res = (_compile + ";\n");
      EList<Command> _commands_1 = coms.getCommands();
      int size = _commands_1.size();
      InputOutput.<Integer>println(Integer.valueOf(size));
      int i = 0;
      EList<Command> _commands_2 = coms.getCommands();
      for (final Command c : _commands_2) {
        if ((i == (size - 1))) {
          String _compile_1 = this.compile(c, indentBase, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
          String _plus = (res + _compile_1);
          res = _plus;
        } else {
          String _compile_2 = this.compile(c, indentBase, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
          String _plus_1 = (res + _compile_2);
          String _plus_2 = (_plus_1 + ";\n");
          res = _plus_2;
          i = (i + 1);
        }
      }
      return res;
    } else {
      Command _command_1 = coms.getCommand();
      String _compile_3 = this.compile(_command_1, indentBase, indentAll, indentFor, indentWhile, indentIf, indentForeach, indentAff);
      String res_1 = (_compile_3 + "");
      return res_1;
    }
  }
  
  public String compile(final Command c, final int indentBase, final int indentAll, final int indentFor, final int indentWhile, final int indentIf, final int indentForeach, final int indentAff) {
    EObject _command = c.getCommand();
    if ((_command instanceof Affectation)) {
      String decal = "";
      int i = 0;
      while ((i < indentAll)) {
        {
          decal = (decal + "\t");
          i = (i + 1);
        }
      }
      i = 0;
      while ((i < indentAff)) {
        {
          decal = (decal + "\t");
          i = (i + 1);
        }
      }
      EObject _command_1 = c.getCommand();
      String _compile = this.compile(((Affectation) _command_1));
      return (decal + _compile);
    }
    EObject _command_2 = c.getCommand();
    if ((_command_2 instanceof Nop)) {
      String decal_1 = "";
      int i_1 = 0;
      while ((i_1 < indentAll)) {
        {
          decal_1 = (decal_1 + "\t");
          i_1 = (i_1 + 1);
        }
      }
      return (decal_1 + "nop\n");
    }
    EObject _command_3 = c.getCommand();
    if ((_command_3 instanceof While)) {
      String decal_2 = "";
      int i_2 = 0;
      String _plus = (Integer.valueOf(indentAll) + " tab");
      InputOutput.<String>println(_plus);
      while ((i_2 < indentAll)) {
        {
          decal_2 = (decal_2 + "\t");
          i_2 = (i_2 + 1);
        }
      }
      i_2 = 0;
      while ((i_2 < indentWhile)) {
        {
          decal_2 = (decal_2 + "\t");
          i_2 = (i_2 + 1);
        }
      }
      EObject _command_4 = c.getCommand();
      Expr _expr = ((While) _command_4).getExpr();
      Object _compile_1 = this.compile(_expr);
      String _plus_1 = ((decal_2 + "while ") + _compile_1);
      String _plus_2 = (_plus_1 + " do\n");
      EObject _command_5 = c.getCommand();
      Commands _commands = ((While) _command_5).getCommands();
      Object _compile_2 = this.compile(_commands, indentBase, ((indentAll + indentBase) + indentWhile), indentFor, indentWhile, indentIf, indentForeach, indentAff);
      String _plus_3 = (_plus_2 + _compile_2);
      String _plus_4 = (_plus_3 + decal_2);
      String _plus_5 = (_plus_4 + "\n");
      String _plus_6 = (_plus_5 + decal_2);
      return (_plus_6 + "od\n");
    }
    EObject _command_6 = c.getCommand();
    if ((_command_6 instanceof For)) {
      String decal_3 = "";
      int i_3 = 0;
      while ((i_3 < indentAll)) {
        {
          decal_3 = (decal_3 + "\t");
          i_3 = (i_3 + 1);
        }
      }
      i_3 = 0;
      while ((i_3 < indentFor)) {
        {
          decal_3 = (decal_3 + "\t");
          i_3 = (i_3 + 1);
        }
      }
      EObject _command_7 = c.getCommand();
      Expr _expr_1 = ((For) _command_7).getExpr();
      Object _compile_3 = this.compile(_expr_1);
      String _plus_7 = ((decal_3 + "for ") + _compile_3);
      String _plus_8 = (_plus_7 + " do\n");
      EObject _command_8 = c.getCommand();
      Commands _commands_1 = ((For) _command_8).getCommands();
      Object _compile_4 = this.compile(_commands_1, indentBase, ((indentAll + indentBase) + indentFor), indentFor, indentWhile, indentIf, indentForeach, indentAff);
      String _plus_9 = (_plus_8 + _compile_4);
      String _plus_10 = (_plus_9 + decal_3);
      String _plus_11 = (_plus_10 + "\n");
      String _plus_12 = (_plus_11 + decal_3);
      return (_plus_12 + "od\n");
    }
    EObject _command_9 = c.getCommand();
    if ((_command_9 instanceof Foreach)) {
      String decal_4 = "";
      int i_4 = 0;
      while ((i_4 < indentAll)) {
        {
          decal_4 = (decal_4 + "\t");
          i_4 = (i_4 + 1);
        }
      }
      i_4 = 0;
      while ((i_4 < indentForeach)) {
        {
          decal_4 = (decal_4 + "\t");
          i_4 = (i_4 + 1);
        }
      }
      EObject _command_10 = c.getCommand();
      Expr _expr1 = ((Foreach) _command_10).getExpr1();
      Object _compile_5 = this.compile(_expr1);
      String _plus_13 = ((decal_4 + "foreach ") + _compile_5);
      String _plus_14 = (_plus_13 + " in ");
      EObject _command_11 = c.getCommand();
      Expr _expr2 = ((Foreach) _command_11).getExpr2();
      Object _compile_6 = this.compile(_expr2);
      String _plus_15 = (_plus_14 + _compile_6);
      String _plus_16 = (_plus_15 + " do\n");
      EObject _command_12 = c.getCommand();
      Commands _commands_2 = ((Foreach) _command_12).getCommands();
      Object _compile_7 = this.compile(_commands_2, indentBase, ((indentAll + indentBase) + indentForeach), indentFor, indentWhile, indentIf, indentForeach, indentAff);
      String _plus_17 = (_plus_16 + _compile_7);
      String _plus_18 = (_plus_17 + decal_4);
      String _plus_19 = (_plus_18 + "\n");
      String _plus_20 = (_plus_19 + decal_4);
      return (_plus_20 + "od\n");
    }
    EObject _command_13 = c.getCommand();
    if ((_command_13 instanceof If)) {
      String decal_5 = "";
      int i_5 = 0;
      while ((i_5 < indentAll)) {
        {
          decal_5 = (decal_5 + "\t");
          i_5 = (i_5 + 1);
        }
      }
      i_5 = 0;
      while ((i_5 < indentIf)) {
        {
          decal_5 = (decal_5 + "\t");
          i_5 = (i_5 + 1);
        }
      }
      EObject _command_14 = c.getCommand();
      Commands _commands2 = ((If) _command_14).getCommands2();
      boolean _notEquals = (!Objects.equal(_commands2, null));
      if (_notEquals) {
        EObject _command_15 = c.getCommand();
        Expr _expr_2 = ((If) _command_15).getExpr();
        Object _compile_8 = this.compile(_expr_2);
        String _plus_21 = ((decal_5 + "if ") + _compile_8);
        String _plus_22 = (_plus_21 + " then \n");
        EObject _command_16 = c.getCommand();
        Commands _commands1 = ((If) _command_16).getCommands1();
        Object _compile_9 = this.compile(_commands1, indentBase, ((indentAll + indentBase) + indentIf), indentFor, indentWhile, indentIf, indentForeach, indentAff);
        String _plus_23 = (_plus_22 + _compile_9);
        String _plus_24 = (_plus_23 + decal_5);
        String _plus_25 = (_plus_24 + "else \n");
        EObject _command_17 = c.getCommand();
        Commands _commands2_1 = ((If) _command_17).getCommands2();
        Object _compile_10 = this.compile(_commands2_1, indentBase, ((indentAll + indentBase) + indentIf), indentFor, indentWhile, indentIf, indentForeach, indentAff);
        String _plus_26 = (_plus_25 + _compile_10);
        String _plus_27 = (_plus_26 + decal_5);
        return (_plus_27 + "fi\n");
      } else {
        EObject _command_18 = c.getCommand();
        Expr _expr_3 = ((If) _command_18).getExpr();
        Object _compile_11 = this.compile(_expr_3);
        String _plus_28 = ((decal_5 + "if ") + _compile_11);
        String _plus_29 = (_plus_28 + " then \n");
        EObject _command_19 = c.getCommand();
        Commands _commands1_1 = ((If) _command_19).getCommands1();
        Object _compile_12 = this.compile(_commands1_1, indentBase, ((indentAll + indentBase) + indentIf), indentFor, indentWhile, indentIf, indentForeach, indentAff);
        String _plus_30 = (_plus_29 + _compile_12);
        String _plus_31 = (_plus_30 + decal_5);
        return (_plus_31 + "fi\n");
      }
    }
    return null;
  }
  
  public String compile(final Affectation aff) {
    EList<String> _affectations = aff.getAffectations();
    int _size = _affectations.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<String> _affectations_1 = aff.getAffectations();
      String _get = _affectations_1.get(0);
      String _plus = ("" + _get);
      String _plus_1 = (_plus + " := ");
      EList<Expr> _valeurs = aff.getValeurs();
      Expr _get_1 = _valeurs.get(0);
      Object _compile = this.compile(_get_1);
      return (_plus_1 + _compile);
    } else {
      EList<String> _affectations_2 = aff.getAffectations();
      final int size = _affectations_2.size();
      int i = 0;
      String res = "";
      while ((i < (size - 1))) {
        {
          String _res = res;
          EList<String> _affectations_3 = aff.getAffectations();
          String _get_2 = _affectations_3.get(i);
          String _plus_2 = (_get_2 + " ,");
          res = (_res + _plus_2);
          i = (i + 1);
        }
      }
      String _res = res;
      EList<String> _affectations_3 = aff.getAffectations();
      String _get_2 = _affectations_3.get(i);
      String _plus_2 = (_get_2 + " := ");
      res = (_res + _plus_2);
      i = 0;
      while ((i < (size - 1))) {
        {
          String _res_1 = res;
          EList<Expr> _valeurs_1 = aff.getValeurs();
          Expr _get_3 = _valeurs_1.get(i);
          Object _compile_1 = this.compile(_get_3);
          String _plus_3 = (_compile_1 + " ,");
          res = (_res_1 + _plus_3);
          i = (i + 1);
        }
      }
      String _res_1 = res;
      EList<Expr> _valeurs_1 = aff.getValeurs();
      Expr _get_3 = _valeurs_1.get(i);
      Object _compile_1 = this.compile(_get_3);
      res = (_res_1 + _compile_1);
      return res;
    }
  }
  
  public Object compile(final Expr expr) {
    ExprAnd _exprAnd = expr.getExprAnd();
    boolean _notEquals = (!Objects.equal(_exprAnd, null));
    if (_notEquals) {
      ExprAnd _exprAnd_1 = expr.getExprAnd();
      return this.compile(_exprAnd_1);
    } else {
      ExprSimple _exprsimple = expr.getExprsimple();
      return this.compile(_exprsimple);
    }
  }
  
  public Object compile(final ExprAnd expr) {
    ExprAnd _exprAnd = expr.getExprAnd();
    boolean _equals = Objects.equal(_exprAnd, null);
    if (_equals) {
      ExprOr _exprOr = expr.getExprOr();
      return this.compile(_exprOr);
    } else {
      ExprOr _exprOr_1 = expr.getExprOr();
      Object _compile = this.compile(_exprOr_1);
      String _plus = (_compile + " && ");
      ExprAnd _exprAnd_1 = expr.getExprAnd();
      Object _compile_1 = this.compile(_exprAnd_1);
      return (_plus + _compile_1);
    }
  }
  
  public Object compile(final ExprOr expr) {
    ExprOr _exprOr = expr.getExprOr();
    boolean _equals = Objects.equal(_exprOr, null);
    if (_equals) {
      ExprNot _exprNot = expr.getExprNot();
      return this.compile(_exprNot);
    } else {
      ExprNot _exprNot_1 = expr.getExprNot();
      Object _compile = this.compile(_exprNot_1);
      String _plus = (_compile + " || ");
      ExprOr _exprOr_1 = expr.getExprOr();
      Object _compile_1 = this.compile(_exprOr_1);
      return (_plus + _compile_1);
    }
  }
  
  public Object compile(final ExprNot expr) {
    Not _not = expr.getNot();
    boolean _notEquals = (!Objects.equal(_not, null));
    if (_notEquals) {
      ExprEq _exprEq = expr.getExprEq();
      Object _compile = this.compile(_exprEq);
      return ("!" + _compile);
    } else {
      ExprEq _exprEq_1 = expr.getExprEq();
      return this.compile(_exprEq_1);
    }
  }
  
  public Object compile(final ExprEq expr) {
    Expr _expr = expr.getExpr();
    boolean _notEquals = (!Objects.equal(_expr, null));
    if (_notEquals) {
      Expr _expr_1 = expr.getExpr();
      return this.compile(_expr_1);
    } else {
      ExprSimple _exprSimple1 = expr.getExprSimple1();
      String _compile = this.compile(_exprSimple1);
      String _plus = (_compile + "=?");
      ExprSimple _exprSimple2 = expr.getExprSimple2();
      String _compile_1 = this.compile(_exprSimple2);
      return (_plus + _compile_1);
    }
  }
  
  public String compile(final ExprSimple expr) {
    String ret = "";
    Lexpr _lexpr = expr.getLexpr();
    boolean _notEquals = (!Objects.equal(_lexpr, null));
    if (_notEquals) {
      String _ret = ret;
      String _valeur = expr.getValeur();
      String _plus = ("(" + _valeur);
      String _plus_1 = (_plus + " ");
      Lexpr _lexpr_1 = expr.getLexpr();
      Object _compile = this.compile(_lexpr_1);
      String _plus_2 = (_plus_1 + _compile);
      String _plus_3 = (_plus_2 + ")");
      ret = (_ret + _plus_3);
    } else {
      Expr _expr = expr.getExpr();
      boolean _notEquals_1 = (!Objects.equal(_expr, null));
      if (_notEquals_1) {
        String _ret_1 = ret;
        String _valeur_1 = expr.getValeur();
        String _plus_4 = ("(" + _valeur_1);
        String _plus_5 = (_plus_4 + " ");
        Expr _expr_1 = expr.getExpr();
        Object _compile_1 = this.compile(_expr_1);
        String _plus_6 = (_plus_5 + _compile_1);
        String _plus_7 = (_plus_6 + ")");
        ret = (_ret_1 + _plus_7);
      } else {
        String _valeur_2 = expr.getValeur();
        ret = _valeur_2;
      }
    }
    return ret;
  }
  
  public Object compile(final Lexpr expr) {
    Lexpr _lexpr = expr.getLexpr();
    boolean _notEquals = (!Objects.equal(_lexpr, null));
    if (_notEquals) {
      Expr _expr = expr.getExpr();
      Object _compile = this.compile(_expr);
      String _plus = (_compile + " ");
      Lexpr _lexpr_1 = expr.getLexpr();
      Object _compile_1 = this.compile(_lexpr_1);
      return (_plus + _compile_1);
    } else {
      Expr _expr_1 = expr.getExpr();
      return this.compile(_expr_1);
    }
  }
}
