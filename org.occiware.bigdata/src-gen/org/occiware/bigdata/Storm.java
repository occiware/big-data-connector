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
 * A representation of the model object '<em><b>Storm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.bigdata.Storm#getOcciwareBigdataWorkersNumber <em>Occiware Bigdata Workers Number</em>}</li>
 *   <li>{@link org.occiware.bigdata.Storm#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}</li>
 * </ul>
 *
 * @see org.occiware.bigdata.BigdataPackage#getStorm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Storm extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Workers Number</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * workersNumber is the number of worker that will be deployed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Workers Number</em>' attribute.
	 * @see #setOcciwareBigdataWorkersNumber(Integer)
	 * @see org.occiware.bigdata.BigdataPackage#getStorm_OcciwareBigdataWorkersNumber()
	 * @model default="2" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Storm!occiwareBigdataWorkersNumber'"
	 * @generated
	 */
	Integer getOcciwareBigdataWorkersNumber();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Storm#getOcciwareBigdataWorkersNumber <em>Occiware Bigdata Workers Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Workers Number</em>' attribute.
	 * @see #getOcciwareBigdataWorkersNumber()
	 * @generated
	 */
	void setOcciwareBigdataWorkersNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Occiware Bigdata Ui Port</b></em>' attribute.
	 * The default value is <code>"8099"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uiPort is the port that will display visdomuser interface 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occiware Bigdata Ui Port</em>' attribute.
	 * @see #setOcciwareBigdataUiPort(Integer)
	 * @see org.occiware.bigdata.BigdataPackage#getStorm_OcciwareBigdataUiPort()
	 * @model default="8099" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.occiware/platform/bigdata/ecore!Storm!occiwareBigdataUiPort'"
	 * @generated
	 */
	Integer getOcciwareBigdataUiPort();

	/**
	 * Sets the value of the '{@link org.occiware.bigdata.Storm#getOcciwareBigdataUiPort <em>Occiware Bigdata Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occiware Bigdata Ui Port</em>' attribute.
	 * @see #getOcciwareBigdataUiPort()
	 * @generated
	 */
	void setOcciwareBigdataUiPort(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Storm::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(platform::Application)\n *       in\n *         \'Storm::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Storm_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Application = idResolver.getClass(&lt;%org.occiware.bigdata.BigdataTables%&gt;.CLSSid_Application, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Application).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.bigdata.BigdataTables%&gt;.STR_Storm_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.bigdata.BigdataTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Storm
