package org.occiware.bigdata.platform.connector;

/**
 * Created by mael on 29/11/17.
 */
public class MissingParameterException extends RuntimeException{

    public MissingParameterException(String message){
        super(message);
    }
}
