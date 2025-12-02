package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.CreditNote;
import org.openapitools.client.model.CreditNoteCreateInput;
import org.openapitools.client.model.CreditNoteEstimateInput;
import org.openapitools.client.model.CreditNoteEstimated;
import org.openapitools.client.model.CreditNoteUpdateInput;
import org.openapitools.client.model.CreditNotes;
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
 * API tests for CreditNotesApi
 */
class CreditNotesApiTest {

    private CreditNotesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(CreditNotesApi.class);
    }

    
    /**
     * Create a credit note
     *
     * This endpoint creates a new credit note.
     */
    @Test
    void createCreditNoteTest() {
        CreditNoteCreateInput creditNoteCreateInput = null;
        // CreditNote response = api.createCreditNote(creditNoteCreateInput);

        // TODO: test validations
    }

    
    /**
     * Download a credit note PDF
     *
     * This endpoint downloads the PDF of an existing credit note.
     */
    @Test
    void downloadCreditNoteTest() {
        UUID lagoId = null;
        // CreditNote response = api.downloadCreditNote(lagoId);

        // TODO: test validations
    }

    
    /**
     * Estimate amounts for a new credit note
     *
     * This endpoint allows you to retrieve amounts for a new credit note creation.
     */
    @Test
    void estimateCreditNoteTest() {
        CreditNoteEstimateInput creditNoteEstimateInput = null;
        // CreditNoteEstimated response = api.estimateCreditNote(creditNoteEstimateInput);

        // TODO: test validations
    }

    
    /**
     * List all credit notes
     *
     * This endpoint list all existing credit notes.
     */
    @Test
    void findAllCreditNotesTest() {
        Integer page = null;
        Integer perPage = null;
        String externalCustomerId = null;
        LocalDate issuingDateFrom = null;
        LocalDate issuingDateTo = null;
        String searchTerm = null;
        String currency = null;
        String reason = null;
        String creditStatus = null;
        String refundStatus = null;
        String invoiceNumber = null;
        Integer amountFrom = null;
        Integer amountTo = null;
        Boolean selfBilled = null;
        List<String> billingEntityCodes = null;
        // CreditNotes response = api.findAllCreditNotes(page, perPage, externalCustomerId, issuingDateFrom, issuingDateTo, searchTerm, currency, reason, creditStatus, refundStatus, invoiceNumber, amountFrom, amountTo, selfBilled, billingEntityCodes);

        // TODO: test validations
    }

    /**
     * List all credit notes
     *
     * This endpoint list all existing credit notes.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllCreditNotesTestQueryMap() {
        CreditNotesApi.FindAllCreditNotesQueryParams queryParams = new CreditNotesApi.FindAllCreditNotesQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null)
            .issuingDateFrom(null)
            .issuingDateTo(null)
            .searchTerm(null)
            .currency(null)
            .reason(null)
            .creditStatus(null)
            .refundStatus(null)
            .invoiceNumber(null)
            .amountFrom(null)
            .amountTo(null)
            .selfBilled(null)
            .billingEntityCodes(null);
        // CreditNotes response = api.findAllCreditNotes(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a credit note
     *
     * This endpoint retrieves an existing credit note.
     */
    @Test
    void findCreditNoteTest() {
        String lagoId = null;
        // CreditNote response = api.findCreditNote(lagoId);

        // TODO: test validations
    }

    
    /**
     * Update a credit note
     *
     * This endpoint updates an existing credit note.
     */
    @Test
    void updateCreditNoteTest() {
        String lagoId = null;
        CreditNoteUpdateInput creditNoteUpdateInput = null;
        // CreditNote response = api.updateCreditNote(lagoId, creditNoteUpdateInput);

        // TODO: test validations
    }

    
    /**
     * Void available credit
     *
     * This endpoint voids the available credit linked to a specific credit note.
     */
    @Test
    void voidCreditNoteTest() {
        UUID lagoId = null;
        // CreditNote response = api.voidCreditNote(lagoId);

        // TODO: test validations
    }

    
}
