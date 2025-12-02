package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationUpdateInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface OrganizationsApi extends ApiClient.Api {


  /**
   * Update your organization
   * This endpoint is used to update your own organization&#39;s settings.
   * @param organizationUpdateInput Update an existing organization (required)
   * @return Organization
   */
  @RequestLine("PUT /organizations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Organization updateOrganization(@javax.annotation.Nonnull OrganizationUpdateInput organizationUpdateInput);

  /**
   * Update your organization
   * Similar to <code>updateOrganization</code> but it also returns the http response headers .
   * This endpoint is used to update your own organization&#39;s settings.
   * @param organizationUpdateInput Update an existing organization (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /organizations")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Organization> updateOrganizationWithHttpInfo(@javax.annotation.Nonnull OrganizationUpdateInput organizationUpdateInput);


}
