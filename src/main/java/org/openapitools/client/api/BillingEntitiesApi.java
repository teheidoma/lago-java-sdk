package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorForbidden;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillingEntityCreateInput;
import org.openapitools.client.model.BillingEntityObject;
import org.openapitools.client.model.BillingEntityObjectExtended;
import org.openapitools.client.model.BillingEntityUpdateInput;
import org.openapitools.client.model.GetBillingEntity200Response;
import org.openapitools.client.model.ListBillingEntities200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface BillingEntitiesApi extends ApiClient.Api {


  /**
   * Create a billing entity
   * This endpoint is used to create a new billing entity
   * @param billingEntityCreateInput The billing entity payload (required)
   * @return BillingEntityObject
   */
  @RequestLine("POST /billing_entities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BillingEntityObject createBillingEntity(@javax.annotation.Nonnull BillingEntityCreateInput billingEntityCreateInput);

  /**
   * Create a billing entity
   * Similar to <code>createBillingEntity</code> but it also returns the http response headers .
   * This endpoint is used to create a new billing entity
   * @param billingEntityCreateInput The billing entity payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /billing_entities")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BillingEntityObject> createBillingEntityWithHttpInfo(@javax.annotation.Nonnull BillingEntityCreateInput billingEntityCreateInput);



  /**
   * Retrieve a billing entity
   * This endpoint returns a specific billing entity by its code
   * @param code The ID of the billing entity (required)
   * @return GetBillingEntity200Response
   */
  @RequestLine("GET /billing_entities/{code}")
  @Headers({
    "Accept: application/json",
  })
  GetBillingEntity200Response getBillingEntity(@Param("code") @javax.annotation.Nonnull UUID code);

  /**
   * Retrieve a billing entity
   * Similar to <code>getBillingEntity</code> but it also returns the http response headers .
   * This endpoint returns a specific billing entity by its code
   * @param code The ID of the billing entity (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /billing_entities/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetBillingEntity200Response> getBillingEntityWithHttpInfo(@Param("code") @javax.annotation.Nonnull UUID code);



  /**
   * List all billing entities
   * This endpoint returns a list of all billing entities in the organization
   * @return ListBillingEntities200Response
   */
  @RequestLine("GET /billing_entities")
  @Headers({
    "Accept: application/json",
  })
  ListBillingEntities200Response listBillingEntities();

  /**
   * List all billing entities
   * Similar to <code>listBillingEntities</code> but it also returns the http response headers .
   * This endpoint returns a list of all billing entities in the organization
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /billing_entities")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ListBillingEntities200Response> listBillingEntitiesWithHttpInfo();



  /**
   * Update a billing entity
   * This endpoint is used to update an existing billing entity
   * @param code The ID of the billing entity (required)
   * @param billingEntityUpdateInput The billing entity update payload (optional)
   * @return BillingEntityObjectExtended
   */
  @RequestLine("PUT /billing_entities/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BillingEntityObjectExtended updateBillingEntity(@Param("code") @javax.annotation.Nonnull UUID code, @javax.annotation.Nullable BillingEntityUpdateInput billingEntityUpdateInput);

  /**
   * Update a billing entity
   * Similar to <code>updateBillingEntity</code> but it also returns the http response headers .
   * This endpoint is used to update an existing billing entity
   * @param code The ID of the billing entity (required)
   * @param billingEntityUpdateInput The billing entity update payload (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /billing_entities/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BillingEntityObjectExtended> updateBillingEntityWithHttpInfo(@Param("code") @javax.annotation.Nonnull UUID code, @javax.annotation.Nullable BillingEntityUpdateInput billingEntityUpdateInput);


}
