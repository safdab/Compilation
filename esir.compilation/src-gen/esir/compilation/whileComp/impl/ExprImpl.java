/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp.impl;

import esir.compilation.whileComp.Expr;
import esir.compilation.whileComp.ExprAnd;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.WhileCompPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whileComp.impl.ExprImpl#getExprsimple <em>Exprsimple</em>}</li>
 *   <li>{@link esir.compilation.whileComp.impl.ExprImpl#getExprAnd <em>Expr And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExprsimple() <em>Exprsimple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprsimple()
   * @generated
   * @ordered
   */
  protected ExprSimple exprsimple;

  /**
   * The cached value of the '{@link #getExprAnd() <em>Expr And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprAnd()
   * @generated
   * @ordered
   */
  protected ExprAnd exprAnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhileCompPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprsimple()
  {
    return exprsimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprsimple(ExprSimple newExprsimple, NotificationChain msgs)
  {
    ExprSimple oldExprsimple = exprsimple;
    exprsimple = newExprsimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR__EXPRSIMPLE, oldExprsimple, newExprsimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprsimple(ExprSimple newExprsimple)
  {
    if (newExprsimple != exprsimple)
    {
      NotificationChain msgs = null;
      if (exprsimple != null)
        msgs = ((InternalEObject)exprsimple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR__EXPRSIMPLE, null, msgs);
      if (newExprsimple != null)
        msgs = ((InternalEObject)newExprsimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR__EXPRSIMPLE, null, msgs);
      msgs = basicSetExprsimple(newExprsimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR__EXPRSIMPLE, newExprsimple, newExprsimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd getExprAnd()
  {
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprAnd(ExprAnd newExprAnd, NotificationChain msgs)
  {
    ExprAnd oldExprAnd = exprAnd;
    exprAnd = newExprAnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR__EXPR_AND, oldExprAnd, newExprAnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprAnd(ExprAnd newExprAnd)
  {
    if (newExprAnd != exprAnd)
    {
      NotificationChain msgs = null;
      if (exprAnd != null)
        msgs = ((InternalEObject)exprAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR__EXPR_AND, null, msgs);
      if (newExprAnd != null)
        msgs = ((InternalEObject)newExprAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR__EXPR_AND, null, msgs);
      msgs = basicSetExprAnd(newExprAnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR__EXPR_AND, newExprAnd, newExprAnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileCompPackage.EXPR__EXPRSIMPLE:
        return basicSetExprsimple(null, msgs);
      case WhileCompPackage.EXPR__EXPR_AND:
        return basicSetExprAnd(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhileCompPackage.EXPR__EXPRSIMPLE:
        return getExprsimple();
      case WhileCompPackage.EXPR__EXPR_AND:
        return getExprAnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileCompPackage.EXPR__EXPRSIMPLE:
        setExprsimple((ExprSimple)newValue);
        return;
      case WhileCompPackage.EXPR__EXPR_AND:
        setExprAnd((ExprAnd)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhileCompPackage.EXPR__EXPRSIMPLE:
        setExprsimple((ExprSimple)null);
        return;
      case WhileCompPackage.EXPR__EXPR_AND:
        setExprAnd((ExprAnd)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhileCompPackage.EXPR__EXPRSIMPLE:
        return exprsimple != null;
      case WhileCompPackage.EXPR__EXPR_AND:
        return exprAnd != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
