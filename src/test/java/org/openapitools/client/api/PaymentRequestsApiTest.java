package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.PaymentRequest;
import org.openapitools.client.model.PaymentRequestCreateInput;
import org.openapitools.client.model.PaymentRequestsPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentRequestsApi
 */
class PaymentRequestsApiTest {

    private PaymentRequestsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentRequestsApi.class);
    }

    
    /**
     * Create a payment request
     *
     * This endpoint is used to create a payment request to collect payments of overdue invoices of a given customer
     */
    @Test
    void createPaymentRequestTest() {
        PaymentRequestCreateInput paymentRequestCreateInput = null;
        // PaymentRequest response = api.createPaymentRequest(paymentRequestCreateInput);

        // TODO: test validations
    }

    
    /**
     * List all payment requests
     *
     * This endpoint is used to list all existing payment requests.
     */
    @Test
    void findAllPaymentRequestsTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        // PaymentRequestsPaginated response = api.findAllPaymentRequests(page, perPage, externalCustomerId);

        // TODO: test validations
    }

    /**
     * List all payment requests
     *
     * This endpoint is used to list all existing payment requests.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllPaymentRequestsTestQueryMap() {
        PaymentRequestsApi.FindAllPaymentRequestsQueryParams queryParams = new PaymentRequestsApi.FindAllPaymentRequestsQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null);
        // PaymentRequestsPaginated response = api.findAllPaymentRequests(queryParams);

    // TODO: test validations
    }
    
}
