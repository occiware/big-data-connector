package org.occiware.bigdata.platform.connector;

/**
 * Created by mael on 29/11/17.
 */
public class ConnectionFailedException extends RuntimeException {
    public ConnectionFailedException(String s) {
        super(s);
    }
}
