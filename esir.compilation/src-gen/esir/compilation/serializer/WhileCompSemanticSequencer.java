/*
 * generated by Xtext 2.10.0
 */
package esir.compilation.serializer;

import com.google.inject.Inject;
import esir.compilation.services.WhileCompGrammarAccess;
import esir.compilation.whileComp.Affectation;
import esir.compilation.whileComp.Command;
import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Cons;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Expr;
import esir.compilation.whileComp.ExprAnd;
import esir.compilation.whileComp.ExprEq;
import esir.compilation.whileComp.ExprNot;
import esir.compilation.whileComp.ExprOr;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.Exprs;
import esir.compilation.whileComp.For;
import esir.compilation.whileComp.Foreach;
import esir.compilation.whileComp.Function;
import esir.compilation.whileComp.Hd;
import esir.compilation.whileComp.If;
import esir.compilation.whileComp.Lexpr;
import esir.compilation.whileComp.List;
import esir.compilation.whileComp.Nil2;
import esir.compilation.whileComp.Nop;
import esir.compilation.whileComp.Not;
import esir.compilation.whileComp.Program;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.Tl;
import esir.compilation.whileComp.Vars;
import esir.compilation.whileComp.While;
import esir.compilation.whileComp.WhileCompPackage;
import esir.compilation.whileComp.Write;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class WhileCompSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WhileCompGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WhileCompPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WhileCompPackage.AFFECTATION:
				sequence_Affectation(context, (Affectation) semanticObject); 
				return; 
			case WhileCompPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case WhileCompPackage.COMMANDS:
				sequence_Commands(context, (Commands) semanticObject); 
				return; 
			case WhileCompPackage.CONS:
				sequence_Cons(context, (Cons) semanticObject); 
				return; 
			case WhileCompPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case WhileCompPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_AND:
				sequence_ExprAnd(context, (ExprAnd) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_EQ:
				sequence_ExprEq(context, (ExprEq) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_NOT:
				sequence_ExprNot(context, (ExprNot) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_OR:
				sequence_ExprOr(context, (ExprOr) semanticObject); 
				return; 
			case WhileCompPackage.EXPR_SIMPLE:
				sequence_ExprSimple(context, (ExprSimple) semanticObject); 
				return; 
			case WhileCompPackage.EXPRS:
				sequence_Exprs(context, (Exprs) semanticObject); 
				return; 
			case WhileCompPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case WhileCompPackage.FOREACH:
				sequence_Foreach(context, (Foreach) semanticObject); 
				return; 
			case WhileCompPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case WhileCompPackage.HD:
				sequence_Hd(context, (Hd) semanticObject); 
				return; 
			case WhileCompPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case WhileCompPackage.LEXPR:
				sequence_Lexpr(context, (Lexpr) semanticObject); 
				return; 
			case WhileCompPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case WhileCompPackage.NIL2:
				sequence_Nil2(context, (Nil2) semanticObject); 
				return; 
			case WhileCompPackage.NOP:
				sequence_Nop(context, (Nop) semanticObject); 
				return; 
			case WhileCompPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case WhileCompPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case WhileCompPackage.READ:
				sequence_Read(context, (Read) semanticObject); 
				return; 
			case WhileCompPackage.TL:
				sequence_Tl(context, (Tl) semanticObject); 
				return; 
			case WhileCompPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			case WhileCompPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			case WhileCompPackage.WRITE:
				sequence_Write(context, (Write) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Affectation returns Affectation
	 *
	 * Constraint:
	 *     (affectations+=VARIABLE affectations+=VARIABLE* (valeurs+=VARIABLE | nil+=Nil2) valeurs+=VARIABLE? (nil+=Nil2? valeurs+=VARIABLE?)*)
	 */
	protected void sequence_Affectation(ISerializationContext context, Affectation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (
	 *         command=Nop | 
	 *         command=Affectation | 
	 *         command=While | 
	 *         command=For | 
	 *         command=If | 
	 *         command=Foreach
	 *     )
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commands returns Commands
	 *
	 * Constraint:
	 *     (command=Command commands+=Command*)
	 */
	protected void sequence_Commands(ISerializationContext context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cons returns Cons
	 *
	 * Constraint:
	 *     cons='cons'
	 */
	protected void sequence_Cons(ISerializationContext context, Cons semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.CONS__CONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.CONS__CONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConsAccess().getConsConsKeyword_0(), semanticObject.getCons());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     (read=Read commands=Commands write=Write)
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.DEFINITION__READ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.DEFINITION__READ));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.DEFINITION__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.DEFINITION__COMMANDS));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.DEFINITION__WRITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.DEFINITION__WRITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getReadReadParserRuleCall_0_0(), semanticObject.getRead());
		feeder.accept(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_2_0(), semanticObject.getCommands());
		feeder.accept(grammarAccess.getDefinitionAccess().getWriteWriteParserRuleCall_4_0(), semanticObject.getWrite());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExprAnd returns ExprAnd
	 *
	 * Constraint:
	 *     ((exprOr=ExprOr exprAnd=ExprAnd) | exprOr=ExprOr)
	 */
	protected void sequence_ExprAnd(ISerializationContext context, ExprAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprEq returns ExprEq
	 *
	 * Constraint:
	 *     ((exprSimple1=ExprSimple exprSimple2=ExprSimple) | expr=Expr)
	 */
	protected void sequence_ExprEq(ISerializationContext context, ExprEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprNot returns ExprNot
	 *
	 * Constraint:
	 *     ((not=Not exprEq=ExprEq) | exprEq=ExprEq)
	 */
	protected void sequence_ExprNot(ISerializationContext context, ExprNot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprOr returns ExprOr
	 *
	 * Constraint:
	 *     ((exprNot=ExprNot exprOr=ExprOr) | exprNot=ExprNot)
	 */
	protected void sequence_ExprOr(ISerializationContext context, ExprOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprSimple returns ExprSimple
	 *
	 * Constraint:
	 *     (
	 *         nil=Nil2 | 
	 *         variable=VARIABLE | 
	 *         symbol=SYMBOL | 
	 *         (cons=Cons lexpr=Lexpr) | 
	 *         (list=List lexpr=Lexpr) | 
	 *         (hd=Hd expr=Expr) | 
	 *         (tl=Tl expr=Expr) | 
	 *         (symbol=SYMBOL lexpr=Lexpr)
	 *     )
	 */
	protected void sequence_ExprSimple(ISerializationContext context, ExprSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Expr
	 *
	 * Constraint:
	 *     (exprsimple=ExprSimple | exprAnd=ExprAnd)
	 */
	protected void sequence_Expr(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exprs returns Exprs
	 *
	 * Constraint:
	 *     ((expr=Expr exprs=Exprs) | expr=Expr)
	 */
	protected void sequence_Exprs(ISerializationContext context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     For returns For
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands)
	 */
	protected void sequence_For(ISerializationContext context, For semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOR__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOR__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOR__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Foreach returns Foreach
	 *
	 * Constraint:
	 *     (expr1=Expr expr2=Expr commands=Commands)
	 */
	protected void sequence_Foreach(ISerializationContext context, Foreach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR1));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__EXPR2));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FOREACH__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FOREACH__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForeachAccess().getExpr1ExprParserRuleCall_1_0(), semanticObject.getExpr1());
		feeder.accept(grammarAccess.getForeachAccess().getExpr2ExprParserRuleCall_3_0(), semanticObject.getExpr2());
		feeder.accept(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (function=SYMBOL definition=Definition)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FUNCTION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FUNCTION__FUNCTION));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.FUNCTION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.FUNCTION__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getFunctionSYMBOLTerminalRuleCall_1_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Hd returns Hd
	 *
	 * Constraint:
	 *     hd='hd'
	 */
	protected void sequence_Hd(ISerializationContext context, Hd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.HD__HD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.HD__HD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHdAccess().getHdHdKeyword_0(), semanticObject.getHd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     If returns If
	 *
	 * Constraint:
	 *     (expr=Expr commands1=Commands commands2=Commands?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lexpr returns Lexpr
	 *
	 * Constraint:
	 *     ((expr=Expr lexpr=Lexpr) | expr=Expr)
	 */
	protected void sequence_Lexpr(ISerializationContext context, Lexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     list='list'
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.LIST__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.LIST__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListAccess().getListListKeyword_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nil2 returns Nil2
	 *
	 * Constraint:
	 *     nil='nil'
	 */
	protected void sequence_Nil2(ISerializationContext context, Nil2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NIL2__NIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NIL2__NIL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNil2Access().getNilNilKeyword_0(), semanticObject.getNil());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nop returns Nop
	 *
	 * Constraint:
	 *     nop='nop'
	 */
	protected void sequence_Nop(ISerializationContext context, Nop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NOP__NOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NOP__NOP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopAccess().getNopNopKeyword_0(), semanticObject.getNop());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Not returns Not
	 *
	 * Constraint:
	 *     not='!'
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.NOT__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getNotExclamationMarkKeyword_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     functions+=Function+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Read returns Read
	 *
	 * Constraint:
	 *     (variable+=VARIABLE variable+=VARIABLE*)
	 */
	protected void sequence_Read(ISerializationContext context, Read semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tl returns Tl
	 *
	 * Constraint:
	 *     tl='tl'
	 */
	protected void sequence_Tl(ISerializationContext context, Tl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.TL__TL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.TL__TL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTlAccess().getTlTlKeyword_0(), semanticObject.getTl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vars returns Vars
	 *
	 * Constraint:
	 *     ((variable=VARIABLE vars=Vars) | variable=VARIABLE)
	 */
	protected void sequence_Vars(ISerializationContext context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     While returns While
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.WHILE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.WHILE__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileCompPackage.Literals.WHILE__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileCompPackage.Literals.WHILE__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Write returns Write
	 *
	 * Constraint:
	 *     (variable+=VARIABLE variable+=VARIABLE*)
	 */
	protected void sequence_Write(ISerializationContext context, Write semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
