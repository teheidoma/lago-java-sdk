package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Plan;
import org.openapitools.client.model.PlanCreateInput;
import org.openapitools.client.model.PlanUpdateInput;
import org.openapitools.client.model.PlansPaginated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlansApi
 */
class PlansApiTest {

    private PlansApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PlansApi.class);
    }

    
    /**
     * Create a plan
     *
     * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     */
    @Test
    void createPlanTest() {
        PlanCreateInput planCreateInput = null;
        // Plan response = api.createPlan(planCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete a plan
     *
     * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
     */
    @Test
    void destroyPlanTest() {
        String code = null;
        // Plan response = api.destroyPlan(code);

        // TODO: test validations
    }

    
    /**
     * List all plans
     *
     * This endpoint retrieves all existing plans.
     */
    @Test
    void findAllPlansTest() {
        Integer page = null;
        Integer perPage = null;
        // PlansPaginated response = api.findAllPlans(page, perPage);

        // TODO: test validations
    }

    /**
     * List all plans
     *
     * This endpoint retrieves all existing plans.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllPlansTestQueryMap() {
        PlansApi.FindAllPlansQueryParams queryParams = new PlansApi.FindAllPlansQueryParams()
            .page(null)
            .perPage(null);
        // PlansPaginated response = api.findAllPlans(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a plan
     *
     * This endpoint retrieves a specific plan.
     */
    @Test
    void findPlanTest() {
        String code = null;
        // Plan response = api.findPlan(code);

        // TODO: test validations
    }

    
    /**
     * Update a plan
     *
     * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     */
    @Test
    void updatePlanTest() {
        String code = null;
        PlanUpdateInput planUpdateInput = null;
        // Plan response = api.updatePlan(code, planUpdateInput);

        // TODO: test validations
    }

    
}
