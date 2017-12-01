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

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

import static io.restassured.RestAssured.given;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.occiware/platform/bigdata#
 * - term: credentials
 * - title: 
 */
public class CredentialsConnector extends org.occiware.bigdata.impl.CredentialsImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CredentialsConnector.class);

	private static final String PATH = "/rest/scheduler/login";

	private String sessionid;

	// Start of user code Credentialsconnector_constructor
	/**
	 * Constructs a credentials connector.
	 */
	CredentialsConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}

	public String getSessionid(){
		return sessionid;
	}

	public void refreshSessionId(){
		LOGGER.info("Try to get the sessionid from : "+getUrl());

		String bodyContent = "username="+getOcciwareBigdataUsername()+"&password="+getOcciwareBigdataPassword();

		Response response = given()
				.contentType(ContentType.URLENC)
				.body(bodyContent)
				.when()
				.post(getUrl()+PATH)
				.then()
				.extract()
				.response();
		if(! responseIs2xx(response)){
			LOGGER.error("Failed to get the sessionid from cloudautomation : \n"+response.asString());
			throw new RuntimeException("Failed to get the session id");
		}
		sessionid = response.asString();
	}

    private boolean responseIs2xx(Response response) {
        if (!(200 <= response.getStatusCode() && response.getStatusCode() < 300)) {
            return false;
        }
        return true;
    }

    public String getUrl(){
	    Optional<String> optionalUrl = Optional.ofNullable(this.getOcciwareBigdataEndpoint())
                .filter(urlAttribute-> ! urlAttribute.isEmpty());
	    if (optionalUrl.isPresent()){
	        LOGGER.info("Attribute url loaded ");
	        return optionalUrl.get();
        }

        Properties prop = new Properties();
        try (InputStream input = CredentialsConnector.class.getClassLoader().getResourceAsStream("resources/config.properties")){
            prop.load(input);
            LOGGER.info("Property loaded "+ prop.getProperty("server.endpoint"));
            return prop.getProperty("server.endpoint");

        } catch (IOException ex) {
            LOGGER.error("Unable to get the cloud automation service url from config.properties", ex);
        }
        LOGGER.info("Using default url : localhost:8080");
        return "localhost:8080";
    }


    // End of user code
}	
