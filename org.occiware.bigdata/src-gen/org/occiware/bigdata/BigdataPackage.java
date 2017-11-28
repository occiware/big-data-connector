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
package org.occiware.bigdata;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.bigdata.BigdataFactory
 * @model kind="package"
 * @generated
 */
public interface BigdataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bigdata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.occiware/platform/bigdata/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bigdata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigdataPackage eINSTANCE = org.occiware.bigdata.impl.BigdataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.bigdata.impl.StormImpl <em>Storm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.bigdata.impl.StormImpl
	 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getStorm()
	 * @generated
	 */
	int STORM = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Workers Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM__OCCIWARE_BIGDATA_UI_PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.bigdata.impl.HdfsImpl <em>Hdfs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.bigdata.impl.HdfsImpl
	 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getHdfs()
	 * @generated
	 */
	int HDFS = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__OCCIWARE_BIGDATA_UI_PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Data Nodes Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Master Node Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Master Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hdfs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hdfs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDFS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.bigdata.impl.SparkImpl <em>Spark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.bigdata.impl.SparkImpl
	 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getSpark()
	 * @generated
	 */
	int SPARK = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__OCCIWARE_BIGDATA_UI_PORT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Workers Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__OCCIWARE_BIGDATA_WORKERS_IP = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK__OCCIWARE_BIGDATA_NETWORK_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.bigdata.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.bigdata.impl.CredentialsImpl
	 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__OCCIWARE_BIGDATA_USERNAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occiware Bigdata Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.occiware.bigdata.Storm <em>Storm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm</em>'.
	 * @see org.occiware.bigdata.Storm
	 * @generated
	 */
	EClass getStorm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Storm#getOcciwareBigdataWorkersNumber <em>Occiware Bigdata Workers Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Workers Number</em>'.
	 * @see org.occiware.bigdata.Storm#getOcciwareBigdataWorkersNumber()
	 * @see #getStorm()
	 * @generated
	 */
	EAttribute getStorm_OcciwareBigdataWorkersNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Storm#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Ui Port</em>'.
	 * @see org.occiware.bigdata.Storm#getOcciwareBigdataUiPort()
	 * @see #getStorm()
	 * @generated
	 */
	EAttribute getStorm_OcciwareBigdataUiPort();

	/**
	 * Returns the meta object for the '{@link org.occiware.bigdata.Storm#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.bigdata.Storm#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorm__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.bigdata.Hdfs <em>Hdfs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hdfs</em>'.
	 * @see org.occiware.bigdata.Hdfs
	 * @generated
	 */
	EClass getHdfs();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Ui Port</em>'.
	 * @see org.occiware.bigdata.Hdfs#getOcciwareBigdataUiPort()
	 * @see #getHdfs()
	 * @generated
	 */
	EAttribute getHdfs_OcciwareBigdataUiPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataDataNodesIp <em>Occiware Bigdata Data Nodes Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Data Nodes Ip</em>'.
	 * @see org.occiware.bigdata.Hdfs#getOcciwareBigdataDataNodesIp()
	 * @see #getHdfs()
	 * @generated
	 */
	EAttribute getHdfs_OcciwareBigdataDataNodesIp();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataInstanceName <em>Occiware Bigdata Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Instance Name</em>'.
	 * @see org.occiware.bigdata.Hdfs#getOcciwareBigdataInstanceName()
	 * @see #getHdfs()
	 * @generated
	 */
	EAttribute getHdfs_OcciwareBigdataInstanceName();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodePort <em>Occiware Bigdata Master Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Master Node Port</em>'.
	 * @see org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodePort()
	 * @see #getHdfs()
	 * @generated
	 */
	EAttribute getHdfs_OcciwareBigdataMasterNodePort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodeIp <em>Occiware Bigdata Master Node Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Master Node Ip</em>'.
	 * @see org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodeIp()
	 * @see #getHdfs()
	 * @generated
	 */
	EAttribute getHdfs_OcciwareBigdataMasterNodeIp();

	/**
	 * Returns the meta object for the '{@link org.occiware.bigdata.Hdfs#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.bigdata.Hdfs#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHdfs__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.bigdata.Spark <em>Spark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spark</em>'.
	 * @see org.occiware.bigdata.Spark
	 * @generated
	 */
	EClass getSpark();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Spark#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Ui Port</em>'.
	 * @see org.occiware.bigdata.Spark#getOcciwareBigdataUiPort()
	 * @see #getSpark()
	 * @generated
	 */
	EAttribute getSpark_OcciwareBigdataUiPort();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Spark#getOcciwareBigdataWorkersIp <em>Occiware Bigdata Workers Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Workers Ip</em>'.
	 * @see org.occiware.bigdata.Spark#getOcciwareBigdataWorkersIp()
	 * @see #getSpark()
	 * @generated
	 */
	EAttribute getSpark_OcciwareBigdataWorkersIp();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Spark#getOcciwareBigdataNetworkName <em>Occiware Bigdata Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Network Name</em>'.
	 * @see org.occiware.bigdata.Spark#getOcciwareBigdataNetworkName()
	 * @see #getSpark()
	 * @generated
	 */
	EAttribute getSpark_OcciwareBigdataNetworkName();

	/**
	 * Returns the meta object for the '{@link org.occiware.bigdata.Spark#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.bigdata.Spark#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpark__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.bigdata.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see org.occiware.bigdata.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataUsername <em>Occiware Bigdata Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Username</em>'.
	 * @see org.occiware.bigdata.Credentials#getOcciwareBigdataUsername()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_OcciwareBigdataUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataPassword <em>Occiware Bigdata Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Password</em>'.
	 * @see org.occiware.bigdata.Credentials#getOcciwareBigdataPassword()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_OcciwareBigdataPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataEndpoint <em>Occiware Bigdata Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occiware Bigdata Endpoint</em>'.
	 * @see org.occiware.bigdata.Credentials#getOcciwareBigdataEndpoint()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_OcciwareBigdataEndpoint();

	/**
	 * Returns the meta object for the '{@link org.occiware.bigdata.Credentials#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.bigdata.Credentials#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCredentials__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BigdataFactory getBigdataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.bigdata.impl.StormImpl <em>Storm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.bigdata.impl.StormImpl
		 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getStorm()
		 * @generated
		 */
		EClass STORM = eINSTANCE.getStorm();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Workers Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER = eINSTANCE.getStorm_OcciwareBigdataWorkersNumber();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM__OCCIWARE_BIGDATA_UI_PORT = eINSTANCE.getStorm_OcciwareBigdataUiPort();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorm__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.bigdata.impl.HdfsImpl <em>Hdfs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.bigdata.impl.HdfsImpl
		 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getHdfs()
		 * @generated
		 */
		EClass HDFS = eINSTANCE.getHdfs();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS__OCCIWARE_BIGDATA_UI_PORT = eINSTANCE.getHdfs_OcciwareBigdataUiPort();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Data Nodes Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP = eINSTANCE.getHdfs_OcciwareBigdataDataNodesIp();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME = eINSTANCE.getHdfs_OcciwareBigdataInstanceName();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Master Node Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT = eINSTANCE.getHdfs_OcciwareBigdataMasterNodePort();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Master Node Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP = eINSTANCE.getHdfs_OcciwareBigdataMasterNodeIp();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HDFS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHdfs__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.bigdata.impl.SparkImpl <em>Spark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.bigdata.impl.SparkImpl
		 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getSpark()
		 * @generated
		 */
		EClass SPARK = eINSTANCE.getSpark();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK__OCCIWARE_BIGDATA_UI_PORT = eINSTANCE.getSpark_OcciwareBigdataUiPort();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Workers Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK__OCCIWARE_BIGDATA_WORKERS_IP = eINSTANCE.getSpark_OcciwareBigdataWorkersIp();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK__OCCIWARE_BIGDATA_NETWORK_NAME = eINSTANCE.getSpark_OcciwareBigdataNetworkName();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPARK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSpark__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.bigdata.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.bigdata.impl.CredentialsImpl
		 * @see org.occiware.bigdata.impl.BigdataPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__OCCIWARE_BIGDATA_USERNAME = eINSTANCE.getCredentials_OcciwareBigdataUsername();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD = eINSTANCE.getCredentials_OcciwareBigdataPassword();

		/**
		 * The meta object literal for the '<em><b>Occiware Bigdata Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT = eINSTANCE.getCredentials_OcciwareBigdataEndpoint();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCredentials__AppliesConstraint__DiagnosticChain_Map();

	}

} //BigdataPackage
