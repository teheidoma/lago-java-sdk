package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.BillableMetric;
import org.openapitools.client.model.BillableMetricCreateInput;
import org.openapitools.client.model.BillableMetricEvaluateExpressionInput;
import org.openapitools.client.model.BillableMetricEvaluateExpressionResult;
import org.openapitools.client.model.BillableMetricUpdateInput;
import org.openapitools.client.model.BillableMetricsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface BillableMetricsApi extends ApiClient.Api {


  /**
   * Create a billable metric
   * This endpoint creates a new billable metric representing a pricing component of your application.
   * @param billableMetricCreateInput Billable metric payload (required)
   * @return BillableMetric
   */
  @RequestLine("POST /billable_metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BillableMetric createBillableMetric(@javax.annotation.Nonnull BillableMetricCreateInput billableMetricCreateInput);

  /**
   * Create a billable metric
   * Similar to <code>createBillableMetric</code> but it also returns the http response headers .
   * This endpoint creates a new billable metric representing a pricing component of your application.
   * @param billableMetricCreateInput Billable metric payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /billable_metrics")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BillableMetric> createBillableMetricWithHttpInfo(@javax.annotation.Nonnull BillableMetricCreateInput billableMetricCreateInput);



  /**
   * Delete a billable metric
   * This endpoint deletes an existing billable metric representing a pricing component of your application.
   * @param code Code of the existing billable metric. (required)
   * @return BillableMetric
   */
  @RequestLine("DELETE /billable_metrics/{code}")
  @Headers({
    "Accept: application/json",
  })
  BillableMetric destroyBillableMetric(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Delete a billable metric
   * Similar to <code>destroyBillableMetric</code> but it also returns the http response headers .
   * This endpoint deletes an existing billable metric representing a pricing component of your application.
   * @param code Code of the existing billable metric. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /billable_metrics/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BillableMetric> destroyBillableMetricWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Evaluate an expression for a billable metric
   * Evaluate an expression for a billable metric creation by providing the expression and test data
   * @param billableMetricEvaluateExpressionInput Billable metric expression evaluation payload (required)
   * @return BillableMetricEvaluateExpressionResult
   */
  @RequestLine("POST /billable_metrics/evaluate_expression")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BillableMetricEvaluateExpressionResult evaluateBillableMetricExpression(@javax.annotation.Nonnull BillableMetricEvaluateExpressionInput billableMetricEvaluateExpressionInput);

  /**
   * Evaluate an expression for a billable metric
   * Similar to <code>evaluateBillableMetricExpression</code> but it also returns the http response headers .
   * Evaluate an expression for a billable metric creation by providing the expression and test data
   * @param billableMetricEvaluateExpressionInput Billable metric expression evaluation payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /billable_metrics/evaluate_expression")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BillableMetricEvaluateExpressionResult> evaluateBillableMetricExpressionWithHttpInfo(@javax.annotation.Nonnull BillableMetricEvaluateExpressionInput billableMetricEvaluateExpressionInput);



  /**
   * List all billable metrics
   * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return BillableMetricsPaginated
   */
  @RequestLine("GET /billable_metrics?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  BillableMetricsPaginated findAllBillableMetrics(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all billable metrics
   * Similar to <code>findAllBillableMetrics</code> but it also returns the http response headers .
   * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /billable_metrics?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BillableMetricsPaginated> findAllBillableMetricsWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all billable metrics
   * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
   * Note, this is equivalent to the other <code>findAllBillableMetrics</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllBillableMetricsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return BillableMetricsPaginated
   */
  @RequestLine("GET /billable_metrics?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  BillableMetricsPaginated findAllBillableMetrics(@QueryMap(encoded=true) FindAllBillableMetricsQueryParams queryParams);

  /**
  * List all billable metrics
  * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
  * Note, this is equivalent to the other <code>findAllBillableMetrics</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return BillableMetricsPaginated
      */
      @RequestLine("GET /billable_metrics?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<BillableMetricsPaginated> findAllBillableMetricsWithHttpInfo(@QueryMap(encoded=true) FindAllBillableMetricsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllBillableMetrics</code> method in a fluent style.
   */
  public static class FindAllBillableMetricsQueryParams extends HashMap<String, Object> {
    public FindAllBillableMetricsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllBillableMetricsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a billable metric
   * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
   * @param code Code of the existing billable metric. (required)
   * @return BillableMetric
   */
  @RequestLine("GET /billable_metrics/{code}")
  @Headers({
    "Accept: application/json",
  })
  BillableMetric findBillableMetric(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Retrieve a billable metric
   * Similar to <code>findBillableMetric</code> but it also returns the http response headers .
   * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
   * @param code Code of the existing billable metric. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /billable_metrics/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<BillableMetric> findBillableMetricWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Update a billable metric
   * This endpoint updates an existing billable metric representing a pricing component of your application.
   * @param code Code of the existing billable metric. (required)
   * @param billableMetricUpdateInput Billable metric payload (required)
   * @return BillableMetric
   */
  @RequestLine("PUT /billable_metrics/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BillableMetric updateBillableMetric(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull BillableMetricUpdateInput billableMetricUpdateInput);

  /**
   * Update a billable metric
   * Similar to <code>updateBillableMetric</code> but it also returns the http response headers .
   * This endpoint updates an existing billable metric representing a pricing component of your application.
   * @param code Code of the existing billable metric. (required)
   * @param billableMetricUpdateInput Billable metric payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /billable_metrics/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BillableMetric> updateBillableMetricWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull BillableMetricUpdateInput billableMetricUpdateInput);


}
