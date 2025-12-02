package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.AppliedCouponInput;
import org.openapitools.client.model.AppliedCouponsPaginated;
import org.openapitools.client.model.Coupon;
import org.openapitools.client.model.CouponCreateInput;
import org.openapitools.client.model.CouponUpdateInput;
import org.openapitools.client.model.CouponsPaginated;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface CouponsApi extends ApiClient.Api {


  /**
   * Apply a coupon to a customer
   * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
   * @param appliedCouponInput Apply coupon payload (required)
   * @return AppliedCoupon
   */
  @RequestLine("POST /applied_coupons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AppliedCoupon applyCoupon(@javax.annotation.Nonnull AppliedCouponInput appliedCouponInput);

  /**
   * Apply a coupon to a customer
   * Similar to <code>applyCoupon</code> but it also returns the http response headers .
   * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
   * @param appliedCouponInput Apply coupon payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /applied_coupons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AppliedCoupon> applyCouponWithHttpInfo(@javax.annotation.Nonnull AppliedCouponInput appliedCouponInput);



  /**
   * Create a coupon
   * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
   * @param couponCreateInput Coupon payload (required)
   * @return Coupon
   */
  @RequestLine("POST /coupons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Coupon createCoupon(@javax.annotation.Nonnull CouponCreateInput couponCreateInput);

  /**
   * Create a coupon
   * Similar to <code>createCoupon</code> but it also returns the http response headers .
   * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
   * @param couponCreateInput Coupon payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /coupons")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Coupon> createCouponWithHttpInfo(@javax.annotation.Nonnull CouponCreateInput couponCreateInput);



  /**
   * Delete an applied coupon
   * This endpoint is used to delete a specific coupon that has been applied to a customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @param appliedCouponId Unique identifier of the applied coupon, created by Lago. (required)
   * @return AppliedCoupon
   */
  @RequestLine("DELETE /customers/{externalCustomerId}/applied_coupons/{appliedCouponId}")
  @Headers({
    "Accept: application/json",
  })
  AppliedCoupon deleteAppliedCoupon(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("appliedCouponId") @javax.annotation.Nonnull UUID appliedCouponId);

  /**
   * Delete an applied coupon
   * Similar to <code>deleteAppliedCoupon</code> but it also returns the http response headers .
   * This endpoint is used to delete a specific coupon that has been applied to a customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @param appliedCouponId Unique identifier of the applied coupon, created by Lago. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /customers/{externalCustomerId}/applied_coupons/{appliedCouponId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppliedCoupon> deleteAppliedCouponWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("appliedCouponId") @javax.annotation.Nonnull UUID appliedCouponId);



  /**
   * Delete a coupon
   * This endpoint is used to delete a coupon.
   * @param code Unique code used to identify the coupon. (required)
   * @return Coupon
   */
  @RequestLine("DELETE /coupons/{code}")
  @Headers({
    "Accept: application/json",
  })
  Coupon destroyCoupon(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Delete a coupon
   * Similar to <code>destroyCoupon</code> but it also returns the http response headers .
   * This endpoint is used to delete a coupon.
   * @param code Unique code used to identify the coupon. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /coupons/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Coupon> destroyCouponWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * List all applied coupons
   * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (optional)
   * @return AppliedCouponsPaginated
   */
  @RequestLine("GET /applied_coupons?page={page}&per_page={perPage}&status={status}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  AppliedCouponsPaginated findAllAppliedCoupons(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("status") @javax.annotation.Nullable String status, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId);

  /**
   * List all applied coupons
   * Similar to <code>findAllAppliedCoupons</code> but it also returns the http response headers .
   * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param status The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /applied_coupons?page={page}&per_page={perPage}&status={status}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AppliedCouponsPaginated> findAllAppliedCouponsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("status") @javax.annotation.Nullable String status, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId);


  /**
   * List all applied coupons
   * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
   * Note, this is equivalent to the other <code>findAllAppliedCoupons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllAppliedCouponsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>status - The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;. (optional)</li>
   *   <li>externalCustomerId - The customer external unique identifier (provided by your own application) (optional)</li>
   *   </ul>
   * @return AppliedCouponsPaginated
   */
  @RequestLine("GET /applied_coupons?page={page}&per_page={perPage}&status={status}&external_customer_id={externalCustomerId}")
  @Headers({
  "Accept: application/json",
  })
  AppliedCouponsPaginated findAllAppliedCoupons(@QueryMap(encoded=true) FindAllAppliedCouponsQueryParams queryParams);

  /**
  * List all applied coupons
  * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
  * Note, this is equivalent to the other <code>findAllAppliedCoupons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>status - The status of the coupon. Can be either &#x60;active&#x60; or &#x60;terminated&#x60;. (optional)</li>
          *   <li>externalCustomerId - The customer external unique identifier (provided by your own application) (optional)</li>
      *   </ul>
          * @return AppliedCouponsPaginated
      */
      @RequestLine("GET /applied_coupons?page={page}&per_page={perPage}&status={status}&external_customer_id={externalCustomerId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<AppliedCouponsPaginated> findAllAppliedCouponsWithHttpInfo(@QueryMap(encoded=true) FindAllAppliedCouponsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllAppliedCoupons</code> method in a fluent style.
   */
  public static class FindAllAppliedCouponsQueryParams extends HashMap<String, Object> {
    public FindAllAppliedCouponsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllAppliedCouponsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllAppliedCouponsQueryParams status(@javax.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllAppliedCouponsQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List all coupons
   * This endpoint is used to list all existing coupons.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return CouponsPaginated
   */
  @RequestLine("GET /coupons?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  CouponsPaginated findAllCoupons(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all coupons
   * Similar to <code>findAllCoupons</code> but it also returns the http response headers .
   * This endpoint is used to list all existing coupons.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /coupons?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CouponsPaginated> findAllCouponsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all coupons
   * This endpoint is used to list all existing coupons.
   * Note, this is equivalent to the other <code>findAllCoupons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllCouponsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return CouponsPaginated
   */
  @RequestLine("GET /coupons?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  CouponsPaginated findAllCoupons(@QueryMap(encoded=true) FindAllCouponsQueryParams queryParams);

  /**
  * List all coupons
  * This endpoint is used to list all existing coupons.
  * Note, this is equivalent to the other <code>findAllCoupons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return CouponsPaginated
      */
      @RequestLine("GET /coupons?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CouponsPaginated> findAllCouponsWithHttpInfo(@QueryMap(encoded=true) FindAllCouponsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllCoupons</code> method in a fluent style.
   */
  public static class FindAllCouponsQueryParams extends HashMap<String, Object> {
    public FindAllCouponsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCouponsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a coupon
   * This endpoint is used to retrieve a specific coupon.
   * @param code Unique code used to identify the coupon. (required)
   * @return Coupon
   */
  @RequestLine("GET /coupons/{code}")
  @Headers({
    "Accept: application/json",
  })
  Coupon findCoupon(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Retrieve a coupon
   * Similar to <code>findCoupon</code> but it also returns the http response headers .
   * This endpoint is used to retrieve a specific coupon.
   * @param code Unique code used to identify the coupon. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /coupons/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Coupon> findCouponWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Update a coupon
   * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
   * @param code Unique code used to identify the coupon. (required)
   * @param couponUpdateInput Coupon payload (required)
   * @return Coupon
   */
  @RequestLine("PUT /coupons/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Coupon updateCoupon(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull CouponUpdateInput couponUpdateInput);

  /**
   * Update a coupon
   * Similar to <code>updateCoupon</code> but it also returns the http response headers .
   * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
   * @param code Unique code used to identify the coupon. (required)
   * @param couponUpdateInput Coupon payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /coupons/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Coupon> updateCouponWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull CouponUpdateInput couponUpdateInput);


}
