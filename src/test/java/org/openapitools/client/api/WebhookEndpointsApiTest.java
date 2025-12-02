package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.WebhookEndpoint;
import org.openapitools.client.model.WebhookEndpointCreateInput;
import org.openapitools.client.model.WebhookEndpointUpdateInput;
import org.openapitools.client.model.WebhookEndpointsPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookEndpointsApi
 */
class WebhookEndpointsApiTest {

    private WebhookEndpointsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(WebhookEndpointsApi.class);
    }

    
    /**
     * Create a webhook_endpoint
     *
     * This endpoint is used to create a webhook endpoint.
     */
    @Test
    void createWebhookEndpointTest() {
        WebhookEndpointCreateInput webhookEndpointCreateInput = null;
        // WebhookEndpoint response = api.createWebhookEndpoint(webhookEndpointCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete a webhook endpoint
     *
     * This endpoint is used to delete an existing webhook endpoint.
     */
    @Test
    void destroyWebhookEndpointTest() {
        UUID lagoId = null;
        // WebhookEndpoint response = api.destroyWebhookEndpoint(lagoId);

        // TODO: test validations
    }

    
    /**
     * List all webhook endpoints
     *
     * This endpoint is used to list all webhook endpoints.
     */
    @Test
    void findAllWebhookEndpointsTest() {
        Integer page = null;
        Integer perPage = null;
        // WebhookEndpointsPaginated response = api.findAllWebhookEndpoints(page, perPage);

        // TODO: test validations
    }

    /**
     * List all webhook endpoints
     *
     * This endpoint is used to list all webhook endpoints.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllWebhookEndpointsTestQueryMap() {
        WebhookEndpointsApi.FindAllWebhookEndpointsQueryParams queryParams = new WebhookEndpointsApi.FindAllWebhookEndpointsQueryParams()
            .page(null)
            .perPage(null);
        // WebhookEndpointsPaginated response = api.findAllWebhookEndpoints(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a webhook endpoint
     *
     * This endpoint is used to retrieve an existing webhook endpoint.
     */
    @Test
    void findWebhookEndpointTest() {
        UUID lagoId = null;
        // WebhookEndpoint response = api.findWebhookEndpoint(lagoId);

        // TODO: test validations
    }

    
    /**
     * Update a webhook endpoint
     *
     * This endpoint is used to update an existing webhook endpoint.
     */
    @Test
    void updateWebhookEndpointTest() {
        UUID lagoId = null;
        WebhookEndpointUpdateInput webhookEndpointUpdateInput = null;
        // WebhookEndpoint response = api.updateWebhookEndpoint(lagoId, webhookEndpointUpdateInput);

        // TODO: test validations
    }

    
}
