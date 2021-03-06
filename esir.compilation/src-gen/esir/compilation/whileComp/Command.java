/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whileComp.Command#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whileComp.WhileCompPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(EObject)
   * @see esir.compilation.whileComp.WhileCompPackage#getCommand_Command()
   * @model containment="true"
   * @generated
   */
  EObject getCommand();

  /**
   * Sets the value of the '{@link esir.compilation.whileComp.Command#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(EObject value);

} // Command
