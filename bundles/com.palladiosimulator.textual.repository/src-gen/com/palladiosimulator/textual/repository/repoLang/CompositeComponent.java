/**
 * generated by Xtext 2.17.0
 */
package com.palladiosimulator.textual.repository.repoLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent#getName <em>Name</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent#getProvides <em>Provides</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent#getRequires <em>Requires</em>}</li>
 *   <li>{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getCompositeComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.palladiosimulator.textual.repository.repoLang.CompositeComponent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.RoleSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getCompositeComponent_Provides()
   * @model containment="true"
   * @generated
   */
  EList<RoleSpecification> getProvides();

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.RoleSpecification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getCompositeComponent_Requires()
   * @model containment="true"
   * @generated
   */
  EList<RoleSpecification> getRequires();

  /**
   * Returns the value of the '<em><b>Components</b></em>' reference list.
   * The list contents are of type {@link com.palladiosimulator.textual.repository.repoLang.Component}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' reference list.
   * @see com.palladiosimulator.textual.repository.repoLang.RepoLangPackage#getCompositeComponent_Components()
   * @model
   * @generated
   */
  EList<Component> getComponents();

} // CompositeComponent
