package app.demo;

import app.DemoServiceApp;
import core.framework.api.AbstractTestModule;

/**
 * @author neo
 */
public class TestModule extends AbstractTestModule {
    @Override
    protected void initialize() {
//        overrideBinding(HTTPClient.class, new HTTPClientBuilder().build());

        load(new DemoServiceApp());
    }
}
