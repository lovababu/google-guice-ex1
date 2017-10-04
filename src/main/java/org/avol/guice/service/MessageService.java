package org.avol.guice.service;

/**
 * @author Durga, Padala on 04/10/17.
 */
public interface MessageService {

    void send(String msg);

    String receive();
}
