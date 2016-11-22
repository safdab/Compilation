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

import org.xtext.compilation.whileComp.ExprNot;
import org.xtext.compilation.whileComp.ExprOr;
import org.xtext.compilation.whileComp.WhileCompPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.impl.ExprOrImpl#getExprNot <em>Expr Not</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.impl.ExprOrImpl#getExprOr <em>Expr Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprOrImpl extends MinimalEObjectImpl.Container implements ExprOr
{
  /**
   * The cached value of the '{@link #getExprNot() <em>Expr Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprNot()
   * @generated
   * @ordered
   */
  protected ExprNot exprNot;

  /**
   * The cached value of the '{@link #getExprOr() <em>Expr Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprOr()
   * @generated
   * @ordered
   */
  protected ExprOr exprOr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprOrImpl()
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
    return WhileCompPackage.Literals.EXPR_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot getExprNot()
  {
    return exprNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprNot(ExprNot newExprNot, NotificationChain msgs)
  {
    ExprNot oldExprNot = exprNot;
    exprNot = newExprNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_OR__EXPR_NOT, oldExprNot, newExprNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprNot(ExprNot newExprNot)
  {
    if (newExprNot != exprNot)
    {
      NotificationChain msgs = null;
      if (exprNot != null)
        msgs = ((InternalEObject)exprNot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_OR__EXPR_NOT, null, msgs);
      if (newExprNot != null)
        msgs = ((InternalEObject)newExprNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_OR__EXPR_NOT, null, msgs);
      msgs = basicSetExprNot(newExprNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_OR__EXPR_NOT, newExprNot, newExprNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr getExprOr()
  {
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprOr(ExprOr newExprOr, NotificationChain msgs)
  {
    ExprOr oldExprOr = exprOr;
    exprOr = newExprOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_OR__EXPR_OR, oldExprOr, newExprOr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprOr(ExprOr newExprOr)
  {
    if (newExprOr != exprOr)
    {
      NotificationChain msgs = null;
      if (exprOr != null)
        msgs = ((InternalEObject)exprOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_OR__EXPR_OR, null, msgs);
      if (newExprOr != null)
        msgs = ((InternalEObject)newExprOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCompPackage.EXPR_OR__EXPR_OR, null, msgs);
      msgs = basicSetExprOr(newExprOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.EXPR_OR__EXPR_OR, newExprOr, newExprOr));
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
      case WhileCompPackage.EXPR_OR__EXPR_NOT:
        return basicSetExprNot(null, msgs);
      case WhileCompPackage.EXPR_OR__EXPR_OR:
        return basicSetExprOr(null, msgs);
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
      case WhileCompPackage.EXPR_OR__EXPR_NOT:
        return getExprNot();
      case WhileCompPackage.EXPR_OR__EXPR_OR:
        return getExprOr();
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
      case WhileCompPackage.EXPR_OR__EXPR_NOT:
        setExprNot((ExprNot)newValue);
        return;
      case WhileCompPackage.EXPR_OR__EXPR_OR:
        setExprOr((ExprOr)newValue);
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
      case WhileCompPackage.EXPR_OR__EXPR_NOT:
        setExprNot((ExprNot)null);
        return;
      case WhileCompPackage.EXPR_OR__EXPR_OR:
        setExprOr((ExprOr)null);
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
      case WhileCompPackage.EXPR_OR__EXPR_NOT:
        return exprNot != null;
      case WhileCompPackage.EXPR_OR__EXPR_OR:
        return exprOr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprOrImpl