package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Plan;
import org.openapitools.client.model.PlanCreateInput;
import org.openapitools.client.model.PlanUpdateInput;
import org.openapitools.client.model.PlansPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface PlansApi extends ApiClient.Api {


  /**
   * Create a plan
   * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
   * @param planCreateInput Plan payload (required)
   * @return Plan
   */
  @RequestLine("POST /plans")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Plan createPlan(@javax.annotation.Nonnull PlanCreateInput planCreateInput);

  /**
   * Create a plan
   * Similar to <code>createPlan</code> but it also returns the http response headers .
   * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
   * @param planCreateInput Plan payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /plans")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Plan> createPlanWithHttpInfo(@javax.annotation.Nonnull PlanCreateInput planCreateInput);



  /**
   * Delete a plan
   * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @return Plan
   */
  @RequestLine("DELETE /plans/{code}")
  @Headers({
    "Accept: application/json",
  })
  Plan destroyPlan(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Delete a plan
   * Similar to <code>destroyPlan</code> but it also returns the http response headers .
   * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /plans/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Plan> destroyPlanWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * List all plans
   * This endpoint retrieves all existing plans.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return PlansPaginated
   */
  @RequestLine("GET /plans?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  PlansPaginated findAllPlans(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all plans
   * Similar to <code>findAllPlans</code> but it also returns the http response headers .
   * This endpoint retrieves all existing plans.
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /plans?page={page}&per_page={perPage}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PlansPaginated> findAllPlansWithHttpInfo(@Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all plans
   * This endpoint retrieves all existing plans.
   * Note, this is equivalent to the other <code>findAllPlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllPlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   </ul>
   * @return PlansPaginated
   */
  @RequestLine("GET /plans?page={page}&per_page={perPage}")
  @Headers({
  "Accept: application/json",
  })
  PlansPaginated findAllPlans(@QueryMap(encoded=true) FindAllPlansQueryParams queryParams);

  /**
  * List all plans
  * This endpoint retrieves all existing plans.
  * Note, this is equivalent to the other <code>findAllPlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
      *   </ul>
          * @return PlansPaginated
      */
      @RequestLine("GET /plans?page={page}&per_page={perPage}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PlansPaginated> findAllPlansWithHttpInfo(@QueryMap(encoded=true) FindAllPlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllPlans</code> method in a fluent style.
   */
  public static class FindAllPlansQueryParams extends HashMap<String, Object> {
    public FindAllPlansQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllPlansQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a plan
   * This endpoint retrieves a specific plan.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @return Plan
   */
  @RequestLine("GET /plans/{code}")
  @Headers({
    "Accept: application/json",
  })
  Plan findPlan(@Param("code") @javax.annotation.Nonnull String code);

  /**
   * Retrieve a plan
   * Similar to <code>findPlan</code> but it also returns the http response headers .
   * This endpoint retrieves a specific plan.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /plans/{code}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Plan> findPlanWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code);



  /**
   * Update a plan
   * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @param planUpdateInput Plan payload (required)
   * @return Plan
   */
  @RequestLine("PUT /plans/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Plan updatePlan(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull PlanUpdateInput planUpdateInput);

  /**
   * Update a plan
   * Similar to <code>updatePlan</code> but it also returns the http response headers .
   * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
   * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance. (required)
   * @param planUpdateInput Plan payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /plans/{code}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Plan> updatePlanWithHttpInfo(@Param("code") @javax.annotation.Nonnull String code, @javax.annotation.Nonnull PlanUpdateInput planUpdateInput);


}
