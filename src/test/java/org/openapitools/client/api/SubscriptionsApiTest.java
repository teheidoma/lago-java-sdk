package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.LifetimeUsage;
import org.openapitools.client.model.LifetimeUsageInput;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionCreateInput;
import org.openapitools.client.model.SubscriptionUpdateInput;
import org.openapitools.client.model.SubscriptionsPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
class SubscriptionsApiTest {

    private SubscriptionsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SubscriptionsApi.class);
    }

    
    /**
     * Assign a plan to a customer
     *
     * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
     */
    @Test
    void createSubscriptionTest() {
        SubscriptionCreateInput subscriptionCreateInput = null;
        // Subscription response = api.createSubscription(subscriptionCreateInput);

        // TODO: test validations
    }

    
    /**
     * Terminate a subscription
     *
     * This endpoint allows you to terminate a subscription.
     */
    @Test
    void destroySubscriptionTest() {
        String externalId = null;
        String status = null;
        // Subscription response = api.destroySubscription(externalId, status);

        // TODO: test validations
    }

    /**
     * Terminate a subscription
     *
     * This endpoint allows you to terminate a subscription.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void destroySubscriptionTestQueryMap() {
        String externalId = null;
        SubscriptionsApi.DestroySubscriptionQueryParams queryParams = new SubscriptionsApi.DestroySubscriptionQueryParams()
            .status(null);
        // Subscription response = api.destroySubscription(externalId, queryParams);

    // TODO: test validations
    }
    
    /**
     * List all subscriptions
     *
     * This endpoint retrieves all active subscriptions.
     */
    @Test
    void findAllSubscriptionsTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        String planCode = null;
        List<String> status = null;
        // SubscriptionsPaginated response = api.findAllSubscriptions(page, perPage, externalCustomerId, planCode, status);

        // TODO: test validations
    }

    /**
     * List all subscriptions
     *
     * This endpoint retrieves all active subscriptions.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllSubscriptionsTestQueryMap() {
        SubscriptionsApi.FindAllSubscriptionsQueryParams queryParams = new SubscriptionsApi.FindAllSubscriptionsQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null)
            .planCode(null)
            .status(null);
        // SubscriptionsPaginated response = api.findAllSubscriptions(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a subscription
     *
     * This endpoint retrieves a specific subscription.
     */
    @Test
    void findSubscriptionTest() {
        String externalId = null;
        // Subscription response = api.findSubscription(externalId);

        // TODO: test validations
    }

    
    /**
     * Retrieve subscription lifetime usage
     *
     * This endpoint enables the retrieval of the lifetime usage of a subscription.
     */
    @Test
    void getSubscriptionLifetimeUsageTest() {
        String externalId = null;
        // LifetimeUsage response = api.getSubscriptionLifetimeUsage(externalId);

        // TODO: test validations
    }

    
    /**
     * Update a subscription
     *
     * This endpoint allows you to update a subscription.
     */
    @Test
    void updateSubscriptionTest() {
        String externalId = null;
        SubscriptionUpdateInput subscriptionUpdateInput = null;
        // Subscription response = api.updateSubscription(externalId, subscriptionUpdateInput);

        // TODO: test validations
    }

    
    /**
     * Update a subscription lifetime usage
     *
     * This endpoint allows you to update the lifetime usage of a subscription.
     */
    @Test
    void updateSubscriptionLifetimeUsageTest() {
        String externalId = null;
        LifetimeUsageInput lifetimeUsageInput = null;
        // LifetimeUsage response = api.updateSubscriptionLifetimeUsage(externalId, lifetimeUsageInput);

        // TODO: test validations
    }

    
}
