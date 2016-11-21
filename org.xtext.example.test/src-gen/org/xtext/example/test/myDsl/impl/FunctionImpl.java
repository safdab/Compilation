/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.test.myDsl.Command;
import org.xtext.example.test.myDsl.Function;
import org.xtext.example.test.myDsl.MyDslPackage;
import org.xtext.example.test.myDsl.Read;
import org.xtext.example.test.myDsl.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.test.myDsl.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.test.myDsl.impl.FunctionImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link org.xtext.example.test.myDsl.impl.FunctionImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.xtext.example.test.myDsl.impl.FunctionImpl#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReads() <em>Reads</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReads()
   * @generated
   * @ordered
   */
  protected EList<Read> reads;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getWrites() <em>Writes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrites()
   * @generated
   * @ordered
   */
  protected EList<Write> writes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return MyDslPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Read> getReads()
  {
    if (reads == null)
    {
      reads = new EObjectContainmentEList<Read>(Read.class, this, MyDslPackage.FUNCTION__READS);
    }
    return reads;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, MyDslPackage.FUNCTION__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Write> getWrites()
  {
    if (writes == null)
    {
      writes = new EObjectContainmentEList<Write>(Write.class, this, MyDslPackage.FUNCTION__WRITES);
    }
    return writes;
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
      case MyDslPackage.FUNCTION__READS:
        return ((InternalEList<?>)getReads()).basicRemove(otherEnd, msgs);
      case MyDslPackage.FUNCTION__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case MyDslPackage.FUNCTION__WRITES:
        return ((InternalEList<?>)getWrites()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.FUNCTION__NAME:
        return getName();
      case MyDslPackage.FUNCTION__READS:
        return getReads();
      case MyDslPackage.FUNCTION__COMMANDS:
        return getCommands();
      case MyDslPackage.FUNCTION__WRITES:
        return getWrites();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.FUNCTION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.FUNCTION__READS:
        getReads().clear();
        getReads().addAll((Collection<? extends Read>)newValue);
        return;
      case MyDslPackage.FUNCTION__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case MyDslPackage.FUNCTION__WRITES:
        getWrites().clear();
        getWrites().addAll((Collection<? extends Write>)newValue);
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
      case MyDslPackage.FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.FUNCTION__READS:
        getReads().clear();
        return;
      case MyDslPackage.FUNCTION__COMMANDS:
        getCommands().clear();
        return;
      case MyDslPackage.FUNCTION__WRITES:
        getWrites().clear();
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
      case MyDslPackage.FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.FUNCTION__READS:
        return reads != null && !reads.isEmpty();
      case MyDslPackage.FUNCTION__COMMANDS:
        return commands != null && !commands.isEmpty();
      case MyDslPackage.FUNCTION__WRITES:
        return writes != null && !writes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionImpl