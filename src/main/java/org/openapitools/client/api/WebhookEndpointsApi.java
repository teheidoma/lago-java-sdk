package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.WebhookEndpoint;
import org.openapitools.client.model.WebhookEndpointCreateInput;
import org.openapitools.client.model.WebhookEndpointUpdateInput;
import org.openapitools.client.model.WebhookEndpointsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface WebhookEndpointsApi extends ApiClient.Api {


  /**
   * Create a webhook_endpoint
   * This endpoint is used to create a webhook endpoint.
   * @param webhookEndpointCreateInput Webhook Endpoint payload (required)
   * @return WebhookEndpoint
   */
  @RequestLine("POST /webhook_endpoints")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WebhookEndpoint createWebhookEndpoint(@javax.annotation.Nonnull WebhookEndpointCreateInput webhookEndpointCreateInput);

  /**
   * Create a webhook_endpoint
   * Similar to <code>createWebhookEndpoint</code> but it also returns the http response headers .
   * This endpoint is used to create a webhook endpoint.
   * @param webhookEndpointCreateInput Webhook Endpoint payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /webhook_endpoints")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WebhookEndpoint> createWebhookEndpointWithHttpInfo(@javax.annotation.Nonnull WebhookEndpointCreateInput webhookEndpointCreateInput);



  /**
   * Delete a webhook endpoint
   * This endpoint is used to delete an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @return WebhookEndpoint
   */
  @RequestLine("DELETE /webhook_endpoints/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  WebhookEndpoint destroyWebhookEndpoint(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Delete a webhook endpoint
   * Similar to <code>destroyWebhookEndpoint</code> but it also returns the http response headers .
   * This endpoint is used to delete an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /webhook_endpoints/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WebhookEndpoint> destroyWebhookEndpointWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * List all webhook endpoints
   * This endpoint is used to list all webhook endpoints.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return WebhookEndpointsPaginated
   */
  @RequestLine("GET /webhook_endpoints?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  WebhookEndpointsPaginated findAllWebhookEndpoints(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all webhook endpoints
   * Similar to <code>findAllWebhookEndpoints</code> but it also returns the http response headers .
   * This endpoint is used to list all webhook endpoints.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /webhook_endpoints?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WebhookEndpointsPaginated> findAllWebhookEndpointsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all webhook endpoints
   * This endpoint is used to list all webhook endpoints.
   * Note, this is equivalent to the other <code>findAllWebhookEndpoints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllWebhookEndpointsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return WebhookEndpointsPaginated
   */
  @RequestLine("GET /webhook_endpoints?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  WebhookEndpointsPaginated findAllWebhookEndpoints(@QueryMap(encoded=true) FindAllWebhookEndpointsQueryParams queryParams);

  /**
  * List all webhook endpoints
  * This endpoint is used to list all webhook endpoints.
  * Note, this is equivalent to the other <code>findAllWebhookEndpoints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return WebhookEndpointsPaginated
      */
      @RequestLine("GET /webhook_endpoints?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<WebhookEndpointsPaginated> findAllWebhookEndpointsWithHttpInfo(@QueryMap(encoded=true) FindAllWebhookEndpointsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllWebhookEndpoints</code> method in a fluent style.
   */
  public static class FindAllWebhookEndpointsQueryParams extends HashMap<String, Object> {
    public FindAllWebhookEndpointsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWebhookEndpointsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a webhook endpoint
   * This endpoint is used to retrieve an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @return WebhookEndpoint
   */
  @RequestLine("GET /webhook_endpoints/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  WebhookEndpoint findWebhookEndpoint(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve a webhook endpoint
   * Similar to <code>findWebhookEndpoint</code> but it also returns the http response headers .
   * This endpoint is used to retrieve an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /webhook_endpoints/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WebhookEndpoint> findWebhookEndpointWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Update a webhook endpoint
   * This endpoint is used to update an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @param webhookEndpointUpdateInput Webhook Endpoint update payload (required)
   * @return WebhookEndpoint
   */
  @RequestLine("PUT /webhook_endpoints/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WebhookEndpoint updateWebhookEndpoint(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull WebhookEndpointUpdateInput webhookEndpointUpdateInput);

  /**
   * Update a webhook endpoint
   * Similar to <code>updateWebhookEndpoint</code> but it also returns the http response headers .
   * This endpoint is used to update an existing webhook endpoint.
   * @param lagoId Unique identifier assigned to the webhook endpoint within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the webhook endpoint&#39;s record within the Lago system. (required)
   * @param webhookEndpointUpdateInput Webhook Endpoint update payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /webhook_endpoints/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WebhookEndpoint> updateWebhookEndpointWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull WebhookEndpointUpdateInput webhookEndpointUpdateInput);


}
