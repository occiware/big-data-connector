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
package org.occiware.bigdata.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import org.occiware.bigdata.BigdataPackage;
import org.occiware.bigdata.BigdataTables;
import org.occiware.bigdata.Credentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.impl.CredentialsImpl#getOcciwareBigdataUsername <em>Occiware Bigdata Username</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.CredentialsImpl#getOcciwareBigdataPassword <em>Occiware Bigdata Password</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.CredentialsImpl#getOcciwareBigdataEndpoint <em>Occiware Bigdata Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CredentialsImpl extends MixinBaseImpl implements Credentials {
	/**
	 * The default value of the '{@link #getOcciwareBigdataUsername() <em>Occiware Bigdata Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataUsername() <em>Occiware Bigdata Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUsername()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataUsername = OCCIWARE_BIGDATA_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataPassword() <em>Occiware Bigdata Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataPassword() <em>Occiware Bigdata Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataPassword()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataPassword = OCCIWARE_BIGDATA_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataEndpoint() <em>Occiware Bigdata Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataEndpoint() <em>Occiware Bigdata Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataEndpoint = OCCIWARE_BIGDATA_ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigdataPackage.Literals.CREDENTIALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataUsername() {
		return occiwareBigdataUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataUsername(String newOcciwareBigdataUsername) {
		String oldOcciwareBigdataUsername = occiwareBigdataUsername;
		occiwareBigdataUsername = newOcciwareBigdataUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME, oldOcciwareBigdataUsername, occiwareBigdataUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataPassword() {
		return occiwareBigdataPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataPassword(String newOcciwareBigdataPassword) {
		String oldOcciwareBigdataPassword = occiwareBigdataPassword;
		occiwareBigdataPassword = newOcciwareBigdataPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD, oldOcciwareBigdataPassword, occiwareBigdataPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataEndpoint() {
		return occiwareBigdataEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataEndpoint(String newOcciwareBigdataEndpoint) {
		String oldOcciwareBigdataEndpoint = occiwareBigdataEndpoint;
		occiwareBigdataEndpoint = newOcciwareBigdataEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT, oldOcciwareBigdataEndpoint, occiwareBigdataEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Credentials::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(occi::Resource)
		 *       in
		 *         'Credentials::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, BigdataTables.STR_Credentials_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, BigdataTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(BigdataTables.CLSSid_Resource, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, BigdataTables.STR_Credentials_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, BigdataTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME:
				return getOcciwareBigdataUsername();
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD:
				return getOcciwareBigdataPassword();
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT:
				return getOcciwareBigdataEndpoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME:
				setOcciwareBigdataUsername((String)newValue);
				return;
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD:
				setOcciwareBigdataPassword((String)newValue);
				return;
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT:
				setOcciwareBigdataEndpoint((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME:
				setOcciwareBigdataUsername(OCCIWARE_BIGDATA_USERNAME_EDEFAULT);
				return;
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD:
				setOcciwareBigdataPassword(OCCIWARE_BIGDATA_PASSWORD_EDEFAULT);
				return;
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT:
				setOcciwareBigdataEndpoint(OCCIWARE_BIGDATA_ENDPOINT_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME:
				return OCCIWARE_BIGDATA_USERNAME_EDEFAULT == null ? occiwareBigdataUsername != null : !OCCIWARE_BIGDATA_USERNAME_EDEFAULT.equals(occiwareBigdataUsername);
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD:
				return OCCIWARE_BIGDATA_PASSWORD_EDEFAULT == null ? occiwareBigdataPassword != null : !OCCIWARE_BIGDATA_PASSWORD_EDEFAULT.equals(occiwareBigdataPassword);
			case BigdataPackage.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT:
				return OCCIWARE_BIGDATA_ENDPOINT_EDEFAULT == null ? occiwareBigdataEndpoint != null : !OCCIWARE_BIGDATA_ENDPOINT_EDEFAULT.equals(occiwareBigdataEndpoint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BigdataPackage.CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occiwareBigdataUsername: ");
		result.append(occiwareBigdataUsername);
		result.append(", occiwareBigdataPassword: ");
		result.append(occiwareBigdataPassword);
		result.append(", occiwareBigdataEndpoint: ");
		result.append(occiwareBigdataEndpoint);
		result.append(')');
		return result.toString();
	}

} //CredentialsImpl
