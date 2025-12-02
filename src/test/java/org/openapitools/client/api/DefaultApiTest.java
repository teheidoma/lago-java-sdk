package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CreditNoteCreatedRequest;
import org.openapitools.client.model.CreditNoteGeneratedRequest;
import org.openapitools.client.model.CreditNoteProviderRefundFailureRequest;
import org.openapitools.client.model.CustomerAccountingProviderCreatedRequest;
import org.openapitools.client.model.CustomerAccountingProviderErrorRequest;
import org.openapitools.client.model.CustomerCheckoutUrlGeneratedRequest;
import org.openapitools.client.model.CustomerCreatedRequest;
import org.openapitools.client.model.CustomerCrmProviderCreatedRequest;
import org.openapitools.client.model.CustomerCrmProviderErrorRequest;
import org.openapitools.client.model.CustomerPaymentProviderCreatedRequest;
import org.openapitools.client.model.CustomerPaymentProviderErrorRequest;
import org.openapitools.client.model.CustomerTaxProviderErrorRequest;
import org.openapitools.client.model.CustomerUpdatedRequest;
import org.openapitools.client.model.CustomerViesCheckRequest;
import org.openapitools.client.model.EventErrorRequest;
import org.openapitools.client.model.EventsErrorsRequest;
import org.openapitools.client.model.FeeCreatedRequest;
import org.openapitools.client.model.FeeTaxProviderErrorRequest;
import org.openapitools.client.model.IntegrationProviderErrorRequest;
import org.openapitools.client.model.InvoiceAddOnAddedRequest;
import org.openapitools.client.model.InvoiceCreatedRequest;
import org.openapitools.client.model.InvoiceDraftedRequest;
import org.openapitools.client.model.InvoiceGeneratedRequest;
import org.openapitools.client.model.InvoiceOneOffCreatedRequest;
import org.openapitools.client.model.InvoicePaidCreditAddedRequest;
import org.openapitools.client.model.InvoicePaymentDisputeLostRequest;
import org.openapitools.client.model.InvoicePaymentFailureRequest;
import org.openapitools.client.model.InvoicePaymentOverdueRequest;
import org.openapitools.client.model.InvoicePaymentStatusUpdatedRequest;
import org.openapitools.client.model.InvoiceResyncedRequest;
import org.openapitools.client.model.InvoiceVoidedRequest;
import org.openapitools.client.model.PaymentProviderErrorRequest;
import org.openapitools.client.model.PaymentRequestCreatedRequest;
import org.openapitools.client.model.PaymentRequestPaymentFailureRequest;
import org.openapitools.client.model.PaymentRequestPaymentStatusUpdatedRequest;
import org.openapitools.client.model.PaymentRequiresActionRequest;
import org.openapitools.client.model.SubscriptionStartedRequest;
import org.openapitools.client.model.SubscriptionTerminatedRequest;
import org.openapitools.client.model.SubscriptionTerminationAlertRequest;
import org.openapitools.client.model.SubscriptionTrialEndedRequest;
import org.openapitools.client.model.SubscriptionUsageThresholdReachedRequest;
import java.util.UUID;
import org.openapitools.client.model.WalletDepletedOngoingBalanceRequest;
import org.openapitools.client.model.WalletTransactionCreatedRequest;
import org.openapitools.client.model.WalletTransactionPaymentFailureRequest;
import org.openapitools.client.model.WalletTransactionUpdatedRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
class DefaultApiTest {

