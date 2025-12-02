package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletsApi
 */
class WalletsApiTest {

    private WalletsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(WalletsApi.class);
    }

    
    /**
     * Create a wallet
     *
     * This endpoint is used to create a wallet with prepaid credits.
     */
    @Test
    void createWalletTest() {
        WalletCreateInput walletCreateInput = null;
        // Wallet response = api.createWallet(walletCreateInput);

        // TODO: test validations
    }

    
    /**
     * Top up a wallet
     *
     * This endpoint is used to top-up an active wallet.
     */
    @Test
    void createWalletTransactionTest() {
        WalletTransactionCreateInput walletTransactionCreateInput = null;
        // WalletTransactions response = api.createWalletTransaction(walletTransactionCreateInput);

        // TODO: test validations
    }

    
    /**
     * Terminate a wallet
     *
     * This endpoint is used to terminate an existing wallet with prepaid credits.
     */
    @Test
    void destroyWalletTest() {
        UUID lagoId = null;
        // Wallet response = api.destroyWallet(lagoId);

        // TODO: test validations
    }

    
    /**
     * List all wallet transactions
     *
     * This endpoint is used to list all wallet transactions.
     */
    @Test
    void findAllWalletTransactionsTest() {
        UUID lagoId = null;
        Integer page = null;
        Integer perPage = null;
        String status = null;
        String transactionStatus = null;
        String transactionType = null;
        // WalletTransactionsPaginated response = api.findAllWalletTransactions(lagoId, page, perPage, status, transactionStatus, transactionType);

        // TODO: test validations
    }

    /**
     * List all wallet transactions
     *
     * This endpoint is used to list all wallet transactions.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllWalletTransactionsTestQueryMap() {
        UUID lagoId = null;
        WalletsApi.FindAllWalletTransactionsQueryParams queryParams = new WalletsApi.FindAllWalletTransactionsQueryParams()
            .page(null)
            .perPage(null)
            .status(null)
            .transactionStatus(null)
            .transactionType(null);
        // WalletTransactionsPaginated response = api.findAllWalletTransactions(lagoId, queryParams);

    // TODO: test validations
    }
    
    /**
     * List all wallets
     *
     * This endpoint is used to list all wallets with prepaid credits.
     */
    @Test
    void findAllWalletsTest() {
        String externalCustomerId = null;
        Integer page = null;
        Integer perPage = null;
        // WalletsPaginated response = api.findAllWallets(externalCustomerId, page, perPage);

        // TODO: test validations
    }

    /**
     * List all wallets
     *
     * This endpoint is used to list all wallets with prepaid credits.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllWalletsTestQueryMap() {
        WalletsApi.FindAllWalletsQueryParams queryParams = new WalletsApi.FindAllWalletsQueryParams()
            .page(null)
            .perPage(null)
            .externalCustomerId(null);
        // WalletsPaginated response = api.findAllWallets(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a wallet
     *
     * This endpoint is used to retrieve an existing wallet with prepaid credits.
     */
    @Test
    void findWalletTest() {
        UUID lagoId = null;
        // Wallet response = api.findWallet(lagoId);

        // TODO: test validations
    }

    
    /**
     * Retrieve a wallet transaction
     *
     * This endpoint is used to retrieve a specific wallet transactions.
     */
    @Test
    void findWalletTransactionTest() {
        UUID lagoId = null;
        // WalletTransactionObject response = api.findWalletTransaction(lagoId);

        // TODO: test validations
    }

    
    /**
     * Update a wallet
     *
     * This endpoint is used to update an existing wallet with prepaid credits.
     */
    @Test
    void updateWalletTest() {
        UUID lagoId = null;
        WalletUpdateInput walletUpdateInput = null;
        // Wallet response = api.updateWallet(lagoId, walletUpdateInput);

        // TODO: test validations
    }

    
    /**
     * Generate a payment URL
     *
     * This endpoint generates a checkout link for a specific wallet transaction.
     */
    @Test
    void walletTransactionPaymentUrlTest() {
        UUID lagoId = null;
        // WalletTransactionPaymentUrl response = api.walletTransactionPaymentUrl(lagoId);

        // TODO: test validations
    }

    
}
