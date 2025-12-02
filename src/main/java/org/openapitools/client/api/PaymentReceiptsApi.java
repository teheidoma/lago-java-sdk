package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.PaymentReceipt;
import org.openapitools.client.model.PaymentReceiptsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface PaymentReceiptsApi extends ApiClient.Api {


  /**
   * List all payment receipts
   * This endpoint is used to list all existing payment receipts.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param invoiceId Filter payment receipts by invoice id. (optional)
   * @return PaymentReceiptsPaginated
   */
  @RequestLine("GET /payment_receipts?page={page}&per_page={perPage}&invoice_id={invoiceId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentReceiptsPaginated findAllPaymentReceipts(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("invoiceId") @javax.annotation.Nullable String invoiceId);

  /**
   * List all payment receipts
   * Similar to <code>findAllPaymentReceipts</code> but it also returns the http response headers .
   * This endpoint is used to list all existing payment receipts.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param invoiceId Filter payment receipts by invoice id. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_receipts?page={page}&per_page={perPage}&invoice_id={invoiceId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentReceiptsPaginated> findAllPaymentReceiptsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("invoiceId") @javax.annotation.Nullable String invoiceId);


  /**
   * List all payment receipts
   * This endpoint is used to list all existing payment receipts.
   * Note, this is equivalent to the other <code>findAllPaymentReceipts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllPaymentReceiptsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>invoiceId - Filter payment receipts by invoice id. (optional)</li>
   *   </ul>
   * @return PaymentReceiptsPaginated
   */
  @RequestLine("GET /payment_receipts?page={page}&per_page={perPage}&invoice_id={invoiceId}")
  @Headers({
  "Accept: application/json",
  })
  PaymentReceiptsPaginated findAllPaymentReceipts(@QueryMap(encoded=true) FindAllPaymentReceiptsQueryParams queryParams);

  /**
  * List all payment receipts
  * This endpoint is used to list all existing payment receipts.
  * Note, this is equivalent to the other <code>findAllPaymentReceipts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>invoiceId - Filter payment receipts by invoice id. (optional)</li>
      *   </ul>
          * @return PaymentReceiptsPaginated
      */
      @RequestLine("GET /payment_receipts?page={page}&per_page={perPage}&invoice_id={invoiceId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaymentReceiptsPaginated> findAllPaymentReceiptsWithHttpInfo(@QueryMap(encoded=true) FindAllPaymentReceiptsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllPaymentReceipts</code> method in a fluent style.
   */
  public static class FindAllPaymentReceiptsQueryParams extends HashMap<String, Object> {
    public FindAllPaymentReceiptsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentReceiptsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentReceiptsQueryParams invoiceId(@javax.annotation.Nullable final String value) {
      put("invoice_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a payment receipt
   * This endpoint retrieves a specific payment receipt.
   * @param lagoId Payment receipt ID (required)
   * @return PaymentReceipt
   */
  @RequestLine("GET /payment_receipts/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentReceipt findPaymentReceipt(@Param("lagoId") @javax.annotation.Nonnull String lagoId);

  /**
   * Retrieve a payment receipt
   * Similar to <code>findPaymentReceipt</code> but it also returns the http response headers .
   * This endpoint retrieves a specific payment receipt.
   * @param lagoId Payment receipt ID (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_receipts/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentReceipt> findPaymentReceiptWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull String lagoId);


}