    private DefaultApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DefaultApi.class);
    }

    
    /**
     * A new credit note has been created
     *
     * A new credit note has been created
     */
    @Test
    void creditNoteCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CreditNoteCreatedRequest creditNoteCreatedRequest = null;
        // api.creditNoteCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, creditNoteCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A new credit note PDF has been generated
     *
     * A new credit note PDF has been generated
     */
    @Test
    void creditNoteGeneratedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CreditNoteGeneratedRequest creditNoteGeneratedRequest = null;
        // api.creditNoteGenerated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, creditNoteGeneratedRequest);

        // TODO: test validations
    }

    
    /**
     * The refund of a credit note has failed on a payment provider
     *
     * The refund of a credit note has failed on a payment provider
     */
    @Test
    void creditNoteProviderRefundFailureTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CreditNoteProviderRefundFailureRequest creditNoteProviderRefundFailureRequest = null;
        // api.creditNoteProviderRefundFailure(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, creditNoteProviderRefundFailureRequest);

        // TODO: test validations
    }

    
    /**
     * A customer was created on an accouting integration
     *
     * A customer was created on an accouting integration
     */
    @Test
    void customerAccountingProviderCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerAccountingProviderCreatedRequest customerAccountingProviderCreatedRequest = null;
        // api.customerAccountingProviderCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerAccountingProviderCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while syncing a customer to an accounting provider
     *
     * An error was encountered while syncing a customer to an accounting provider
     */
    @Test
    void customerAccountingProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerAccountingProviderErrorRequest customerAccountingProviderErrorRequest = null;
        // api.customerAccountingProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerAccountingProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * A checkout URL was generated for a customer
     *
     * A checkout URL was generated for a customer
     */
    @Test
    void customerCheckoutUrlGeneratedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerCheckoutUrlGeneratedRequest customerCheckoutUrlGeneratedRequest = null;
        // api.customerCheckoutUrlGenerated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerCheckoutUrlGeneratedRequest);

        // TODO: test validations
    }

    
    /**
     * A new customer has been created
     *
     * A new customer has been created
     */
    @Test
    void customerCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerCreatedRequest customerCreatedRequest = null;
        // api.customerCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A customer has been created in the CRM provider
     *
     * A customer has been created in the CRM provider
     */
    @Test
    void customerCrmProviderCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerCrmProviderCreatedRequest customerCrmProviderCreatedRequest = null;
        // api.customerCrmProviderCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerCrmProviderCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while syncing a customer to a CRM provider
     *
     * An error was encountered while syncing a customer to a CRM provider
     */
    @Test
    void customerCrmProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerCrmProviderErrorRequest customerCrmProviderErrorRequest = null;
        // api.customerCrmProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerCrmProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * A customer has been created on a payment provider
     *
     * A customer has been created on a payment provider
     */
    @Test
    void customerPaymentProviderCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerPaymentProviderCreatedRequest customerPaymentProviderCreatedRequest = null;
        // api.customerPaymentProviderCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerPaymentProviderCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while syncing a customer to a payment provider
     *
     * An error was encountered while syncing a customer to a payment provider
     */
    @Test
    void customerPaymentProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerPaymentProviderErrorRequest customerPaymentProviderErrorRequest = null;
        // api.customerPaymentProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerPaymentProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while fetching taxes for a customer on a tax provider
     *
     * An error was encountered while fetching taxes for a customer on a tax provider
     */
    @Test
    void customerTaxProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerTaxProviderErrorRequest customerTaxProviderErrorRequest = null;
        // api.customerTaxProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerTaxProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * A customer has been updated
     *
     * A customer has been updated
     */
    @Test
    void customerUpdatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerUpdatedRequest customerUpdatedRequest = null;
        // api.customerUpdated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerUpdatedRequest);

        // TODO: test validations
    }

    
    /**
     * VIES VAT number has been checked for a customer
     *
     * VIES VAT number has been checked for a customer
     */
    @Test
    void customerViesCheckTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        CustomerViesCheckRequest customerViesCheckRequest = null;
        // api.customerViesCheck(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, customerViesCheckRequest);

        // TODO: test validations
    }

    
    /**
     * An error has been detected on an event
     *
     * An error has been detected on an event
     */
    @Test
    void eventErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        EventErrorRequest eventErrorRequest = null;
        // api.eventError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, eventErrorRequest);

        // TODO: test validations
    }

    
    /**
     * Errors were encountered while post-processing some events
     *
     * Errors were encountered while post-processing some events
     */
    @Test
    void eventsErrorsTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        EventsErrorsRequest eventsErrorsRequest = null;
        // api.eventsErrors(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, eventsErrorsRequest);

        // TODO: test validations
    }

    
    /**
     * A pay in advance fee has been created
     *
     * A pay in advance fee has been created
     */
    @Test
    void feeCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        FeeCreatedRequest feeCreatedRequest = null;
        // api.feeCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, feeCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while fetching taxes for a fee on a tax provider
     *
     * An error was encountered while fetching taxes for a fee on a tax provider
     */
    @Test
    void feeTaxProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        FeeTaxProviderErrorRequest feeTaxProviderErrorRequest = null;
        // api.feeTaxProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, feeTaxProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * An error was encountered while processing data on an integration
     *
     * An error was encountered while processing data on an integration
     */
    @Test
    void integrationProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        IntegrationProviderErrorRequest integrationProviderErrorRequest = null;
        // api.integrationProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, integrationProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * A new add on invoice has been emitted
     *
     * A new add on invoice has been emitted
     */
    @Test
    void invoiceAddOnAddedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceAddOnAddedRequest invoiceAddOnAddedRequest = null;
        // api.invoiceAddOnAdded(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceAddOnAddedRequest);

        // TODO: test validations
    }

    
    /**
     * A new invoice has been emitted
     *
     * A new invoice has been emitted
     */
    @Test
    void invoiceCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceCreatedRequest invoiceCreatedRequest = null;
        // api.invoiceCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A new draft invoice has been emitted
     *
     * A new draft invoice has been emitted
     */
    @Test
    void invoiceDraftedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceDraftedRequest invoiceDraftedRequest = null;
        // api.invoiceDrafted(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceDraftedRequest);

        // TODO: test validations
    }

    
    /**
     * A new invoice PDF has been generated
     *
     * A new invoice PDF has been generated
     */
    @Test
    void invoiceGeneratedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceGeneratedRequest invoiceGeneratedRequest = null;
        // api.invoiceGenerated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceGeneratedRequest);

        // TODO: test validations
    }

    
    /**
     * A new one off invoice has been emitted
     *
     * A new one off invoice has been emitted
     */
    @Test
    void invoiceOneOffCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceOneOffCreatedRequest invoiceOneOffCreatedRequest = null;
        // api.invoiceOneOffCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceOneOffCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A new prepaid credit invoice has been emitted
     *
     * A new prepaid credit invoice has been emitted
     */
    @Test
    void invoicePaidCreditAddedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoicePaidCreditAddedRequest invoicePaidCreditAddedRequest = null;
        // api.invoicePaidCreditAdded(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoicePaidCreditAddedRequest);

        // TODO: test validations
    }

    
    /**
     * A payment dispute has been lost for an invoice payment
     *
     * A payment dispute has been lost for an invoice payment
     */
    @Test
    void invoicePaymentDisputeLostTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoicePaymentDisputeLostRequest invoicePaymentDisputeLostRequest = null;
        // api.invoicePaymentDisputeLost(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoicePaymentDisputeLostRequest);

        // TODO: test validations
    }

    
    /**
     * A payment attempt for an invoice has failed on a payment provider
     *
     * A payment attempt for an invoice has failed on a payment provider
     */
    @Test
    void invoicePaymentFailureTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoicePaymentFailureRequest invoicePaymentFailureRequest = null;
        // api.invoicePaymentFailure(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoicePaymentFailureRequest);

        // TODO: test validations
    }

    
    /**
     * An invoice payment is overdue
     *
     * An invoice payment is overdue
     */
    @Test
    void invoicePaymentOverdueTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoicePaymentOverdueRequest invoicePaymentOverdueRequest = null;
        // api.invoicePaymentOverdue(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoicePaymentOverdueRequest);

        // TODO: test validations
    }

    
    /**
     * The payment status of an invoice has been updated
     *
     * The payment status of an invoice has been updated
     */
    @Test
    void invoicePaymentStatusUpdatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoicePaymentStatusUpdatedRequest invoicePaymentStatusUpdatedRequest = null;
        // api.invoicePaymentStatusUpdated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoicePaymentStatusUpdatedRequest);

        // TODO: test validations
    }

    
    /**
     * An invoice has been resynced with salesforce
     *
     * An invoice has been resynced with salesforce
     */
    @Test
    void invoiceResyncedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceResyncedRequest invoiceResyncedRequest = null;
        // api.invoiceResynced(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceResyncedRequest);

        // TODO: test validations
    }

    
    /**
     * An invoice has been voided
     *
     * An invoice has been voided
     */
    @Test
    void invoiceVoidedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        InvoiceVoidedRequest invoiceVoidedRequest = null;
        // api.invoiceVoided(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, invoiceVoidedRequest);

        // TODO: test validations
    }

    
    /**
     * An error was raised by a payment provider
     *
     * An error was raised by a payment provider
     */
    @Test
    void paymentProviderErrorTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        PaymentProviderErrorRequest paymentProviderErrorRequest = null;
        // api.paymentProviderError(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, paymentProviderErrorRequest);

        // TODO: test validations
    }

    
    /**
     * An new payment request has been created
     *
     * An new payment request has been created
     */
    @Test
    void paymentRequestCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        PaymentRequestCreatedRequest paymentRequestCreatedRequest = null;
        // api.paymentRequestCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, paymentRequestCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A payment attempt for a payment request has failed on a payment provider
     *
     * A payment attempt for a payment request has failed on a payment provider
     */
    @Test
    void paymentRequestPaymentFailureTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        PaymentRequestPaymentFailureRequest paymentRequestPaymentFailureRequest = null;
        // api.paymentRequestPaymentFailure(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, paymentRequestPaymentFailureRequest);

        // TODO: test validations
    }

    
    /**
     * The payment status of an invoice has been updated
     *
     * The payment status of an invoice has been updated
     */
    @Test
    void paymentRequestPaymentStatusUpdatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        PaymentRequestPaymentStatusUpdatedRequest paymentRequestPaymentStatusUpdatedRequest = null;
        // api.paymentRequestPaymentStatusUpdated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, paymentRequestPaymentStatusUpdatedRequest);

        // TODO: test validations
    }

    
    /**
     * An action is required to process a payment
     *
     * An action is required to process a payment
     */
    @Test
    void paymentRequiresActionTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        PaymentRequiresActionRequest paymentRequiresActionRequest = null;
        // api.paymentRequiresAction(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, paymentRequiresActionRequest);

        // TODO: test validations
    }

    
    /**
     * An subscription has started
     *
     * An subscription has started
     */
    @Test
    void subscriptionStartedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        SubscriptionStartedRequest subscriptionStartedRequest = null;
        // api.subscriptionStarted(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, subscriptionStartedRequest);

        // TODO: test validations
    }

    
    /**
     * A subscription has been terminated
     *
     * A subscription has been terminated
     */
    @Test
    void subscriptionTerminatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        SubscriptionTerminatedRequest subscriptionTerminatedRequest = null;
        // api.subscriptionTerminated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, subscriptionTerminatedRequest);

        // TODO: test validations
    }

    
    /**
     * A subscription will be terminated in the future
     *
     * A subscription will be terminated in the future
     */
    @Test
    void subscriptionTerminationAlertTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        SubscriptionTerminationAlertRequest subscriptionTerminationAlertRequest = null;
        // api.subscriptionTerminationAlert(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, subscriptionTerminationAlertRequest);

        // TODO: test validations
    }

    
    /**
     * A subscription trial period has ended
     *
     * A subscription trial period has ended
     */
    @Test
    void subscriptionTrialEndedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        SubscriptionTrialEndedRequest subscriptionTrialEndedRequest = null;
        // api.subscriptionTrialEnded(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, subscriptionTrialEndedRequest);

        // TODO: test validations
    }

    
    /**
     * A usage threshold has been reached by a subscription
     *
     * A usage threshold has been reached by a subscription
     */
    @Test
    void subscriptionUsageThresholdReachedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        SubscriptionUsageThresholdReachedRequest subscriptionUsageThresholdReachedRequest = null;
        // api.subscriptionUsageThresholdReached(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, subscriptionUsageThresholdReachedRequest);

        // TODO: test validations
    }

    
    /**
     * The balance of a wallet has been depleted
     *
     * The balance of a wallet has been depleted
     */
    @Test
    void walletDepletedOngoingBalanceTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        WalletDepletedOngoingBalanceRequest walletDepletedOngoingBalanceRequest = null;
        // api.walletDepletedOngoingBalance(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, walletDepletedOngoingBalanceRequest);

        // TODO: test validations
    }

    
    /**
     * A new wallet transaction has been created
     *
     * A new wallet transaction has been created
     */
    @Test
    void walletTransactionCreatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        WalletTransactionCreatedRequest walletTransactionCreatedRequest = null;
        // api.walletTransactionCreated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, walletTransactionCreatedRequest);

        // TODO: test validations
    }

    
    /**
     * A payment attempt for a wallet transaction has failed on a payment provider
     *
     * A payment attempt for a wallet transaction has failed on a payment provider
     */
    @Test
    void walletTransactionPaymentFailureTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        WalletTransactionPaymentFailureRequest walletTransactionPaymentFailureRequest = null;
        // api.walletTransactionPaymentFailure(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, walletTransactionPaymentFailureRequest);

        // TODO: test validations
    }

    
    /**
     * A wallet transaction has been updated
     *
     * A wallet transaction has been updated
     */
    @Test
    void walletTransactionUpdatedTest() {
        String xLagoSignature = null;
        String xLagoSignatureAlgorithm = null;
        UUID xLagoUniqueKey = null;
        WalletTransactionUpdatedRequest walletTransactionUpdatedRequest = null;
        // api.walletTransactionUpdated(xLagoSignature, xLagoSignatureAlgorithm, xLagoUniqueKey, walletTransactionUpdatedRequest);

        // TODO: test validations
    }

    
}
