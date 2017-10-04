package org.avol.guice.service.impl;

import org.avol.guice.annotations.FbMessage;
import org.avol.guice.annotations.TwitterMessage;
import org.avol.guice.service.MessageService;

import javax.inject.Inject;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class FacebookMessageServiceImpl implements MessageService {

    @Inject
    @FbMessage
    private String msg;

    @Override
    public void send(String msg) {
        System.out.println(String.format("Posting %s on facebook wall.", msg));
    }

    @Override
    public String receive() {
        return msg;
    }
}
