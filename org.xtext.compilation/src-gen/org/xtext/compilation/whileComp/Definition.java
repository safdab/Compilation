/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation.whileComp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.whileComp.Definition#getRead <em>Read</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.Definition#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.xtext.compilation.whileComp.Definition#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.whileComp.WhileCompPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Read</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read</em>' containment reference.
   * @see #setRead(Read)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getDefinition_Read()
   * @model containment="true"
   * @generated
   */
  Read getRead();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.Definition#getRead <em>Read</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read</em>' containment reference.
   * @see #getRead()
   * @generated
   */
  void setRead(Read value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilation.whileComp.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getDefinition_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Write</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Write</em>' containment reference.
   * @see #setWrite(Write)
   * @see org.xtext.compilation.whileComp.WhileCompPackage#getDefinition_Write()
   * @model containment="true"
   * @generated
   */
  Write getWrite();

  /**
   * Sets the value of the '{@link org.xtext.compilation.whileComp.Definition#getWrite <em>Write</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Write</em>' containment reference.
   * @see #getWrite()
   * @generated
   */
  void setWrite(Write value);

} // Definition
