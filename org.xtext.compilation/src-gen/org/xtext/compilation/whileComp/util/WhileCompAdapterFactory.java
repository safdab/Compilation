/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.compilation.whileComp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.compilation.whileComp.WhileCompPackage
 * @generated
 */
public class WhileCompAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WhileCompPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileCompAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WhileCompPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileCompSwitch<Adapter> modelSwitch =
    new WhileCompSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseRead(Read object)
      {
        return createReadAdapter();
      }
      @Override
      public Adapter caseWrite(Write object)
      {
        return createWriteAdapter();
      }
      @Override
      public Adapter caseNop(Nop object)
      {
        return createNopAdapter();
      }
      @Override
      public Adapter caseAffectation(Affectation object)
      {
        return createAffectationAdapter();
      }
      @Override
      public Adapter caseNil2(Nil2 object)
      {
        return createNil2Adapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseCommands(Commands object)
      {
        return createCommandsAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExprAnd(ExprAnd object)
      {
        return createExprAndAdapter();
      }
      @Override
      public Adapter caseExprOr(ExprOr object)
      {
        return createExprOrAdapter();
      }
      @Override
      public Adapter caseExprNot(ExprNot object)
      {
        return createExprNotAdapter();
      }
      @Override
      public Adapter caseExprEq(ExprEq object)
      {
        return createExprEqAdapter();
      }
      @Override
      public Adapter caseVars(Vars object)
      {
        return createVarsAdapter();
      }
      @Override
      public Adapter caseExprs(Exprs object)
      {
        return createExprsAdapter();
      }
      @Override
      public Adapter caseExprSimple(ExprSimple object)
      {
        return createExprSimpleAdapter();
      }
      @Override
      public Adapter caseCons(Cons object)
      {
        return createConsAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseHd(Hd object)
      {
        return createHdAdapter();
      }
      @Override
      public Adapter caseTl(Tl object)
      {
        return createTlAdapter();
      }
      @Override
      public Adapter caseLexpr(Lexpr object)
      {
        return createLexprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Read
   * @generated
   */
  public Adapter createReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Write <em>Write</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Write
   * @generated
   */
  public Adapter createWriteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Nop <em>Nop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Nop
   * @generated
   */
  public Adapter createNopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Affectation
   * @generated
   */
  public Adapter createAffectationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Nil2 <em>Nil2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Nil2
   * @generated
   */
  public Adapter createNil2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Commands
   * @generated
   */
  public Adapter createCommandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.ExprAnd
   * @generated
   */
  public Adapter createExprAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.ExprOr
   * @generated
   */
  public Adapter createExprOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.ExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.ExprNot
   * @generated
   */
  public Adapter createExprNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.ExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.ExprEq
   * @generated
   */
  public Adapter createExprEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Vars
   * @generated
   */
  public Adapter createVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Exprs
   * @generated
   */
  public Adapter createExprsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.ExprSimple
   * @generated
   */
  public Adapter createExprSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Cons <em>Cons</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Cons
   * @generated
   */
  public Adapter createConsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Hd <em>Hd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Hd
   * @generated
   */
  public Adapter createHdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Tl <em>Tl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Tl
   * @generated
   */
  public Adapter createTlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.compilation.whileComp.Lexpr <em>Lexpr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.compilation.whileComp.Lexpr
   * @generated
   */
  public Adapter createLexprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WhileCompAdapterFactory
