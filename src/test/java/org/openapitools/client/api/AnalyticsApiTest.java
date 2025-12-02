package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.GrossRevenues;
import org.openapitools.client.model.InvoiceCollections;
import org.openapitools.client.model.InvoicedUsages;
import org.openapitools.client.model.Mrrs;
import org.openapitools.client.model.OverdueBalances;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
class AnalyticsApiTest {

    private AnalyticsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(AnalyticsApi.class);
    }

    
    /**
     * List gross revenue
     *
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     */
    @Test
    void findAllGrossRevenuesTest() {
        Currency currency = null;
        String externalCustomerId = null;
        Integer months = null;
        // GrossRevenues response = api.findAllGrossRevenues(currency, externalCustomerId, months);

        // TODO: test validations
    }

    /**
     * List gross revenue
     *
     * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllGrossRevenuesTestQueryMap() {
        AnalyticsApi.FindAllGrossRevenuesQueryParams queryParams = new AnalyticsApi.FindAllGrossRevenuesQueryParams()
            .currency(null)
            .externalCustomerId(null)
            .months(null);
        // GrossRevenues response = api.findAllGrossRevenues(queryParams);

    // TODO: test validations
    }
    
    /**
     * List of finalized invoices
     *
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     */
    @Test
    void findAllInvoiceCollectionsTest() {
        Currency currency = null;
        Integer months = null;
        // InvoiceCollections response = api.findAllInvoiceCollections(currency, months);

        // TODO: test validations
    }

    /**
     * List of finalized invoices
     *
     * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllInvoiceCollectionsTestQueryMap() {
        AnalyticsApi.FindAllInvoiceCollectionsQueryParams queryParams = new AnalyticsApi.FindAllInvoiceCollectionsQueryParams()
            .currency(null)
            .months(null);
        // InvoiceCollections response = api.findAllInvoiceCollections(queryParams);

    // TODO: test validations
    }
    
    /**
     * List usage revenue
     *
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     */
    @Test
    void findAllInvoicedUsagesTest() {
        Currency currency = null;
        Integer months = null;
        // InvoicedUsages response = api.findAllInvoicedUsages(currency, months);

        // TODO: test validations
    }

    /**
     * List usage revenue
     *
     * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllInvoicedUsagesTestQueryMap() {
        AnalyticsApi.FindAllInvoicedUsagesQueryParams queryParams = new AnalyticsApi.FindAllInvoicedUsagesQueryParams()
            .currency(null)
            .months(null);
        // InvoicedUsages response = api.findAllInvoicedUsages(queryParams);

    // TODO: test validations
    }
    
    /**
     * List MRR
     *
     * This endpoint is used to list MRR.
     */
    @Test
    void findAllMrrsTest() {
        Currency currency = null;
        Integer months = null;
        // Mrrs response = api.findAllMrrs(currency, months);

        // TODO: test validations
    }

    /**
     * List MRR
     *
     * This endpoint is used to list MRR.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllMrrsTestQueryMap() {
        AnalyticsApi.FindAllMrrsQueryParams queryParams = new AnalyticsApi.FindAllMrrsQueryParams()
            .currency(null)
            .months(null);
        // Mrrs response = api.findAllMrrs(queryParams);

    // TODO: test validations
    }
    
    /**
     * List overdue balance
     *
     * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
     */
    @Test
    void findAllOverdueBalancesTest() {
        Currency currency = null;
        String externalCustomerId = null;
        Integer months = null;
        // OverdueBalances response = api.findAllOverdueBalances(currency, externalCustomerId, months);

        // TODO: test validations
    }

    /**
     * List overdue balance
     *
     * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllOverdueBalancesTestQueryMap() {
        AnalyticsApi.FindAllOverdueBalancesQueryParams queryParams = new AnalyticsApi.FindAllOverdueBalancesQueryParams()
            .currency(null)
            .externalCustomerId(null)
            .months(null);
        // OverdueBalances response = api.findAllOverdueBalances(queryParams);

    // TODO: test validations
    }
    
}
