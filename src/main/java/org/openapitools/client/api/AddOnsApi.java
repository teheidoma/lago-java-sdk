package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.AddOn;
import org.openapitools.client.model.AddOnCreateInput;
import org.openapitools.client.model.AddOnUpdateInput;
import org.openapitools.client.model.AddOnsPaginated;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface AddOnsApi extends ApiClient.Api {


  /**
   * Create an add-on
   * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
   * @param addOnCreateInput Add-on payload (required)
   * @return AddOn
   */
  @RequestLine("POST /add_ons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOn createAddOn(@javax.annotation.Nonnull AddOnCreateInput addOnCreateInput);

  /**
   * Create an add-on
   * Similar to <code>createAddOn</code> but it also returns the http response headers .
   * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
   * @param addOnCreateInput Add-on payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /add_ons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOn> createAddOnWithHttpInfo(@javax.annotation.Nonnull AddOnCreateInput addOnCreateInput);



  /**
   * Delete an add-on
   * This endpoint is used to delete an existing add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @return AddOn
   */
  @RequestLine("DELETE /add_ons/{code}")
  @Headers({
    "Accept: application/json",
  })
  AddOn destroyAddOn(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Delete an add-on
   * Similar to <code>destroyAddOn</code> but it also returns the http response headers .
   * This endpoint is used to delete an existing add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /add_ons/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AddOn> destroyAddOnWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Retrieve an add-on
   * This endpoint is used to retrieve a specific add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @return AddOn
   */
  @RequestLine("GET /add_ons/{code}")
  @Headers({
    "Accept: application/json",
  })
  AddOn findAddOn(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Retrieve an add-on
   * Similar to <code>findAddOn</code> but it also returns the http response headers .
   * This endpoint is used to retrieve a specific add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /add_ons/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AddOn> findAddOnWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * List all add-ons
   * This endpoint is used to list all existing add-ons.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return AddOnsPaginated
   */
  @RequestLine("GET /add_ons?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  AddOnsPaginated findAllAddOns(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all add-ons
   * Similar to <code>findAllAddOns</code> but it also returns the http response headers .
   * This endpoint is used to list all existing add-ons.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /add_ons?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AddOnsPaginated> findAllAddOnsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all add-ons
   * This endpoint is used to list all existing add-ons.
   * Note, this is equivalent to the other <code>findAllAddOns</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllAddOnsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return AddOnsPaginated
   */
  @RequestLine("GET /add_ons?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  AddOnsPaginated findAllAddOns(@QueryMap(encoded=true) FindAllAddOnsQueryParams queryParams);

  /**
  * List all add-ons
  * This endpoint is used to list all existing add-ons.
  * Note, this is equivalent to the other <code>findAllAddOns</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return AddOnsPaginated
      */
      @RequestLine("GET /add_ons?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AddOnsPaginated> findAllAddOnsWithHttpInfo(@QueryMap(encoded=true) FindAllAddOnsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllAddOns</code> method in a fluent style.
   */
  public static class FindAllAddOnsQueryParams extends HashMap<String, Object> {
    public FindAllAddOnsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllAddOnsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update an add-on
   * This endpoint is used to update an existing add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @param addOnUpdateInput Add-on payload (required)
   * @return AddOn
   */
  @RequestLine("PUT /add_ons/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddOn updateAddOn(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull AddOnUpdateInput addOnUpdateInput);

  /**
   * Update an add-on
   * Similar to <code>updateAddOn</code> but it also returns the http response headers .
   * This endpoint is used to update an existing add-on.
   * @param code Unique code used to identify the add-on. (required)
   * @param addOnUpdateInput Add-on payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /add_ons/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddOn> updateAddOnWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull AddOnUpdateInput addOnUpdateInput);


}
