package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Payment;
import org.openapitools.client.model.PaymentCreateInput;
import org.openapitools.client.model.PaymentManualObject;
import org.openapitools.client.model.PaymentsPaginated;
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
 * API tests for PaymentsApi
 */
class PaymentsApiTest {

    private PaymentsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentsApi.class);
    }

    
    /**
     * Create a payment
     *
     * This endpoint is used to create a manual payment
     */
    @Test
    void createPaymentTest() {
        PaymentCreateInput paymentCreateInput = null;
        // Payment response = api.createPayment(paymentCreateInput);

        // TODO: test validations
    }

    
    /**
     * List all payments
     *
     * This endpoint is used to list all payments
     */
    @Test
    void findAllPaymentsTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        UUID lagoInvoiceId = null;
        // PaymentsPaginated response = api.findAllPayments(page, perPage, externalCustomerId, lagoInvoiceId);

        // TODO: test validations
    }

    /**
     * List all payments
     *
     * This endpoint is used to list all payments
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllPaymentsTestQueryMap() {
        PaymentsApi.FindAllPaymentsQueryParams queryParams = new PaymentsApi.FindAllPaymentsQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null)
            .lagoInvoiceId(null);
        // PaymentsPaginated response = api.findAllPayments(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a payment
     *
     * This endpoint retrieves a specific payment by its ID.
     */
    @Test
    void findPaymentTest() {
        UUID lagoId = null;
        // PaymentManualObject response = api.findPayment(lagoId);

        // TODO: test validations
    }

    
}
