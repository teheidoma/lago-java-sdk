package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.Fee;
import org.openapitools.client.model.FeeUpdateInput;
import org.openapitools.client.model.FeesPaginated;
import java.time.OffsetDateTime;
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
 * API tests for FeesApi
 */
class FeesApiTest {

    private FeesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(FeesApi.class);
    }

    
    /**
     * Delete a fee
     *
     * This endpoint is used for deleting a specific fee that has not yet been invoiced
     */
    @Test
    void deleteFeeTest() {
        UUID lagoId = null;
        // Fee response = api.deleteFee(lagoId);

        // TODO: test validations
    }

    
    /**
     * List all fees
     *
     * This endpoint is used for retrieving all fees that has been issued.
     */
    @Test
    void findAllFeesTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        String externalSubscriptionId = null;
        String eventTransactionId = null;
        Currency currency = null;
        String feeType = null;
        String billableMetricCode = null;
        String paymentStatus = null;
        OffsetDateTime createdAtFrom = null;
        OffsetDateTime createdAtTo = null;
        OffsetDateTime succeededAtFrom = null;
        OffsetDateTime succeededAtTo = null;
        OffsetDateTime failedAtFrom = null;
        OffsetDateTime failedAtTo = null;
        OffsetDateTime refundedAtFrom = null;
        OffsetDateTime refundedAtTo = null;
        // FeesPaginated response = api.findAllFees(page, perPage, externalCustomerId, externalSubscriptionId, eventTransactionId, currency, feeType, billableMetricCode, paymentStatus, createdAtFrom, createdAtTo, succeededAtFrom, succeededAtTo, failedAtFrom, failedAtTo, refundedAtFrom, refundedAtTo);

        // TODO: test validations
    }

    /**
     * List all fees
     *
     * This endpoint is used for retrieving all fees that has been issued.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllFeesTestQueryMap() {
        FeesApi.FindAllFeesQueryParams queryParams = new FeesApi.FindAllFeesQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null)
            .externalSubscriptionId(null)
            .eventTransactionId(null)
            .currency(null)
            .feeType(null)
            .billableMetricCode(null)
            .paymentStatus(null)
            .createdAtFrom(null)
            .createdAtTo(null)
            .succeededAtFrom(null)
            .succeededAtTo(null)
            .failedAtFrom(null)
            .failedAtTo(null)
            .refundedAtFrom(null)
            .refundedAtTo(null);
        // FeesPaginated response = api.findAllFees(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a specific fee
     *
     * This endpoint is used for retrieving a specific fee that has been issued.
     */
    @Test
    void findFeeTest() {
        UUID lagoId = null;
        // Fee response = api.findFee(lagoId);

        // TODO: test validations
    }

    
    /**
     * Update a fee
     *
     * This endpoint is used for updating a specific fee that has been issued.
     */
    @Test
    void updateFeeTest() {
        UUID lagoId = null;
        FeeUpdateInput feeUpdateInput = null;
        // Fee response = api.updateFee(lagoId, feeUpdateInput);

        // TODO: test validations
    }

    
}
