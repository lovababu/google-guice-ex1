package org.avol.guice.module;

import com.google.inject.AbstractModule;
import org.avol.guice.annotations.FbMessage;
import org.avol.guice.annotations.TwitterMessage;
import org.avol.guice.rest.FacebookResource;
import org.avol.guice.rest.TwitterResource;
import org.avol.guice.service.MessageService;
import org.avol.guice.service.impl.FacebookMessageServiceImpl;
import org.avol.guice.service.impl.TwitterMessageServiceImpl;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class MessageModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(TwitterMessage.class).toProvider(() -> "Hello, guice from twitter.");
        bind(String.class).annotatedWith(FbMessage.class).toProvider(() -> "Hello, guice from facebook.");
        bind(MessageService.class).annotatedWith(TwitterMessage.class).to(TwitterMessageServiceImpl.class);
        bind(MessageService.class).annotatedWith(FbMessage.class).to(FacebookMessageServiceImpl.class);

        bind(FacebookResource.class);
        bind(TwitterResource.class);
    }
}
