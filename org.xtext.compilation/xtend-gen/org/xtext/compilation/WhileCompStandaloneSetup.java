/**
 * generated by Xtext 2.10.0
 */
package org.xtext.compilation;

import org.xtext.compilation.WhileCompStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class WhileCompStandaloneSetup extends WhileCompStandaloneSetupGenerated {
  public static void doSetup() {
    WhileCompStandaloneSetup _whileCompStandaloneSetup = new WhileCompStandaloneSetup();
    _whileCompStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}