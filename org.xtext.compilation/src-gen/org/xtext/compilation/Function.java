/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.compilation.Function#getReads <em>Reads</em>}</li>
 *   <li>{@link org.xtext.compilation.Function#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.xtext.compilation.Function#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.CompilationPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.compilation.CompilationPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.compilation.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reads</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilation.Read}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reads</em>' containment reference list.
   * @see org.xtext.compilation.CompilationPackage#getFunction_Reads()
   * @model containment="true"
   * @generated
   */
  EList<Read> getReads();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilation.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.xtext.compilation.CompilationPackage#getFunction_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Writes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilation.Write}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writes</em>' containment reference list.
   * @see org.xtext.compilation.CompilationPackage#getFunction_Writes()
   * @model containment="true"
   * @generated
   */
  EList<Write> getWrites();

} // Function
