/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang.impl;

import com.palladiosimulator.textual.repository.repoLang.RepoLangPackage;
import com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranch;
import com.palladiosimulator.textual.repository.repoLang.SeffGuardedBranchAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seff Guarded Branch Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.impl.SeffGuardedBranchActionImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeffGuardedBranchActionImpl extends SeffActionImpl implements SeffGuardedBranchAction
{
  /**
   * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBranches()
   * @generated
   * @ordered
   */
  protected EList<SeffGuardedBranch> branches;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeffGuardedBranchActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RepoLangPackage.Literals.SEFF_GUARDED_BRANCH_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SeffGuardedBranch> getBranches()
  {
    if (branches == null)
    {
      branches = new EObjectContainmentEList<SeffGuardedBranch>(SeffGuardedBranch.class, this, RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES);
    }
    return branches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES:
        return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES:
        return getBranches();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES:
        getBranches().clear();
        getBranches().addAll((Collection<? extends SeffGuardedBranch>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES:
        getBranches().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RepoLangPackage.SEFF_GUARDED_BRANCH_ACTION__BRANCHES:
        return branches != null && !branches.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SeffGuardedBranchActionImpl