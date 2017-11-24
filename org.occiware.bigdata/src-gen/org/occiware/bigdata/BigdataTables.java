/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.bigdata/model/bigdata.ecore
 * using:
 *   /org.occiware.bigdata/model/bigdata.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.bigdata;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.occiware.bigdata.BigdataTables;

/**
 * BigdataTables provides the dispatch tables for the bigdata for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class BigdataTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(BigdataPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_occiware_s_platform_s_bigdata_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.occiware/platform/bigdata/ecore", null, org.occiware.bigdata.BigdataPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/platform/ecore", null, org.eclipse.cmf.occi.platform.PlatformPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Application = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.occiware.bigdata.BigdataTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Credentials = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_org_occiware_s_platform_s_bigdata_s_ecore.getClassId("Credentials", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Hdfs = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_org_occiware_s_platform_s_bigdata_s_ecore.getClassId("Hdfs", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Spark = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_org_occiware_s_platform_s_bigdata_s_ecore.getClassId("Spark", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storm = org.occiware.bigdata.BigdataTables.PACKid_http_c_s_s_org_occiware_s_platform_s_bigdata_s_ecore.getClassId("Storm", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Credentials_c_c_appliesConstraint = "Credentials::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Hdfs_c_c_appliesConstraint = "Hdfs::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Spark_c_c_appliesConstraint = "Spark::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Storm_c_c_appliesConstraint = "Storm::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			BigdataTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Credentials = new EcoreExecutorType(BigdataPackage.Literals.CREDENTIALS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Hdfs = new EcoreExecutorType(BigdataPackage.Literals.HDFS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Spark = new EcoreExecutorType(BigdataPackage.Literals.SPARK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storm = new EcoreExecutorType(BigdataPackage.Literals.STORM, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Credentials,
			_Hdfs,
			_Spark,
			_Storm
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Credentials__Credentials = new ExecutorFragment(Types._Credentials, BigdataTables.Types._Credentials);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__MixinBase = new ExecutorFragment(Types._Credentials, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__OclAny = new ExecutorFragment(Types._Credentials, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Credentials__OclElement = new ExecutorFragment(Types._Credentials, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Hdfs__Hdfs = new ExecutorFragment(Types._Hdfs, BigdataTables.Types._Hdfs);
		private static final /*@NonNull*/ ExecutorFragment _Hdfs__MixinBase = new ExecutorFragment(Types._Hdfs, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Hdfs__OclAny = new ExecutorFragment(Types._Hdfs, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Hdfs__OclElement = new ExecutorFragment(Types._Hdfs, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Spark__MixinBase = new ExecutorFragment(Types._Spark, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Spark__OclAny = new ExecutorFragment(Types._Spark, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Spark__OclElement = new ExecutorFragment(Types._Spark, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Spark__Spark = new ExecutorFragment(Types._Spark, BigdataTables.Types._Spark);

		private static final /*@NonNull*/ ExecutorFragment _Storm__MixinBase = new ExecutorFragment(Types._Storm, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Storm__OclAny = new ExecutorFragment(Types._Storm, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storm__OclElement = new ExecutorFragment(Types._Storm, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storm__Storm = new ExecutorFragment(Types._Storm, BigdataTables.Types._Storm);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Credentials__occiwareBigdataEndpoint = new EcoreExecutorProperty(BigdataPackage.Literals.CREDENTIALS__OCCIWARE_BIGDATA_ENDPOINT, Types._Credentials, 0);
		public static final /*@NonNull*/ ExecutorProperty _Credentials__occiwareBigdataPassword = new EcoreExecutorProperty(BigdataPackage.Literals.CREDENTIALS__OCCIWARE_BIGDATA_PASSWORD, Types._Credentials, 1);
		public static final /*@NonNull*/ ExecutorProperty _Credentials__occiwareBigdataUsername = new EcoreExecutorProperty(BigdataPackage.Literals.CREDENTIALS__OCCIWARE_BIGDATA_USERNAME, Types._Credentials, 2);

		public static final /*@NonNull*/ ExecutorProperty _Hdfs__occiwareBigdataDataNodesIp = new EcoreExecutorProperty(BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_DATA_NODES_IP, Types._Hdfs, 0);
		public static final /*@NonNull*/ ExecutorProperty _Hdfs__occiwareBigdataInstanceName = new EcoreExecutorProperty(BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_INSTANCE_NAME, Types._Hdfs, 1);
		public static final /*@NonNull*/ ExecutorProperty _Hdfs__occiwareBigdataMasterNodeIp = new EcoreExecutorProperty(BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_IP, Types._Hdfs, 2);
		public static final /*@NonNull*/ ExecutorProperty _Hdfs__occiwareBigdataMasterNodePort = new EcoreExecutorProperty(BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_MASTER_NODE_PORT, Types._Hdfs, 3);
		public static final /*@NonNull*/ ExecutorProperty _Hdfs__occiwareBigdataUiPort = new EcoreExecutorProperty(BigdataPackage.Literals.HDFS__OCCIWARE_BIGDATA_UI_PORT, Types._Hdfs, 4);

		public static final /*@NonNull*/ ExecutorProperty _Spark__occiwareBigdataNetworkName = new EcoreExecutorProperty(BigdataPackage.Literals.SPARK__OCCIWARE_BIGDATA_NETWORK_NAME, Types._Spark, 0);
		public static final /*@NonNull*/ ExecutorProperty _Spark__occiwareBigdataUiPort = new EcoreExecutorProperty(BigdataPackage.Literals.SPARK__OCCIWARE_BIGDATA_UI_PORT, Types._Spark, 1);
		public static final /*@NonNull*/ ExecutorProperty _Spark__occiwareBigdataWorkersIp = new EcoreExecutorProperty(BigdataPackage.Literals.SPARK__OCCIWARE_BIGDATA_WORKERS_IP, Types._Spark, 2);

		public static final /*@NonNull*/ ExecutorProperty _Storm__occiwareBigdataUiPort = new EcoreExecutorProperty(BigdataPackage.Literals.STORM__OCCIWARE_BIGDATA_UI_PORT, Types._Storm, 0);
		public static final /*@NonNull*/ ExecutorProperty _Storm__occiwareBigdataWorkersNumber = new EcoreExecutorProperty(BigdataPackage.Literals.STORM__OCCIWARE_BIGDATA_WORKERS_NUMBER, Types._Storm, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Credentials =
		{
			Fragments._Credentials__OclAny /* 0 */,
			Fragments._Credentials__OclElement /* 1 */,
			Fragments._Credentials__MixinBase /* 2 */,
			Fragments._Credentials__Credentials /* 3 */
		};
		private static final int /*@NonNull*/ [] __Credentials = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Hdfs =
		{
			Fragments._Hdfs__OclAny /* 0 */,
			Fragments._Hdfs__OclElement /* 1 */,
			Fragments._Hdfs__MixinBase /* 2 */,
			Fragments._Hdfs__Hdfs /* 3 */
		};
		private static final int /*@NonNull*/ [] __Hdfs = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Spark =
		{
			Fragments._Spark__OclAny /* 0 */,
			Fragments._Spark__OclElement /* 1 */,
			Fragments._Spark__MixinBase /* 2 */,
			Fragments._Spark__Spark /* 3 */
		};
		private static final int /*@NonNull*/ [] __Spark = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storm =
		{
			Fragments._Storm__OclAny /* 0 */,
			Fragments._Storm__OclElement /* 1 */,
			Fragments._Storm__MixinBase /* 2 */,
			Fragments._Storm__Storm /* 3 */
		};
		private static final int /*@NonNull*/ [] __Storm = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Credentials.initFragments(_Credentials, __Credentials);
			Types._Hdfs.initFragments(_Hdfs, __Hdfs);
			Types._Spark.initFragments(_Spark, __Spark);
			Types._Storm.initFragments(_Storm, __Storm);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__Credentials = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Credentials__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hdfs__Hdfs = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hdfs__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hdfs__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Hdfs__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spark__Spark = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spark__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spark__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spark__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storm__Storm = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storm__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storm__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storm__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Credentials__Credentials.initOperations(_Credentials__Credentials);
			Fragments._Credentials__MixinBase.initOperations(_Credentials__MixinBase);
			Fragments._Credentials__OclAny.initOperations(_Credentials__OclAny);
			Fragments._Credentials__OclElement.initOperations(_Credentials__OclElement);

			Fragments._Hdfs__Hdfs.initOperations(_Hdfs__Hdfs);
			Fragments._Hdfs__MixinBase.initOperations(_Hdfs__MixinBase);
			Fragments._Hdfs__OclAny.initOperations(_Hdfs__OclAny);
			Fragments._Hdfs__OclElement.initOperations(_Hdfs__OclElement);

			Fragments._Spark__MixinBase.initOperations(_Spark__MixinBase);
			Fragments._Spark__OclAny.initOperations(_Spark__OclAny);
			Fragments._Spark__OclElement.initOperations(_Spark__OclElement);
			Fragments._Spark__Spark.initOperations(_Spark__Spark);

			Fragments._Storm__MixinBase.initOperations(_Storm__MixinBase);
			Fragments._Storm__OclAny.initOperations(_Storm__OclAny);
			Fragments._Storm__OclElement.initOperations(_Storm__OclElement);
			Fragments._Storm__Storm.initOperations(_Storm__Storm);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Credentials = {
			BigdataTables.Properties._Credentials__occiwareBigdataEndpoint,
			BigdataTables.Properties._Credentials__occiwareBigdataPassword,
			BigdataTables.Properties._Credentials__occiwareBigdataUsername
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Hdfs = {
			BigdataTables.Properties._Hdfs__occiwareBigdataDataNodesIp,
			BigdataTables.Properties._Hdfs__occiwareBigdataInstanceName,
			BigdataTables.Properties._Hdfs__occiwareBigdataMasterNodeIp,
			BigdataTables.Properties._Hdfs__occiwareBigdataMasterNodePort,
			BigdataTables.Properties._Hdfs__occiwareBigdataUiPort
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Spark = {
			BigdataTables.Properties._Spark__occiwareBigdataNetworkName,
			BigdataTables.Properties._Spark__occiwareBigdataUiPort,
			BigdataTables.Properties._Spark__occiwareBigdataWorkersIp
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storm = {
			BigdataTables.Properties._Storm__occiwareBigdataUiPort,
			BigdataTables.Properties._Storm__occiwareBigdataWorkersNumber
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Credentials__Credentials.initProperties(_Credentials);
			Fragments._Hdfs__Hdfs.initProperties(_Hdfs);
			Fragments._Spark__Spark.initProperties(_Spark);
			Fragments._Storm__Storm.initProperties(_Storm);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BigdataTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
