/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp.impl;

import esir.compilation.whileComp.Hd;
import esir.compilation.whileComp.WhileCompPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whileComp.impl.HdImpl#getHd <em>Hd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HdImpl extends MinimalEObjectImpl.Container implements Hd
{
  /**
   * The default value of the '{@link #getHd() <em>Hd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHd()
   * @generated
   * @ordered
   */
  protected static final String HD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHd() <em>Hd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHd()
   * @generated
   * @ordered
   */
  protected String hd = HD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HdImpl()
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
    return WhileCompPackage.Literals.HD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHd()
  {
    return hd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHd(String newHd)
  {
    String oldHd = hd;
    hd = newHd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCompPackage.HD__HD, oldHd, hd));
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
      case WhileCompPackage.HD__HD:
        return getHd();
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
      case WhileCompPackage.HD__HD:
        setHd((String)newValue);
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
      case WhileCompPackage.HD__HD:
        setHd(HD_EDEFAULT);
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
      case WhileCompPackage.HD__HD:
        return HD_EDEFAULT == null ? hd != null : !HD_EDEFAULT.equals(hd);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hd: ");
    result.append(hd);
    result.append(')');
    return result.toString();
  }

} //HdImpl
