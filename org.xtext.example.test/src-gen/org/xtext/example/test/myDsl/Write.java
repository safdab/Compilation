/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.test.myDsl.Write#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.test.myDsl.MyDslPackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.xtext.example.test.myDsl.MyDslPackage#getWrite_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // Write