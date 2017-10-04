package org.avol.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.avol.guice.module.MessageModule;
import org.avol.guice.rest.FacebookResource;
import org.avol.guice.rest.TwitterResource;

/**
 * @author Durga, Padala on 04/10/17.
 */
public class GuiceTest {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new MessageModule());

        FacebookResource fr = injector.getInstance(FacebookResource.class);

        fr.send("Facebook");
        System.out.println(fr.receive());

        TwitterResource tr = injector.getInstance(TwitterResource.class);
        tr.send("Twitter");
        System.out.println(tr.receive());
    }
}
