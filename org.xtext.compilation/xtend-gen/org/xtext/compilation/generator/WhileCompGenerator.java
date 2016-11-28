/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.compilation.whileComp.Affectation;
import org.xtext.compilation.whileComp.Command;
import org.xtext.compilation.whileComp.Commands;
import org.xtext.compilation.whileComp.Cons;
import org.xtext.compilation.whileComp.Definition;
import org.xtext.compilation.whileComp.Expr;
import org.xtext.compilation.whileComp.ExprAnd;
import org.xtext.compilation.whileComp.ExprEq;
import org.xtext.compilation.whileComp.ExprNot;
import org.xtext.compilation.whileComp.ExprOr;
import org.xtext.compilation.whileComp.ExprSimple;
import org.xtext.compilation.whileComp.For;
import org.xtext.compilation.whileComp.Foreach;
import org.xtext.compilation.whileComp.Function;
import org.xtext.compilation.whileComp.Hd;
import org.xtext.compilation.whileComp.If;
import org.xtext.compilation.whileComp.Lexpr;
import org.xtext.compilation.whileComp.List;
import org.xtext.compilation.whileComp.Nil2;
import org.xtext.compilation.whileComp.Nop;
import org.xtext.compilation.whileComp.Not;
import org.xtext.compilation.whileComp.Program;
import org.xtext.compilation.whileComp.Read;
import org.xtext.compilation.whileComp.Tl;
import org.xtext.compilation.whileComp.While;
import org.xtext.compilation.whileComp.Write;

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
      CharSequence _compile = this.compile(e);
      fsa.generateFile("Result_output.whpp", _compile);
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _functions = p.getFunctions();
      for(final Function f : _functions) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _function = c.getFunction();
    _builder.append(_function, "");
    _builder.append(": ");
    _builder.newLineIfNotEmpty();
    {
      Definition _definition = c.getDefinition();
      EList<Read> _reads = _definition.getReads();
      for(final Read f : _reads) {
        _builder.append("read");
        {
          EList<String> _variable = f.getVariable();
          boolean _hasElements = false;
          for(final String param : _variable) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(" ");
            _builder.append(param, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("%");
    _builder.newLine();
    {
      Definition _definition_1 = c.getDefinition();
      EList<Command> _commands = _definition_1.getCommands();
      for(final Command f_1 : _commands) {
        CharSequence _compile = this.compile(((Command) f_1));
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("%");
    _builder.newLine();
    {
      Definition _definition_2 = c.getDefinition();
      EList<Write> _writes = _definition_2.getWrites();
      for(final Write f_2 : _writes) {
        _builder.append("write");
        {
          EList<String> _variable_1 = f_2.getVariable();
          boolean _hasElements_1 = false;
          for(final String param_1 : _variable_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(" ");
            _builder.append(param_1, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Commands coms) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t", "");
    Command _command = coms.getCommand();
    Object _compile = this.compile(_command);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = coms.getCommands();
      for(final Command c : _commands) {
        _builder.append(" ;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _compile_1 = this.compile(c);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Command c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _command = c.getCommand();
      if ((_command instanceof Affectation)) {
        {
          EObject _command_1 = c.getCommand();
          Nil2 _nil = ((Affectation) _command_1).getNil();
          if ((_nil instanceof Nil2)) {
            _builder.append("\t", "");
            EObject _command_2 = c.getCommand();
            String _affectation = ((Affectation) _command_2).getAffectation();
            _builder.append(_affectation, "");
            _builder.append(" := ");
            EObject _command_3 = c.getCommand();
            Nil2 _nil_1 = ((Affectation) _command_3).getNil();
            String _nil_2 = _nil_1.getNil();
            _builder.append(_nil_2, "");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t", "");
            EObject _command_4 = c.getCommand();
            String _affectation_1 = ((Affectation) _command_4).getAffectation();
            _builder.append(_affectation_1, "");
            _builder.append(" := ");
            EObject _command_5 = c.getCommand();
            String _valeur = ((Affectation) _command_5).getValeur();
            _builder.append(_valeur, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EObject _command_6 = c.getCommand();
      if ((_command_6 instanceof Nop)) {
        _builder.append("\t", "");
        _builder.append("nop");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_7 = c.getCommand();
      if ((_command_7 instanceof While)) {
        _builder.append("\t", "");
        _builder.append("while ");
        EObject _command_8 = c.getCommand();
        Expr _expr = ((While) _command_8).getExpr();
        CharSequence _compile = this.compile(_expr);
        _builder.append(_compile, "");
        _builder.append("\tdo");
        _builder.newLineIfNotEmpty();
        EObject _command_9 = c.getCommand();
        Commands _commands = ((While) _command_9).getCommands();
        CharSequence _compile_1 = this.compile(_commands);
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_10 = c.getCommand();
      if ((_command_10 instanceof For)) {
        _builder.append("\t", "");
        _builder.append("For ");
        EObject _command_11 = c.getCommand();
        Expr _expr_1 = ((For) _command_11).getExpr();
        CharSequence _compile_2 = this.compile(_expr_1);
        _builder.append(_compile_2, "");
        _builder.append("\tdo");
        _builder.newLineIfNotEmpty();
        EObject _command_12 = c.getCommand();
        Commands _commands_1 = ((For) _command_12).getCommands();
        CharSequence _compile_3 = this.compile(_commands_1);
        _builder.append(_compile_3, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_13 = c.getCommand();
      if ((_command_13 instanceof Foreach)) {
        _builder.append("\t", "");
        _builder.append("foreach ");
        EObject _command_14 = c.getCommand();
        Expr _expr1 = ((Foreach) _command_14).getExpr1();
        CharSequence _compile_4 = this.compile(_expr1);
        _builder.append(_compile_4, "");
        _builder.append(" in ");
        EObject _command_15 = c.getCommand();
        Expr _expr2 = ((Foreach) _command_15).getExpr2();
        CharSequence _compile_5 = this.compile(_expr2);
        _builder.append(_compile_5, "");
        _builder.append("\tdo");
        _builder.newLineIfNotEmpty();
        EObject _command_16 = c.getCommand();
        Commands _commands_2 = ((Foreach) _command_16).getCommands();
        CharSequence _compile_6 = this.compile(_commands_2);
        _builder.append(_compile_6, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("od");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EObject _command_17 = c.getCommand();
      if ((_command_17 instanceof If)) {
        _builder.append("\t", "");
        _builder.append("if ");
        EObject _command_18 = c.getCommand();
        Expr _expr_2 = ((If) _command_18).getExpr();
        CharSequence _compile_7 = this.compile(_expr_2);
        _builder.append(_compile_7, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t", "");
        _builder.append("then ");
        _builder.newLineIfNotEmpty();
        EObject _command_19 = c.getCommand();
        Commands _commands1 = ((If) _command_19).getCommands1();
        CharSequence _compile_8 = this.compile(_commands1);
        _builder.append(_compile_8, "");
        _builder.newLineIfNotEmpty();
        {
          EObject _command_20 = c.getCommand();
          Commands _commands2 = ((If) _command_20).getCommands2();
          boolean _notEquals = (!Objects.equal(_commands2, null));
          if (_notEquals) {
            _builder.append("\t", "");
            _builder.append("else ");
            _builder.newLineIfNotEmpty();
            EObject _command_21 = c.getCommand();
            Commands _commands2_1 = ((If) _command_21).getCommands2();
            CharSequence _compile_9 = this.compile(_commands2_1);
            _builder.append(_compile_9, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t", "");
        _builder.append("fi");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Expr expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ExprAnd _exprAnd = expr.getExprAnd();
      boolean _notEquals = (!Objects.equal(_exprAnd, null));
      if (_notEquals) {
        ExprAnd _exprAnd_1 = expr.getExprAnd();
        CharSequence _compile = this.compile(_exprAnd_1);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      ExprSimple _exprsimple = expr.getExprsimple();
      boolean _notEquals_1 = (!Objects.equal(_exprsimple, null));
      if (_notEquals_1) {
        ExprSimple _exprsimple_1 = expr.getExprsimple();
        CharSequence _compile_1 = this.compile(_exprsimple_1);
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprAnd expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ExprAnd _exprAnd = expr.getExprAnd();
      boolean _equals = Objects.equal(_exprAnd, null);
      if (_equals) {
        ExprOr _exprOr = expr.getExprOr();
        CharSequence _compile = this.compile(_exprOr);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      } else {
        ExprOr _exprOr_1 = expr.getExprOr();
        CharSequence _compile_1 = this.compile(_exprOr_1);
        _builder.append(_compile_1, "");
        _builder.append(" && ");
        ExprAnd _exprAnd_1 = expr.getExprAnd();
        Object _compile_2 = this.compile(_exprAnd_1);
        _builder.append(_compile_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprOr expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ExprOr _exprOr = expr.getExprOr();
      boolean _equals = Objects.equal(_exprOr, null);
      if (_equals) {
        ExprNot _exprNot = expr.getExprNot();
        CharSequence _compile = this.compile(_exprNot);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      } else {
        ExprNot _exprNot_1 = expr.getExprNot();
        CharSequence _compile_1 = this.compile(_exprNot_1);
        _builder.append(_compile_1, "");
        _builder.append(" || ");
        ExprOr _exprOr_1 = expr.getExprOr();
        Object _compile_2 = this.compile(_exprOr_1);
        _builder.append(_compile_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprNot expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Not _not = expr.getNot();
      boolean _notEquals = (!Objects.equal(_not, null));
      if (_notEquals) {
        _builder.append("!");
        ExprEq _exprEq = expr.getExprEq();
        CharSequence _compile = this.compile(_exprEq);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      } else {
        ExprEq _exprEq_1 = expr.getExprEq();
        CharSequence _compile_1 = this.compile(_exprEq_1);
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprEq expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _expr = expr.getExpr();
      boolean _notEquals = (!Objects.equal(_expr, null));
      if (_notEquals) {
        _builder.append("(");
        Expr _expr_1 = expr.getExpr();
        Object _compile = this.compile(_expr_1);
        _builder.append(_compile, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        ExprSimple _exprSimple1 = expr.getExprSimple1();
        CharSequence _compile_1 = this.compile(_exprSimple1);
        _builder.append(_compile_1, "");
        _builder.append(" =? ");
        ExprSimple _exprSimple2 = expr.getExprSimple2();
        CharSequence _compile_2 = this.compile(_exprSimple2);
        _builder.append(_compile_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprSimple expr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Nil2 _nil = expr.getNil();
      boolean _notEquals = (!Objects.equal(_nil, null));
      if (_notEquals) {
        _builder.append("nil");
        _builder.newLine();
      }
    }
    {
      String _variable = expr.getVariable();
      boolean _notEquals_1 = (!Objects.equal(_variable, null));
      if (_notEquals_1) {
        String _variable_1 = expr.getVariable();
        _builder.append(_variable_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if (((!Objects.equal(expr.getSymbol(), null)) && Objects.equal(expr.getLexpr(), null))) {
        String _symbol = expr.getSymbol();
        _builder.append(_symbol, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Cons _cons = expr.getCons();
      boolean _notEquals_2 = (!Objects.equal(_cons, null));
      if (_notEquals_2) {
        _builder.append("(cons ");
        Lexpr _lexpr = expr.getLexpr();
        CharSequence _compile = this.compile(_lexpr);
        _builder.append(_compile, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List _list = expr.getList();
      boolean _notEquals_3 = (!Objects.equal(_list, null));
      if (_notEquals_3) {
        _builder.append("(list ");
        Lexpr _lexpr_1 = expr.getLexpr();
        CharSequence _compile_1 = this.compile(_lexpr_1);
        _builder.append(_compile_1, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Hd _hd = expr.getHd();
      boolean _notEquals_4 = (!Objects.equal(_hd, null));
      if (_notEquals_4) {
        _builder.append("(hd ");
        Expr _expr = expr.getExpr();
        Object _compile_2 = this.compile(_expr);
        _builder.append(_compile_2, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Tl _tl = expr.getTl();
      boolean _notEquals_5 = (!Objects.equal(_tl, null));
      if (_notEquals_5) {
        _builder.append("(tl ");
        Expr _expr_1 = expr.getExpr();
        Object _compile_3 = this.compile(_expr_1);
        _builder.append(_compile_3, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      String _symbol_1 = expr.getSymbol();
      boolean _notEquals_6 = (!Objects.equal(_symbol_1, null));
      if (_notEquals_6) {
        _builder.append("(");
        String _symbol_2 = expr.getSymbol();
        _builder.append(_symbol_2, "");
        _builder.append(" ");
        Lexpr _lexpr_2 = expr.getLexpr();
        CharSequence _compile_4 = this.compile(_lexpr_2);
        _builder.append(_compile_4, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Lexpr expr) {
    StringConcatenation _builder = new StringConcatenation();
    Expr _expr = expr.getExpr();
    Object _compile = this.compile(_expr);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    {
      Lexpr _lexpr = expr.getLexpr();
      boolean _notEquals = (!Objects.equal(_lexpr, null));
      if (_notEquals) {
        Lexpr _lexpr_1 = expr.getLexpr();
        Object _compile_1 = this.compile(_lexpr_1);
        _builder.append(_compile_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
