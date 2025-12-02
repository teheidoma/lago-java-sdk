package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.Wallet;
import org.openapitools.client.model.WalletCreateInput;
import org.openapitools.client.model.WalletTransactionCreateInput;
import org.openapitools.client.model.WalletTransactionObject;
import org.openapitools.client.model.WalletTransactionPaymentUrl;
import org.openapitools.client.model.WalletTransactions;
import org.openapitools.client.model.WalletTransactionsPaginated;
import org.openapitools.client.model.WalletUpdateInput;
import org.openapitools.client.model.WalletsPaginated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface WalletsApi extends ApiClient.Api {


  /**
   * Create a wallet
   * This endpoint is used to create a wallet with prepaid credits.
   * @param walletCreateInput Wallet payload (required)
   * @return Wallet
   */
  @RequestLine("POST /wallets")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Wallet createWallet(@javax.annotation.Nonnull WalletCreateInput walletCreateInput);

  /**
   * Create a wallet
   * Similar to <code>createWallet</code> but it also returns the http response headers .
   * This endpoint is used to create a wallet with prepaid credits.
   * @param walletCreateInput Wallet payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /wallets")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Wallet> createWalletWithHttpInfo(@javax.annotation.Nonnull WalletCreateInput walletCreateInput);



  /**
   * Top up a wallet
   * This endpoint is used to top-up an active wallet.
   * @param walletTransactionCreateInput Wallet transaction payload (required)
   * @return WalletTransactions
   */
  @RequestLine("POST /wallet_transactions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WalletTransactions createWalletTransaction(@javax.annotation.Nonnull WalletTransactionCreateInput walletTransactionCreateInput);

  /**
   * Top up a wallet
   * Similar to <code>createWalletTransaction</code> but it also returns the http response headers .
   * This endpoint is used to top-up an active wallet.
   * @param walletTransactionCreateInput Wallet transaction payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /wallet_transactions")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WalletTransactions> createWalletTransactionWithHttpInfo(@javax.annotation.Nonnull WalletTransactionCreateInput walletTransactionCreateInput);



  /**
   * Terminate a wallet
   * This endpoint is used to terminate an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return Wallet
   */
  @RequestLine("DELETE /wallets/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  Wallet destroyWallet(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Terminate a wallet
   * Similar to <code>destroyWallet</code> but it also returns the http response headers .
   * This endpoint is used to terminate an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /wallets/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Wallet> destroyWalletWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * List all wallet transactions
   * This endpoint is used to list all wallet transactions.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;. (optional)
   * @param transactionStatus The transaction status of the wallet transaction. Possible values are &#x60;purchased&#x60; (with pending or settled status), &#x60;granted&#x60; (without invoice_id), &#x60;voided&#x60; or &#x60;invoiced&#x60;. (optional)
   * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance). (optional)
   * @return WalletTransactionsPaginated
   */
  @RequestLine("GET /wallets/{lagoId}/wallet_transactions?page={page}&per_page={perPage}&status={status}&transaction_status={transactionStatus}&transaction_type={transactionType}")
  @Headers({
    "Accept: application/json",
  })
  WalletTransactionsPaginated findAllWalletTransactions(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("status") @javax.annotation.Nullable String status, @Param("transactionStatus") @javax.annotation.Nullable String transactionStatus, @Param("transactionType") @javax.annotation.Nullable String transactionType);

  /**
   * List all wallet transactions
   * Similar to <code>findAllWalletTransactions</code> but it also returns the http response headers .
   * This endpoint is used to list all wallet transactions.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;. (optional)
   * @param transactionStatus The transaction status of the wallet transaction. Possible values are &#x60;purchased&#x60; (with pending or settled status), &#x60;granted&#x60; (without invoice_id), &#x60;voided&#x60; or &#x60;invoiced&#x60;. (optional)
   * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance). (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /wallets/{lagoId}/wallet_transactions?page={page}&per_page={perPage}&status={status}&transaction_status={transactionStatus}&transaction_type={transactionType}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WalletTransactionsPaginated> findAllWalletTransactionsWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage, @Param("status") @javax.annotation.Nullable String status, @Param("transactionStatus") @javax.annotation.Nullable String transactionStatus, @Param("transactionType") @javax.annotation.Nullable String transactionType);


  /**
   * List all wallet transactions
   * This endpoint is used to list all wallet transactions.
   * Note, this is equivalent to the other <code>findAllWalletTransactions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllWalletTransactionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>status - The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;. (optional)</li>
   *   <li>transactionStatus - The transaction status of the wallet transaction. Possible values are &#x60;purchased&#x60; (with pending or settled status), &#x60;granted&#x60; (without invoice_id), &#x60;voided&#x60; or &#x60;invoiced&#x60;. (optional)</li>
   *   <li>transactionType - The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance). (optional)</li>
   *   </ul>
   * @return WalletTransactionsPaginated
   */
  @RequestLine("GET /wallets/{lagoId}/wallet_transactions?page={page}&per_page={perPage}&status={status}&transaction_status={transactionStatus}&transaction_type={transactionType}")
  @Headers({
  "Accept: application/json",
  })
  WalletTransactionsPaginated findAllWalletTransactions(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @QueryMap(encoded=true) FindAllWalletTransactionsQueryParams queryParams);

  /**
  * List all wallet transactions
  * This endpoint is used to list all wallet transactions.
  * Note, this is equivalent to the other <code>findAllWalletTransactions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>status - The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;. (optional)</li>
          *   <li>transactionStatus - The transaction status of the wallet transaction. Possible values are &#x60;purchased&#x60; (with pending or settled status), &#x60;granted&#x60; (without invoice_id), &#x60;voided&#x60; or &#x60;invoiced&#x60;. (optional)</li>
          *   <li>transactionType - The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance). (optional)</li>
      *   </ul>
          * @return WalletTransactionsPaginated
      */
      @RequestLine("GET /wallets/{lagoId}/wallet_transactions?page={page}&per_page={perPage}&status={status}&transaction_status={transactionStatus}&transaction_type={transactionType}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<WalletTransactionsPaginated> findAllWalletTransactionsWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @QueryMap(encoded=true) FindAllWalletTransactionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllWalletTransactions</code> method in a fluent style.
   */
  public static class FindAllWalletTransactionsQueryParams extends HashMap<String, Object> {
    public FindAllWalletTransactionsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletTransactionsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletTransactionsQueryParams status(@javax.annotation.Nullable final String value) {
      put("status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletTransactionsQueryParams transactionStatus(@javax.annotation.Nullable final String value) {
      put("transaction_status", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletTransactionsQueryParams transactionType(@javax.annotation.Nullable final String value) {
      put("transaction_type", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List all wallets
   * This endpoint is used to list all wallets with prepaid credits.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return WalletsPaginated
   */
  @RequestLine("GET /wallets?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  WalletsPaginated findAllWallets(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);

  /**
   * List all wallets
   * Similar to <code>findAllWallets</code> but it also returns the http response headers .
   * This endpoint is used to list all wallets with prepaid credits.
   * @param externalCustomerId The customer external unique identifier (provided by your own application). (required)
   * @param page Page number. (optional)
   * @param perPage Number of records per page. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /wallets?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WalletsPaginated> findAllWalletsWithHttpInfo(@Param("externalCustomerId") @javax.annotation.Nonnull String externalCustomerId, @Param("page") @javax.annotation.Nullable Integer page, @Param("perPage") @javax.annotation.Nullable Integer perPage);


  /**
   * List all wallets
   * This endpoint is used to list all wallets with prepaid credits.
   * Note, this is equivalent to the other <code>findAllWallets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllWalletsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>page - Page number. (optional)</li>
   *   <li>perPage - Number of records per page. (optional)</li>
   *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). (required)</li>
   *   </ul>
   * @return WalletsPaginated
   */
  @RequestLine("GET /wallets?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
  @Headers({
  "Accept: application/json",
  })
  WalletsPaginated findAllWallets(@QueryMap(encoded=true) FindAllWalletsQueryParams queryParams);

  /**
  * List all wallets
  * This endpoint is used to list all wallets with prepaid credits.
  * Note, this is equivalent to the other <code>findAllWallets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>page - Page number. (optional)</li>
          *   <li>perPage - Number of records per page. (optional)</li>
          *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). (required)</li>
      *   </ul>
          * @return WalletsPaginated
      */
      @RequestLine("GET /wallets?page={page}&per_page={perPage}&external_customer_id={externalCustomerId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<WalletsPaginated> findAllWalletsWithHttpInfo(@QueryMap(encoded=true) FindAllWalletsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllWallets</code> method in a fluent style.
   */
  public static class FindAllWalletsQueryParams extends HashMap<String, Object> {
    public FindAllWalletsQueryParams page(@javax.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletsQueryParams perPage(@javax.annotation.Nullable final Integer value) {
      put("per_page", EncodingUtils.encode(value));
      return this;
    }
    public FindAllWalletsQueryParams externalCustomerId(@javax.annotation.Nonnull final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Retrieve a wallet
   * This endpoint is used to retrieve an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return Wallet
   */
  @RequestLine("GET /wallets/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  Wallet findWallet(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve a wallet
   * Similar to <code>findWallet</code> but it also returns the http response headers .
   * This endpoint is used to retrieve an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /wallets/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Wallet> findWalletWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Retrieve a wallet transaction
   * This endpoint is used to retrieve a specific wallet transactions.
   * @param lagoId Unique identifier assigned to the wallet transaction within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return WalletTransactionObject
   */
  @RequestLine("GET /wallet_transactions/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  WalletTransactionObject findWalletTransaction(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Retrieve a wallet transaction
   * Similar to <code>findWalletTransaction</code> but it also returns the http response headers .
   * This endpoint is used to retrieve a specific wallet transactions.
   * @param lagoId Unique identifier assigned to the wallet transaction within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /wallet_transactions/{lagoId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WalletTransactionObject> findWalletTransactionWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);



  /**
   * Update a wallet
   * This endpoint is used to update an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @param walletUpdateInput Wallet update payload (required)
   * @return Wallet
   */
  @RequestLine("PUT /wallets/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Wallet updateWallet(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull WalletUpdateInput walletUpdateInput);

  /**
   * Update a wallet
   * Similar to <code>updateWallet</code> but it also returns the http response headers .
   * This endpoint is used to update an existing wallet with prepaid credits.
   * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet&#39;s record within the Lago system. (required)
   * @param walletUpdateInput Wallet update payload (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /wallets/{lagoId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Wallet> updateWalletWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId, @javax.annotation.Nonnull WalletUpdateInput walletUpdateInput);



  /**
   * Generate a payment URL
   * This endpoint generates a checkout link for a specific wallet transaction.
   * @param lagoId ID of the wallet transaction. (required)
   * @return WalletTransactionPaymentUrl
   */
  @RequestLine("POST /wallet_transactions/{lagoId}/payment_url")
  @Headers({
    "Accept: application/json",
  })
  WalletTransactionPaymentUrl walletTransactionPaymentUrl(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);

  /**
   * Generate a payment URL
   * Similar to <code>walletTransactionPaymentUrl</code> but it also returns the http response headers .
   * This endpoint generates a checkout link for a specific wallet transaction.
   * @param lagoId ID of the wallet transaction. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /wallet_transactions/{lagoId}/payment_url")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<WalletTransactionPaymentUrl> walletTransactionPaymentUrlWithHttpInfo(@Param("lagoId") @javax.annotation.Nonnull UUID lagoId);


}
