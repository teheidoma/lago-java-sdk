package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventBatchInput;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.EventsPaginated;
import org.openapitools.client.model.Fees;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface EventsApi extends ApiClient.Api {


  /**
   * Batch multiple events
   * This endpoint can be used to send a batch of usage records. Each request may include up to 100 events.
   * @param eventBatchInput Batch events payload (required)
   */
  @RequestLine("POST /events/batch")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void createBatchEvents(@javax.annotation.Nonnull EventBatchInput eventBatchInput);

  /**
   * Batch multiple events
   * Similar to <code>createBatchEvents</code> but it also returns the http response headers .
   * This endpoint can be used to send a batch of usage records. Each request may include up to 100 events.
   * @param eventBatchInput Batch events payload (required)
   */
  @RequestLine("POST /events/batch")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> createBatchEventsWithHttpInfo(@javax.annotation.Nonnull EventBatchInput eventBatchInput);



  /**
   * Send usage events
   * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
   * @param eventInput Event payload (required)
   * @return Event
   */
  @RequestLine("POST /events")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Event createEvent(@javax.annotation.Nonnull EventInput eventInput);

  /**
   * Send usage events
   * Similar to <code>createEvent</code> but it also returns the http response headers .
   * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
   * @param eventInput Event payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /events")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Event> createEventWithHttpInfo(@javax.annotation.Nonnull EventInput eventInput);



  /**
   * Estimate fees for a pay in advance charge
   * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
   * @param eventEstimateFeesInput Event estimate payload (required)
   * @return Fees
   */
  @RequestLine("POST /events/estimate_fees")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Fees eventEstimateFees(@javax.annotation.Nonnull EventEstimateFeesInput eventEstimateFeesInput);

  /**
   * Estimate fees for a pay in advance charge
   * Similar to <code>eventEstimateFees</code> but it also returns the http response headers .
   * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
   * @param eventEstimateFeesInput Event estimate payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /events/estimate_fees")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Fees> eventEstimateFeesWithHttpInfo(@javax.annotation.Nonnull EventEstimateFeesInput eventEstimateFeesInput);



  /**
   * List all events
   * This endpoint is used for retrieving all events.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalSubscriptionId External subscription ID (optional)
   * @param code Filter events by its code. (optional)
   * @param timestampFrom Filter events by timestamp starting from a specific date. (optional)
   * @param timestampTo Filter events by timestamp up to a specific date. (optional)
   * @return EventsPaginated
   */
  @RequestLine("GET /events?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&code={code}&timestamp_from={timestampFrom}&timestamp_to={timestampTo}")
  @Headers({
    "Accept: application/json",
  })
  EventsPaginated findAllEvents(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalSubscriptionId") @javax.annotation.Nullable String externalSubscriptionId, @Param("code") @javax.annotation.Nullable String code, @Param("timestampFrom") @javax.annotation.Nullable OffsetDateTime timestampFrom, @Param("timestampTo") @javax.annotation.Nullable OffsetDateTime timestampTo);

  /**
   * List all events
   * Similar to <code>findAllEvents</code> but it also returns the http response headers .
   * This endpoint is used for retrieving all events.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalSubscriptionId External subscription ID (optional)
   * @param code Filter events by its code. (optional)
   * @param timestampFrom Filter events by timestamp starting from a specific date. (optional)
   * @param timestampTo Filter events by timestamp up to a specific date. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /events?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&code={code}&timestamp_from={timestampFrom}&timestamp_to={timestampTo}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventsPaginated> findAllEventsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalSubscriptionId") @javax.annotation.Nullable String externalSubscriptionId, @Param("code") @javax.annotation.Nullable String code, @Param("timestampFrom") @javax.annotation.Nullable OffsetDateTime timestampFrom, @Param("timestampTo") @javax.annotation.Nullable OffsetDateTime timestampTo);


  /**
   * List all events
   * This endpoint is used for retrieving all events.
   * Note, this is equivalent to the other <code>findAllEvents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllEventsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalSubscriptionId - External subscription ID (optional)</li>
   *   <li>code - Filter events by its code. (optional)</li>
   *   <li>timestampFrom - Filter events by timestamp starting from a specific date. (optional)</li>
   *   <li>timestampTo - Filter events by timestamp up to a specific date. (optional)</li>
   *   </ul>
   * @return EventsPaginated
   */
  @RequestLine("GET /events?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&code={code}&timestamp_from={timestampFrom}&timestamp_to={timestampTo}")
  @Headers({
  "Accept: application/json",
  })
  EventsPaginated findAllEvents(@QueryMap(encoded=true) FindAllEventsQueryParams queryParams);

  /**
  * List all events
  * This endpoint is used for retrieving all events.
  * Note, this is equivalent to the other <code>findAllEvents</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalSubscriptionId - External subscription ID (optional)</li>
          *   <li>code - Filter events by its code. (optional)</li>
          *   <li>timestampFrom - Filter events by timestamp starting from a specific date. (optional)</li>
          *   <li>timestampTo - Filter events by timestamp up to a specific date. (optional)</li>
      *   </ul>
          * @return EventsPaginated
      */
      @RequestLine("GET /events?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&code={code}&timestamp_from={timestampFrom}&timestamp_to={timestampTo}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<EventsPaginated> findAllEventsWithHttpInfo(@QueryMap(encoded=true) FindAllEventsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllEvents</code> method in a fluent style.
   */
  public static class FindAllEventsQueryParams extends HashMap<String, Object> {
    public FindAllEventsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllEventsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllEventsQueryParams externalSubscriptionId(@javax.annotation.Nullable final String value) {
      put("external_subscription_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllEventsQueryParams code(@javax.annotation.Nullable final String value) {
      put("code", EncodingUtils.encode(value));
      return this;
    }
    public FindAllEventsQueryParams timestampFrom(@javax.annotation.Nullable final OffsetDateTime value) {
      put("timestamp_from", EncodingUtils.encode(value));
      return this;
    }
    public FindAllEventsQueryParams timestampTo(@javax.annotation.Nullable final OffsetDateTime value) {
      put("timestamp_to", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a specific event
   * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
   * @param transactionId This field represents the unique identifier sent for this specific event (must be URL encoded). (required)
   * @return Event
   */
  @RequestLine("GET /events/{transactionId}")
  @Headers({
    "Accept: application/json",
  })
  Event findEvent(@Param("transactionId") @javax.annotation.Nonnull String transactionId);

  /**
   * Retrieve a specific event
   * Similar to <code>findEvent</code> but it also returns the http response headers .
   * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
   * @param transactionId This field represents the unique identifier sent for this specific event (must be URL encoded). (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /events/{transactionId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Event> findEventWithHttpInfo(@Param("transactionId") @javax.annotation.Nonnull String transactionId);


}
