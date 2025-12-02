package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Tax;
import org.openapitools.client.model.TaxCreateInput;
import org.openapitools.client.model.TaxUpdateInput;
import org.openapitools.client.model.TaxesPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface TaxesApi extends ApiClient.Api {


  /**
   * Create a tax
   * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param taxCreateInput Tax creation payload (required)
   * @return Tax
   */
  @RequestLine("POST /taxes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Tax createTax(@javax.annotation.Nonnull TaxCreateInput taxCreateInput);

  /**
   * Create a tax
   * Similar to <code>createTax</code> but it also returns the http response headers .
   * This endpoint creates a new tax representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param taxCreateInput Tax creation payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /taxes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Tax> createTaxWithHttpInfo(@javax.annotation.Nonnull TaxCreateInput taxCreateInput);



  /**
   * Delete a tax
   * This endpoint is used to delete a tax.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @return Tax
   */
  @RequestLine("DELETE /taxes/{code}")
  @Headers({
    "Accept: application/json",
  })
  Tax destroyTax(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Delete a tax
   * Similar to <code>destroyTax</code> but it also returns the http response headers .
   * This endpoint is used to delete a tax.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /taxes/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Tax> destroyTaxWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * List all taxes
   * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return TaxesPaginated
   */
  @RequestLine("GET /taxes?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  TaxesPaginated findAllTaxes(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all taxes
   * Similar to <code>findAllTaxes</code> but it also returns the http response headers .
   * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /taxes?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<TaxesPaginated> findAllTaxesWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all taxes
   * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
   * Note, this is equivalent to the other <code>findAllTaxes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllTaxesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return TaxesPaginated
   */
  @RequestLine("GET /taxes?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  TaxesPaginated findAllTaxes(@QueryMap(encoded=true) FindAllTaxesQueryParams queryParams);

  /**
  * List all taxes
  * This endpoint retrieves all existing taxes representing a customizable tax rate applicable to either the organization or a specific customer.
  * Note, this is equivalent to the other <code>findAllTaxes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return TaxesPaginated
      */
      @RequestLine("GET /taxes?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<TaxesPaginated> findAllTaxesWithHttpInfo(@QueryMap(encoded=true) FindAllTaxesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllTaxes</code> method in a fluent style.
   */
  public static class FindAllTaxesQueryParams extends HashMap<String, Object> {
    public FindAllTaxesQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllTaxesQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a Tax
   * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @return Tax
   */
  @RequestLine("GET /taxes/{code}")
  @Headers({
    "Accept: application/json",
  })
  Tax findTax(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Retrieve a Tax
   * Similar to <code>findTax</code> but it also returns the http response headers .
   * This endpoint retrieves an existing tax representing a customizable tax rate applicable to either the organization or a specific customer. The tax is identified by its unique code.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /taxes/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Tax> findTaxWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Update a tax
   * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @param taxUpdateInput Tax update payload (required)
   * @return Tax
   */
  @RequestLine("PUT /taxes/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Tax updateTax(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull TaxUpdateInput taxUpdateInput);

  /**
   * Update a tax
   * Similar to <code>updateTax</code> but it also returns the http response headers .
   * This endpoint updates an existing tax representing a customizable tax rate applicable to either the organization or a specific customer.
   * @param code The code of the tax. It serves as a unique identifier associated with a particular tax. The code is typically used for internal or system-level identification purposes. (required)
   * @param taxUpdateInput Tax update payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /taxes/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Tax> updateTaxWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull TaxUpdateInput taxUpdateInput);


}
