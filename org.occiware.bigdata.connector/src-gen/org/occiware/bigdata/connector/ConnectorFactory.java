/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Thu Nov 23 15:11:43 CET 2017 from platform:/resource/org.occiware.bigdata/model/bigdata.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.occiware.bigdata.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: bigdata
 * - scheme: http://org.occiware/platform/bigdata#
 */
public class ConnectorFactory extends org.occiware.bigdata.impl.BigdataFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/platform/bigdata#
	 * - term: storm
	 * - title: 
	 */
	@Override
	public org.occiware.bigdata.Storm createStorm() {
		return new StormConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/platform/bigdata#
	 * - term: hdfs
	 * - title: 
	 */
	@Override
	public org.occiware.bigdata.Hdfs createHdfs() {
		return new HdfsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/platform/bigdata#
	 * - term: spark
	 * - title: 
	 */
	@Override
	public org.occiware.bigdata.Spark createSpark() {
		return new SparkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.occiware/platform/bigdata#
	 * - term: credentials
	 * - title: 
	 */
	@Override
	public org.occiware.bigdata.Credentials createCredentials() {
		return new CredentialsConnector();
	}

}
