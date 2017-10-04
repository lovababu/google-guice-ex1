package org.avol.guice.rest;

import org.avol.guice.annotations.TwitterMessage;
import org.avol.guice.service.MessageService;

import javax.inject.Inject;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class TwitterResource {

    @Inject
    @TwitterMessage
    private MessageService twitter;

    public void send(String msg) {
        twitter.send(msg);
    }

    public String receive() {
        return twitter.receive();
    }
}
