package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Tax;
import org.openapitools.client.model.TaxCreateInput;
import org.openapitools.client.model.TaxUpdateInput;
import org.openapitools.client.model.TaxesPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxesApi
 */
class TaxesApiTest {

    private TaxesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(TaxesApi.class);
    }

    
    /**
     * Create a tax
     *
     * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    void createTaxTest() {
        TaxCreateInput taxCreateInput = null;
        // Tax response = api.createTax(taxCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete a tax
     *
     * This endpoint is used to delete a tax.
     */
    @Test
    void destroyTaxTest() {
        String code = null;
        // Tax response = api.destroyTax(code);

        // TODO: test validations
    }

    
    /**
     * List all taxes
     *
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    void findAllTaxesTest() {
        Integer page = null;
        Integer perPage = null;
        // TaxesPaginated response = api.findAllTaxes(page, perPage);

        // TODO: test validations
    }

    /**
     * List all taxes
     *
     * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllTaxesTestQueryMap() {
        TaxesApi.FindAllTaxesQueryParams queryParams = new TaxesApi.FindAllTaxesQueryParams()
            .page(null)
            .perPage(null);
        // TaxesPaginated response = api.findAllTaxes(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a Tax
     *
     * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
     */
    @Test
    void findTaxTest() {
        String code = null;
        // Tax response = api.findTax(code);

        // TODO: test validations
    }

    
    /**
     * Update a tax
     *
     * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
     */
    @Test
    void updateTaxTest() {
        String code = null;
        TaxUpdateInput taxUpdateInput = null;
        // Tax response = api.updateTax(code, taxUpdateInput);

        // TODO: test validations
    }

    
}
