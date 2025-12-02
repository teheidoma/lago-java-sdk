package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorForbidden;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillingEntityCreateInput;
import org.openapitools.client.model.BillingEntityObject;
import org.openapitools.client.model.BillingEntityObjectExtended;
import org.openapitools.client.model.BillingEntityUpdateInput;
import org.openapitools.client.model.GetBillingEntity200Response;
import org.openapitools.client.model.ListBillingEntities200Response;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingEntitiesApi
 */
class BillingEntitiesApiTest {

    private BillingEntitiesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BillingEntitiesApi.class);
    }

    
    /**
     * Create a billing entity
     *
     * This endpoint is used to create a new billing entity
     */
    @Test
    void createBillingEntityTest() {
        BillingEntityCreateInput billingEntityCreateInput = null;
        // BillingEntityObject response = api.createBillingEntity(billingEntityCreateInput);

        // TODO: test validations
    }

    
    /**
     * Retrieve a billing entity
     *
     * This endpoint returns a specific billing entity by its code
     */
    @Test
    void getBillingEntityTest() {
        UUID code = null;
        // GetBillingEntity200Response response = api.getBillingEntity(code);

        // TODO: test validations
    }

    
    /**
     * List all billing entities
     *
     * This endpoint returns a list of all billing entities in the organization
     */
    @Test
    void listBillingEntitiesTest() {
        // ListBillingEntities200Response response = api.listBillingEntities();

        // TODO: test validations
    }

    
    /**
     * Update a billing entity
     *
     * This endpoint is used to update an existing billing entity
     */
    @Test
    void updateBillingEntityTest() {
        UUID code = null;
        BillingEntityUpdateInput billingEntityUpdateInput = null;
        // BillingEntityObjectExtended response = api.updateBillingEntity(code, billingEntityUpdateInput);

        // TODO: test validations
    }

    
}
