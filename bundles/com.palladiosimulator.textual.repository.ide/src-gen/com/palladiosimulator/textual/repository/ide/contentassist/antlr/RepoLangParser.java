/*
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.palladiosimulator.textual.repository.ide.contentassist.antlr.internal.InternalRepoLangParser;
import com.palladiosimulator.textual.repository.services.RepoLangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RepoLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RepoLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RepoLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
			builder.put(grammarAccess.getCustomTypeAccess().getAlternatives(), "rule__CustomType__Alternatives");
			builder.put(grammarAccess.getSeffActionAccess().getAlternatives(), "rule__SeffAction__Alternatives");
			builder.put(grammarAccess.getSeffCallParameterAccess().getAlternatives_0(), "rule__SeffCallParameter__Alternatives_0");
			builder.put(grammarAccess.getSeffBranchAccess().getAlternatives(), "rule__SeffBranch__Alternatives");
			builder.put(grammarAccess.getCharTypeAccess().getAlternatives(), "rule__CharType__Alternatives");
			builder.put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
			builder.put(grammarAccess.getImportedRepositoryAccess().getGroup(), "rule__ImportedRepository__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getTypeRepoAccess().getGroup(), "rule__TypeRepo__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
			builder.put(grammarAccess.getInterfaceAccess().getGroup_2(), "rule__Interface__Group_2__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_1(), "rule__Signature__Group_1__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_1_2(), "rule__Signature__Group_1_2__0");
			builder.put(grammarAccess.getSignatureParameterAccess().getGroup(), "rule__SignatureParameter__Group__0");
			builder.put(grammarAccess.getCustomCompositeTypeAccess().getGroup(), "rule__CustomCompositeType__Group__0");
			builder.put(grammarAccess.getCustomCompositeTypeAccess().getGroup_2(), "rule__CustomCompositeType__Group_2__0");
			builder.put(grammarAccess.getCustomInnerDeclarationAccess().getGroup(), "rule__CustomInnerDeclaration__Group__0");
			builder.put(grammarAccess.getCustomCollectionTypeAccess().getGroup(), "rule__CustomCollectionType__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_2(), "rule__Component__Group_2__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_2_2(), "rule__Component__Group_2_2__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_3(), "rule__Component__Group_3__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_3_2(), "rule__Component__Group_3_2__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_4(), "rule__Component__Group_4__0");
			builder.put(grammarAccess.getRoleSpecificationAccess().getGroup(), "rule__RoleSpecification__Group__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup(), "rule__CompositeComponent__Group__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_2(), "rule__CompositeComponent__Group_2__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_3(), "rule__CompositeComponent__Group_3__0");
			builder.put(grammarAccess.getCompositeComponentAccess().getGroup_4(), "rule__CompositeComponent__Group_4__0");
			builder.put(grammarAccess.getSeffAccess().getGroup(), "rule__Seff__Group__0");
			builder.put(grammarAccess.getSeffInternalActionAccess().getGroup(), "rule__SeffInternalAction__Group__0");
			builder.put(grammarAccess.getSeffAcquireActionAccess().getGroup(), "rule__SeffAcquireAction__Group__0");
			builder.put(grammarAccess.getSeffAcquireActionAccess().getGroup_3(), "rule__SeffAcquireAction__Group_3__0");
			builder.put(grammarAccess.getSeffReleaseActionAccess().getGroup(), "rule__SeffReleaseAction__Group__0");
			builder.put(grammarAccess.getSeffReleaseActionAccess().getGroup_3(), "rule__SeffReleaseAction__Group_3__0");
			builder.put(grammarAccess.getSeffLoopActionAccess().getGroup(), "rule__SeffLoopAction__Group__0");
			builder.put(grammarAccess.getSeffSetReturnActionAccess().getGroup(), "rule__SeffSetReturnAction__Group__0");
			builder.put(grammarAccess.getSeffSetVariableActionAccess().getGroup(), "rule__SeffSetVariableAction__Group__0");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getGroup(), "rule__SeffExternalCallAction__Group__0");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getGroup_2(), "rule__SeffExternalCallAction__Group_2__0");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getGroup_4(), "rule__SeffExternalCallAction__Group_4__0");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getGroup_4_2(), "rule__SeffExternalCallAction__Group_4_2__0");
			builder.put(grammarAccess.getSeffCallParameterAccess().getGroup(), "rule__SeffCallParameter__Group__0");
			builder.put(grammarAccess.getSeffReferenceParameterAccess().getGroup(), "rule__SeffReferenceParameter__Group__0");
			builder.put(grammarAccess.getSeffReturnParameterAccess().getGroup(), "rule__SeffReturnParameter__Group__0");
			builder.put(grammarAccess.getSeffVariableCharAccess().getGroup(), "rule__SeffVariableChar__Group__0");
			builder.put(grammarAccess.getSeffProbabilisticBranchActionAccess().getGroup(), "rule__SeffProbabilisticBranchAction__Group__0");
			builder.put(grammarAccess.getSeffProbabilisticBranchAccess().getGroup(), "rule__SeffProbabilisticBranch__Group__0");
			builder.put(grammarAccess.getSeffGuardedBranchActionAccess().getGroup(), "rule__SeffGuardedBranchAction__Group__0");
			builder.put(grammarAccess.getSeffGuardedBranchAccess().getGroup(), "rule__SeffGuardedBranch__Group__0");
			builder.put(grammarAccess.getSeffForkActionAccess().getGroup(), "rule__SeffForkAction__Group__0");
			builder.put(grammarAccess.getSeffForkActionAccess().getGroup_5(), "rule__SeffForkAction__Group_5__0");
			builder.put(grammarAccess.getSeffForkAccess().getGroup(), "rule__SeffFork__Group__0");
			builder.put(grammarAccess.getSubSeffAccess().getGroup(), "rule__SubSeff__Group__0");
			builder.put(grammarAccess.getPassiveResourceAccess().getGroup(), "rule__PassiveResource__Group__0");
			builder.put(grammarAccess.getProbabilityAccess().getGroup(), "rule__Probability__Group__0");
			builder.put(grammarAccess.getProbabilityAccess().getGroup_1(), "rule__Probability__Group_1__0");
			builder.put(grammarAccess.getRepositoryAccess().getNameAssignment_1(), "rule__Repository__NameAssignment_1");
			builder.put(grammarAccess.getRepositoryAccess().getImportsAssignment_2(), "rule__Repository__ImportsAssignment_2");
			builder.put(grammarAccess.getRepositoryAccess().getTypesAssignment_3(), "rule__Repository__TypesAssignment_3");
			builder.put(grammarAccess.getRepositoryAccess().getElementsAssignment_4(), "rule__Repository__ElementsAssignment_4");
			builder.put(grammarAccess.getImportedRepositoryAccess().getImportedNamespaceAssignment_1(), "rule__ImportedRepository__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getTypeRepoAccess().getDataTypes__RepositoryAssignment_2(), "rule__TypeRepo__DataTypes__RepositoryAssignment_2");
			builder.put(grammarAccess.getInterfaceAccess().getNameAssignment_1(), "rule__Interface__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceAccess().getSignatureAssignment_2_1(), "rule__Interface__SignatureAssignment_2_1");
			builder.put(grammarAccess.getSignatureAccess().getNameAssignment_0(), "rule__Signature__NameAssignment_0");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_1_1(), "rule__Signature__ParametersAssignment_1_1");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_1_2_1(), "rule__Signature__ParametersAssignment_1_2_1");
			builder.put(grammarAccess.getSignatureParameterAccess().getNameAssignment_0(), "rule__SignatureParameter__NameAssignment_0");
			builder.put(grammarAccess.getSignatureParameterAccess().getTypeAssignment_2(), "rule__SignatureParameter__TypeAssignment_2");
			builder.put(grammarAccess.getCustomCompositeTypeAccess().getEntityNameAssignment_1(), "rule__CustomCompositeType__EntityNameAssignment_1");
			builder.put(grammarAccess.getCustomCompositeTypeAccess().getParentType_CompositeDataTypeAssignment_2_1(), "rule__CustomCompositeType__ParentType_CompositeDataTypeAssignment_2_1");
			builder.put(grammarAccess.getCustomCompositeTypeAccess().getInnerDeclaration_CompositeDataTypeAssignment_4(), "rule__CustomCompositeType__InnerDeclaration_CompositeDataTypeAssignment_4");
			builder.put(grammarAccess.getCustomInnerDeclarationAccess().getEntityNameAssignment_0(), "rule__CustomInnerDeclaration__EntityNameAssignment_0");
			builder.put(grammarAccess.getCustomInnerDeclarationAccess().getDatatype_InnerDeclarationAssignment_2(), "rule__CustomInnerDeclaration__Datatype_InnerDeclarationAssignment_2");
			builder.put(grammarAccess.getCustomCollectionTypeAccess().getEntityNameAssignment_1(), "rule__CustomCollectionType__EntityNameAssignment_1");
			builder.put(grammarAccess.getCustomCollectionTypeAccess().getInnerType_CollectionDataTypeAssignment_3(), "rule__CustomCollectionType__InnerType_CollectionDataTypeAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getProvidesAssignment_2_1(), "rule__Component__ProvidesAssignment_2_1");
			builder.put(grammarAccess.getComponentAccess().getProvidesAssignment_2_2_1(), "rule__Component__ProvidesAssignment_2_2_1");
			builder.put(grammarAccess.getComponentAccess().getRequiresAssignment_3_1(), "rule__Component__RequiresAssignment_3_1");
			builder.put(grammarAccess.getComponentAccess().getRequiresAssignment_3_2_1(), "rule__Component__RequiresAssignment_3_2_1");
			builder.put(grammarAccess.getComponentAccess().getSeffsAssignment_4_1(), "rule__Component__SeffsAssignment_4_1");
			builder.put(grammarAccess.getComponentAccess().getPassiveResourcesAssignment_4_2(), "rule__Component__PassiveResourcesAssignment_4_2");
			builder.put(grammarAccess.getRoleSpecificationAccess().getInterfaceAssignment_0(), "rule__RoleSpecification__InterfaceAssignment_0");
			builder.put(grammarAccess.getRoleSpecificationAccess().getNameAssignment_2(), "rule__RoleSpecification__NameAssignment_2");
			builder.put(grammarAccess.getCompositeComponentAccess().getNameAssignment_1(), "rule__CompositeComponent__NameAssignment_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getProvidesAssignment_2_1(), "rule__CompositeComponent__ProvidesAssignment_2_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getRequiresAssignment_3_1(), "rule__CompositeComponent__RequiresAssignment_3_1");
			builder.put(grammarAccess.getCompositeComponentAccess().getComponentsAssignment_4_1(), "rule__CompositeComponent__ComponentsAssignment_4_1");
			builder.put(grammarAccess.getSeffAccess().getNameAssignment_1(), "rule__Seff__NameAssignment_1");
			builder.put(grammarAccess.getSeffAccess().getRoleAssignment_3(), "rule__Seff__RoleAssignment_3");
			builder.put(grammarAccess.getSeffAccess().getSignatureAssignment_4(), "rule__Seff__SignatureAssignment_4");
			builder.put(grammarAccess.getSeffAccess().getActionsAssignment_6(), "rule__Seff__ActionsAssignment_6");
			builder.put(grammarAccess.getSeffInternalActionAccess().getNameAssignment_1(), "rule__SeffInternalAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffInternalActionAccess().getDemandTypeAssignment_2(), "rule__SeffInternalAction__DemandTypeAssignment_2");
			builder.put(grammarAccess.getSeffInternalActionAccess().getDemandAssignment_3(), "rule__SeffInternalAction__DemandAssignment_3");
			builder.put(grammarAccess.getSeffAcquireActionAccess().getNameAssignment_1(), "rule__SeffAcquireAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffAcquireActionAccess().getResourceAssignment_2(), "rule__SeffAcquireAction__ResourceAssignment_2");
			builder.put(grammarAccess.getSeffAcquireActionAccess().getAmountAssignment_3_1(), "rule__SeffAcquireAction__AmountAssignment_3_1");
			builder.put(grammarAccess.getSeffReleaseActionAccess().getNameAssignment_1(), "rule__SeffReleaseAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffReleaseActionAccess().getResourceAssignment_2(), "rule__SeffReleaseAction__ResourceAssignment_2");
			builder.put(grammarAccess.getSeffReleaseActionAccess().getAmountAssignment_3_1(), "rule__SeffReleaseAction__AmountAssignment_3_1");
			builder.put(grammarAccess.getSeffLoopActionAccess().getNameAssignment_1(), "rule__SeffLoopAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffLoopActionAccess().getCountAssignment_3(), "rule__SeffLoopAction__CountAssignment_3");
			builder.put(grammarAccess.getSeffLoopActionAccess().getActionsAssignment_5(), "rule__SeffLoopAction__ActionsAssignment_5");
			builder.put(grammarAccess.getSeffSetReturnActionAccess().getNameAssignment_1(), "rule__SeffSetReturnAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffSetReturnActionAccess().getReturnValueAssignment_2(), "rule__SeffSetReturnAction__ReturnValueAssignment_2");
			builder.put(grammarAccess.getSeffSetVariableActionAccess().getNameAssignment_1(), "rule__SeffSetVariableAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffSetVariableActionAccess().getSetValuesAssignment_2(), "rule__SeffSetVariableAction__SetValuesAssignment_2");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getNameAssignment_1(), "rule__SeffExternalCallAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getRoleAssignment_2_0(), "rule__SeffExternalCallAction__RoleAssignment_2_0");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getCalledAssignment_3(), "rule__SeffExternalCallAction__CalledAssignment_3");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getBindingsAssignment_4_1(), "rule__SeffExternalCallAction__BindingsAssignment_4_1");
			builder.put(grammarAccess.getSeffExternalCallActionAccess().getReturningAssignment_4_2_1(), "rule__SeffExternalCallAction__ReturningAssignment_4_2_1");
			builder.put(grammarAccess.getSeffCallParameterAccess().getParameterAssignment_0_0(), "rule__SeffCallParameter__ParameterAssignment_0_0");
			builder.put(grammarAccess.getSeffCallParameterAccess().getReferenceNameAssignment_0_1(), "rule__SeffCallParameter__ReferenceNameAssignment_0_1");
			builder.put(grammarAccess.getSeffCallParameterAccess().getValuesAssignment_2(), "rule__SeffCallParameter__ValuesAssignment_2");
			builder.put(grammarAccess.getSeffReferenceParameterAccess().getReferenceNameAssignment_0(), "rule__SeffReferenceParameter__ReferenceNameAssignment_0");
			builder.put(grammarAccess.getSeffReferenceParameterAccess().getValuesAssignment_2(), "rule__SeffReferenceParameter__ValuesAssignment_2");
			builder.put(grammarAccess.getSeffReturnParameterAccess().getValuesAssignment_1(), "rule__SeffReturnParameter__ValuesAssignment_1");
			builder.put(grammarAccess.getSeffVariableCharAccess().getCharacterisationTypeAssignment_0(), "rule__SeffVariableChar__CharacterisationTypeAssignment_0");
			builder.put(grammarAccess.getSeffVariableCharAccess().getValueAssignment_2(), "rule__SeffVariableChar__ValueAssignment_2");
			builder.put(grammarAccess.getSeffProbabilisticBranchActionAccess().getNameAssignment_1(), "rule__SeffProbabilisticBranchAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffProbabilisticBranchActionAccess().getBranchesAssignment_3(), "rule__SeffProbabilisticBranchAction__BranchesAssignment_3");
			builder.put(grammarAccess.getSeffProbabilisticBranchAccess().getProbabilityAssignment_0(), "rule__SeffProbabilisticBranch__ProbabilityAssignment_0");
			builder.put(grammarAccess.getSeffProbabilisticBranchAccess().getNameAssignment_2(), "rule__SeffProbabilisticBranch__NameAssignment_2");
			builder.put(grammarAccess.getSeffProbabilisticBranchAccess().getSeffAssignment_3(), "rule__SeffProbabilisticBranch__SeffAssignment_3");
			builder.put(grammarAccess.getSeffGuardedBranchActionAccess().getNameAssignment_1(), "rule__SeffGuardedBranchAction__NameAssignment_1");
			builder.put(grammarAccess.getSeffGuardedBranchActionAccess().getBranchesAssignment_3(), "rule__SeffGuardedBranchAction__BranchesAssignment_3");
			builder.put(grammarAccess.getSeffGuardedBranchAccess().getConditionAssignment_0(), "rule__SeffGuardedBranch__ConditionAssignment_0");
			builder.put(grammarAccess.getSeffGuardedBranchAccess().getNameAssignment_2(), "rule__SeffGuardedBranch__NameAssignment_2");
			builder.put(grammarAccess.getSeffGuardedBranchAccess().getSeffAssignment_3(), "rule__SeffGuardedBranch__SeffAssignment_3");
			builder.put(grammarAccess.getSeffForkActionAccess().getSyncAssignment_1(), "rule__SeffForkAction__SyncAssignment_1");
			builder.put(grammarAccess.getSeffForkActionAccess().getNameAssignment_2(), "rule__SeffForkAction__NameAssignment_2");
			builder.put(grammarAccess.getSeffForkActionAccess().getForksAssignment_4(), "rule__SeffForkAction__ForksAssignment_4");
			builder.put(grammarAccess.getSeffForkActionAccess().getForksAssignment_5_1(), "rule__SeffForkAction__ForksAssignment_5_1");
			builder.put(grammarAccess.getSeffForkAccess().getNameAssignment_0(), "rule__SeffFork__NameAssignment_0");
			builder.put(grammarAccess.getSeffForkAccess().getSeffAssignment_1(), "rule__SeffFork__SeffAssignment_1");
			builder.put(grammarAccess.getSubSeffAccess().getActionsAssignment_1(), "rule__SubSeff__ActionsAssignment_1");
			builder.put(grammarAccess.getPassiveResourceAccess().getNameAssignment_1(), "rule__PassiveResource__NameAssignment_1");
			builder.put(grammarAccess.getPassiveResourceAccess().getCapacityAssignment_3(), "rule__PassiveResource__CapacityAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RepoLangGrammarAccess grammarAccess;

	@Override
	protected InternalRepoLangParser createParser() {
		InternalRepoLangParser result = new InternalRepoLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RepoLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RepoLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}