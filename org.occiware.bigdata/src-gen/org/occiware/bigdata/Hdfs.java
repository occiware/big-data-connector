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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hdfs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}</li>
 *   <li>{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataDataNodesIp <em>Occiware Bigdata Data Nodes Ip</em>}</li>
 *   <li>{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataInstanceName <em>Occiware Bigdata Instance Name</em>}</li>
 *   <li>{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodePort <em>Occiware Bigdata Master Node Port</em>}</li>
 *   <li>{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodeIp <em>Occiware Bigdata Master Node Ip</em>}</li>
 * </ul>
 *
 * @see org.occiware.bigdata.BigdataPackage#getHdfs()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Hdfs extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute.
	 * The default value is <code>"6000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uiPort will display HDFS user interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Ui Port</em>' attribute.
	 * @see #setOcciwareBigdataUiPort(Integer)
	 * @see org.occiware.bigdata.BigdataPackage#getHdfs_OcciwareBigdataUiPort()
	 * @model default="6000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Hdfs!occiwareBigdataUiPort'"
	 * @generated
	 */
	Integer getOcciwareBigdataUiPort();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Ui Port</em>' attribute.
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 */
	void setOcciwareBigdataUiPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Data Nodes Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dataNodesIp is list of nodes ip
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Data Nodes Ip</em>' attribute.
	 * @see #setOcciwareBigdataDataNodesIp(String)
	 * @see org.occiware.bigdata.BigdataPackage#getHdfs_OcciwareBigdataDataNodesIp()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Hdfs!occiwareBigdataDataNodesIp'"
	 * @generated
	 */
	String getOcciwareBigdataDataNodesIp();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataDataNodesIp <em>Occiware Bigdata Data Nodes Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Data Nodes Ip</em>' attribute.
	 * @see #getOcciwareBigdataDataNodesIp()
	 * @generated
	 */
	void setOcciwareBigdataDataNodesIp(String value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Instance Name</b></em>' attribute.
	 * The default value is <code>"hdfsContainer"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * instanceName is the hdfsContainer name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Instance Name</em>' attribute.
	 * @see #setOcciwareBigdataInstanceName(String)
	 * @see org.occiware.bigdata.BigdataPackage#getHdfs_OcciwareBigdataInstanceName()
	 * @model default="hdfsContainer" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Hdfs!occiwareBigdataInstanceName'"
	 * @generated
	 */
	String getOcciwareBigdataInstanceName();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataInstanceName <em>Occiware Bigdata Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Instance Name</em>' attribute.
	 * @see #getOcciwareBigdataInstanceName()
	 * @generated
	 */
	void setOcciwareBigdataInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Master Node Port</b></em>' attribute.
	 * The default value is <code>"50010"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * masterNodePort is the port entry of the master datanode of HDFS 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Master Node Port</em>' attribute.
	 * @see #setOcciwareBigdataMasterNodePort(Integer)
	 * @see org.occiware.bigdata.BigdataPackage#getHdfs_OcciwareBigdataMasterNodePort()
	 * @model default="50010" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Hdfs!occiwareBigdataMasterNodePort'"
	 * @generated
	 */
	Integer getOcciwareBigdataMasterNodePort();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodePort <em>Occiware Bigdata Master Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Master Node Port</em>' attribute.
	 * @see #getOcciwareBigdataMasterNodePort()
	 * @generated
	 */
	void setOcciwareBigdataMasterNodePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Master Node Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * masterNodeIp is the IP adress of the HDFS master node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Master Node Ip</em>' attribute.
	 * @see #setOcciwareBigdataMasterNodeIp(String)
	 * @see org.occiware.bigdata.BigdataPackage#getHdfs_OcciwareBigdataMasterNodeIp()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Hdfs!occiwareBigdataMasterNodeIp'"
	 * @generated
	 */
	String getOcciwareBigdataMasterNodeIp();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Hdfs#getOcciwareBigdataMasterNodeIp <em>Occiware Bigdata Master Node Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Master Node Ip</em>' attribute.
	 * @see #getOcciwareBigdataMasterNodeIp()
	 * @generated
	 */
	void setOcciwareBigdataMasterNodeIp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Hdfs::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Component)\n *       in\n *         \'Hdfs::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Hdfs_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Component = idResolver.getClass(&lt;%org.occiware.bigdata.BigdataTables%&gt;.CLSSid_Component, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Component).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Hdfs_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Hdfs
