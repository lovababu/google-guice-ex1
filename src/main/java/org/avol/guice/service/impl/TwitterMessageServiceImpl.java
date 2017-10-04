package org.avol.guice.service.impl;

import org.avol.guice.annotations.TwitterMessage;
import org.avol.guice.service.MessageService;

import javax.inject.Inject;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class TwitterMessageServiceImpl implements MessageService {

    @Inject
    @TwitterMessage
    private String msg;

    @Override
    public void send(String msg) {
        System.out.println(String.format("Tweeting %s on twitter", msg));
    }

    @Override
    public String receive() {
        return msg;
    }
}
