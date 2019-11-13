/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seff Reference Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffReferenceParameter()
 * @model
 * @generated
 */
public interface SeffReferenceParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Name</em>' attribute.
   * @see #setReferenceName(String)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffReferenceParameter_ReferenceName()
   * @model
   * @generated
   */
  String getReferenceName();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.SeffReferenceParameter#getReferenceName <em>Reference Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Name</em>' attribute.
   * @see #getReferenceName()
   * @generated
   */
  void setReferenceName(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.SeffVariableChar}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getSeffReferenceParameter_Values()
   * @model containment="true"
   * @generated
   */
  EList<SeffVariableChar> getValues();

} // SeffReferenceParameter
