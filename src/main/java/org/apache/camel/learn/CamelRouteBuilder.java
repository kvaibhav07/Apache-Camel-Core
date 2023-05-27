package org.apache.camel.learn;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java Domain Specific Language(DSL) Router
 */
public class CamelRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
       /* from("file:src/data?noop=true")
            .choice()
                .when(xpath("/person/city = 'London'"))
                    .log("UK message")
                    .to("file:target/messages/uk")
                .otherwise()
                    .log("Other message")
                    .to("file:target/messages/others");*/

        from("file://C:/apache-maven-3.8.3/lib?noop=true")
                .log("Transferring file one location to another location.")
                .to("file://D:/apache-camel/outputFolder").log("Transferred file to destination folder.");
    }

}
