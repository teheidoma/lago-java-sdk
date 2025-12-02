package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.AddOn;
import org.openapitools.client.model.AddOnCreateInput;
import org.openapitools.client.model.AddOnUpdateInput;
import org.openapitools.client.model.AddOnsPaginated;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddOnsApi
 */
class AddOnsApiTest {

    private AddOnsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AddOnsApi.class);
    }

    
    /**
     * Create an add-on
     *
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     */
    @Test
    void createAddOnTest() {
        AddOnCreateInput addOnCreateInput = null;
        // AddOn response = api.createAddOn(addOnCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete an add-on
     *
     * This endpoint is used to delete an existing add-on.
     */
    @Test
    void destroyAddOnTest() {
        String code = null;
        // AddOn response = api.destroyAddOn(code);

        // TODO: test validations
    }

    
    /**
     * Retrieve an add-on
     *
     * This endpoint is used to retrieve a specific add-on.
     */
    @Test
    void findAddOnTest() {
        String code = null;
        // AddOn response = api.findAddOn(code);

        // TODO: test validations
    }

    
    /**
     * List all add-ons
     *
     * This endpoint is used to list all existing add-ons.
     */
    @Test
    void findAllAddOnsTest() {
        Integer page = null;
        Integer perPage = null;
        // AddOnsPaginated response = api.findAllAddOns(page, perPage);

        // TODO: test validations
    }

    /**
     * List all add-ons
     *
     * This endpoint is used to list all existing add-ons.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllAddOnsTestQueryMap() {
        AddOnsApi.FindAllAddOnsQueryParams queryParams = new AddOnsApi.FindAllAddOnsQueryParams()
            .page(null)
            .perPage(null);
        // AddOnsPaginated response = api.findAllAddOns(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update an add-on
     *
     * This endpoint is used to update an existing add-on.
     */
    @Test
    void updateAddOnTest() {
        String code = null;
        AddOnUpdateInput addOnUpdateInput = null;
        // AddOn response = api.updateAddOn(code, addOnUpdateInput);

        // TODO: test validations
    }

    
}
