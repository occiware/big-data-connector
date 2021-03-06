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
 * A representation of the model object '<em><b>Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.Credentials#getOcciwareBigdataUsername <em>Occiware Bigdata Username</em>}</li>
 *   <li>{@link org.occiware.bigdata.Credentials#getOcciwareBigdataPassword <em>Occiware Bigdata Password</em>}</li>
 *   <li>{@link org.occiware.bigdata.Credentials#getOcciwareBigdataEndpoint <em>Occiware Bigdata Endpoint</em>}</li>
 * </ul>
 *
 * @see org.occiware.bigdata.BigdataPackage#getCredentials()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Credentials extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * username is the cloud-automation authentication username
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Username</em>' attribute.
	 * @see #setOcciwareBigdataUsername(String)
	 * @see org.occiware.bigdata.BigdataPackage#getCredentials_OcciwareBigdataUsername()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Credentials!occiwareBigdataUsername'"
	 * @generated
	 */
	String getOcciwareBigdataUsername();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataUsername <em>Occiware Bigdata Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Username</em>' attribute.
	 * @see #getOcciwareBigdataUsername()
	 * @generated
	 */
	void setOcciwareBigdataUsername(String value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * password is the cloud automation authentication password
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Password</em>' attribute.
	 * @see #setOcciwareBigdataPassword(String)
	 * @see org.occiware.bigdata.BigdataPackage#getCredentials_OcciwareBigdataPassword()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Credentials!occiwareBigdataPassword'"
	 * @generated
	 */
	String getOcciwareBigdataPassword();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataPassword <em>Occiware Bigdata Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Password</em>' attribute.
	 * @see #getOcciwareBigdataPassword()
	 * @generated
	 */
	void setOcciwareBigdataPassword(String value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Endpoint</em>' attribute.
	 * @see #setOcciwareBigdataEndpoint(String)
	 * @see org.occiware.bigdata.BigdataPackage#getCredentials_OcciwareBigdataEndpoint()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Credentials!occiwareBigdataEndpoint'"
	 * @generated
	 */
	String getOcciwareBigdataEndpoint();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Credentials#getOcciwareBigdataEndpoint <em>Occiware Bigdata Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Endpoint</em>' attribute.
	 * @see #getOcciwareBigdataEndpoint()
	 * @generated
	 */
	void setOcciwareBigdataEndpoint(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Credentials::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(occi::Resource)\n *       in\n *         \'Credentials::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Credentials_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Resource = idResolver.getClass(&lt;%org.occiware.bigdata.BigdataTables%&gt;.CLSSid_Resource, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Credentials_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Credentials
