/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whileComp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whileComp.While#getExpr <em>Expr</em>}</li>
 *   <li>{@link esir.compilation.whileComp.While#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whileComp.WhileCompPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see esir.compilation.whileComp.WhileCompPackage#getWhile_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link esir.compilation.whileComp.While#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference.
   * @see #setCommands(Commands)
   * @see esir.compilation.whileComp.WhileCompPackage#getWhile_Commands()
   * @model containment="true"
   * @generated
   */
  Commands getCommands();

  /**
   * Sets the value of the '{@link esir.compilation.whileComp.While#getCommands <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands</em>' containment reference.
   * @see #getCommands()
   * @generated
   */
  void setCommands(Commands value);

} // While
