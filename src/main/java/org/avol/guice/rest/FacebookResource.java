package org.avol.guice.rest;

import org.avol.guice.annotations.FbMessage;
import org.avol.guice.service.MessageService;

import javax.inject.Inject;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class FacebookResource {


    @Inject
    @FbMessage
    private MessageService fb;

    public void send(String msg) {
        fb.send(msg);
    }

    public String receive() {
        return fb.receive();
    }
}
