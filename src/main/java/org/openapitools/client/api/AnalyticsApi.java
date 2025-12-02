package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.GrossRevenues;
import org.openapitools.client.model.InvoiceCollections;
import org.openapitools.client.model.InvoicedUsages;
import org.openapitools.client.model.Mrrs;
import org.openapitools.client.model.OverdueBalances;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface AnalyticsApi extends ApiClient.Api {


  /**
   * List gross revenue
   * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
   * @param currency Currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return GrossRevenues
   */
  @RequestLine("GET /analytics/gross_revenue?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  GrossRevenues findAllGrossRevenues(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("months") @javax.annotation.Nullable Integer months);

  /**
   * List gross revenue
   * Similar to <code>findAllGrossRevenues</code> but it also returns the http response headers .
   * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
   * @param currency Currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /analytics/gross_revenue?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<GrossRevenues> findAllGrossRevenuesWithHttpInfo(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("months") @javax.annotation.Nullable Integer months);


  /**
   * List gross revenue
   * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
   * Note, this is equivalent to the other <code>findAllGrossRevenues</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllGrossRevenuesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>currency - Currency of revenue analytics. Format must be ISO 4217. (optional)</li>
   *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)</li>
   *   <li>months - Show data only for given number of months. (optional)</li>
   *   </ul>
   * @return GrossRevenues
   */
  @RequestLine("GET /analytics/gross_revenue?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
  "Accept: application/json",
  })
  GrossRevenues findAllGrossRevenues(@QueryMap(encoded=true) FindAllGrossRevenuesQueryParams queryParams);

  /**
  * List gross revenue
  * Gross revenue is the sum of monthly &#x60;finalized&#x60; invoice payments and fees paid in advance that are not invoiceable. This total is calculated after deducting taxes and discounts.
  * Note, this is equivalent to the other <code>findAllGrossRevenues</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>currency - Currency of revenue analytics. Format must be ISO 4217. (optional)</li>
          *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)</li>
          *   <li>months - Show data only for given number of months. (optional)</li>
      *   </ul>
          * @return GrossRevenues
      */
      @RequestLine("GET /analytics/gross_revenue?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<GrossRevenues> findAllGrossRevenuesWithHttpInfo(@QueryMap(encoded=true) FindAllGrossRevenuesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllGrossRevenues</code> method in a fluent style.
   */
  public static class FindAllGrossRevenuesQueryParams extends HashMap<String, Object> {
    public FindAllGrossRevenuesQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllGrossRevenuesQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllGrossRevenuesQueryParams months(@javax.annotation.Nullable final Integer value) {
      put("months", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List of finalized invoices
   * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
   * @param currency The currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return InvoiceCollections
   */
  @RequestLine("GET /analytics/invoice_collection?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  InvoiceCollections findAllInvoiceCollections(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);

  /**
   * List of finalized invoices
   * Similar to <code>findAllInvoiceCollections</code> but it also returns the http response headers .
   * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
   * @param currency The currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /analytics/invoice_collection?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<InvoiceCollections> findAllInvoiceCollectionsWithHttpInfo(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);


  /**
   * List of finalized invoices
   * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
   * Note, this is equivalent to the other <code>findAllInvoiceCollections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllInvoiceCollectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>currency - The currency of revenue analytics. Format must be ISO 4217. (optional)</li>
   *   <li>months - Show data only for given number of months. (optional)</li>
   *   </ul>
   * @return InvoiceCollections
   */
  @RequestLine("GET /analytics/invoice_collection?currency={currency}&months={months}")
  @Headers({
  "Accept: application/json",
  })
  InvoiceCollections findAllInvoiceCollections(@QueryMap(encoded=true) FindAllInvoiceCollectionsQueryParams queryParams);

  /**
  * List of finalized invoices
  * Represents a monthly aggregation, detailing both the total count and the cumulative amount of invoices that have been marked as &#x60;finalized&#x60;. This report sorts invoices categorically based on their &#x60;payment_status&#x60;.
  * Note, this is equivalent to the other <code>findAllInvoiceCollections</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>currency - The currency of revenue analytics. Format must be ISO 4217. (optional)</li>
          *   <li>months - Show data only for given number of months. (optional)</li>
      *   </ul>
          * @return InvoiceCollections
      */
      @RequestLine("GET /analytics/invoice_collection?currency={currency}&months={months}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<InvoiceCollections> findAllInvoiceCollectionsWithHttpInfo(@QueryMap(encoded=true) FindAllInvoiceCollectionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllInvoiceCollections</code> method in a fluent style.
   */
  public static class FindAllInvoiceCollectionsQueryParams extends HashMap<String, Object> {
    public FindAllInvoiceCollectionsQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoiceCollectionsQueryParams months(@javax.annotation.Nullable final Integer value) {
      put("months", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List usage revenue
   * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
   * @param currency The currency of invoiced usage analytics. Format must be ISO 4217. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return InvoicedUsages
   */
  @RequestLine("GET /analytics/invoiced_usage?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  InvoicedUsages findAllInvoicedUsages(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);

  /**
   * List usage revenue
   * Similar to <code>findAllInvoicedUsages</code> but it also returns the http response headers .
   * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
   * @param currency The currency of invoiced usage analytics. Format must be ISO 4217. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /analytics/invoiced_usage?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<InvoicedUsages> findAllInvoicedUsagesWithHttpInfo(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);


  /**
   * List usage revenue
   * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
   * Note, this is equivalent to the other <code>findAllInvoicedUsages</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllInvoicedUsagesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>currency - The currency of invoiced usage analytics. Format must be ISO 4217. (optional)</li>
   *   <li>months - Show data only for given number of months. (optional)</li>
   *   </ul>
   * @return InvoicedUsages
   */
  @RequestLine("GET /analytics/invoiced_usage?currency={currency}&months={months}")
  @Headers({
  "Accept: application/json",
  })
  InvoicedUsages findAllInvoicedUsages(@QueryMap(encoded=true) FindAllInvoicedUsagesQueryParams queryParams);

  /**
  * List usage revenue
  * Reports a monthly analysis focused on the revenue generated from all usage-based fees. It exclusively accounts for revenue that has been formally invoiced. Importantly, this report does not include revenue related to the usage in the current billing period, limiting its scope to previously invoiced amounts.
  * Note, this is equivalent to the other <code>findAllInvoicedUsages</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>currency - The currency of invoiced usage analytics. Format must be ISO 4217. (optional)</li>
          *   <li>months - Show data only for given number of months. (optional)</li>
      *   </ul>
          * @return InvoicedUsages
      */
      @RequestLine("GET /analytics/invoiced_usage?currency={currency}&months={months}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<InvoicedUsages> findAllInvoicedUsagesWithHttpInfo(@QueryMap(encoded=true) FindAllInvoicedUsagesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllInvoicedUsages</code> method in a fluent style.
   */
  public static class FindAllInvoicedUsagesQueryParams extends HashMap<String, Object> {
    public FindAllInvoicedUsagesQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllInvoicedUsagesQueryParams months(@javax.annotation.Nullable final Integer value) {
      put("months", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List MRR
   * This endpoint is used to list MRR.
   * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next remaining months depending on calendar or anniversary billing) as well as to fees paid in arrears (allocated to the preceding months depending on calendar or anniversary billing). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next  remaining months depending on calendar or anniversary billing) and for fees paid in arrears (spread over the previous months depending on calendar or anniversary billing). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return Mrrs
   */
  @RequestLine("GET /analytics/mrr?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  Mrrs findAllMrrs(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);

  /**
   * List MRR
   * Similar to <code>findAllMrrs</code> but it also returns the http response headers .
   * This endpoint is used to list MRR.
   * @param currency Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next remaining months depending on calendar or anniversary billing) as well as to fees paid in arrears (allocated to the preceding months depending on calendar or anniversary billing). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next  remaining months depending on calendar or anniversary billing) and for fees paid in arrears (spread over the previous months depending on calendar or anniversary billing). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /analytics/mrr?currency={currency}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Mrrs> findAllMrrsWithHttpInfo(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("months") @javax.annotation.Nullable Integer months);


  /**
   * List MRR
   * This endpoint is used to list MRR.
   * Note, this is equivalent to the other <code>findAllMrrs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllMrrsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>currency - Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next remaining months depending on calendar or anniversary billing) as well as to fees paid in arrears (allocated to the preceding months depending on calendar or anniversary billing). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next  remaining months depending on calendar or anniversary billing) and for fees paid in arrears (spread over the previous months depending on calendar or anniversary billing). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month. (optional)</li>
   *   <li>months - Show data only for given number of months. (optional)</li>
   *   </ul>
   * @return Mrrs
   */
  @RequestLine("GET /analytics/mrr?currency={currency}&months={months}")
  @Headers({
  "Accept: application/json",
  })
  Mrrs findAllMrrs(@QueryMap(encoded=true) FindAllMrrsQueryParams queryParams);

  /**
  * List MRR
  * This endpoint is used to list MRR.
  * Note, this is equivalent to the other <code>findAllMrrs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>currency - Quantifies the revenue generated from &#x60;subscription&#x60; fees on a monthly basis. This figure is calculated post-application of applicable taxes and deduction of any applicable discounts. The method of calculation varies based on the subscription billing cycle:  - Revenue from &#x60;monthly&#x60; subscription invoices is included in the MRR for the month in which the invoice is issued. - Revenue from &#x60;quarterly&#x60; subscription invoices is distributed evenly over three months. This distribution applies to fees paid in advance (allocated to the next remaining months depending on calendar or anniversary billing) as well as to fees paid in arrears (allocated to the preceding months depending on calendar or anniversary billing). - Revenue from &#x60;yearly&#x60; subscription invoices is distributed evenly over twelve months. This allocation is applicable for fees paid in advance (spread over the next  remaining months depending on calendar or anniversary billing) and for fees paid in arrears (spread over the previous months depending on calendar or anniversary billing). - Revenue from &#x60;weekly&#x60; subscription invoices, the total revenue from all invoices issued within a month is summed up. This total is then divided by the number of invoices issued during that month, and the result is multiplied by 4.33, representing the average number of weeks in a month. (optional)</li>
          *   <li>months - Show data only for given number of months. (optional)</li>
      *   </ul>
          * @return Mrrs
      */
      @RequestLine("GET /analytics/mrr?currency={currency}&months={months}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Mrrs> findAllMrrsWithHttpInfo(@QueryMap(encoded=true) FindAllMrrsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllMrrs</code> method in a fluent style.
   */
  public static class FindAllMrrsQueryParams extends HashMap<String, Object> {
    public FindAllMrrsQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllMrrsQueryParams months(@javax.annotation.Nullable final Integer value) {
      put("months", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List overdue balance
   * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
   * @param currency Currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return OverdueBalances
   */
  @RequestLine("GET /analytics/overdue_balance?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  OverdueBalances findAllOverdueBalances(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("months") @javax.annotation.Nullable Integer months);

  /**
   * List overdue balance
   * Similar to <code>findAllOverdueBalances</code> but it also returns the http response headers .
   * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
   * @param currency Currency of revenue analytics. Format must be ISO 4217. (optional)
   * @param externalCustomerId The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)
   * @param months Show data only for given number of months. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /analytics/overdue_balance?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OverdueBalances> findAllOverdueBalancesWithHttpInfo(@Param("currency") @javax.annotation.Nullable Currency currency, @Param("externalCustomerId") @javax.annotation.Nullable String externalCustomerId, @Param("months") @javax.annotation.Nullable Integer months);


  /**
   * List overdue balance
   * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
   * Note, this is equivalent to the other <code>findAllOverdueBalances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindAllOverdueBalancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>currency - Currency of revenue analytics. Format must be ISO 4217. (optional)</li>
   *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)</li>
   *   <li>months - Show data only for given number of months. (optional)</li>
   *   </ul>
   * @return OverdueBalances
   */
  @RequestLine("GET /analytics/overdue_balance?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
  @Headers({
  "Accept: application/json",
  })
  OverdueBalances findAllOverdueBalances(@QueryMap(encoded=true) FindAllOverdueBalancesQueryParams queryParams);

  /**
  * List overdue balance
  * Overdue balance is the total amount associated with overdue invoices (invoices with pending or failed payments which are past their due dates).
  * Note, this is equivalent to the other <code>findAllOverdueBalances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>currency - Currency of revenue analytics. Format must be ISO 4217. (optional)</li>
          *   <li>externalCustomerId - The customer external unique identifier (provided by your own application). Use it to filter revenue analytics at the customer level. (optional)</li>
          *   <li>months - Show data only for given number of months. (optional)</li>
      *   </ul>
          * @return OverdueBalances
      */
      @RequestLine("GET /analytics/overdue_balance?currency={currency}&external_customer_id={externalCustomerId}&months={months}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<OverdueBalances> findAllOverdueBalancesWithHttpInfo(@QueryMap(encoded=true) FindAllOverdueBalancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>findAllOverdueBalances</code> method in a fluent style.
   */
  public static class FindAllOverdueBalancesQueryParams extends HashMap<String, Object> {
    public FindAllOverdueBalancesQueryParams currency(@javax.annotation.Nullable final Currency value) {
      put("currency", EncodingUtils.encode(value));
      return this;
    }
    public FindAllOverdueBalancesQueryParams externalCustomerId(@javax.annotation.Nullable final String value) {
      put("external_customer_id", EncodingUtils.encode(value));
      return this;
    }
    public FindAllOverdueBalancesQueryParams months(@javax.annotation.Nullable final Integer value) {
      put("months", EncodingUtils.encode(value));
      return this;
    }
  }
}
