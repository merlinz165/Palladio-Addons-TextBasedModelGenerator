/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang.impl;

import com.palladiosimulator.textual.repository.repoLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepoLangFactoryImpl extends EFactoryImpl implements RepoLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RepoLangFactory init()
  {
    try
    {
      RepoLangFactory theRepoLangFactory = (RepoLangFactory)EPackage.Registry.INSTANCE.getEFactory(RepoLangPackage.eNS_URI);
      if (theRepoLangFactory != null)
      {
        return theRepoLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RepoLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepoLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RepoLangPackage.REPOSITORY: return createRepository();
      case RepoLangPackage.IMPORTED_REPOSITORY: return createImportedRepository();
      case RepoLangPackage.NAMED_ELEMENT: return createNamedElement();
      case RepoLangPackage.INTERFACE: return createInterface();
      case RepoLangPackage.SIGNATURE: return createSignature();
      case RepoLangPackage.SIGNATURE_PARAMETER: return createSignatureParameter();
      case RepoLangPackage.COMPONENT: return createComponent();
      case RepoLangPackage.ROLE_SPECIFICATION: return createRoleSpecification();
      case RepoLangPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
      case RepoLangPackage.SEFF: return createSeff();
      case RepoLangPackage.SEFF_ACTION: return createSeffAction();
      case RepoLangPackage.SEFF_INTERNAL_ACTION: return createSeffInternalAction();
      case RepoLangPackage.SEFF_ACQUIRE_ACTION: return createSeffAcquireAction();
      case RepoLangPackage.SEFF_RELEASE_ACTION: return createSeffReleaseAction();
      case RepoLangPackage.SEFF_LOOP_ACTION: return createSeffLoopAction();
      case RepoLangPackage.SEFF_SET_RETURN_ACTION: return createSeffSetReturnAction();
      case RepoLangPackage.SEFF_SET_VARIABLE_ACTION: return createSeffSetVariableAction();
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION: return createSeffExternalCallAction();
      case RepoLangPackage.SEFF_CALL_PARAMETER: return createSeffCallParameter();
      case RepoLangPackage.SEFF_REFERENCE_PARAMETER: return createSeffReferenceParameter();
      case RepoLangPackage.SEFF_RETURN_PARAMETER: return createSeffReturnParameter();
      case RepoLangPackage.SEFF_VARIABLE_CHAR: return createSeffVariableChar();
      case RepoLangPackage.SEFF_PROBABILISTIC_BRANCH_ACTION: return createSeffProbabilisticBranchAction();
      case RepoLangPackage.SEFF_BRANCH: return createSeffBranch();
      case RepoLangPackage.SEFF_PROBABILISTIC_BRANCH: return createSeffProbabilisticBranch();
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION: return createSeffGuardedBranchAction();
      case RepoLangPackage.SEFF_GUARDED_BRANCH: return createSeffGuardedBranch();
      case RepoLangPackage.SEFF_FORK_ACTION: return createSeffForkAction();
      case RepoLangPackage.SEFF_FORK: return createSeffFork();
      case RepoLangPackage.SUB_SEFF: return createSubSeff();
      case RepoLangPackage.PASSIVE_RESOURCE: return createPassiveResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportedRepository createImportedRepository()
  {
    ImportedRepositoryImpl importedRepository = new ImportedRepositoryImpl();
    return importedRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SignatureParameter createSignatureParameter()
  {
    SignatureParameterImpl signatureParameter = new SignatureParameterImpl();
    return signatureParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoleSpecification createRoleSpecification()
  {
    RoleSpecificationImpl roleSpecification = new RoleSpecificationImpl();
    return roleSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompositeComponent createCompositeComponent()
  {
    CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
    return compositeComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Seff createSeff()
  {
    SeffImpl seff = new SeffImpl();
    return seff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffAction createSeffAction()
  {
    SeffActionImpl seffAction = new SeffActionImpl();
    return seffAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffInternalAction createSeffInternalAction()
  {
    SeffInternalActionImpl seffInternalAction = new SeffInternalActionImpl();
    return seffInternalAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffAcquireAction createSeffAcquireAction()
  {
    SeffAcquireActionImpl seffAcquireAction = new SeffAcquireActionImpl();
    return seffAcquireAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffReleaseAction createSeffReleaseAction()
  {
    SeffReleaseActionImpl seffReleaseAction = new SeffReleaseActionImpl();
    return seffReleaseAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffLoopAction createSeffLoopAction()
  {
    SeffLoopActionImpl seffLoopAction = new SeffLoopActionImpl();
    return seffLoopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffSetReturnAction createSeffSetReturnAction()
  {
    SeffSetReturnActionImpl seffSetReturnAction = new SeffSetReturnActionImpl();
    return seffSetReturnAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffSetVariableAction createSeffSetVariableAction()
  {
    SeffSetVariableActionImpl seffSetVariableAction = new SeffSetVariableActionImpl();
    return seffSetVariableAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffExternalCallAction createSeffExternalCallAction()
  {
    SeffExternalCallActionImpl seffExternalCallAction = new SeffExternalCallActionImpl();
    return seffExternalCallAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffCallParameter createSeffCallParameter()
  {
    SeffCallParameterImpl seffCallParameter = new SeffCallParameterImpl();
    return seffCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffReferenceParameter createSeffReferenceParameter()
  {
    SeffReferenceParameterImpl seffReferenceParameter = new SeffReferenceParameterImpl();
    return seffReferenceParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffReturnParameter createSeffReturnParameter()
  {
    SeffReturnParameterImpl seffReturnParameter = new SeffReturnParameterImpl();
    return seffReturnParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffVariableChar createSeffVariableChar()
  {
    SeffVariableCharImpl seffVariableChar = new SeffVariableCharImpl();
    return seffVariableChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffProbabilisticBranchAction createSeffProbabilisticBranchAction()
  {
    SeffProbabilisticBranchActionImpl seffProbabilisticBranchAction = new SeffProbabilisticBranchActionImpl();
    return seffProbabilisticBranchAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffBranch createSeffBranch()
  {
    SeffBranchImpl seffBranch = new SeffBranchImpl();
    return seffBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffProbabilisticBranch createSeffProbabilisticBranch()
  {
    SeffProbabilisticBranchImpl seffProbabilisticBranch = new SeffProbabilisticBranchImpl();
    return seffProbabilisticBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffGuardedBranchAction createSeffGuardedBranchAction()
  {
    SeffGuardedBranchActionImpl seffGuardedBranchAction = new SeffGuardedBranchActionImpl();
    return seffGuardedBranchAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffGuardedBranch createSeffGuardedBranch()
  {
    SeffGuardedBranchImpl seffGuardedBranch = new SeffGuardedBranchImpl();
    return seffGuardedBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffForkAction createSeffForkAction()
  {
    SeffForkActionImpl seffForkAction = new SeffForkActionImpl();
    return seffForkAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SeffFork createSeffFork()
  {
    SeffForkImpl seffFork = new SeffForkImpl();
    return seffFork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubSeff createSubSeff()
  {
    SubSeffImpl subSeff = new SubSeffImpl();
    return subSeff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PassiveResource createPassiveResource()
  {
    PassiveResourceImpl passiveResource = new PassiveResourceImpl();
    return passiveResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepoLangPackage getRepoLangPackage()
  {
    return (RepoLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RepoLangPackage getPackage()
  {
    return RepoLangPackage.eINSTANCE;
  }

} //RepoLangFactoryImpl