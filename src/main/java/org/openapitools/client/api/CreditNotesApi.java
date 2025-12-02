package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface CreditNotesApi extends ApiClient.Api {


  /**
   * Create a credit note
   * This endpoint creates a new credit note.
   * @param creditNoteCreateInput Credit note payload (required)
   * @return CreditNote
   */
  @RequestLine("POST /credit_notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreditNote createCreditNote(@javax.annotation.Nonnull CreditNoteCreateInput creditNoteCreateInput);

  /**
   * Create a credit note
   * Similar to <code>createCreditNote</code> but it also returns the http response headers .
   * This endpoint creates a new credit note.
   * @param creditNoteCreateInput Credit note payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /credit_notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreditNote> createCreditNoteWithHttpInfo(@javax.annotation.Nonnull CreditNoteCreateInput creditNoteCreateInput);



  /**
   * Download a credit note PDF
   * This endpoint downloads the PDF of an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return CreditNote
   */
  @RequestLine("POST /credit_notes/{lagoId}/download")
  @Headers({
    "Accept: application/json",
  })
  CreditNote downloadCreditNote(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Download a credit note PDF
   * Similar to <code>downloadCreditNote</code> but it also returns the http response headers .
   * This endpoint downloads the PDF of an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /credit_notes/{lagoId}/download")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CreditNote> downloadCreditNoteWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Estimate amounts for a new credit note
   * This endpoint allows you to retrieve amounts for a new credit note creation.
   * @param creditNoteEstimateInput Credit note estimate payload (optional)
   * @return CreditNoteEstimated
   */
  @RequestLine("POST /credit_notes/estimate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreditNoteEstimated estimateCreditNote(@javax.annotation.Nullable CreditNoteEstimateInput creditNoteEstimateInput);

  /**
   * Estimate amounts for a new credit note
   * Similar to <code>estimateCreditNote</code> but it also returns the http response headers .
   * This endpoint allows you to retrieve amounts for a new credit note creation.
   * @param creditNoteEstimateInput Credit note estimate payload (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /credit_notes/estimate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreditNoteEstimated> estimateCreditNoteWithHttpInfo(@javax.annotation.Nullable CreditNoteEstimateInput creditNoteEstimateInput);



  /**
   * List all credit notes
   * This endpoint list all existing credit notes.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param issuingDateFrom Filter credit notes starting from a specific date. (optional)
   * @param issuingDateTo Filter credit notes up to a specific date. (optional)
   * @param searchTerm Search credit notes by id, number, customer name, customer external_id or customer email. (optional)
   * @param currency Filter credit notes by currency. Possible values ISO 4217 currency codes. (optional)
   * @param reason Filter credit notes by reasons. Possible values are &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60;, &#x60;duplicated_charge&#x60; or &#x60;other&#x60;. (optional)
   * @param creditStatus Filter credit notes by credit status. Possible values are &#x60;available&#x60;, &#x60;consumed&#x60;  or &#x60;voided&#x60;. (optional)
   * @param refundStatus Filter credit notes by refund status. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;  or &#x60;failed&#x60;. (optional)
   * @param invoiceNumber Filter credit notes by their related invoice number. (optional)
   * @param amountFrom Filter credit notes of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param amountTo Filter credit notes up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param selfBilled Filter credit notes belonging to a self billed invoice. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param billingEntityCodes Filter credit notes by billing entity codes. (optional)
   * @return CreditNotes
   */
  @RequestLine("GET /credit_notes?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&search_term={searchTerm}&currency={currency}&reason={reason}&credit_status={creditStatus}&refund_status={refundStatus}&invoice_number={invoiceNumber}&amount_from={amountFrom}&amount_to={amountTo}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}")
  @Headers({
    "Accept: application/json",
  })
  CreditNotes findAllCreditNotes(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("issuingDateFrom") @javax.annotation.Nullable LocalDate issuingDateFrom, @Param("issuingDateTo") @javax.annotation.Nullable LocalDate issuingDateTo, @Param("searchTerm") @javax.annotation.Nullable String searchTerm, @Param("currency") @javax.annotation.Nullable String currency, @Param("reason") @javax.annotation.Nullable String reason, @Param("creditStatus") @javax.annotation.Nullable String creditStatus, @Param("refundStatus") @javax.annotation.Nullable String refundStatus, @Param("invoiceNumber") @javax.annotation.Nullable String invoiceNumber, @Param("amountFrom") @javax.annotation.Nullable Integer amountFrom, @Param("amountTo") @javax.annotation.Nullable Integer amountTo, @Param("selfBilled") @javax.annotation.Nullable Boolean selfBilled, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes);

  /**
   * List all credit notes
   * Similar to <code>findAllCreditNotes</code> but it also returns the http response headers .
   * This endpoint list all existing credit notes.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param issuingDateFrom Filter credit notes starting from a specific date. (optional)
   * @param issuingDateTo Filter credit notes up to a specific date. (optional)
   * @param searchTerm Search credit notes by id, number, customer name, customer external_id or customer email. (optional)
   * @param currency Filter credit notes by currency. Possible values ISO 4217 currency codes. (optional)
   * @param reason Filter credit notes by reasons. Possible values are &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60;, &#x60;duplicated_charge&#x60; or &#x60;other&#x60;. (optional)
   * @param creditStatus Filter credit notes by credit status. Possible values are &#x60;available&#x60;, &#x60;consumed&#x60;  or &#x60;voided&#x60;. (optional)
   * @param refundStatus Filter credit notes by refund status. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;  or &#x60;failed&#x60;. (optional)
   * @param invoiceNumber Filter credit notes by their related invoice number. (optional)
   * @param amountFrom Filter credit notes of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param amountTo Filter credit notes up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param selfBilled Filter credit notes belonging to a self billed invoice. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param billingEntityCodes Filter credit notes by billing entity codes. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /credit_notes?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&search_term={searchTerm}&currency={currency}&reason={reason}&credit_status={creditStatus}&refund_status={refundStatus}&invoice_number={invoiceNumber}&amount_from={amountFrom}&amount_to={amountTo}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CreditNotes> findAllCreditNotesWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("issuingDateFrom") @javax.annotation.Nullable LocalDate issuingDateFrom, @Param("issuingDateTo") @javax.annotation.Nullable LocalDate issuingDateTo, @Param("searchTerm") @javax.annotation.Nullable String searchTerm, @Param("currency") @javax.annotation.Nullable String currency, @Param("reason") @javax.annotation.Nullable String reason, @Param("creditStatus") @javax.annotation.Nullable String creditStatus, @Param("refundStatus") @javax.annotation.Nullable String refundStatus, @Param("invoiceNumber") @javax.annotation.Nullable String invoiceNumber, @Param("amountFrom") @javax.annotation.Nullable Integer amountFrom, @Param("amountTo") @javax.annotation.Nullable Integer amountTo, @Param("selfBilled") @javax.annotation.Nullable Boolean selfBilled, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes);


  /**
   * List all credit notes
   * This endpoint list all existing credit notes.
   * Note, this is equivalent to the other <code>findAllCreditNotes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllCreditNotesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
   *   <li>issuingDateFrom - Filter credit notes starting from a specific date. (optional)</li>
   *   <li>issuingDateTo - Filter credit notes up to a specific date. (optional)</li>
   *   <li>searchTerm - Search credit notes by id, number, customer name, customer external_id or customer email. (optional)</li>
   *   <li>currency - Filter credit notes by currency. Possible values ISO 4217 currency codes. (optional)</li>
   *   <li>reason - Filter credit notes by reasons. Possible values are &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60;, &#x60;duplicated_charge&#x60; or &#x60;other&#x60;. (optional)</li>
   *   <li>creditStatus - Filter credit notes by credit status. Possible values are &#x60;available&#x60;, &#x60;consumed&#x60;  or &#x60;voided&#x60;. (optional)</li>
   *   <li>refundStatus - Filter credit notes by refund status. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;  or &#x60;failed&#x60;. (optional)</li>
   *   <li>invoiceNumber - Filter credit notes by their related invoice number. (optional)</li>
   *   <li>amountFrom - Filter credit notes of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
   *   <li>amountTo - Filter credit notes up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
   *   <li>selfBilled - Filter credit notes belonging to a self billed invoice. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
   *   <li>billingEntityCodes - Filter credit notes by billing entity codes. (optional)</li>
   *   </ul>
   * @return CreditNotes
   */
  @RequestLine("GET /credit_notes?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&search_term={searchTerm}&currency={currency}&reason={reason}&credit_status={creditStatus}&refund_status={refundStatus}&invoice_number={invoiceNumber}&amount_from={amountFrom}&amount_to={amountTo}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}")
  @Headers({
  "Accept: application/json",
  })
  CreditNotes findAllCreditNotes(@QueryMap(encoded=true) FindAllCreditNotesQueryParams queryParams);

  /**
  * List all credit notes
  * This endpoint list all existing credit notes.
  * Note, this is equivalent to the other <code>findAllCreditNotes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
          *   <li>issuingDateFrom - Filter credit notes starting from a specific date. (optional)</li>
          *   <li>issuingDateTo - Filter credit notes up to a specific date. (optional)</li>
          *   <li>searchTerm - Search credit notes by id, number, customer name, customer external_id or customer email. (optional)</li>
          *   <li>currency - Filter credit notes by currency. Possible values ISO 4217 currency codes. (optional)</li>
          *   <li>reason - Filter credit notes by reasons. Possible values are &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60;, &#x60;duplicated_charge&#x60; or &#x60;other&#x60;. (optional)</li>
          *   <li>creditStatus - Filter credit notes by credit status. Possible values are &#x60;available&#x60;, &#x60;consumed&#x60;  or &#x60;voided&#x60;. (optional)</li>
          *   <li>refundStatus - Filter credit notes by refund status. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;  or &#x60;failed&#x60;. (optional)</li>
          *   <li>invoiceNumber - Filter credit notes by their related invoice number. (optional)</li>
          *   <li>amountFrom - Filter credit notes of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
          *   <li>amountTo - Filter credit notes up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
          *   <li>selfBilled - Filter credit notes belonging to a self billed invoice. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
          *   <li>billingEntityCodes - Filter credit notes by billing entity codes. (optional)</li>
      *   </ul>
          * @return CreditNotes
      */
      @RequestLine("GET /credit_notes?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&search_term={searchTerm}&currency={currency}&reason={reason}&credit_status={creditStatus}&refund_status={refundStatus}&invoice_number={invoiceNumber}&amount_from={amountFrom}&amount_to={amountTo}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CreditNotes> findAllCreditNotesWithHttpInfo(@QueryMap(encoded=true) FindAllCreditNotesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllCreditNotes</code> method in a fluent style.
   */
  public static class FindAllCreditNotesQueryParams extends HashMap<String, Object> {
    public FindAllCreditNotesQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams issuingDateFrom(@javax.annotation.Nullable final LocalDate value) {
      put("issuing_date_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams issuingDateTo(@javax.annotation.Nullable final LocalDate value) {
      put("issuing_date_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams searchTerm(@javax.annotation.Nullable final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams currency(@javax.annotation.Nullable final String value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams reason(@javax.annotation.Nullable final String value) {
      put("reason", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams creditStatus(@javax.annotation.Nullable final String value) {
      put("credit_status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams refundStatus(@javax.annotation.Nullable final String value) {
      put("refund_status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams invoiceNumber(@javax.annotation.Nullable final String value) {
      put("invoice_number", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams amountFrom(@javax.annotation.Nullable final Integer value) {
      put("amount_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams amountTo(@javax.annotation.Nullable final Integer value) {
      put("amount_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams selfBilled(@javax.annotation.Nullable final Boolean value) {
      put("self_billed", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCreditNotesQueryParams billingEntityCodes(@javax.annotation.Nullable final List<String> value) {
      put("billing_entity_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * Retrieve a credit note
   * This endpoint retrieves an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return CreditNote
   */
  @RequestLine("GET /credit_notes/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  CreditNote findCreditNote(@Param("lagoId") @javax.annotation.Nonnull String lagoId);

  /**
   * Retrieve a credit note
   * Similar to <code>findCreditNote</code> but it also returns the http response headers .
   * This endpoint retrieves an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /credit_notes/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CreditNote> findCreditNoteWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull String lagoId);



  /**
   * Update a credit note
   * This endpoint updates an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @param creditNoteUpdateInput Credit note update payload (required)
   * @return CreditNote
   */
  @RequestLine("PUT /credit_notes/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreditNote updateCreditNote(@Param("lagoId") @javax.annotation.Nonnull String lagoId, @javax.annotation.Nonnull CreditNoteUpdateInput creditNoteUpdateInput);

  /**
   * Update a credit note
   * Similar to <code>updateCreditNote</code> but it also returns the http response headers .
   * This endpoint updates an existing credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @param creditNoteUpdateInput Credit note update payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /credit_notes/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreditNote> updateCreditNoteWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull String lagoId, @javax.annotation.Nonnull CreditNoteUpdateInput creditNoteUpdateInput);



  /**
   * Void available credit
   * This endpoint voids the available credit linked to a specific credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return CreditNote
   */
  @RequestLine("PUT /credit_notes/{lagoId}/void")
  @Headers({
    "Accept: application/json",
  })
  CreditNote voidCreditNote(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Void available credit
   * Similar to <code>voidCreditNote</code> but it also returns the http response headers .
   * This endpoint voids the available credit linked to a specific credit note.
   * @param lagoId The credit note unique identifier, created by Lago. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /credit_notes/{lagoId}/void")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CreditNote> voidCreditNoteWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);


}
