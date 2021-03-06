/*
 * generated by Xtext 2.10.0
 */
package esir.compilation.ui;

import com.google.inject.Injector;
import esir.compilation.ui.internal.CompilationActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class WhileCompExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CompilationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CompilationActivator.getInstance().getInjector(CompilationActivator.ESIR_COMPILATION_WHILECOMP);
	}
	
}
