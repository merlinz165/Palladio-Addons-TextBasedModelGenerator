/*
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.ide

import com.google.inject.Guice
import com.palladiosimulator.textual.repository.RepoLangRuntimeModule
import com.palladiosimulator.textual.repository.RepoLangStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RepoLangIdeSetup extends RepoLangStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RepoLangRuntimeModule, new RepoLangIdeModule))
	}
	
}
