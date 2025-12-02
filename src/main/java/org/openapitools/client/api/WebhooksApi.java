package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorUnauthorized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface WebhooksApi extends ApiClient.Api {


  /**
   * Retrieve webhook public key
   * This endpoint is used to retrieve the public key used to verify the webhooks signature
   * @return String
   */
  @RequestLine("GET /webhooks/public_key")
  @Headers({
    "Accept: application/json,text/plain",
  })
  String fetchPublicKey();

  /**
   * Retrieve webhook public key
   * Similar to <code>fetchPublicKey</code> but it also returns the http response headers .
   * This endpoint is used to retrieve the public key used to verify the webhooks signature
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /webhooks/public_key")
  @Headers({
    "Accept: application/json,text/plain",
  })
  ApiResponse<String> fetchPublicKeyWithHttpInfo();


}
