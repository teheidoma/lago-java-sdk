package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.CustomerCheckoutUrl;
import org.openapitools.client.model.CustomerCreateInput;
import org.openapitools.client.model.CustomerPastUsage;
import org.openapitools.client.model.CustomerUsage;
import org.openapitools.client.model.CustomersPaginated;
import org.openapitools.client.model.GetCustomerPortalUrl200Response;
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
 * API tests for CustomersApi
 */
class CustomersApiTest {

    private CustomersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(CustomersApi.class);
    }

    
    /**
     * Create a customer
     *
     * This endpoint creates a new customer.
     */
    @Test
    void createCustomerTest() {
        CustomerCreateInput customerCreateInput = null;
        // Customer response = api.createCustomer(customerCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete an applied coupon
     *
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     */
    @Test
    void deleteAppliedCouponTest() {
        String externalCustomerId = null;
        UUID appliedCouponId = null;
        // AppliedCoupon response = api.deleteAppliedCoupon(externalCustomerId, appliedCouponId);

        // TODO: test validations
    }

    
    /**
     * Delete a customer
     *
     * This endpoint deletes an existing customer.
     */
    @Test
    void destroyCustomerTest() {
        String externalCustomerId = null;
        // Customer response = api.destroyCustomer(externalCustomerId);

        // TODO: test validations
    }

    
    /**
     * Retrieve customer past usage
     *
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     */
    @Test
    void findAllCustomerPastUsageTest() {
        String externalCustomerId = null;
        String externalSubscriptionId = null;
        Integer page = null;
        Integer perPage = null;
        String billableMetricCode = null;
        Integer periodsCount = null;
        // CustomerPastUsage response = api.findAllCustomerPastUsage(externalCustomerId, externalSubscriptionId, page, perPage, billableMetricCode, periodsCount);

        // TODO: test validations
    }

    /**
     * Retrieve customer past usage
     *
     * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllCustomerPastUsageTestQueryMap() {
        String externalCustomerId = null;
        CustomersApi.FindAllCustomerPastUsageQueryParams queryParams = new CustomersApi.FindAllCustomerPastUsageQueryParams()
            .page(null)
            .perPage(null)
            .externalSubscriptionId(null)
            .billableMetricCode(null)
            .periodsCount(null);
        // CustomerPastUsage response = api.findAllCustomerPastUsage(externalCustomerId, queryParams);

    // TODO: test validations
    }
    
    /**
     * List all customers
     *
     * This endpoint retrieves all existing customers.
     */
    @Test
    void findAllCustomersTest() {
        Integer page = null;
        Integer perPage = null;
        List<String> accountType = null;
        List<String> billingEntityCodes = null;
        // CustomersPaginated response = api.findAllCustomers(page, perPage, accountType, billingEntityCodes);

        // TODO: test validations
    }

    /**
     * List all customers
     *
     * This endpoint retrieves all existing customers.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllCustomersTestQueryMap() {
        CustomersApi.FindAllCustomersQueryParams queryParams = new CustomersApi.FindAllCustomersQueryParams()
            .page(null)
            .perPage(null)
            .accountType(null)
            .billingEntityCodes(null);
        // CustomersPaginated response = api.findAllCustomers(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a customer
     *
     * This endpoint retrieves an existing customer.
     */
    @Test
    void findCustomerTest() {
        String externalCustomerId = null;
        // Customer response = api.findCustomer(externalCustomerId);

        // TODO: test validations
    }

    
    /**
     * Retrieve customer current usage
     *
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     */
    @Test
    void findCustomerCurrentUsageTest() {
        String externalCustomerId = null;
        String externalSubscriptionId = null;
        Boolean applyTaxes = null;
        // CustomerUsage response = api.findCustomerCurrentUsage(externalCustomerId, externalSubscriptionId, applyTaxes);

        // TODO: test validations
    }

    /**
     * Retrieve customer current usage
     *
     * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findCustomerCurrentUsageTestQueryMap() {
        String externalCustomerId = null;
        CustomersApi.FindCustomerCurrentUsageQueryParams queryParams = new CustomersApi.FindCustomerCurrentUsageQueryParams()
            .externalSubscriptionId(null)
            .applyTaxes(null);
        // CustomerUsage response = api.findCustomerCurrentUsage(externalCustomerId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Generate a Customer Payment Provider Checkout URL
     *
     * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
     */
    @Test
    void generateCustomerCheckoutURLTest() {
        String externalCustomerId = null;
        // CustomerCheckoutUrl response = api.generateCustomerCheckoutURL(externalCustomerId);

        // TODO: test validations
    }

    
    /**
     * Get a customer portal URL
     *
     * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
     */
    @Test
    void getCustomerPortalUrlTest() {
        String externalCustomerId = null;
        // GetCustomerPortalUrl200Response response = api.getCustomerPortalUrl(externalCustomerId);

        // TODO: test validations
    }

    
}
