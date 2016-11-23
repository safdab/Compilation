/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.compilation.whileComp.ExprEq;
import org.xtext.compilation.whileComp.ExprNot;
import org.xtext.compilation.whileComp.Not;
import org.xtext.compilation.whileComp.WhileCompPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.impl.ExprNotImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.impl.ExprNotImpl#getExprEq <em>Expr Eq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprNotImpl extends MinimalEObjectImpl.Container implements ExprNot
{
  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected Not not;

  /**
   * The cached value of the '{@link #getExprEq() <em>Expr Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprEq()
   * @generated
   * @ordered
   */
  protected ExprEq exprEq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotImpl()
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
    return WhileCompPackage.Literals.EXPR_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNot(Not newNot, NotificationChain msgs)
  {
    Not oldNot = not;
    not = newNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_NOT__NOT, oldNot, newNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(Not newNot)
  {
    if (newNot != not)
    {
      NotificationChain msgs = null;
      if (not != null)
        msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_NOT__NOT, null, msgs);
      if (newNot != null)
        msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_NOT__NOT, null, msgs);
      msgs = basicSetNot(newNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_NOT__NOT, newNot, newNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq getExprEq()
  {
    return exprEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprEq(ExprEq newExprEq, NotificationChain msgs)
  {
    ExprEq oldExprEq = exprEq;
    exprEq = newExprEq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_NOT__EXPR_EQ, oldExprEq, newExprEq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprEq(ExprEq newExprEq)
  {
    if (newExprEq != exprEq)
    {
      NotificationChain msgs = null;
      if (exprEq != null)
        msgs = ((InternalEObject)exprEq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_NOT__EXPR_EQ, null, msgs);
      if (newExprEq != null)
        msgs = ((InternalEObject)newExprEq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_NOT__EXPR_EQ, null, msgs);
      msgs = basicSetExprEq(newExprEq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_NOT__EXPR_EQ, newExprEq, newExprEq));
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
      case WhileCompPackage.EXPR_NOT__NOT:
        return basicSetNot(null, msgs);
      case WhileCompPackage.EXPR_NOT__EXPR_EQ:
        return basicSetExprEq(null, msgs);
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
      case WhileCompPackage.EXPR_NOT__NOT:
        return getNot();
      case WhileCompPackage.EXPR_NOT__EXPR_EQ:
        return getExprEq();
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
      case WhileCompPackage.EXPR_NOT__NOT:
        setNot((Not)newValue);
        return;
      case WhileCompPackage.EXPR_NOT__EXPR_EQ:
        setExprEq((ExprEq)newValue);
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
      case WhileCompPackage.EXPR_NOT__NOT:
        setNot((Not)null);
        return;
      case WhileCompPackage.EXPR_NOT__EXPR_EQ:
        setExprEq((ExprEq)null);
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
      case WhileCompPackage.EXPR_NOT__NOT:
        return not != null;
      case WhileCompPackage.EXPR_NOT__EXPR_EQ:
        return exprEq != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotImpl
