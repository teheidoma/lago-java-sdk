package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.Fee;
import org.openapitools.client.model.FeeUpdateInput;
import org.openapitools.client.model.FeesPaginated;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface FeesApi extends ApiClient.Api {


  /**
   * Delete a fee
   * This endpoint is used for deleting a specific fee that has not yet been invoiced
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @return Fee
   */
  @RequestLine("DELETE /fees/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  Fee deleteFee(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Delete a fee
   * Similar to <code>deleteFee</code> but it also returns the http response headers .
   * This endpoint is used for deleting a specific fee that has not yet been invoiced
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /fees/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Fee> deleteFeeWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * List all fees
   * This endpoint is used for retrieving all fees that has been issued.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param externalSubscriptionId External subscription ID (optional)
   * @param eventTransactionId Filter results by event transaction ID (optional)
   * @param currency Filter results by fee&#39;s currency. (optional)
   * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. (optional)
   * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types. (optional)
   * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;. (optional)
   * @param createdAtFrom Filter results created after creation date and time in UTC. (optional)
   * @param createdAtTo Filter results created before creation date and time in UTC. (optional)
   * @param succeededAtFrom Filter results with payment success after creation date and time in UTC. (optional)
   * @param succeededAtTo Filter results with payment success after creation date and time in UTC. (optional)
   * @param failedAtFrom Filter results with payment failure after creation date and time in UTC. (optional)
   * @param failedAtTo Filter results with payment failure after creation date and time in UTC. (optional)
   * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC. (optional)
   * @param refundedAtTo Filter results with payment refund after creation date and time in UTC. (optional)
   * @return FeesPaginated
   */
  @RequestLine("GET /fees?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&external_subscription_id={externalSubscriptionId}&event_transaction_id={eventTransactionId}&currency={currency}&fee_type={feeType}&billable_metric_code={billableMetricCode}&payment_status={paymentStatus}&created_at_from={createdAtFrom}&created_at_to={createdAtTo}&succeeded_at_from={succeededAtFrom}&succeeded_at_to={succeededAtTo}&failed_at_from={failedAtFrom}&failed_at_to={failedAtTo}&refunded_at_from={refundedAtFrom}&refunded_at_to={refundedAtTo}")
  @Headers({
    "Accept: application/json",
  })
  FeesPaginated findAllFees(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nullable String externalSubscriptionId, @Param("eventTransactionId") @javax.annotation.Nullable String eventTransactionId, @Param("currency") @javax.annotation.Nullable Currency currency, @Param("feeType") @javax.annotation.Nullable String feeType, @Param("billableMetricCode") @javax.annotation.Nullable String billableMetricCode, @Param("paymentStatus") @javax.annotation.Nullable String paymentStatus, @Param("createdAtFrom") @javax.annotation.Nullable OffsetDateTime createdAtFrom, @Param("createdAtTo") @javax.annotation.Nullable OffsetDateTime createdAtTo, @Param("succeededAtFrom") @javax.annotation.Nullable OffsetDateTime succeededAtFrom, @Param("succeededAtTo") @javax.annotation.Nullable OffsetDateTime succeededAtTo, @Param("failedAtFrom") @javax.annotation.Nullable OffsetDateTime failedAtFrom, @Param("failedAtTo") @javax.annotation.Nullable OffsetDateTime failedAtTo, @Param("refundedAtFrom") @javax.annotation.Nullable OffsetDateTime refundedAtFrom, @Param("refundedAtTo") @javax.annotation.Nullable OffsetDateTime refundedAtTo);

  /**
   * List all fees
   * Similar to <code>findAllFees</code> but it also returns the http response headers .
   * This endpoint is used for retrieving all fees that has been issued.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId Unique identifier assigned to the customer in your application. (optional)
   * @param externalSubscriptionId External subscription ID (optional)
   * @param eventTransactionId Filter results by event transaction ID (optional)
   * @param currency Filter results by fee&#39;s currency. (optional)
   * @param feeType The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. (optional)
   * @param billableMetricCode Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types. (optional)
   * @param paymentStatus Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;. (optional)
   * @param createdAtFrom Filter results created after creation date and time in UTC. (optional)
   * @param createdAtTo Filter results created before creation date and time in UTC. (optional)
   * @param succeededAtFrom Filter results with payment success after creation date and time in UTC. (optional)
   * @param succeededAtTo Filter results with payment success after creation date and time in UTC. (optional)
   * @param failedAtFrom Filter results with payment failure after creation date and time in UTC. (optional)
   * @param failedAtTo Filter results with payment failure after creation date and time in UTC. (optional)
   * @param refundedAtFrom Filter results with payment refund after creation date and time in UTC. (optional)
   * @param refundedAtTo Filter results with payment refund after creation date and time in UTC. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /fees?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&external_subscription_id={externalSubscriptionId}&event_transaction_id={eventTransactionId}&currency={currency}&fee_type={feeType}&billable_metric_code={billableMetricCode}&payment_status={paymentStatus}&created_at_from={createdAtFrom}&created_at_to={createdAtTo}&succeeded_at_from={succeededAtFrom}&succeeded_at_to={succeededAtTo}&failed_at_from={failedAtFrom}&failed_at_to={failedAtTo}&refunded_at_from={refundedAtFrom}&refunded_at_to={refundedAtTo}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<FeesPaginated> findAllFeesWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nullable String externalSubscriptionId, @Param("eventTransactionId") @javax.annotation.Nullable String eventTransactionId, @Param("currency") @javax.annotation.Nullable Currency currency, @Param("feeType") @javax.annotation.Nullable String feeType, @Param("billableMetricCode") @javax.annotation.Nullable String billableMetricCode, @Param("paymentStatus") @javax.annotation.Nullable String paymentStatus, @Param("createdAtFrom") @javax.annotation.Nullable OffsetDateTime createdAtFrom, @Param("createdAtTo") @javax.annotation.Nullable OffsetDateTime createdAtTo, @Param("succeededAtFrom") @javax.annotation.Nullable OffsetDateTime succeededAtFrom, @Param("succeededAtTo") @javax.annotation.Nullable OffsetDateTime succeededAtTo, @Param("failedAtFrom") @javax.annotation.Nullable OffsetDateTime failedAtFrom, @Param("failedAtTo") @javax.annotation.Nullable OffsetDateTime failedAtTo, @Param("refundedAtFrom") @javax.annotation.Nullable OffsetDateTime refundedAtFrom, @Param("refundedAtTo") @javax.annotation.Nullable OffsetDateTime refundedAtTo);


  /**
   * List all fees
   * This endpoint is used for retrieving all fees that has been issued.
   * Note, this is equivalent to the other <code>findAllFees</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllFeesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
   *   <li>externalSubscriptionId - External subscription ID (optional)</li>
   *   <li>eventTransactionId - Filter results by event transaction ID (optional)</li>
   *   <li>currency - Filter results by fee&#39;s currency. (optional)</li>
   *   <li>feeType - The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. (optional)</li>
   *   <li>billableMetricCode - Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types. (optional)</li>
   *   <li>paymentStatus - Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;. (optional)</li>
   *   <li>createdAtFrom - Filter results created after creation date and time in UTC. (optional)</li>
   *   <li>createdAtTo - Filter results created before creation date and time in UTC. (optional)</li>
   *   <li>succeededAtFrom - Filter results with payment success after creation date and time in UTC. (optional)</li>
   *   <li>succeededAtTo - Filter results with payment success after creation date and time in UTC. (optional)</li>
   *   <li>failedAtFrom - Filter results with payment failure after creation date and time in UTC. (optional)</li>
   *   <li>failedAtTo - Filter results with payment failure after creation date and time in UTC. (optional)</li>
   *   <li>refundedAtFrom - Filter results with payment refund after creation date and time in UTC. (optional)</li>
   *   <li>refundedAtTo - Filter results with payment refund after creation date and time in UTC. (optional)</li>
   *   </ul>
   * @return FeesPaginated
   */
  @RequestLine("GET /fees?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&external_subscription_id={externalSubscriptionId}&event_transaction_id={eventTransactionId}&currency={currency}&fee_type={feeType}&billable_metric_code={billableMetricCode}&payment_status={paymentStatus}&created_at_from={createdAtFrom}&created_at_to={createdAtTo}&succeeded_at_from={succeededAtFrom}&succeeded_at_to={succeededAtTo}&failed_at_from={failedAtFrom}&failed_at_to={failedAtTo}&refunded_at_from={refundedAtFrom}&refunded_at_to={refundedAtTo}")
  @Headers({
  "Accept: application/json",
  })
  FeesPaginated findAllFees(@QueryMap(encoded=true) FindAllFeesQueryParams queryParams);

  /**
  * List all fees
  * This endpoint is used for retrieving all fees that has been issued.
  * Note, this is equivalent to the other <code>findAllFees</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - Unique identifier assigned to the customer in your application. (optional)</li>
          *   <li>externalSubscriptionId - External subscription ID (optional)</li>
          *   <li>eventTransactionId - Filter results by event transaction ID (optional)</li>
          *   <li>currency - Filter results by fee&#39;s currency. (optional)</li>
          *   <li>feeType - The fee type. Possible values are &#x60;add-on&#x60;, &#x60;charge&#x60;, &#x60;credit&#x60; or &#x60;subscription&#x60;. (optional)</li>
          *   <li>billableMetricCode - Filter results by the &#x60;code&#x60; of the billable metric attached to the fee. Only applies to &#x60;charge&#x60; types. (optional)</li>
          *   <li>paymentStatus - Indicates the payment status of the fee. It represents the current status of the payment associated with the fee. The possible values for this field are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; and refunded&#x60;. (optional)</li>
          *   <li>createdAtFrom - Filter results created after creation date and time in UTC. (optional)</li>
          *   <li>createdAtTo - Filter results created before creation date and time in UTC. (optional)</li>
          *   <li>succeededAtFrom - Filter results with payment success after creation date and time in UTC. (optional)</li>
          *   <li>succeededAtTo - Filter results with payment success after creation date and time in UTC. (optional)</li>
          *   <li>failedAtFrom - Filter results with payment failure after creation date and time in UTC. (optional)</li>
          *   <li>failedAtTo - Filter results with payment failure after creation date and time in UTC. (optional)</li>
          *   <li>refundedAtFrom - Filter results with payment refund after creation date and time in UTC. (optional)</li>
          *   <li>refundedAtTo - Filter results with payment refund after creation date and time in UTC. (optional)</li>
      *   </ul>
          * @return FeesPaginated
      */
      @RequestLine("GET /fees?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&external_subscription_id={externalSubscriptionId}&event_transaction_id={eventTransactionId}&currency={currency}&fee_type={feeType}&billable_metric_code={billableMetricCode}&payment_status={paymentStatus}&created_at_from={createdAtFrom}&created_at_to={createdAtTo}&succeeded_at_from={succeededAtFrom}&succeeded_at_to={succeededAtTo}&failed_at_from={failedAtFrom}&failed_at_to={failedAtTo}&refunded_at_from={refundedAtFrom}&refunded_at_to={refundedAtTo}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<FeesPaginated> findAllFeesWithHttpInfo(@QueryMap(encoded=true) FindAllFeesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllFees</code> method in a fluent style.
   */
  public static class FindAllFeesQueryParams extends HashMap<String, Object> {
    public FindAllFeesQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams externalSubscriptionId(@javax.annotation.Nullable final String value) {
      put("external_subscription_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams eventTransactionId(@javax.annotation.Nullable final String value) {
      put("event_transaction_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams feeType(@javax.annotation.Nullable final String value) {
      put("fee_type", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams billableMetricCode(@javax.annotation.Nullable final String value) {
      put("billable_metric_code", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams paymentStatus(@javax.annotation.Nullable final String value) {
      put("payment_status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams createdAtFrom(@javax.annotation.Nullable final OffsetDateTime value) {
      put("created_at_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams createdAtTo(@javax.annotation.Nullable final OffsetDateTime value) {
      put("created_at_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams succeededAtFrom(@javax.annotation.Nullable final OffsetDateTime value) {
      put("succeeded_at_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams succeededAtTo(@javax.annotation.Nullable final OffsetDateTime value) {
      put("succeeded_at_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams failedAtFrom(@javax.annotation.Nullable final OffsetDateTime value) {
      put("failed_at_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams failedAtTo(@javax.annotation.Nullable final OffsetDateTime value) {
      put("failed_at_to", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams refundedAtFrom(@javax.annotation.Nullable final OffsetDateTime value) {
      put("refunded_at_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllFeesQueryParams refundedAtTo(@javax.annotation.Nullable final OffsetDateTime value) {
      put("refunded_at_to", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific fee
   * This endpoint is used for retrieving a specific fee that has been issued.
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @return Fee
   */
  @RequestLine("GET /fees/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  Fee findFee(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve a specific fee
   * Similar to <code>findFee</code> but it also returns the http response headers .
   * This endpoint is used for retrieving a specific fee that has been issued.
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /fees/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Fee> findFeeWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Update a fee
   * This endpoint is used for updating a specific fee that has been issued.
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @param feeUpdateInput Fee payload (optional)
   * @return Fee
   */
  @RequestLine("PUT /fees/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Fee updateFee(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nullable FeeUpdateInput feeUpdateInput);

  /**
   * Update a fee
   * Similar to <code>updateFee</code> but it also returns the http response headers .
   * This endpoint is used for updating a specific fee that has been issued.
   * @param lagoId Unique identifier assigned to the fee within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the fee&#39;s record within the Lago system. (required)
   * @param feeUpdateInput Fee payload (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /fees/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Fee> updateFeeWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nullable FeeUpdateInput feeUpdateInput);


}
