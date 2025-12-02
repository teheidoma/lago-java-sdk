package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillableMetricsApi
 */
class BillableMetricsApiTest {

    private BillableMetricsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BillableMetricsApi.class);
    }

    
    /**
     * Create a billable metric
     *
     * This endpoint creates a new billable metric representing a pricing component of your application.
     */
    @Test
    void createBillableMetricTest() {
        BillableMetricCreateInput billableMetricCreateInput = null;
        // BillableMetric response = api.createBillableMetric(billableMetricCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete a billable metric
     *
     * This endpoint deletes an existing billable metric representing a pricing component of your application.
     */
    @Test
    void destroyBillableMetricTest() {
        String code = null;
        // BillableMetric response = api.destroyBillableMetric(code);

        // TODO: test validations
    }

    
    /**
     * Evaluate an expression for a billable metric
     *
     * Evaluate an expression for a billable metric creation by providing the expression and test data
     */
    @Test
    void evaluateBillableMetricExpressionTest() {
        BillableMetricEvaluateExpressionInput billableMetricEvaluateExpressionInput = null;
        // BillableMetricEvaluateExpressionResult response = api.evaluateBillableMetricExpression(billableMetricEvaluateExpressionInput);

        // TODO: test validations
    }

    
    /**
     * List all billable metrics
     *
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     */
    @Test
    void findAllBillableMetricsTest() {
        Integer page = null;
        Integer perPage = null;
        // BillableMetricsPaginated response = api.findAllBillableMetrics(page, perPage);

        // TODO: test validations
    }

    /**
     * List all billable metrics
     *
     * This endpoint retrieves all existing billable metrics that represent pricing components of your application.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllBillableMetricsTestQueryMap() {
        BillableMetricsApi.FindAllBillableMetricsQueryParams queryParams = new BillableMetricsApi.FindAllBillableMetricsQueryParams()
            .page(null)
            .perPage(null);
        // BillableMetricsPaginated response = api.findAllBillableMetrics(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a billable metric
     *
     * This endpoint retrieves an existing billable metric that represents a pricing component of your application. The billable metric is identified by its unique code.
     */
    @Test
    void findBillableMetricTest() {
        String code = null;
        // BillableMetric response = api.findBillableMetric(code);

        // TODO: test validations
    }

    
    /**
     * Update a billable metric
     *
     * This endpoint updates an existing billable metric representing a pricing component of your application.
     */
    @Test
    void updateBillableMetricTest() {
        String code = null;
        BillableMetricUpdateInput billableMetricUpdateInput = null;
        // BillableMetric response = api.updateBillableMetric(code, billableMetricUpdateInput);

        // TODO: test validations
    }

    
}
