package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Payment;
import org.openapitools.client.model.PaymentCreateInput;
import org.openapitools.client.model.PaymentManualObject;
import org.openapitools.client.model.PaymentsPaginated;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface PaymentsApi extends ApiClient.Api {


  /**
   * Create a payment
   * This endpoint is used to create a manual payment
   * @param paymentCreateInput Payment payload (required)
   * @return Payment
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Payment createPayment(@javax.annotation.Nonnull PaymentCreateInput paymentCreateInput);

  /**
   * Create a payment
   * Similar to <code>createPayment</code> but it also returns the http response headers .
   * This endpoint is used to create a manual payment
   * @param paymentCreateInput Payment payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Payment> createPaymentWithHttpInfo(@javax.annotation.Nonnull PaymentCreateInput paymentCreateInput);



  /**
   * List all payments
   * This endpoint is used to list all payments
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param lagoInvoiceId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (optional)
   * @return PaymentsPaginated
   */
  @RequestLine("GET /payments?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&lago_invoice_id={lagoInvoiceId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentsPaginated findAllPayments(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("lagoInvoiceId") @javax.annotation.Nullable UUID lagoInvoiceId);

  /**
   * List all payments
   * Similar to <code>findAllPayments</code> but it also returns the http response headers .
   * This endpoint is used to list all payments
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param lagoInvoiceId Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payments?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&lago_invoice_id={lagoInvoiceId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentsPaginated> findAllPaymentsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("lagoInvoiceId") @javax.annotation.Nullable UUID lagoInvoiceId);


  /**
   * List all payments
   * This endpoint is used to list all payments
   * Note, this is equivalent to the other <code>findAllPayments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllPaymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
   *   <li>lagoInvoiceId - Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (optional)</li>
   *   </ul>
   * @return PaymentsPaginated
   */
  @RequestLine("GET /payments?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&lago_invoice_id={lagoInvoiceId}")
  @Headers({
  "Accept: application/json",
  })
  PaymentsPaginated findAllPayments(@QueryMap(encoded=true) FindAllPaymentsQueryParams queryParams);

  /**
  * List all payments
  * This endpoint is used to list all payments
  * Note, this is equivalent to the other <code>findAllPayments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
          *   <li>lagoInvoiceId - Unique identifier assigned to the invoice within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the invoice&#39;s record within the Lago system. (optional)</li>
      *   </ul>
          * @return PaymentsPaginated
      */
      @RequestLine("GET /payments?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&lago_invoice_id={lagoInvoiceId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaymentsPaginated> findAllPaymentsWithHttpInfo(@QueryMap(encoded=true) FindAllPaymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllPayments</code> method in a fluent style.
   */
  public static class FindAllPaymentsQueryParams extends HashMap<String, Object> {
    public FindAllPaymentsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentsQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentsQueryParams lagoInvoiceId(@javax.annotation.Nullable final UUID value) {
      put("lago_invoice_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a payment
   * This endpoint retrieves a specific payment by its ID.
   * @param lagoId Unique identifier of the payment. (required)
   * @return PaymentManualObject
   */
  @RequestLine("GET /payments/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentManualObject findPayment(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve a payment
   * Similar to <code>findPayment</code> but it also returns the http response headers .
   * This endpoint retrieves a specific payment by its ID.
   * @param lagoId Unique identifier of the payment. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payments/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentManualObject> findPaymentWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);


}
