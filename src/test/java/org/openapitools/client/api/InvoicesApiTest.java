package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Invoice;
import org.openapitools.client.model.InvoiceOneOffCreateInput;
import org.openapitools.client.model.InvoicePaymentUrl;
import org.openapitools.client.model.InvoicePreviewInput;
import org.openapitools.client.model.InvoiceUpdateInput;
import org.openapitools.client.model.InvoicesPaginated;
import java.time.LocalDate;
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
 * API tests for InvoicesApi
 */
class InvoicesApiTest {

    private InvoicesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(InvoicesApi.class);
    }

    
    /**
     * Create a one-off invoice
     *
     * This endpoint is used for issuing a one-off invoice.
     */
    @Test
    void createInvoiceTest() {
        InvoiceOneOffCreateInput invoiceOneOffCreateInput = null;
        // Invoice response = api.createInvoice(invoiceOneOffCreateInput);

        // TODO: test validations
    }

    
    /**
     * Download an invoice PDF
     *
     * This endpoint is used for downloading a specific invoice PDF document.
     */
    @Test
    void downloadInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.downloadInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * Finalize a draft invoice
     *
     * This endpoint is used for finalizing a draft invoice.
     */
    @Test
    void finalizeInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.finalizeInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * List all invoices
     *
     * This endpoint is used for retrieving all invoices.
     */
    @Test
    void findAllInvoicesTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        Integer amountFrom = null;
        Integer amountTo = null;
        LocalDate issuingDateFrom = null;
        LocalDate issuingDateTo = null;
        String status = null;
        String paymentStatus = null;
        Boolean paymentOverdue = null;
        String searchTerm = null;
        String currency = null;
        Boolean paymentDisputeLost = null;
        String invoiceType = null;
        Boolean selfBilled = null;
        List<String> billingEntityCodes = null;
        String metadataKey = null;
        // InvoicesPaginated response = api.findAllInvoices(page, perPage, externalCustomerId, amountFrom, amountTo, issuingDateFrom, issuingDateTo, status, paymentStatus, paymentOverdue, searchTerm, currency, paymentDisputeLost, invoiceType, selfBilled, billingEntityCodes, metadataKey);

        // TODO: test validations
    }

    /**
     * List all invoices
     *
     * This endpoint is used for retrieving all invoices.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllInvoicesTestQueryMap() {
        InvoicesApi.FindAllInvoicesQueryParams queryParams = new InvoicesApi.FindAllInvoicesQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null)
            .amountFrom(null)
            .amountTo(null)
            .issuingDateFrom(null)
            .issuingDateTo(null)
            .status(null)
            .paymentStatus(null)
            .paymentOverdue(null)
            .searchTerm(null)
            .currency(null)
            .paymentDisputeLost(null)
            .invoiceType(null)
            .selfBilled(null)
            .billingEntityCodes(null)
            .metadataKey(null);
        // InvoicesPaginated response = api.findAllInvoices(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve an invoice
     *
     * This endpoint is used for retrieving a specific invoice that has been issued.
     */
    @Test
    void findInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.findInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * Generate a payment URL
     *
     * This endpoint generates a checkout link for a specific invoice.
     */
    @Test
    void invoicePaymentUrlTest() {
        UUID lagoId = null;
        // InvoicePaymentUrl response = api.invoicePaymentUrl(lagoId);

        // TODO: test validations
    }

    
    /**
     * Create an invoice preview
     *
     * This endpoint is used for generating invoice preview.
     */
    @Test
    void invoicePreviewTest() {
        InvoicePreviewInput invoicePreviewInput = null;
        // Invoice response = api.invoicePreview(invoicePreviewInput);

        // TODO: test validations
    }

    
    /**
     * Mark an invoice payment dispute as lost
     *
     * This endpoint is used for setting invoice&#39;s payment dispute as lost.
     */
    @Test
    void loseDisputeInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.loseDisputeInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * Refresh a draft invoice
     *
     * This endpoint is used for refreshing a draft invoice.
     */
    @Test
    void refreshInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.refreshInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * Retry generation of a failed invoice
     *
     * This endpoint is used for retrying to generate a failed invoice.
     */
    @Test
    void retryInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.retryInvoice(lagoId);

        // TODO: test validations
    }

    
    /**
     * Retry an invoice payment
     *
     * This endpoint resends an invoice for collection and retry a payment.
     */
    @Test
    void retryPaymentTest() {
        UUID lagoId = null;
        // api.retryPayment(lagoId);

        // TODO: test validations
    }

    
    /**
     * Update an invoice
     *
     * This endpoint is used for updating an existing invoice.
     */
    @Test
    void updateInvoiceTest() {
        UUID lagoId = null;
        InvoiceUpdateInput invoiceUpdateInput = null;
        // Invoice response = api.updateInvoice(lagoId, invoiceUpdateInput);

        // TODO: test validations
    }

    
    /**
     * Void an invoice
     *
     * This endpoint is used for voiding an invoice. You can void an invoice only when it&#39;s in a &#x60;finalized&#x60; status, and the payment status is not &#x60;succeeded&#x60;.
     */
    @Test
    void voidInvoiceTest() {
        UUID lagoId = null;
        // Invoice response = api.voidInvoice(lagoId);

        // TODO: test validations
    }

    
}
