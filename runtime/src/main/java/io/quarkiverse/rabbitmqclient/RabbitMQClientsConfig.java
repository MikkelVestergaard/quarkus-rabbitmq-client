package io.quarkiverse.rabbitmqclient;

import java.util.Map;

import io.quarkus.runtime.annotations.*;

@ConfigRoot(name = "rabbitmqclient", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class RabbitMQClientsConfig {

    /**
     * The default client.
     */
    @ConfigItem(name = ConfigItem.PARENT)
    public RabbitMQClientConfig defaultClient;

    /**
     * Additional named clients.
     */
    @ConfigDocSection
    @ConfigDocMapKey("client-name")
    @ConfigItem(name = ConfigItem.PARENT)
    public Map<String, RabbitMQClientConfig> namedClients;
}
