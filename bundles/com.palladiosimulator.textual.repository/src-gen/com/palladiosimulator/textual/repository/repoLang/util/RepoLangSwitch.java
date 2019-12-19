/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang.util;

import com.palladiosimulator.textual.repository.repoLang.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage
 * @generated
 */
public class RepoLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RepoLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepoLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RepoLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RepoLangPackage.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.IMPORTED_REPOSITORY:
      {
        ImportedRepository importedRepository = (ImportedRepository)theEObject;
        T result = caseImportedRepository(importedRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseNamedElement(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SIGNATURE:
      {
        Signature signature = (Signature)theEObject;
        T result = caseSignature(signature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SIGNATURE_PARAMETER:
      {
        SignatureParameter signatureParameter = (SignatureParameter)theEObject;
        T result = caseSignatureParameter(signatureParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseNamedElement(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.ROLE_SPECIFICATION:
      {
        RoleSpecification roleSpecification = (RoleSpecification)theEObject;
        T result = caseRoleSpecification(roleSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.COMPOSITE_COMPONENT:
      {
        CompositeComponent compositeComponent = (CompositeComponent)theEObject;
        T result = caseCompositeComponent(compositeComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF:
      {
        Seff seff = (Seff)theEObject;
        T result = caseSeff(seff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_ACTION:
      {
        SeffAction seffAction = (SeffAction)theEObject;
        T result = caseSeffAction(seffAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_INTERNAL_ACTION:
      {
        SeffInternalAction seffInternalAction = (SeffInternalAction)theEObject;
        T result = caseSeffInternalAction(seffInternalAction);
        if (result == null) result = caseSeffAction(seffInternalAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_ACQUIRE_ACTION:
      {
        SeffAcquireAction seffAcquireAction = (SeffAcquireAction)theEObject;
        T result = caseSeffAcquireAction(seffAcquireAction);
        if (result == null) result = caseSeffAction(seffAcquireAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_RELEASE_ACTION:
      {
        SeffReleaseAction seffReleaseAction = (SeffReleaseAction)theEObject;
        T result = caseSeffReleaseAction(seffReleaseAction);
        if (result == null) result = caseSeffAction(seffReleaseAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_LOOP_ACTION:
      {
        SeffLoopAction seffLoopAction = (SeffLoopAction)theEObject;
        T result = caseSeffLoopAction(seffLoopAction);
        if (result == null) result = caseSeffAction(seffLoopAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_SET_RETURN_ACTION:
      {
        SeffSetReturnAction seffSetReturnAction = (SeffSetReturnAction)theEObject;
        T result = caseSeffSetReturnAction(seffSetReturnAction);
        if (result == null) result = caseSeffAction(seffSetReturnAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_SET_VARIABLE_ACTION:
      {
        SeffSetVariableAction seffSetVariableAction = (SeffSetVariableAction)theEObject;
        T result = caseSeffSetVariableAction(seffSetVariableAction);
        if (result == null) result = caseSeffAction(seffSetVariableAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_EXTERNAL_CALL_ACTION:
      {
        SeffExternalCallAction seffExternalCallAction = (SeffExternalCallAction)theEObject;
        T result = caseSeffExternalCallAction(seffExternalCallAction);
        if (result == null) result = caseSeffAction(seffExternalCallAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_CALL_PARAMETER:
      {
        SeffCallParameter seffCallParameter = (SeffCallParameter)theEObject;
        T result = caseSeffCallParameter(seffCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_REFERENCE_PARAMETER:
      {
        SeffReferenceParameter seffReferenceParameter = (SeffReferenceParameter)theEObject;
        T result = caseSeffReferenceParameter(seffReferenceParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_RETURN_PARAMETER:
      {
        SeffReturnParameter seffReturnParameter = (SeffReturnParameter)theEObject;
        T result = caseSeffReturnParameter(seffReturnParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_VARIABLE_CHAR:
      {
        SeffVariableChar seffVariableChar = (SeffVariableChar)theEObject;
        T result = caseSeffVariableChar(seffVariableChar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_PROBABILISTIC_BRANCH_ACTION:
      {
        SeffProbabilisticBranchAction seffProbabilisticBranchAction = (SeffProbabilisticBranchAction)theEObject;
        T result = caseSeffProbabilisticBranchAction(seffProbabilisticBranchAction);
        if (result == null) result = caseSeffAction(seffProbabilisticBranchAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_BRANCH:
      {
        SeffBranch seffBranch = (SeffBranch)theEObject;
        T result = caseSeffBranch(seffBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_PROBABILISTIC_BRANCH:
      {
        SeffProbabilisticBranch seffProbabilisticBranch = (SeffProbabilisticBranch)theEObject;
        T result = caseSeffProbabilisticBranch(seffProbabilisticBranch);
        if (result == null) result = caseSeffBranch(seffProbabilisticBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION:
      {
        SeffGuardedBranchAction seffGuardedBranchAction = (SeffGuardedBranchAction)theEObject;
        T result = caseSeffGuardedBranchAction(seffGuardedBranchAction);
        if (result == null) result = caseSeffAction(seffGuardedBranchAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_GUARDED_BRANCH:
      {
        SeffGuardedBranch seffGuardedBranch = (SeffGuardedBranch)theEObject;
        T result = caseSeffGuardedBranch(seffGuardedBranch);
        if (result == null) result = caseSeffBranch(seffGuardedBranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_FORK_ACTION:
      {
        SeffForkAction seffForkAction = (SeffForkAction)theEObject;
        T result = caseSeffForkAction(seffForkAction);
        if (result == null) result = caseSeffAction(seffForkAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SEFF_FORK:
      {
        SeffFork seffFork = (SeffFork)theEObject;
        T result = caseSeffFork(seffFork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.SUB_SEFF:
      {
        SubSeff subSeff = (SubSeff)theEObject;
        T result = caseSubSeff(subSeff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepoLangPackage.PASSIVE_RESOURCE:
      {
        PassiveResource passiveResource = (PassiveResource)theEObject;
        T result = casePassiveResource(passiveResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imported Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imported Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportedRepository(ImportedRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignature(Signature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignatureParameter(SignatureParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleSpecification(RoleSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeComponent(CompositeComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeff(Seff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffAction(SeffAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Internal Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Internal Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffInternalAction(SeffInternalAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Acquire Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Acquire Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffAcquireAction(SeffAcquireAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Release Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Release Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffReleaseAction(SeffReleaseAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Loop Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Loop Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffLoopAction(SeffLoopAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Set Return Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Set Return Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffSetReturnAction(SeffSetReturnAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Set Variable Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Set Variable Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffSetVariableAction(SeffSetVariableAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff External Call Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff External Call Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffExternalCallAction(SeffExternalCallAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffCallParameter(SeffCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Reference Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Reference Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffReferenceParameter(SeffReferenceParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Return Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Return Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffReturnParameter(SeffReturnParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Variable Char</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Variable Char</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffVariableChar(SeffVariableChar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Probabilistic Branch Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Probabilistic Branch Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffProbabilisticBranchAction(SeffProbabilisticBranchAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffBranch(SeffBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Probabilistic Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Probabilistic Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffProbabilisticBranch(SeffProbabilisticBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Guarded Branch Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Guarded Branch Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffGuardedBranchAction(SeffGuardedBranchAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Guarded Branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Guarded Branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffGuardedBranch(SeffGuardedBranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Fork Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Fork Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffForkAction(SeffForkAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seff Fork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seff Fork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeffFork(SeffFork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Seff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Seff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubSeff(SubSeff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Passive Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePassiveResource(PassiveResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RepoLangSwitch