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
import org.occiware.bigdata.Spark;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.impl.SparkImpl#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.SparkImpl#getOcciwareBigdataWorkersIp <em>Occiware Bigdata Workers Ip</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.SparkImpl#getOcciwareBigdataNetworkName <em>Occiware Bigdata Network Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkImpl extends MixinBaseImpl implements Spark {
	/**
	 * The default value of the '{@link #getOcciwareBigdataUiPort() <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_UI_PORT_EDEFAULT = "5000";

	/**
	 * The cached value of the '{@link #getOcciwareBigdataUiPort() <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataUiPort = OCCIWARE_BIGDATA_UI_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataWorkersIp() <em>Occiware Bigdata Workers Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataWorkersIp()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_WORKERS_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataWorkersIp() <em>Occiware Bigdata Workers Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataWorkersIp()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataWorkersIp = OCCIWARE_BIGDATA_WORKERS_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataNetworkName() <em>Occiware Bigdata Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_NETWORK_NAME_EDEFAULT = "my-net";

	/**
	 * The cached value of the '{@link #getOcciwareBigdataNetworkName() <em>Occiware Bigdata Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataNetworkName = OCCIWARE_BIGDATA_NETWORK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigdataPackage.Literals.SPARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataUiPort() {
		return occiwareBigdataUiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataUiPort(String newOcciwareBigdataUiPort) {
		String oldOcciwareBigdataUiPort = occiwareBigdataUiPort;
		occiwareBigdataUiPort = newOcciwareBigdataUiPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.SPARK__OCCIWARE_BIGDATA_UI_PORT, oldOcciwareBigdataUiPort, occiwareBigdataUiPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataWorkersIp() {
		return occiwareBigdataWorkersIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataWorkersIp(String newOcciwareBigdataWorkersIp) {
		String oldOcciwareBigdataWorkersIp = occiwareBigdataWorkersIp;
		occiwareBigdataWorkersIp = newOcciwareBigdataWorkersIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.SPARK__OCCIWARE_BIGDATA_WORKERS_IP, oldOcciwareBigdataWorkersIp, occiwareBigdataWorkersIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataNetworkName() {
		return occiwareBigdataNetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataNetworkName(String newOcciwareBigdataNetworkName) {
		String oldOcciwareBigdataNetworkName = occiwareBigdataNetworkName;
		occiwareBigdataNetworkName = newOcciwareBigdataNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME, oldOcciwareBigdataNetworkName, occiwareBigdataNetworkName));
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
		 *   let severity : Integer[1] = 'Spark::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Application)
		 *       in
		 *         'Spark::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, BigdataTables.STR_Spark_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, BigdataTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Application_0 = idResolver.getClass(BigdataTables.CLSSid_Application, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Application_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, BigdataTables.STR_Spark_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, BigdataTables.INT_0).booleanValue();
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
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_UI_PORT:
				return getOcciwareBigdataUiPort();
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_WORKERS_IP:
				return getOcciwareBigdataWorkersIp();
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME:
				return getOcciwareBigdataNetworkName();
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
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort((String)newValue);
				return;
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_WORKERS_IP:
				setOcciwareBigdataWorkersIp((String)newValue);
				return;
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME:
				setOcciwareBigdataNetworkName((String)newValue);
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
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort(OCCIWARE_BIGDATA_UI_PORT_EDEFAULT);
				return;
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_WORKERS_IP:
				setOcciwareBigdataWorkersIp(OCCIWARE_BIGDATA_WORKERS_IP_EDEFAULT);
				return;
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME:
				setOcciwareBigdataNetworkName(OCCIWARE_BIGDATA_NETWORK_NAME_EDEFAULT);
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
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_UI_PORT:
				return OCCIWARE_BIGDATA_UI_PORT_EDEFAULT == null ? occiwareBigdataUiPort != null : !OCCIWARE_BIGDATA_UI_PORT_EDEFAULT.equals(occiwareBigdataUiPort);
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_WORKERS_IP:
				return OCCIWARE_BIGDATA_WORKERS_IP_EDEFAULT == null ? occiwareBigdataWorkersIp != null : !OCCIWARE_BIGDATA_WORKERS_IP_EDEFAULT.equals(occiwareBigdataWorkersIp);
			case BigdataPackage.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME:
				return OCCIWARE_BIGDATA_NETWORK_NAME_EDEFAULT == null ? occiwareBigdataNetworkName != null : !OCCIWARE_BIGDATA_NETWORK_NAME_EDEFAULT.equals(occiwareBigdataNetworkName);
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
			case BigdataPackage.SPARK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (occiwareBigdataUiPort: ");
		result.append(occiwareBigdataUiPort);
		result.append(", occiwareBigdataWorkersIp: ");
		result.append(occiwareBigdataWorkersIp);
		result.append(", occiwareBigdataNetworkName: ");
		result.append(occiwareBigdataNetworkName);
		result.append(')');
		return result.toString();
	}

} //SparkImpl
