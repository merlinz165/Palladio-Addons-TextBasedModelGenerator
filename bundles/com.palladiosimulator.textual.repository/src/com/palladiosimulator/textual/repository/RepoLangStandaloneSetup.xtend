/*
 * generated by Xtext 2.10.0
 */
package com.palladiosimulator.textual.repository


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RepoLangStandaloneSetup extends RepoLangStandaloneSetupGenerated {

	def static void doSetup() {
		new RepoLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
