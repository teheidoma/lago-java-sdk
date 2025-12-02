package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface InvoicesApi extends ApiClient.Api {


  /**
   * Create a one-off invoice
   * This endpoint is used for issuing a one-off invoice.
   * @param invoiceOneOffCreateInput Invoice payload (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Invoice createInvoice(@javax.annotation.Nonnull InvoiceOneOffCreateInput invoiceOneOffCreateInput);

  /**
   * Create a one-off invoice
   * Similar to <code>createInvoice</code> but it also returns the http response headers .
   * This endpoint is used for issuing a one-off invoice.
   * @param invoiceOneOffCreateInput Invoice payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Invoice> createInvoiceWithHttpInfo(@javax.annotation.Nonnull InvoiceOneOffCreateInput invoiceOneOffCreateInput);



  /**
   * Download an invoice PDF
   * This endpoint is used for downloading a specific invoice PDF document.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices/{lagoId}/download")
  @Headers({
    "Accept: application/json",
  })
  Invoice downloadInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Download an invoice PDF
   * Similar to <code>downloadInvoice</code> but it also returns the http response headers .
   * This endpoint is used for downloading a specific invoice PDF document.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/{lagoId}/download")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> downloadInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Finalize a draft invoice
   * This endpoint is used for finalizing a draft invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("PUT /invoices/{lagoId}/finalize")
  @Headers({
    "Accept: application/json",
  })
  Invoice finalizeInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Finalize a draft invoice
   * Similar to <code>finalizeInvoice</code> but it also returns the http response headers .
   * This endpoint is used for finalizing a draft invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /invoices/{lagoId}/finalize")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> finalizeInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * List all invoices
   * This endpoint is used for retrieving all invoices.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param amountFrom Filter invoices of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param amountTo Filter invoices up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param issuingDateFrom Filter invoices starting from a specific date. (optional)
   * @param issuingDateTo Filter invoices up to a specific date. (optional)
   * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;. (optional)
   * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. (optional)
   * @param paymentOverdue Filter invoices by payment_overdue. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param searchTerm Search invoices by id, number, customer name, customer external_id or customer email. (optional)
   * @param currency Filter invoices by currency. Possible values ISO 4217 currency codes. (optional)
   * @param paymentDisputeLost Filter invoices with a payment dispute lost. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param invoiceType Filter invoices by invoice type. Possible values are &#x60;subscription&#x60;, &#x60;add_on&#x60;, &#x60;credit&#x60;, &#x60;one_off&#x60;, &#x60;advance_charges&#x60; or &#x60;progressive_billing&#x60;. (optional)
   * @param selfBilled Filter invoices by self billed. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param billingEntityCodes Filter invoices by billing entity codes. Possible values are the billing entity codes you have created. (optional)
   * @param metadataKey Filter invoices by metadata. Replace &#x60;key&#x60; with the actual metadata key you want to match, and provide the corresponding value. Providing empty value will search for invoice without given metadata key. For example, &#x60;metadata[color]&#x3D;blue&#x60;. (optional)
   * @return InvoicesPaginated
   */
  @RequestLine("GET /invoices?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&amount_from={amountFrom}&amount_to={amountTo}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&status={status}&payment_status={paymentStatus}&payment_overdue={paymentOverdue}&search_term={searchTerm}&currency={currency}&payment_dispute_lost={paymentDisputeLost}&invoice_type={invoiceType}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}&metadata[key]={metadataKey}")
  @Headers({
    "Accept: application/json",
  })
  InvoicesPaginated findAllInvoices(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("amountFrom") @javax.annotation.Nullable Integer amountFrom, @Param("amountTo") @javax.annotation.Nullable Integer amountTo, @Param("issuingDateFrom") @javax.annotation.Nullable LocalDate issuingDateFrom, @Param("issuingDateTo") @javax.annotation.Nullable LocalDate issuingDateTo, @Param("status") @javax.annotation.Nullable String status, @Param("paymentStatus") @javax.annotation.Nullable String paymentStatus, @Param("paymentOverdue") @javax.annotation.Nullable Boolean paymentOverdue, @Param("searchTerm") @javax.annotation.Nullable String searchTerm, @Param("currency") @javax.annotation.Nullable String currency, @Param("paymentDisputeLost") @javax.annotation.Nullable Boolean paymentDisputeLost, @Param("invoiceType") @javax.annotation.Nullable String invoiceType, @Param("selfBilled") @javax.annotation.Nullable Boolean selfBilled, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes, @Param("metadataKey") @javax.annotation.Nullable String metadataKey);

  /**
   * List all invoices
   * Similar to <code>findAllInvoices</code> but it also returns the http response headers .
   * This endpoint is used for retrieving all invoices.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param amountFrom Filter invoices of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param amountTo Filter invoices up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)
   * @param issuingDateFrom Filter invoices starting from a specific date. (optional)
   * @param issuingDateTo Filter invoices up to a specific date. (optional)
   * @param status Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;. (optional)
   * @param paymentStatus Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. (optional)
   * @param paymentOverdue Filter invoices by payment_overdue. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param searchTerm Search invoices by id, number, customer name, customer external_id or customer email. (optional)
   * @param currency Filter invoices by currency. Possible values ISO 4217 currency codes. (optional)
   * @param paymentDisputeLost Filter invoices with a payment dispute lost. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param invoiceType Filter invoices by invoice type. Possible values are &#x60;subscription&#x60;, &#x60;add_on&#x60;, &#x60;credit&#x60;, &#x60;one_off&#x60;, &#x60;advance_charges&#x60; or &#x60;progressive_billing&#x60;. (optional)
   * @param selfBilled Filter invoices by self billed. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)
   * @param billingEntityCodes Filter invoices by billing entity codes. Possible values are the billing entity codes you have created. (optional)
   * @param metadataKey Filter invoices by metadata. Replace &#x60;key&#x60; with the actual metadata key you want to match, and provide the corresponding value. Providing empty value will search for invoice without given metadata key. For example, &#x60;metadata[color]&#x3D;blue&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /invoices?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&amount_from={amountFrom}&amount_to={amountTo}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&status={status}&payment_status={paymentStatus}&payment_overdue={paymentOverdue}&search_term={searchTerm}&currency={currency}&payment_dispute_lost={paymentDisputeLost}&invoice_type={invoiceType}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}&metadata[key]={metadataKey}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<InvoicesPaginated> findAllInvoicesWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("amountFrom") @javax.annotation.Nullable Integer amountFrom, @Param("amountTo") @javax.annotation.Nullable Integer amountTo, @Param("issuingDateFrom") @javax.annotation.Nullable LocalDate issuingDateFrom, @Param("issuingDateTo") @javax.annotation.Nullable LocalDate issuingDateTo, @Param("status") @javax.annotation.Nullable String status, @Param("paymentStatus") @javax.annotation.Nullable String paymentStatus, @Param("paymentOverdue") @javax.annotation.Nullable Boolean paymentOverdue, @Param("searchTerm") @javax.annotation.Nullable String searchTerm, @Param("currency") @javax.annotation.Nullable String currency, @Param("paymentDisputeLost") @javax.annotation.Nullable Boolean paymentDisputeLost, @Param("invoiceType") @javax.annotation.Nullable String invoiceType, @Param("selfBilled") @javax.annotation.Nullable Boolean selfBilled, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes, @Param("metadataKey") @javax.annotation.Nullable String metadataKey);


  /**
   * List all invoices
   * This endpoint is used for retrieving all invoices.
   * Note, this is equivalent to the other <code>findAllInvoices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllInvoicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
   *   <li>amountFrom - Filter invoices of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
   *   <li>amountTo - Filter invoices up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
   *   <li>issuingDateFrom - Filter invoices starting from a specific date. (optional)</li>
   *   <li>issuingDateTo - Filter invoices up to a specific date. (optional)</li>
   *   <li>status - Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;. (optional)</li>
   *   <li>paymentStatus - Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. (optional)</li>
   *   <li>paymentOverdue - Filter invoices by payment_overdue. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
   *   <li>searchTerm - Search invoices by id, number, customer name, customer external_id or customer email. (optional)</li>
   *   <li>currency - Filter invoices by currency. Possible values ISO 4217 currency codes. (optional)</li>
   *   <li>paymentDisputeLost - Filter invoices with a payment dispute lost. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
   *   <li>invoiceType - Filter invoices by invoice type. Possible values are &#x60;subscription&#x60;, &#x60;add_on&#x60;, &#x60;credit&#x60;, &#x60;one_off&#x60;, &#x60;advance_charges&#x60; or &#x60;progressive_billing&#x60;. (optional)</li>
   *   <li>selfBilled - Filter invoices by self billed. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
   *   <li>billingEntityCodes - Filter invoices by billing entity codes. Possible values are the billing entity codes you have created. (optional)</li>
   *   <li>metadataKey - Filter invoices by metadata. Replace &#x60;key&#x60; with the actual metadata key you want to match, and provide the corresponding value. Providing empty value will search for invoice without given metadata key. For example, &#x60;metadata[color]&#x3D;blue&#x60;. (optional)</li>
   *   </ul>
   * @return InvoicesPaginated
   */
  @RequestLine("GET /invoices?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&amount_from={amountFrom}&amount_to={amountTo}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&status={status}&payment_status={paymentStatus}&payment_overdue={paymentOverdue}&search_term={searchTerm}&currency={currency}&payment_dispute_lost={paymentDisputeLost}&invoice_type={invoiceType}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}&metadata[key]={metadataKey}")
  @Headers({
  "Accept: application/json",
  })
  InvoicesPaginated findAllInvoices(@QueryMap(encoded=true) FindAllInvoicesQueryParams queryParams);

  /**
  * List all invoices
  * This endpoint is used for retrieving all invoices.
  * Note, this is equivalent to the other <code>findAllInvoices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
          *   <li>amountFrom - Filter invoices of at least a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
          *   <li>amountTo - Filter invoices up to a specific amount. This parameter must be defined in cents to ensure consistent handling for all currency types. (optional)</li>
          *   <li>issuingDateFrom - Filter invoices starting from a specific date. (optional)</li>
          *   <li>issuingDateTo - Filter invoices up to a specific date. (optional)</li>
          *   <li>status - Filter invoices by status. Possible values are &#x60;draft&#x60; or &#x60;finalized&#x60;. (optional)</li>
          *   <li>paymentStatus - Filter invoices by payment status. Possible values are &#x60;pending&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;. (optional)</li>
          *   <li>paymentOverdue - Filter invoices by payment_overdue. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
          *   <li>searchTerm - Search invoices by id, number, customer name, customer external_id or customer email. (optional)</li>
          *   <li>currency - Filter invoices by currency. Possible values ISO 4217 currency codes. (optional)</li>
          *   <li>paymentDisputeLost - Filter invoices with a payment dispute lost. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
          *   <li>invoiceType - Filter invoices by invoice type. Possible values are &#x60;subscription&#x60;, &#x60;add_on&#x60;, &#x60;credit&#x60;, &#x60;one_off&#x60;, &#x60;advance_charges&#x60; or &#x60;progressive_billing&#x60;. (optional)</li>
          *   <li>selfBilled - Filter invoices by self billed. Possible values are &#x60;true&#x60; or &#x60;false&#x60;. (optional)</li>
          *   <li>billingEntityCodes - Filter invoices by billing entity codes. Possible values are the billing entity codes you have created. (optional)</li>
          *   <li>metadataKey - Filter invoices by metadata. Replace &#x60;key&#x60; with the actual metadata key you want to match, and provide the corresponding value. Providing empty value will search for invoice without given metadata key. For example, &#x60;metadata[color]&#x3D;blue&#x60;. (optional)</li>
      *   </ul>
          * @return InvoicesPaginated
      */
      @RequestLine("GET /invoices?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&amount_from={amountFrom}&amount_to={amountTo}&issuing_date_from={issuingDateFrom}&issuing_date_to={issuingDateTo}&status={status}&payment_status={paymentStatus}&payment_overdue={paymentOverdue}&search_term={searchTerm}&currency={currency}&payment_dispute_lost={paymentDisputeLost}&invoice_type={invoiceType}&self_billed={selfBilled}&billing_entity_codes={billingEntityCodes}&metadata[key]={metadataKey}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<InvoicesPaginated> findAllInvoicesWithHttpInfo(@QueryMap(encoded=true) FindAllInvoicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllInvoices</code> method in a fluent style.
   */
  public static class FindAllInvoicesQueryParams extends HashMap<String, Object> {
    public FindAllInvoicesQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams amountFrom(@javax.annotation.Nullable final Integer value) {
      put("amount_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams amountTo(@javax.annotation.Nullable final Integer value) {
      put("amount_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams issuingDateFrom(@javax.annotation.Nullable final LocalDate value) {
      put("issuing_date_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams issuingDateTo(@javax.annotation.Nullable final LocalDate value) {
      put("issuing_date_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams status(@javax.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams paymentStatus(@javax.annotation.Nullable final String value) {
      put("payment_status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams paymentOverdue(@javax.annotation.Nullable final Boolean value) {
      put("payment_overdue", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams searchTerm(@javax.annotation.Nullable final String value) {
      put("search_term", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams currency(@javax.annotation.Nullable final String value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams paymentDisputeLost(@javax.annotation.Nullable final Boolean value) {
      put("payment_dispute_lost", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams invoiceType(@javax.annotation.Nullable final String value) {
      put("invoice_type", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams selfBilled(@javax.annotation.Nullable final Boolean value) {
      put("self_billed", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicesQueryParams billingEntityCodes(@javax.annotation.Nullable final List<String> value) {
      put("billing_entity_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public FindAllInvoicesQueryParams metadataKey(@javax.annotation.Nullable final String value) {
      put("metadata[key]", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve an invoice
   * This endpoint is used for retrieving a specific invoice that has been issued.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("GET /invoices/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  Invoice findInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve an invoice
   * Similar to <code>findInvoice</code> but it also returns the http response headers .
   * This endpoint is used for retrieving a specific invoice that has been issued.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /invoices/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> findInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Generate a payment URL
   * This endpoint generates a checkout link for a specific invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return InvoicePaymentUrl
   */
  @RequestLine("POST /invoices/{lagoId}/payment_url")
  @Headers({
    "Accept: application/json",
  })
  InvoicePaymentUrl invoicePaymentUrl(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Generate a payment URL
   * Similar to <code>invoicePaymentUrl</code> but it also returns the http response headers .
   * This endpoint generates a checkout link for a specific invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/{lagoId}/payment_url")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<InvoicePaymentUrl> invoicePaymentUrlWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Create an invoice preview
   * This endpoint is used for generating invoice preview.
   * @param invoicePreviewInput Invoice preview payload (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices/preview")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Invoice invoicePreview(@javax.annotation.Nonnull InvoicePreviewInput invoicePreviewInput);

  /**
   * Create an invoice preview
   * Similar to <code>invoicePreview</code> but it also returns the http response headers .
   * This endpoint is used for generating invoice preview.
   * @param invoicePreviewInput Invoice preview payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/preview")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Invoice> invoicePreviewWithHttpInfo(@javax.annotation.Nonnull InvoicePreviewInput invoicePreviewInput);



  /**
   * Mark an invoice payment dispute as lost
   * This endpoint is used for setting invoice&#39;s payment dispute as lost.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices/{lagoId}/lose_dispute")
  @Headers({
    "Accept: application/json",
  })
  Invoice loseDisputeInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Mark an invoice payment dispute as lost
   * Similar to <code>loseDisputeInvoice</code> but it also returns the http response headers .
   * This endpoint is used for setting invoice&#39;s payment dispute as lost.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/{lagoId}/lose_dispute")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> loseDisputeInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Refresh a draft invoice
   * This endpoint is used for refreshing a draft invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("PUT /invoices/{lagoId}/refresh")
  @Headers({
    "Accept: application/json",
  })
  Invoice refreshInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Refresh a draft invoice
   * Similar to <code>refreshInvoice</code> but it also returns the http response headers .
   * This endpoint is used for refreshing a draft invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /invoices/{lagoId}/refresh")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> refreshInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Retry generation of a failed invoice
   * This endpoint is used for retrying to generate a failed invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices/{lagoId}/retry")
  @Headers({
    "Accept: application/json",
  })
  Invoice retryInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retry generation of a failed invoice
   * Similar to <code>retryInvoice</code> but it also returns the http response headers .
   * This endpoint is used for retrying to generate a failed invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/{lagoId}/retry")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> retryInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Retry an invoice payment
   * This endpoint resends an invoice for collection and retry a payment.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   */
  @RequestLine("POST /invoices/{lagoId}/retry_payment")
  @Headers({
    "Accept: application/json",
  })
  void retryPayment(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retry an invoice payment
   * Similar to <code>retryPayment</code> but it also returns the http response headers .
   * This endpoint resends an invoice for collection and retry a payment.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   */
  @RequestLine("POST /invoices/{lagoId}/retry_payment")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> retryPaymentWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Update an invoice
   * This endpoint is used for updating an existing invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @param invoiceUpdateInput Update an existing invoice (required)
   * @return Invoice
   */
  @RequestLine("PUT /invoices/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Invoice updateInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull InvoiceUpdateInput invoiceUpdateInput);

  /**
   * Update an invoice
   * Similar to <code>updateInvoice</code> but it also returns the http response headers .
   * This endpoint is used for updating an existing invoice.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @param invoiceUpdateInput Update an existing invoice (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /invoices/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Invoice> updateInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull InvoiceUpdateInput invoiceUpdateInput);



  /**
   * Void an invoice
   * This endpoint is used for voiding an invoice. You can void an invoice only when it&#39;s in a &#x60;finalized&#x60; status, and the payment status is not &#x60;succeeded&#x60;.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return Invoice
   */
  @RequestLine("POST /invoices/{lagoId}/void")
  @Headers({
    "Accept: application/json",
  })
  Invoice voidInvoice(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Void an invoice
   * Similar to <code>voidInvoice</code> but it also returns the http response headers .
   * This endpoint is used for voiding an invoice. You can void an invoice only when it&#39;s in a &#x60;finalized&#x60; status, and the payment status is not &#x60;succeeded&#x60;.
   * @param lagoId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /invoices/{lagoId}/void")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Invoice> voidInvoiceWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);


}
