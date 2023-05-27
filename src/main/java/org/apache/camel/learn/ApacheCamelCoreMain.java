package org.apache.camel.learn;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class ApacheCamelCoreMain {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.configure().addRoutesBuilder(new CamelRouteBuilder());
        main.run(args);

        /*CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new CamelRouteBuilder());
        camelContext.start();
        while (true)
            Thread.sleep(5000);*/
    }

}

