/*
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.compilation.ide.contentassist.antlr.internal.InternalWhileCompParser;
import org.xtext.compilation.services.WhileCompGrammarAccess;

public class WhileCompParser extends AbstractContentAssistParser {

	@Inject
	private WhileCompGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalWhileCompParser createParser() {
		InternalWhileCompParser result = new InternalWhileCompParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAffectationAccess().getAlternatives_2(), "rule__Affectation__Alternatives_2");
					put(grammarAccess.getInputAccess().getAlternatives(), "rule__Input__Alternatives");
					put(grammarAccess.getOutputAccess().getAlternatives(), "rule__Output__Alternatives");
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getExprAndAccess().getAlternatives(), "rule__ExprAnd__Alternatives");
					put(grammarAccess.getExprOrAccess().getAlternatives(), "rule__ExprOr__Alternatives");
					put(grammarAccess.getExprNotAccess().getAlternatives(), "rule__ExprNot__Alternatives");
					put(grammarAccess.getExprEqAccess().getAlternatives(), "rule__ExprEq__Alternatives");
					put(grammarAccess.getVarsAccess().getAlternatives(), "rule__Vars__Alternatives");
					put(grammarAccess.getExprsAccess().getAlternatives(), "rule__Exprs__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getReadAccess().getGroup(), "rule__Read__Group__0");
					put(grammarAccess.getReadAccess().getGroup_2(), "rule__Read__Group_2__0");
					put(grammarAccess.getWriteAccess().getGroup(), "rule__Write__Group__0");
					put(grammarAccess.getWriteAccess().getGroup_2(), "rule__Write__Group_2__0");
					put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
					put(grammarAccess.getInputAccess().getGroup_0(), "rule__Input__Group_0__0");
					put(grammarAccess.getOutputAccess().getGroup_0(), "rule__Output__Group_0__0");
					put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
					put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
					put(grammarAccess.getForeachAccess().getGroup(), "rule__Foreach__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup_0(), "rule__ExprAnd__Group_0__0");
					put(grammarAccess.getExprAndAccess().getGroup_0_0(), "rule__ExprAnd__Group_0_0__0");
					put(grammarAccess.getExprOrAccess().getGroup_0(), "rule__ExprOr__Group_0__0");
					put(grammarAccess.getExprOrAccess().getGroup_0_0(), "rule__ExprOr__Group_0_0__0");
					put(grammarAccess.getExprNotAccess().getGroup_0(), "rule__ExprNot__Group_0__0");
					put(grammarAccess.getExprEqAccess().getGroup_0(), "rule__ExprEq__Group_0__0");
					put(grammarAccess.getExprEqAccess().getGroup_1(), "rule__ExprEq__Group_1__0");
					put(grammarAccess.getVarsAccess().getGroup_0(), "rule__Vars__Group_0__0");
					put(grammarAccess.getExprsAccess().getGroup_0(), "rule__Exprs__Group_0__0");
					put(grammarAccess.getExprsAccess().getGroup_0_0(), "rule__Exprs__Group_0_0__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3(), "rule__ExprSimple__Group_3__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_4(), "rule__ExprSimple__Group_4__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_5(), "rule__ExprSimple__Group_5__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_6(), "rule__ExprSimple__Group_6__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_7(), "rule__ExprSimple__Group_7__0");
					put(grammarAccess.getLexprAccess().getGroup(), "rule__Lexpr__Group__0");
					put(grammarAccess.getProgramAccess().getFunctionsAssignment(), "rule__Program__FunctionsAssignment");
					put(grammarAccess.getFunctionAccess().getFunctionAssignment_1(), "rule__Function__FunctionAssignment_1");
					put(grammarAccess.getFunctionAccess().getDefinitionAssignment_3(), "rule__Function__DefinitionAssignment_3");
					put(grammarAccess.getDefinitionAccess().getReadsAssignment_0(), "rule__Definition__ReadsAssignment_0");
					put(grammarAccess.getDefinitionAccess().getCommandsAssignment_2(), "rule__Definition__CommandsAssignment_2");
					put(grammarAccess.getDefinitionAccess().getWritesAssignment_4(), "rule__Definition__WritesAssignment_4");
					put(grammarAccess.getReadAccess().getVariableAssignment_1(), "rule__Read__VariableAssignment_1");
					put(grammarAccess.getReadAccess().getVariableAssignment_2_1(), "rule__Read__VariableAssignment_2_1");
					put(grammarAccess.getWriteAccess().getVariableAssignment_1(), "rule__Write__VariableAssignment_1");
					put(grammarAccess.getWriteAccess().getVariableAssignment_2_1(), "rule__Write__VariableAssignment_2_1");
					put(grammarAccess.getNopAccess().getNopAssignment(), "rule__Nop__NopAssignment");
					put(grammarAccess.getAffectationAccess().getAffectationAssignment_0(), "rule__Affectation__AffectationAssignment_0");
					put(grammarAccess.getAffectationAccess().getValeurAssignment_2_0(), "rule__Affectation__ValeurAssignment_2_0");
					put(grammarAccess.getAffectationAccess().getNilAssignment_2_1(), "rule__Affectation__NilAssignment_2_1");
					put(grammarAccess.getNil2Access().getNilAssignment(), "rule__Nil2__NilAssignment");
					put(grammarAccess.getInputAccess().getVariableAssignment_0_0(), "rule__Input__VariableAssignment_0_0");
					put(grammarAccess.getInputAccess().getInputAssignment_0_2(), "rule__Input__InputAssignment_0_2");
					put(grammarAccess.getInputAccess().getVariableAssignment_1(), "rule__Input__VariableAssignment_1");
					put(grammarAccess.getOutputAccess().getVariableAssignment_0_0(), "rule__Output__VariableAssignment_0_0");
					put(grammarAccess.getOutputAccess().getOutputAssignment_0_2(), "rule__Output__OutputAssignment_0_2");
					put(grammarAccess.getOutputAccess().getVariableAssignment_1(), "rule__Output__VariableAssignment_1");
					put(grammarAccess.getCommandsAccess().getCommandAssignment_0(), "rule__Commands__CommandAssignment_0");
					put(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1(), "rule__Commands__CommandsAssignment_1_1");
					put(grammarAccess.getCommandAccess().getCommandAssignment_0(), "rule__Command__CommandAssignment_0");
					put(grammarAccess.getCommandAccess().getCommandAssignment_1(), "rule__Command__CommandAssignment_1");
					put(grammarAccess.getCommandAccess().getCommandAssignment_2(), "rule__Command__CommandAssignment_2");
					put(grammarAccess.getCommandAccess().getCommandAssignment_3(), "rule__Command__CommandAssignment_3");
					put(grammarAccess.getCommandAccess().getCommandAssignment_4(), "rule__Command__CommandAssignment_4");
					put(grammarAccess.getCommandAccess().getCommandAssignment_5(), "rule__Command__CommandAssignment_5");
					put(grammarAccess.getForeachAccess().getExpr1Assignment_1(), "rule__Foreach__Expr1Assignment_1");
					put(grammarAccess.getForeachAccess().getExpr2Assignment_3(), "rule__Foreach__Expr2Assignment_3");
					put(grammarAccess.getForeachAccess().getCommandsAssignment_5(), "rule__Foreach__CommandsAssignment_5");
					put(grammarAccess.getIfAccess().getExprAssignment_1(), "rule__If__ExprAssignment_1");
					put(grammarAccess.getIfAccess().getCommands1Assignment_3(), "rule__If__Commands1Assignment_3");
					put(grammarAccess.getIfAccess().getCommands2Assignment_4_1(), "rule__If__Commands2Assignment_4_1");
					put(grammarAccess.getForAccess().getExprAssignment_1(), "rule__For__ExprAssignment_1");
					put(grammarAccess.getForAccess().getCommandsAssignment_3(), "rule__For__CommandsAssignment_3");
					put(grammarAccess.getWhileAccess().getExprAssignment_1(), "rule__While__ExprAssignment_1");
					put(grammarAccess.getWhileAccess().getCommandsAssignment_3(), "rule__While__CommandsAssignment_3");
					put(grammarAccess.getExprAccess().getExprsimpleAssignment_0(), "rule__Expr__ExprsimpleAssignment_0");
					put(grammarAccess.getExprAccess().getExprAndAssignment_1(), "rule__Expr__ExprAndAssignment_1");
					put(grammarAccess.getExprAndAccess().getExprOrAssignment_0_0_0(), "rule__ExprAnd__ExprOrAssignment_0_0_0");
					put(grammarAccess.getExprAndAccess().getExprAndAssignment_0_0_2(), "rule__ExprAnd__ExprAndAssignment_0_0_2");
					put(grammarAccess.getExprAndAccess().getExprOrAssignment_1(), "rule__ExprAnd__ExprOrAssignment_1");
					put(grammarAccess.getExprOrAccess().getExprNotAssignment_0_0_0(), "rule__ExprOr__ExprNotAssignment_0_0_0");
					put(grammarAccess.getExprOrAccess().getExprOrAssignment_0_0_2(), "rule__ExprOr__ExprOrAssignment_0_0_2");
					put(grammarAccess.getExprOrAccess().getExprNotAssignment_1(), "rule__ExprOr__ExprNotAssignment_1");
					put(grammarAccess.getExprNotAccess().getNotAssignment_0_0(), "rule__ExprNot__NotAssignment_0_0");
					put(grammarAccess.getExprNotAccess().getExprEqAssignment_0_1(), "rule__ExprNot__ExprEqAssignment_0_1");
					put(grammarAccess.getExprNotAccess().getExprEqAssignment_1(), "rule__ExprNot__ExprEqAssignment_1");
					put(grammarAccess.getExprEqAccess().getExprSimple1Assignment_0_0(), "rule__ExprEq__ExprSimple1Assignment_0_0");
					put(grammarAccess.getExprEqAccess().getExprSimple2Assignment_0_2(), "rule__ExprEq__ExprSimple2Assignment_0_2");
					put(grammarAccess.getExprEqAccess().getExprAssignment_1_1(), "rule__ExprEq__ExprAssignment_1_1");
					put(grammarAccess.getVarsAccess().getVariableAssignment_0_0(), "rule__Vars__VariableAssignment_0_0");
					put(grammarAccess.getVarsAccess().getVarsAssignment_0_2(), "rule__Vars__VarsAssignment_0_2");
					put(grammarAccess.getVarsAccess().getVariableAssignment_1(), "rule__Vars__VariableAssignment_1");
					put(grammarAccess.getExprsAccess().getExprAssignment_0_0_0(), "rule__Exprs__ExprAssignment_0_0_0");
					put(grammarAccess.getExprsAccess().getExprsAssignment_0_0_2(), "rule__Exprs__ExprsAssignment_0_0_2");
					put(grammarAccess.getExprsAccess().getExprAssignment_1(), "rule__Exprs__ExprAssignment_1");
					put(grammarAccess.getExprSimpleAccess().getNilAssignment_0(), "rule__ExprSimple__NilAssignment_0");
					put(grammarAccess.getExprSimpleAccess().getVariableAssignment_1(), "rule__ExprSimple__VariableAssignment_1");
					put(grammarAccess.getExprSimpleAccess().getSymbolAssignment_2(), "rule__ExprSimple__SymbolAssignment_2");
					put(grammarAccess.getExprSimpleAccess().getConsAssignment_3_1(), "rule__ExprSimple__ConsAssignment_3_1");
					put(grammarAccess.getExprSimpleAccess().getLexprAssignment_3_2(), "rule__ExprSimple__LexprAssignment_3_2");
					put(grammarAccess.getExprSimpleAccess().getListAssignment_4_1(), "rule__ExprSimple__ListAssignment_4_1");
					put(grammarAccess.getExprSimpleAccess().getLexprAssignment_4_2(), "rule__ExprSimple__LexprAssignment_4_2");
					put(grammarAccess.getExprSimpleAccess().getHdAssignment_5_1(), "rule__ExprSimple__HdAssignment_5_1");
					put(grammarAccess.getExprSimpleAccess().getExprAssignment_5_2(), "rule__ExprSimple__ExprAssignment_5_2");
					put(grammarAccess.getExprSimpleAccess().getTlAssignment_6_1(), "rule__ExprSimple__TlAssignment_6_1");
					put(grammarAccess.getExprSimpleAccess().getExprAssignment_6_2(), "rule__ExprSimple__ExprAssignment_6_2");
					put(grammarAccess.getExprSimpleAccess().getSymbolAssignment_7_1(), "rule__ExprSimple__SymbolAssignment_7_1");
					put(grammarAccess.getExprSimpleAccess().getLexprAssignment_7_2(), "rule__ExprSimple__LexprAssignment_7_2");
					put(grammarAccess.getNotAccess().getNotAssignment(), "rule__Not__NotAssignment");
					put(grammarAccess.getConsAccess().getConsAssignment(), "rule__Cons__ConsAssignment");
					put(grammarAccess.getListAccess().getListAssignment(), "rule__List__ListAssignment");
					put(grammarAccess.getHdAccess().getHdAssignment(), "rule__Hd__HdAssignment");
					put(grammarAccess.getTlAccess().getTlAssignment(), "rule__Tl__TlAssignment");
					put(grammarAccess.getLexprAccess().getExprAssignment_0(), "rule__Lexpr__ExprAssignment_0");
					put(grammarAccess.getLexprAccess().getLexprAssignment_1(), "rule__Lexpr__LexprAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalWhileCompParser typedParser = (InternalWhileCompParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WhileCompGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhileCompGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
