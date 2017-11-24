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
import org.occiware.bigdata.Hdfs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hdfs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.impl.HdfsImpl#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.HdfsImpl#getOcciwareBigdataDataNodesIp <em>Occiware Bigdata Data Nodes Ip</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.HdfsImpl#getOcciwareBigdataInstanceName <em>Occiware Bigdata Instance Name</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.HdfsImpl#getOcciwareBigdataMasterNodePort <em>Occiware Bigdata Master Node Port</em>}</li>
 *   <li>{@link org.occiware.bigdata.impl.HdfsImpl#getOcciwareBigdataMasterNodeIp <em>Occiware Bigdata Master Node Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HdfsImpl extends MixinBaseImpl implements Hdfs {
	/**
	 * The default value of the '{@link #getOcciwareBigdataUiPort() <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCIWARE_BIGDATA_UI_PORT_EDEFAULT = new Integer(6000);

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
	 * The default value of the '{@link #getOcciwareBigdataDataNodesIp() <em>Occiware Bigdata Data Nodes Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataDataNodesIp()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_DATA_NODES_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataDataNodesIp() <em>Occiware Bigdata Data Nodes Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataDataNodesIp()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataDataNodesIp = OCCIWARE_BIGDATA_DATA_NODES_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataInstanceName() <em>Occiware Bigdata Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_INSTANCE_NAME_EDEFAULT = "hdfsContainer";

	/**
	 * The cached value of the '{@link #getOcciwareBigdataInstanceName() <em>Occiware Bigdata Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataInstanceName = OCCIWARE_BIGDATA_INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataMasterNodePort() <em>Occiware Bigdata Master Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataMasterNodePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCIWARE_BIGDATA_MASTER_NODE_PORT_EDEFAULT = new Integer(50010);

	/**
	 * The cached value of the '{@link #getOcciwareBigdataMasterNodePort() <em>Occiware Bigdata Master Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataMasterNodePort()
	 * @generated
	 * @ordered
	 */
	protected Integer occiwareBigdataMasterNodePort = OCCIWARE_BIGDATA_MASTER_NODE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciwareBigdataMasterNodeIp() <em>Occiware Bigdata Master Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataMasterNodeIp()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCIWARE_BIGDATA_MASTER_NODE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciwareBigdataMasterNodeIp() <em>Occiware Bigdata Master Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciwareBigdataMasterNodeIp()
	 * @generated
	 * @ordered
	 */
	protected String occiwareBigdataMasterNodeIp = OCCIWARE_BIGDATA_MASTER_NODE_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HdfsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigdataPackage.Literals.HDFS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT, oldOcciwareBigdataUiPort, occiwareBigdataUiPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataDataNodesIp() {
		return occiwareBigdataDataNodesIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataDataNodesIp(String newOcciwareBigdataDataNodesIp) {
		String oldOcciwareBigdataDataNodesIp = occiwareBigdataDataNodesIp;
		occiwareBigdataDataNodesIp = newOcciwareBigdataDataNodesIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP, oldOcciwareBigdataDataNodesIp, occiwareBigdataDataNodesIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataInstanceName() {
		return occiwareBigdataInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataInstanceName(String newOcciwareBigdataInstanceName) {
		String oldOcciwareBigdataInstanceName = occiwareBigdataInstanceName;
		occiwareBigdataInstanceName = newOcciwareBigdataInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME, oldOcciwareBigdataInstanceName, occiwareBigdataInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciwareBigdataMasterNodePort() {
		return occiwareBigdataMasterNodePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataMasterNodePort(Integer newOcciwareBigdataMasterNodePort) {
		Integer oldOcciwareBigdataMasterNodePort = occiwareBigdataMasterNodePort;
		occiwareBigdataMasterNodePort = newOcciwareBigdataMasterNodePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT, oldOcciwareBigdataMasterNodePort, occiwareBigdataMasterNodePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciwareBigdataMasterNodeIp() {
		return occiwareBigdataMasterNodeIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciwareBigdataMasterNodeIp(String newOcciwareBigdataMasterNodeIp) {
		String oldOcciwareBigdataMasterNodeIp = occiwareBigdataMasterNodeIp;
		occiwareBigdataMasterNodeIp = newOcciwareBigdataMasterNodeIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP, oldOcciwareBigdataMasterNodeIp, occiwareBigdataMasterNodeIp));
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
		 *   let severity : Integer[1] = 'Hdfs::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)
		 *       in
		 *         'Hdfs::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, BigdataTables.STR_Hdfs_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, BigdataTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Component = idResolver.getClass(BigdataTables.CLSSid_Component, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, BigdataTables.STR_Hdfs_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, BigdataTables.INT_0).booleanValue();
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
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT:
				return getOcciwareBigdataUiPort();
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP:
				return getOcciwareBigdataDataNodesIp();
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME:
				return getOcciwareBigdataInstanceName();
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT:
				return getOcciwareBigdataMasterNodePort();
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP:
				return getOcciwareBigdataMasterNodeIp();
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
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort((Integer)newValue);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP:
				setOcciwareBigdataDataNodesIp((String)newValue);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME:
				setOcciwareBigdataInstanceName((String)newValue);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT:
				setOcciwareBigdataMasterNodePort((Integer)newValue);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP:
				setOcciwareBigdataMasterNodeIp((String)newValue);
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
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT:
				setOcciwareBigdataUiPort(OCCIWARE_BIGDATA_UI_PORT_EDEFAULT);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP:
				setOcciwareBigdataDataNodesIp(OCCIWARE_BIGDATA_DATA_NODES_IP_EDEFAULT);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME:
				setOcciwareBigdataInstanceName(OCCIWARE_BIGDATA_INSTANCE_NAME_EDEFAULT);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT:
				setOcciwareBigdataMasterNodePort(OCCIWARE_BIGDATA_MASTER_NODE_PORT_EDEFAULT);
				return;
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP:
				setOcciwareBigdataMasterNodeIp(OCCIWARE_BIGDATA_MASTER_NODE_IP_EDEFAULT);
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
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_UI_PORT:
				return OCCIWARE_BIGDATA_UI_PORT_EDEFAULT == null ? occiwareBigdataUiPort != null : !OCCIWARE_BIGDATA_UI_PORT_EDEFAULT.equals(occiwareBigdataUiPort);
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP:
				return OCCIWARE_BIGDATA_DATA_NODES_IP_EDEFAULT == null ? occiwareBigdataDataNodesIp != null : !OCCIWARE_BIGDATA_DATA_NODES_IP_EDEFAULT.equals(occiwareBigdataDataNodesIp);
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME:
				return OCCIWARE_BIGDATA_INSTANCE_NAME_EDEFAULT == null ? occiwareBigdataInstanceName != null : !OCCIWARE_BIGDATA_INSTANCE_NAME_EDEFAULT.equals(occiwareBigdataInstanceName);
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT:
				return OCCIWARE_BIGDATA_MASTER_NODE_PORT_EDEFAULT == null ? occiwareBigdataMasterNodePort != null : !OCCIWARE_BIGDATA_MASTER_NODE_PORT_EDEFAULT.equals(occiwareBigdataMasterNodePort);
			case BigdataPackage.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP:
				return OCCIWARE_BIGDATA_MASTER_NODE_IP_EDEFAULT == null ? occiwareBigdataMasterNodeIp != null : !OCCIWARE_BIGDATA_MASTER_NODE_IP_EDEFAULT.equals(occiwareBigdataMasterNodeIp);
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
			case BigdataPackage.HDFS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(", occiwareBigdataDataNodesIp: ");
		result.append(occiwareBigdataDataNodesIp);
		result.append(", occiwareBigdataInstanceName: ");
		result.append(occiwareBigdataInstanceName);
		result.append(", occiwareBigdataMasterNodePort: ");
		result.append(occiwareBigdataMasterNodePort);
		result.append(", occiwareBigdataMasterNodeIp: ");
		result.append(occiwareBigdataMasterNodeIp);
		result.append(')');
		return result.toString();
	}

} //HdfsImpl
