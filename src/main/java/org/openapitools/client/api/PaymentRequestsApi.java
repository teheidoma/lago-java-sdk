package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.PaymentRequest;
import org.openapitools.client.model.PaymentRequestCreateInput;
import org.openapitools.client.model.PaymentRequestsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface PaymentRequestsApi extends ApiClient.Api {


  /**
   * Create a payment request
   * This endpoint is used to create a payment request to collect payments of overdue invoices of a given customer
   * @param paymentRequestCreateInput PaymentRequest payload (required)
   * @return PaymentRequest
   */
  @RequestLine("POST /payment_requests")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentRequest createPaymentRequest(@javax.annotation.Nonnull PaymentRequestCreateInput paymentRequestCreateInput);

  /**
   * Create a payment request
   * Similar to <code>createPaymentRequest</code> but it also returns the http response headers .
   * This endpoint is used to create a payment request to collect payments of overdue invoices of a given customer
   * @param paymentRequestCreateInput PaymentRequest payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payment_requests")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentRequest> createPaymentRequestWithHttpInfo(@javax.annotation.Nonnull PaymentRequestCreateInput paymentRequestCreateInput);



  /**
   * List all payment requests
   * This endpoint is used to list all existing payment requests.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @return PaymentRequestsPaginated
   */
  @RequestLine("GET /payment_requests?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentRequestsPaginated findAllPaymentRequests(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId);

  /**
   * List all payment requests
   * Similar to <code>findAllPaymentRequests</code> but it also returns the http response headers .
   * This endpoint is used to list all existing payment requests.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_requests?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentRequestsPaginated> findAllPaymentRequestsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId);


  /**
   * List all payment requests
   * This endpoint is used to list all existing payment requests.
   * Note, this is equivalent to the other <code>findAllPaymentRequests</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllPaymentRequestsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
   *   </ul>
   * @return PaymentRequestsPaginated
   */
  @RequestLine("GET /payment_requests?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
  "Accept: application/json",
  })
  PaymentRequestsPaginated findAllPaymentRequests(@QueryMap(encoded=true) FindAllPaymentRequestsQueryParams queryParams);

  /**
  * List all payment requests
  * This endpoint is used to list all existing payment requests.
  * Note, this is equivalent to the other <code>findAllPaymentRequests</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
      *   </ul>
          * @return PaymentRequestsPaginated
      */
      @RequestLine("GET /payment_requests?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaymentRequestsPaginated> findAllPaymentRequestsWithHttpInfo(@QueryMap(encoded=true) FindAllPaymentRequestsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllPaymentRequests</code> method in a fluent style.
   */
  public static class FindAllPaymentRequestsQueryParams extends HashMap<String, Object> {
    public FindAllPaymentRequestsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentRequestsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPaymentRequestsQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
  }
}
