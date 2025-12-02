package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.CustomerCheckoutUrl;
import org.openapitools.client.model.CustomerCreateInput;
import org.openapitools.client.model.CustomerPastUsage;
import org.openapitools.client.model.CustomerUsage;
import org.openapitools.client.model.CustomersPaginated;
import org.openapitools.client.model.GetCustomerPortalUrl200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface CustomersApi extends ApiClient.Api {


  /**
   * Create a customer
   * This endpoint creates a new customer.
   * @param customerCreateInput Customer payload (required)
   * @return Customer
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Customer createCustomer(@javax.annotation.Nonnull CustomerCreateInput customerCreateInput);

  /**
   * Create a customer
   * Similar to <code>createCustomer</code> but it also returns the http response headers .
   * This endpoint creates a new customer.
   * @param customerCreateInput Customer payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Customer> createCustomerWithHttpInfo(@javax.annotation.Nonnull CustomerCreateInput customerCreateInput);



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
   * Delete a customer
   * This endpoint deletes an existing customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @return Customer
   */
  @RequestLine("DELETE /customers/{externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  Customer destroyCustomer(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);

  /**
   * Delete a customer
   * Similar to <code>destroyCustomer</code> but it also returns the http response headers .
   * This endpoint deletes an existing customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /customers/{externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Customer> destroyCustomerWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);



  /**
   * Retrieve customer past usage
   * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param externalSubscriptionId The unique identifier of the subscription within your application. (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param billableMetricCode Billable metric code filter to apply to the charge usage (optional)
   * @param periodsCount Number of past billing period to returns in the result (optional)
   * @return CustomerPastUsage
   */
  @RequestLine("GET /customers/{externalCustomerId}/past_usage?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&billable_metric_code={billableMetricCode}&periods_count={periodsCount}")
  @Headers({
    "Accept: application/json",
  })
  CustomerPastUsage findAllCustomerPastUsage(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nonnull String externalSubscriptionId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("billableMetricCode") @javax.annotation.Nullable String billableMetricCode, @Param("periodsCount") @javax.annotation.Nullable Integer periodsCount);

  /**
   * Retrieve customer past usage
   * Similar to <code>findAllCustomerPastUsage</code> but it also returns the http response headers .
   * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param externalSubscriptionId The unique identifier of the subscription within your application. (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param billableMetricCode Billable metric code filter to apply to the charge usage (optional)
   * @param periodsCount Number of past billing period to returns in the result (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{externalCustomerId}/past_usage?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&billable_metric_code={billableMetricCode}&periods_count={periodsCount}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerPastUsage> findAllCustomerPastUsageWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nonnull String externalSubscriptionId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("billableMetricCode") @javax.annotation.Nullable String billableMetricCode, @Param("periodsCount") @javax.annotation.Nullable Integer periodsCount);


  /**
   * Retrieve customer past usage
   * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
   * Note, this is equivalent to the other <code>findAllCustomerPastUsage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllCustomerPastUsageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalSubscriptionId - The unique identifier of the subscription within your application. (required)</li>
   *   <li>billableMetricCode - Billable metric code filter to apply to the charge usage (optional)</li>
   *   <li>periodsCount - Number of past billing period to returns in the result (optional)</li>
   *   </ul>
   * @return CustomerPastUsage
   */
  @RequestLine("GET /customers/{externalCustomerId}/past_usage?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&billable_metric_code={billableMetricCode}&periods_count={periodsCount}")
  @Headers({
  "Accept: application/json",
  })
  CustomerPastUsage findAllCustomerPastUsage(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @QueryMap(encoded=true) FindAllCustomerPastUsageQueryParams queryParams);

  /**
  * Retrieve customer past usage
  * This endpoint enables the retrieval of the usage-based billing data for a customer within past periods.
  * Note, this is equivalent to the other <code>findAllCustomerPastUsage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalSubscriptionId - The unique identifier of the subscription within your application. (required)</li>
          *   <li>billableMetricCode - Billable metric code filter to apply to the charge usage (optional)</li>
          *   <li>periodsCount - Number of past billing period to returns in the result (optional)</li>
      *   </ul>
          * @return CustomerPastUsage
      */
      @RequestLine("GET /customers/{externalCustomerId}/past_usage?page={page}&per_page={perPage}&external_subscription_id={externalSubscriptionId}&billable_metric_code={billableMetricCode}&periods_count={periodsCount}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerPastUsage> findAllCustomerPastUsageWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @QueryMap(encoded=true) FindAllCustomerPastUsageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllCustomerPastUsage</code> method in a fluent style.
   */
  public static class FindAllCustomerPastUsageQueryParams extends HashMap<String, Object> {
    public FindAllCustomerPastUsageQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomerPastUsageQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomerPastUsageQueryParams externalSubscriptionId(@javax.annotation.Nonnull final String value) {
      put("external_subscription_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomerPastUsageQueryParams billableMetricCode(@javax.annotation.Nullable final String value) {
      put("billable_metric_code", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomerPastUsageQueryParams periodsCount(@javax.annotation.Nullable final Integer value) {
      put("periods_count", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List all customers
   * This endpoint retrieves all existing customers.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param accountType Filter customers by account type. (optional)
   * @param billingEntityCodes Filter customers by billing entity codes. (optional)
   * @return CustomersPaginated
   */
  @RequestLine("GET /customers?page={page}&per_page={perPage}&account_type={accountType}&billing_entity_codes={billingEntityCodes}")
  @Headers({
    "Accept: application/json",
  })
  CustomersPaginated findAllCustomers(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("accountType") @javax.annotation.Nullable List<String> accountType, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes);

  /**
   * List all customers
   * Similar to <code>findAllCustomers</code> but it also returns the http response headers .
   * This endpoint retrieves all existing customers.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param accountType Filter customers by account type. (optional)
   * @param billingEntityCodes Filter customers by billing entity codes. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers?page={page}&per_page={perPage}&account_type={accountType}&billing_entity_codes={billingEntityCodes}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomersPaginated> findAllCustomersWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("accountType") @javax.annotation.Nullable List<String> accountType, @Param("billingEntityCodes") @javax.annotation.Nullable List<String> billingEntityCodes);


  /**
   * List all customers
   * This endpoint retrieves all existing customers.
   * Note, this is equivalent to the other <code>findAllCustomers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllCustomersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>accountType - Filter customers by account type. (optional)</li>
   *   <li>billingEntityCodes - Filter customers by billing entity codes. (optional)</li>
   *   </ul>
   * @return CustomersPaginated
   */
  @RequestLine("GET /customers?page={page}&per_page={perPage}&account_type={accountType}&billing_entity_codes={billingEntityCodes}")
  @Headers({
  "Accept: application/json",
  })
  CustomersPaginated findAllCustomers(@QueryMap(encoded=true) FindAllCustomersQueryParams queryParams);

  /**
  * List all customers
  * This endpoint retrieves all existing customers.
  * Note, this is equivalent to the other <code>findAllCustomers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>accountType - Filter customers by account type. (optional)</li>
          *   <li>billingEntityCodes - Filter customers by billing entity codes. (optional)</li>
      *   </ul>
          * @return CustomersPaginated
      */
      @RequestLine("GET /customers?page={page}&per_page={perPage}&account_type={accountType}&billing_entity_codes={billingEntityCodes}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomersPaginated> findAllCustomersWithHttpInfo(@QueryMap(encoded=true) FindAllCustomersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllCustomers</code> method in a fluent style.
   */
  public static class FindAllCustomersQueryParams extends HashMap<String, Object> {
    public FindAllCustomersQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomersQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllCustomersQueryParams accountType(@javax.annotation.Nullable final List<String> value) {
      put("account_type", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public FindAllCustomersQueryParams billingEntityCodes(@javax.annotation.Nullable final List<String> value) {
      put("billing_entity_codes", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * Retrieve a customer
   * This endpoint retrieves an existing customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @return Customer
   */
  @RequestLine("GET /customers/{externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  Customer findCustomer(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);

  /**
   * Retrieve a customer
   * Similar to <code>findCustomer</code> but it also returns the http response headers .
   * This endpoint retrieves an existing customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application) (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Customer> findCustomerWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);



  /**
   * Retrieve customer current usage
   * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param externalSubscriptionId The unique identifier of the subscription within your application. (required)
   * @param applyTaxes Optional flag to determine if taxes should be applied. Defaults to &#x60;true&#x60; if not provided or if null.  (optional, default to true)
   * @return CustomerUsage
   */
  @RequestLine("GET /customers/{externalCustomerId}/current_usage?external_subscription_id={externalSubscriptionId}&apply_taxes={applyTaxes}")
  @Headers({
    "Accept: application/json",
  })
  CustomerUsage findCustomerCurrentUsage(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nonnull String externalSubscriptionId, @Param("applyTaxes") @javax.annotation.Nullable Boolean applyTaxes);

  /**
   * Retrieve customer current usage
   * Similar to <code>findCustomerCurrentUsage</code> but it also returns the http response headers .
   * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param externalSubscriptionId The unique identifier of the subscription within your application. (required)
   * @param applyTaxes Optional flag to determine if taxes should be applied. Defaults to &#x60;true&#x60; if not provided or if null.  (optional, default to true)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{externalCustomerId}/current_usage?external_subscription_id={externalSubscriptionId}&apply_taxes={applyTaxes}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerUsage> findCustomerCurrentUsageWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("externalSubscriptionId") @javax.annotation.Nonnull String externalSubscriptionId, @Param("applyTaxes") @javax.annotation.Nullable Boolean applyTaxes);


  /**
   * Retrieve customer current usage
   * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
   * Note, this is equivalent to the other <code>findCustomerCurrentUsage</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindCustomerCurrentUsageQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>externalSubscriptionId - The unique identifier of the subscription within your application. (required)</li>
   *   <li>applyTaxes - Optional flag to determine if taxes should be applied. Defaults to &#x60;true&#x60; if not provided or if null.  (optional, default to true)</li>
   *   </ul>
   * @return CustomerUsage
   */
  @RequestLine("GET /customers/{externalCustomerId}/current_usage?external_subscription_id={externalSubscriptionId}&apply_taxes={applyTaxes}")
  @Headers({
  "Accept: application/json",
  })
  CustomerUsage findCustomerCurrentUsage(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @QueryMap(encoded=true) FindCustomerCurrentUsageQueryParams queryParams);

  /**
  * Retrieve customer current usage
  * This endpoint enables the retrieval of the usage-based billing data for a customer within the current period.
  * Note, this is equivalent to the other <code>findCustomerCurrentUsage</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>externalSubscriptionId - The unique identifier of the subscription within your application. (required)</li>
          *   <li>applyTaxes - Optional flag to determine if taxes should be applied. Defaults to &#x60;true&#x60; if not provided or if null.  (optional, default to true)</li>
      *   </ul>
          * @return CustomerUsage
      */
      @RequestLine("GET /customers/{externalCustomerId}/current_usage?external_subscription_id={externalSubscriptionId}&apply_taxes={applyTaxes}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerUsage> findCustomerCurrentUsageWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @QueryMap(encoded=true) FindCustomerCurrentUsageQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findCustomerCurrentUsage</code> method in a fluent style.
   */
  public static class FindCustomerCurrentUsageQueryParams extends HashMap<String, Object> {
    public FindCustomerCurrentUsageQueryParams externalSubscriptionId(@javax.annotation.Nonnull final String value) {
      put("external_subscription_id", EncodingUtils.encode(value));
      return this;
    }
    public FindCustomerCurrentUsageQueryParams applyTaxes(@javax.annotation.Nullable final Boolean value) {
      put("apply_taxes", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generate a Customer Payment Provider Checkout URL
   * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @return CustomerCheckoutUrl
   */
  @RequestLine("POST /customers/{externalCustomerId}/checkout_url")
  @Headers({
    "Accept: application/json",
  })
  CustomerCheckoutUrl generateCustomerCheckoutURL(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);

  /**
   * Generate a Customer Payment Provider Checkout URL
   * Similar to <code>generateCustomerCheckoutURL</code> but it also returns the http response headers .
   * This endpoint regenerates the Payment Provider Checkout URL of a Customer.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers/{externalCustomerId}/checkout_url")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerCheckoutUrl> generateCustomerCheckoutURLWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);



  /**
   * Get a customer portal URL
   * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
   * @param externalCustomerId External ID of the existing customer (required)
   * @return GetCustomerPortalUrl200Response
   */
  @RequestLine("GET /customers/{externalCustomerId}/portal_url")
  @Headers({
    "Accept: application/json",
  })
  GetCustomerPortalUrl200Response getCustomerPortalUrl(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);

  /**
   * Get a customer portal URL
   * Similar to <code>getCustomerPortalUrl</code> but it also returns the http response headers .
   * Retrieves an embeddable link for displaying a customer portal.  This endpoint allows you to fetch the URL that can be embedded to provide customers access to a dedicated portal
   * @param externalCustomerId External ID of the existing customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{externalCustomerId}/portal_url")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GetCustomerPortalUrl200Response> getCustomerPortalUrlWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId);


}
