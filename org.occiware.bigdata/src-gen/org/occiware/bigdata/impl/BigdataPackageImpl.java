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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.bigdata.BigdataFactory;
import org.occiware.bigdata.BigdataPackage;
import org.occiware.bigdata.Credentials;
import org.occiware.bigdata.Hdfs;
import org.occiware.bigdata.Spark;
import org.occiware.bigdata.Storm;

import org.occiware.bigdata.util.BigdataValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigdataPackageImpl extends EPackageImpl implements BigdataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdfsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.occiware.bigdata.BigdataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BigdataPackageImpl() {
		super(eNS_URI, BigdataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BigdataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BigdataPackage init() {
		if (isInited) return (BigdataPackage)EPackage.Registry.INSTANCE.getEPackage(BigdataPackage.eNS_URI);

		// Obtain or create and register package
		BigdataPackageImpl theBigdataPackage = (BigdataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BigdataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BigdataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PlatformPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBigdataPackage.createPackageContents();

		// Initialize created meta-data
		theBigdataPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBigdataPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BigdataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBigdataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BigdataPackage.eNS_URI, theBigdataPackage);
		return theBigdataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorm() {
		return stormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorm_OcciwareBigdataWorkersNumber() {
		return (EAttribute)stormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorm_OcciwareBigdataUiPort() {
		return (EAttribute)stormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorm__AppliesConstraint__DiagnosticChain_Map() {
		return stormEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHdfs() {
		return hdfsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdfs_OcciwareBigdataUiPort() {
		return (EAttribute)hdfsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdfs_OcciwareBigdataDataNodesIp() {
		return (EAttribute)hdfsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdfs_OcciwareBigdataInstanceName() {
		return (EAttribute)hdfsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdfs_OcciwareBigdataMasterNodePort() {
		return (EAttribute)hdfsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHdfs_OcciwareBigdataMasterNodeIp() {
		return (EAttribute)hdfsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHdfs__AppliesConstraint__DiagnosticChain_Map() {
		return hdfsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpark() {
		return sparkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpark_OcciwareBigdataUiPort() {
		return (EAttribute)sparkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpark_OcciwareBigdataWorkersIp() {
		return (EAttribute)sparkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpark_OcciwareBigdataNetworkName() {
		return (EAttribute)sparkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpark__AppliesConstraint__DiagnosticChain_Map() {
		return sparkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCredentials() {
		return credentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredentials_OcciwareBigdataUsername() {
		return (EAttribute)credentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredentials_OcciwareBigdataPassword() {
		return (EAttribute)credentialsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCredentials_OcciwareBigdataEndpoint() {
		return (EAttribute)credentialsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCredentials__AppliesConstraint__DiagnosticChain_Map() {
		return credentialsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigdataFactory getBigdataFactory() {
		return (BigdataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stormEClass = createEClass(STORM);
		createEAttribute(stormEClass, STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER);
		createEAttribute(stormEClass, STORM__OCCIWARE_BIGDATA_UI_PORT);
		createEOperation(stormEClass, STORM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		hdfsEClass = createEClass(HDFS);
		createEAttribute(hdfsEClass, HDFS__OCCIWARE_BIGDATA_UI_PORT);
		createEAttribute(hdfsEClass, HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP);
		createEAttribute(hdfsEClass, HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME);
		createEAttribute(hdfsEClass, HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT);
		createEAttribute(hdfsEClass, HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP);
		createEOperation(hdfsEClass, HDFS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sparkEClass = createEClass(SPARK);
		createEAttribute(sparkEClass, SPARK__OCCIWARE_BIGDATA_UI_PORT);
		createEAttribute(sparkEClass, SPARK__OCCIWARE_BIGDATA_WORKERS_IP);
		createEAttribute(sparkEClass, SPARK__OCCIWARE_BIGDATA_NETWORK_NAME);
		createEOperation(sparkEClass, SPARK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		credentialsEClass = createEClass(CREDENTIALS);
		createEAttribute(credentialsEClass, CREDENTIALS__OCCIWARE_BIGDATA_USERNAME);
		createEAttribute(credentialsEClass, CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD);
		createEAttribute(credentialsEClass, CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT);
		createEOperation(credentialsEClass, CREDENTIALS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stormEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		hdfsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sparkEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		credentialsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(stormEClass, Storm.class, "Storm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorm_OcciwareBigdataWorkersNumber(), theOCCIPackage.getInteger(), "occiwareBigdataWorkersNumber", "2", 0, 1, Storm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorm_OcciwareBigdataUiPort(), theOCCIPackage.getInteger(), "occiwareBigdataUiPort", "8099", 0, 1, Storm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getStorm__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hdfsEClass, Hdfs.class, "Hdfs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHdfs_OcciwareBigdataUiPort(), theOCCIPackage.getInteger(), "occiwareBigdataUiPort", "6000", 0, 1, Hdfs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHdfs_OcciwareBigdataDataNodesIp(), theOCCIPackage.getString(), "occiwareBigdataDataNodesIp", null, 0, 1, Hdfs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHdfs_OcciwareBigdataInstanceName(), theOCCIPackage.getString(), "occiwareBigdataInstanceName", "hdfsContainer", 0, 1, Hdfs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHdfs_OcciwareBigdataMasterNodePort(), theOCCIPackage.getInteger(), "occiwareBigdataMasterNodePort", "50010", 0, 1, Hdfs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHdfs_OcciwareBigdataMasterNodeIp(), theOCCIPackage.getString(), "occiwareBigdataMasterNodeIp", null, 1, 1, Hdfs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getHdfs__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sparkEClass, Spark.class, "Spark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpark_OcciwareBigdataUiPort(), theOCCIPackage.getString(), "occiwareBigdataUiPort", "5000", 0, 1, Spark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpark_OcciwareBigdataWorkersIp(), theOCCIPackage.getString(), "occiwareBigdataWorkersIp", null, 0, 1, Spark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpark_OcciwareBigdataNetworkName(), theOCCIPackage.getString(), "occiwareBigdataNetworkName", "my-net", 0, 1, Spark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSpark__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(credentialsEClass, Credentials.class, "Credentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredentials_OcciwareBigdataUsername(), theOCCIPackage.getString(), "occiwareBigdataUsername", null, 1, 1, Credentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredentials_OcciwareBigdataPassword(), theOCCIPackage.getString(), "occiwareBigdataPassword", null, 1, 1, Credentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredentials_OcciwareBigdataEndpoint(), theOCCIPackage.getString(), "occiwareBigdataEndpoint", null, 0, 1, Credentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCredentials__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stormEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (hdfsEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sparkEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (credentialsEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //BigdataPackageImpl
