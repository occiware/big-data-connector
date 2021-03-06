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
import org.occiware.bigdata.Storm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.impl.StormImpl#getOcciwareBigdataWorkersNumber <em>Occiware Bigdata Workers Number</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.StormImpl#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormImpl extends MixinBaseImpl implements Storm {
	/**
	 * The default value of the '{@link #getOcciwareBigdataWorkersNumber() <em>Occiware Bigdata Workers Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataWorkersNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCIWARE_BIGDATA_WORKERS_NUMBER_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getOcciwareBigdataWorkersNumber() <em>Occiware Bigdata Workers Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataWorkersNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer occiwareBigdataWorkersNumber = OCCIWARE_BIGDATA_WORKERS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataUiPort() <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCIWARE_BIGDATA_UI_PORT_EDEFAULT = new Integer(8099);

	/**
	 * The cached value of the '{@link #getOcciwareBigdataUiPort() <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 * @ordered
	 */
	protected Integer occiwareBigdataUiPort = OCCIWARE_BIGDATA_UI_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigdataPackage.Literals.STORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciwareBigdataWorkersNumber() {
		return occiwareBigdataWorkersNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataWorkersNumber(Integer newOcciwareBigdataWorkersNumber) {
		Integer oldOcciwareBigdataWorkersNumber = occiwareBigdataWorkersNumber;
		occiwareBigdataWorkersNumber = newOcciwareBigdataWorkersNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER, oldOcciwareBigdataWorkersNumber, occiwareBigdataWorkersNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciwareBigdataUiPort() {
		return occiwareBigdataUiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataUiPort(Integer newOcciwareBigdataUiPort) {
		Integer oldOcciwareBigdataUiPort = occiwareBigdataUiPort;
		occiwareBigdataUiPort = newOcciwareBigdataUiPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.STORM__OCCIWARE_BIGDATA_UI_PORT, oldOcciwareBigdataUiPort, occiwareBigdataUiPort));
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
		 *   let severity : Integer[1] = 'Storm::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Application)
		 *       in
		 *         'Storm::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, BigdataTables.STR_Storm_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, BigdataTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Application = idResolver.getClass(BigdataTables.CLSSid_Application, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Application).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, BigdataTables.STR_Storm_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, BigdataTables.INT_0).booleanValue();
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
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER:
				return getOcciwareBigdataWorkersNumber();
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_UI_PORT:
				return getOcciwareBigdataUiPort();
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
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER:
				setOcciwareBigdataWorkersNumber((Integer)newValue);
				return;
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort((Integer)newValue);
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
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER:
				setOcciwareBigdataWorkersNumber(OCCIWARE_BIGDATA_WORKERS_NUMBER_EDEFAULT);
				return;
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort(OCCIWARE_BIGDATA_UI_PORT_EDEFAULT);
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
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER:
				return OCCIWARE_BIGDATA_WORKERS_NUMBER_EDEFAULT == null ? occiwareBigdataWorkersNumber != null : !OCCIWARE_BIGDATA_WORKERS_NUMBER_EDEFAULT.equals(occiwareBigdataWorkersNumber);
			case BigdataPackage.STORM__OCCIWARE_BIGDATA_UI_PORT:
				return OCCIWARE_BIGDATA_UI_PORT_EDEFAULT == null ? occiwareBigdataUiPort != null : !OCCIWARE_BIGDATA_UI_PORT_EDEFAULT.equals(occiwareBigdataUiPort);
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
			case BigdataPackage.STORM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (occiwareBigdataWorkersNumber: ");
		result.append(occiwareBigdataWorkersNumber);
		result.append(", occiwareBigdataUiPort: ");
		result.append(occiwareBigdataUiPort);
		result.append(')');
		return result.toString();
	}

} //StormImpl
