package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationUpdateInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationsApi
 */
class OrganizationsApiTest {

    private OrganizationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(OrganizationsApi.class);
    }

    
    /**
     * Update your organization
     *
     * This endpoint is used to update your own organization&#39;s settings.
     */
    @Test
    void updateOrganizationTest() {
        OrganizationUpdateInput organizationUpdateInput = null;
        // Organization response = api.updateOrganization(organizationUpdateInput);

        // TODO: test validations
    }

    
}
