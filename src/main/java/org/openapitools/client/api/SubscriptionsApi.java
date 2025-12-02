package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.LifetimeUsage;
import org.openapitools.client.model.LifetimeUsageInput;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionCreateInput;
import org.openapitools.client.model.SubscriptionUpdateInput;
import org.openapitools.client.model.SubscriptionsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface SubscriptionsApi extends ApiClient.Api {


  /**
   * Assign a plan to a customer
   * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
   * @param subscriptionCreateInput Subscription payload (required)
   * @return Subscription
   */
  @RequestLine("POST /subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Subscription createSubscription(@javax.annotation.Nonnull SubscriptionCreateInput subscriptionCreateInput);

  /**
   * Assign a plan to a customer
   * Similar to <code>createSubscription</code> but it also returns the http response headers .
   * This endpoint assigns a plan to a customer, creating or modifying a subscription. Ideal for initial subscriptions or plan changes (upgrades/downgrades).
   * @param subscriptionCreateInput Subscription payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /subscriptions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Subscription> createSubscriptionWithHttpInfo(@javax.annotation.Nonnull SubscriptionCreateInput subscriptionCreateInput);



  /**
   * Terminate a subscription
   * This endpoint allows you to terminate a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request. (optional)
   * @return Subscription
   */
  @RequestLine("DELETE /subscriptions/{externalId}?status={status}")
  @Headers({
    "Accept: application/json",
  })
  Subscription destroySubscription(@Param("externalId") @javax.annotation.Nonnull String externalId, @Param("status") @javax.annotation.Nullable String status);

  /**
   * Terminate a subscription
   * Similar to <code>destroySubscription</code> but it also returns the http response headers .
   * This endpoint allows you to terminate a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param status If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /subscriptions/{externalId}?status={status}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Subscription> destroySubscriptionWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId, @Param("status") @javax.annotation.Nullable String status);


  /**
   * Terminate a subscription
   * This endpoint allows you to terminate a subscription.
   * Note, this is equivalent to the other <code>destroySubscription</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DestroySubscriptionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param externalId External ID of the existing subscription (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>status - If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request. (optional)</li>
   *   </ul>
   * @return Subscription
   */
  @RequestLine("DELETE /subscriptions/{externalId}?status={status}")
  @Headers({
  "Accept: application/json",
  })
  Subscription destroySubscription(@Param("externalId") @javax.annotation.Nonnull String externalId, @QueryMap(encoded=true) DestroySubscriptionQueryParams queryParams);

  /**
  * Terminate a subscription
  * This endpoint allows you to terminate a subscription.
  * Note, this is equivalent to the other <code>destroySubscription</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param externalId External ID of the existing subscription (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>status - If the field is not defined, Lago will terminate only &#x60;active&#x60; subscriptions. However, if you wish to cancel a &#x60;pending&#x60; subscription, please ensure that you include &#x60;status&#x3D;pending&#x60; in your request. (optional)</li>
      *   </ul>
          * @return Subscription
      */
      @RequestLine("DELETE /subscriptions/{externalId}?status={status}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Subscription> destroySubscriptionWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId, @QueryMap(encoded=true) DestroySubscriptionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>destroySubscription</code> method in a fluent style.
   */
  public static class DestroySubscriptionQueryParams extends HashMap<String, Object> {
    public DestroySubscriptionQueryParams status(@javax.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List all subscriptions
   * This endpoint retrieves all active subscriptions.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (optional)
   * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans. (optional)
   * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;. (optional)
   * @return SubscriptionsPaginated
   */
  @RequestLine("GET /subscriptions?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&plan_code={planCode}&status[]={status}")
  @Headers({
    "Accept: application/json",
  })
  SubscriptionsPaginated findAllSubscriptions(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("planCode") @javax.annotation.Nullable String planCode, @Param("status") @javax.annotation.Nullable List<String> status);

  /**
   * List all subscriptions
   * Similar to <code>findAllSubscriptions</code> but it also returns the http response headers .
   * This endpoint retrieves all active subscriptions.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (optional)
   * @param planCode The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans. (optional)
   * @param status If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&plan_code={planCode}&status[]={status}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<SubscriptionsPaginated> findAllSubscriptionsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("planCode") @javax.annotation.Nullable String planCode, @Param("status") @javax.annotation.Nullable List<String> status);


  /**
   * List all subscriptions
   * This endpoint retrieves all active subscriptions.
   * Note, this is equivalent to the other <code>findAllSubscriptions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllSubscriptionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - The customer external unique identifier (provided by your own application) (optional)</li>
   *   <li>planCode - The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans. (optional)</li>
   *   <li>status - If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;. (optional)</li>
   *   </ul>
   * @return SubscriptionsPaginated
   */
  @RequestLine("GET /subscriptions?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&plan_code={planCode}&status[]={status}")
  @Headers({
  "Accept: application/json",
  })
  SubscriptionsPaginated findAllSubscriptions(@QueryMap(encoded=true) FindAllSubscriptionsQueryParams queryParams);

  /**
  * List all subscriptions
  * This endpoint retrieves all active subscriptions.
  * Note, this is equivalent to the other <code>findAllSubscriptions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - The customer external unique identifier (provided by your own application) (optional)</li>
          *   <li>planCode - The unique code representing the plan to be attached to the customer. This code must correspond to the code property of one of the active plans. (optional)</li>
          *   <li>status - If the field is not defined, Lago will return only &#x60;active&#x60; subscriptions. However, if you wish to fetch subscriptions by different status you can define them in a status[] query param. Available filter values: &#x60;pending&#x60;, &#x60;canceled&#x60;, &#x60;terminated&#x60;, &#x60;active&#x60;. (optional)</li>
      *   </ul>
          * @return SubscriptionsPaginated
      */
      @RequestLine("GET /subscriptions?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}&plan_code={planCode}&status[]={status}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<SubscriptionsPaginated> findAllSubscriptionsWithHttpInfo(@QueryMap(encoded=true) FindAllSubscriptionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllSubscriptions</code> method in a fluent style.
   */
  public static class FindAllSubscriptionsQueryParams extends HashMap<String, Object> {
    public FindAllSubscriptionsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllSubscriptionsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllSubscriptionsQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllSubscriptionsQueryParams planCode(@javax.annotation.Nullable final String value) {
      put("plan_code", EncodingUtils.encode(value));
      return this;
    }
    public FindAllSubscriptionsQueryParams status(@javax.annotation.Nullable final List<String> value) {
      put("status[]", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * Retrieve a subscription
   * This endpoint retrieves a specific subscription.
   * @param externalId External ID of the existing subscription (required)
   * @return Subscription
   */
  @RequestLine("GET /subscriptions/{externalId}")
  @Headers({
    "Accept: application/json",
  })
  Subscription findSubscription(@Param("externalId") @javax.annotation.Nonnull String externalId);

  /**
   * Retrieve a subscription
   * Similar to <code>findSubscription</code> but it also returns the http response headers .
   * This endpoint retrieves a specific subscription.
   * @param externalId External ID of the existing subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions/{externalId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Subscription> findSubscriptionWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId);



  /**
   * Retrieve subscription lifetime usage
   * This endpoint enables the retrieval of the lifetime usage of a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @return LifetimeUsage
   */
  @RequestLine("GET /subscriptions/{externalId}/lifetime_usage")
  @Headers({
    "Accept: application/json",
  })
  LifetimeUsage getSubscriptionLifetimeUsage(@Param("externalId") @javax.annotation.Nonnull String externalId);

  /**
   * Retrieve subscription lifetime usage
   * Similar to <code>getSubscriptionLifetimeUsage</code> but it also returns the http response headers .
   * This endpoint enables the retrieval of the lifetime usage of a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /subscriptions/{externalId}/lifetime_usage")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LifetimeUsage> getSubscriptionLifetimeUsageWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId);



  /**
   * Update a subscription
   * This endpoint allows you to update a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param subscriptionUpdateInput Update an existing subscription (required)
   * @return Subscription
   */
  @RequestLine("PUT /subscriptions/{externalId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Subscription updateSubscription(@Param("externalId") @javax.annotation.Nonnull String externalId, @javax.annotation.Nonnull SubscriptionUpdateInput subscriptionUpdateInput);

  /**
   * Update a subscription
   * Similar to <code>updateSubscription</code> but it also returns the http response headers .
   * This endpoint allows you to update a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param subscriptionUpdateInput Update an existing subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /subscriptions/{externalId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Subscription> updateSubscriptionWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId, @javax.annotation.Nonnull SubscriptionUpdateInput subscriptionUpdateInput);



  /**
   * Update a subscription lifetime usage
   * This endpoint allows you to update the lifetime usage of a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param lifetimeUsageInput Update the lifetime usage of a subscription (required)
   * @return LifetimeUsage
   */
  @RequestLine("PUT /subscriptions/{externalId}/lifetime_usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LifetimeUsage updateSubscriptionLifetimeUsage(@Param("externalId") @javax.annotation.Nonnull String externalId, @javax.annotation.Nonnull LifetimeUsageInput lifetimeUsageInput);

  /**
   * Update a subscription lifetime usage
   * Similar to <code>updateSubscriptionLifetimeUsage</code> but it also returns the http response headers .
   * This endpoint allows you to update the lifetime usage of a subscription.
   * @param externalId External ID of the existing subscription (required)
   * @param lifetimeUsageInput Update the lifetime usage of a subscription (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /subscriptions/{externalId}/lifetime_usage")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LifetimeUsage> updateSubscriptionLifetimeUsageWithHttpInfo(@Param("externalId") @javax.annotation.Nonnull String externalId, @javax.annotation.Nonnull LifetimeUsageInput lifetimeUsageInput);


}
