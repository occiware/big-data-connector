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
 * Generated at Thu Nov 23 11:34:47 CET 2017 from platform:/plugin/org.eclipse.cmf.occi.platform/model/Platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.occiware.bigdata.platform.connector;

import io.restassured.http.ContentType;
import org.eclipse.cmf.occi.platform.Status;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.occiware.bigdata.connector.CredentialsConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static io.restassured.RestAssured.given;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/platform#
 * - term: application
 * - title: Application
 */
public class ApplicationConnector extends org.eclipse.cmf.occi.platform.impl.ApplicationImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConnector.class);

	private static final String SERVICE_INSTANCE_PATH = "/cloud-automation-service/serviceInstances";

	// Start of user code Applicationconnector_constructor
	/**
	 * Constructs a application connector.
	 */
	ApplicationConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ApplicationocciCreate
	/**
	 * Called when this Application instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Application_occiRetrieve_method
	/**
	 * Called when this Application instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Application_occiUpdate_method
	/**
	 * Called when this Application instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ApplicationocciDelete_method
	/**
	 * Called when this Application instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Application actions.
	//
	// Start of user code Application_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/application/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			setOcciAppState(Status.ACTIVE);

            CredentialsConnector creds = getCredentialsConnector();


            JSONObject content = new JSONObject();
            JSONObject genericInfo = new JSONObject();
            JSONObject variables = new JSONObject();

            genericInfo.put("pca.service.model","proactive.platform.bigdata");
            genericInfo.put("pca.service.type","Platform");
            genericInfo.put("pca.action.type","create");

            variables.put("pca.instance.id",this.getTitle());

            content.put("genericInfo",genericInfo);
            content.put("variables",variables);

            LOGGER.info("POST request in order to start the platform :\n"+content.toJSONString());
            Optional<String> optionalResponse = RequestUtils.postRequestWithSessionId(
                    given().contentType(ContentType.JSON)
                            .body(content.toJSONString()),
                    creds.getUrl() + SERVICE_INSTANCE_PATH,
                    creds);
            JSONObject response = (JSONObject) JSONValue.parse(optionalResponse
                    .orElseThrow(() -> new ConnectionFailedException("Unable to get the instance "+title)));

            LOGGER.info(response.toJSONString());

            break;

		default:
			break;
		}
	}
		// End of user code

	// Start of user code Application_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/application/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			setOcciAppState(Status.INACTIVE);

            CredentialsConnector creds = getCredentialsConnector();

            JSONObject content = new JSONObject();
            JSONObject genericInfo = new JSONObject();
            JSONObject variables = new JSONObject();



            genericInfo.put("pca.service.model","proactive.platform.bigdata");
            genericInfo.put("pca.service.type","Platform");
            genericInfo.put("pca.action.type","delete");

            variables.put("pca.instance.id",this.getTitle());

            content.put("genericInfo",genericInfo);
            content.put("variables",variables);


            LOGGER.info("DELETE request in order to delete the application");
            LOGGER.info("Delete request \n : "+content.toJSONString());
            Optional<String> optionalResponse = RequestUtils.deleteRequestWithSessionId(
                    given().contentType(ContentType.JSON)
                            .body(content.toJSONString()),
                    creds.getUrl()+SERVICE_INSTANCE_PATH,
                    creds);
            LOGGER.info(optionalResponse.orElse("No response for the stop application request"));

            break;

		default:
			break;
		}
	}

    private CredentialsConnector getCredentialsConnector(){
        return MixinUtils.getMixinBase(this.getParts(),CredentialsConnector.class)
                .orElseThrow(() -> new MissingParameterException("Credentials mixin was not associated to the instance"));
    }
		// End of user code
}	
