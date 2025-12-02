package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.PaymentReceipt;
import org.openapitools.client.model.PaymentReceiptsPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentReceiptsApi
 */
class PaymentReceiptsApiTest {

    private PaymentReceiptsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentReceiptsApi.class);
    }

    
    /**
     * List all payment receipts
     *
     * This endpoint is used to list all existing payment receipts.
     */
    @Test
    void findAllPaymentReceiptsTest() {
        Integer page = null;
        Integer perPage = null;
        String invoiceId = null;
        // PaymentReceiptsPaginated response = api.findAllPaymentReceipts(page, perPage, invoiceId);

        // TODO: test validations
    }

    /**
     * List all payment receipts
     *
     * This endpoint is used to list all existing payment receipts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllPaymentReceiptsTestQueryMap() {
        PaymentReceiptsApi.FindAllPaymentReceiptsQueryParams queryParams = new PaymentReceiptsApi.FindAllPaymentReceiptsQueryParams()
            .page(null)
            .perPage(null)
            .invoiceId(null);
        // PaymentReceiptsPaginated response = api.findAllPaymentReceipts(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a payment receipt
     *
     * This endpoint retrieves a specific payment receipt.
     */
    @Test
    void findPaymentReceiptTest() {
        String lagoId = null;
        // PaymentReceipt response = api.findPaymentReceipt(lagoId);

        // TODO: test validations
    }

    
}
