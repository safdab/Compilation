/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.compilation.CompilationFactory
 * @model kind="package"
 * @generated
 */
public interface CompilationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "compilation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Compilation";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "compilation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CompilationPackage eINSTANCE = org.xtext.compilation.impl.CompilationPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.ProgramImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FUNCTIONS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.FunctionImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Reads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__READS = 1;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__COMMANDS = 2;

  /**
   * The feature id for the '<em><b>Writes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__WRITES = 3;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.ReadImpl <em>Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.ReadImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getRead()
   * @generated
   */
  int READ = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ__NAME = 0;

  /**
   * The number of structural features of the '<em>Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.WriteImpl <em>Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.WriteImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getWrite()
   * @generated
   */
  int WRITE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE__NAME = 0;

  /**
   * The number of structural features of the '<em>Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.CommandImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.NopImpl <em>Nop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.NopImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getNop()
   * @generated
   */
  int NOP = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP__NAME = COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Nop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.compilation.impl.AffectationImpl <em>Affectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.compilation.impl.AffectationImpl
   * @see org.xtext.compilation.impl.CompilationPackageImpl#getAffectation()
   * @generated
   */
  int AFFECTATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Valeur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VALEUR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Affectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.compilation.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilation.Program#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.compilation.Program#getFunctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.compilation.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilation.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.compilation.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilation.Function#getReads <em>Reads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reads</em>'.
   * @see org.xtext.compilation.Function#getReads()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Reads();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilation.Function#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.xtext.compilation.Function#getCommands()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.compilation.Function#getWrites <em>Writes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Writes</em>'.
   * @see org.xtext.compilation.Function#getWrites()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Writes();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read</em>'.
   * @see org.xtext.compilation.Read
   * @generated
   */
  EClass getRead();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilation.Read#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.xtext.compilation.Read#getName()
   * @see #getRead()
   * @generated
   */
  EAttribute getRead_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Write <em>Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write</em>'.
   * @see org.xtext.compilation.Write
   * @generated
   */
  EClass getWrite();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.compilation.Write#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.xtext.compilation.Write#getName()
   * @see #getWrite()
   * @generated
   */
  EAttribute getWrite_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.compilation.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilation.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.compilation.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Nop <em>Nop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nop</em>'.
   * @see org.xtext.compilation.Nop
   * @generated
   */
  EClass getNop();

  /**
   * Returns the meta object for class '{@link org.xtext.compilation.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affectation</em>'.
   * @see org.xtext.compilation.Affectation
   * @generated
   */
  EClass getAffectation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.compilation.Affectation#getValeur <em>Valeur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valeur</em>'.
   * @see org.xtext.compilation.Affectation#getValeur()
   * @see #getAffectation()
   * @generated
   */
  EAttribute getAffectation_Valeur();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CompilationFactory getCompilationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.ProgramImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.FunctionImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Reads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__READS = eINSTANCE.getFunction_Reads();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__COMMANDS = eINSTANCE.getFunction_Commands();

    /**
     * The meta object literal for the '<em><b>Writes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__WRITES = eINSTANCE.getFunction_Writes();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.ReadImpl <em>Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.ReadImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getRead()
     * @generated
     */
    EClass READ = eINSTANCE.getRead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ__NAME = eINSTANCE.getRead_Name();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.WriteImpl <em>Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.WriteImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getWrite()
     * @generated
     */
    EClass WRITE = eINSTANCE.getWrite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITE__NAME = eINSTANCE.getWrite_Name();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.CommandImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.NopImpl <em>Nop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.NopImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getNop()
     * @generated
     */
    EClass NOP = eINSTANCE.getNop();

    /**
     * The meta object literal for the '{@link org.xtext.compilation.impl.AffectationImpl <em>Affectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.compilation.impl.AffectationImpl
     * @see org.xtext.compilation.impl.CompilationPackageImpl#getAffectation()
     * @generated
     */
    EClass AFFECTATION = eINSTANCE.getAffectation();

    /**
     * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AFFECTATION__VALEUR = eINSTANCE.getAffectation_Valeur();

  }

} //CompilationPackage
