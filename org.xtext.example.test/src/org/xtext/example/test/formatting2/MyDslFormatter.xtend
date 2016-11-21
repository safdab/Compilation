/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.test.myDsl.Command
import org.xtext.example.test.myDsl.Function
import org.xtext.example.test.myDsl.Model
import org.xtext.example.test.myDsl.Read
import org.xtext.example.test.myDsl.Write
import org.xtext.example.test.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Function functions : model.getFunctions()) {
			functions.format;
		}
	}

	def dispatch void format(Function function, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Read reads : function.getReads()) {
			reads.format;
		}
		for (Command commands : function.getCommands()) {
			commands.format;
		}
		for (Write writes : function.getWrites()) {
			writes.format;
		}
	}
	
	// TODO: implement for 
}