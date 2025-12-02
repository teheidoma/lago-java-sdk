package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
class WebhooksApiTest {

    private WebhooksApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(WebhooksApi.class);
    }

    
    /**
     * Retrieve webhook public key
     *
     * This endpoint is used to retrieve the public key used to verify the webhooks signature
     */
    @Test
    void fetchPublicKeyTest() {
        // String response = api.fetchPublicKey();

        // TODO: test validations
    }

    
}
