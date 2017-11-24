/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.occiware.bigdata.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.bigdata.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.bigdata.BigdataPackage
 * @generated
 */
public class BigdataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BigdataValidator INSTANCE = new BigdataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.bigdata";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Storm'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORM__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Hdfs'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HDFS__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Spark'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPARK__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Credentials'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CREDENTIALS__APPLIES_CONSTRAINT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigdataValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BigdataPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BigdataPackage.STORM:
				return validateStorm((Storm)value, diagnostics, context);
			case BigdataPackage.HDFS:
				return validateHdfs((Hdfs)value, diagnostics, context);
			case BigdataPackage.SPARK:
				return validateSpark((Spark)value, diagnostics, context);
			case BigdataPackage.CREDENTIALS:
				return validateCredentials((Credentials)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorm(Storm storm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storm, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorm_appliesConstraint(storm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Storm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorm_appliesConstraint(Storm storm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storm.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHdfs(Hdfs hdfs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hdfs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hdfs, diagnostics, context);
		if (result || diagnostics != null) result &= validateHdfs_appliesConstraint(hdfs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Hdfs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHdfs_appliesConstraint(Hdfs hdfs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hdfs.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpark(Spark spark, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(spark, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(spark, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpark_appliesConstraint(spark, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Spark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpark_appliesConstraint(Spark spark, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return spark.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredentials(Credentials credentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(credentials, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(credentials, diagnostics, context);
		if (result || diagnostics != null) result &= validateCredentials_appliesConstraint(credentials, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredentials_appliesConstraint(Credentials credentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return credentials.appliesConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BigdataValidator
