package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-23T15:05:45.180675+03:00[Europe/Kiev]", comments = "Generator version: 7.13.0")
public interface DefaultApi extends ApiClient.Api {


  /**
   * A new credit note has been created
   * A new credit note has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteCreatedRequest Details of the new credit note (optional)
   */
  @RequestLine("POST /credit_note_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void creditNoteCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteCreatedRequest creditNoteCreatedRequest);

  /**
   * A new credit note has been created
   * Similar to <code>creditNoteCreated</code> but it also returns the http response headers .
   * A new credit note has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteCreatedRequest Details of the new credit note (optional)
   */
  @RequestLine("POST /credit_note_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> creditNoteCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteCreatedRequest creditNoteCreatedRequest);



  /**
   * A new credit note PDF has been generated
   * A new credit note PDF has been generated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteGeneratedRequest Details of the credit note (optional)
   */
  @RequestLine("POST /credit_note_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void creditNoteGenerated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteGeneratedRequest creditNoteGeneratedRequest);

  /**
   * A new credit note PDF has been generated
   * Similar to <code>creditNoteGenerated</code> but it also returns the http response headers .
   * A new credit note PDF has been generated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteGeneratedRequest Details of the credit note (optional)
   */
  @RequestLine("POST /credit_note_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> creditNoteGeneratedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteGeneratedRequest creditNoteGeneratedRequest);



  /**
   * The refund of a credit note has failed on a payment provider
   * The refund of a credit note has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteProviderRefundFailureRequest Details of the credit note and of the provider error (optional)
   */
  @RequestLine("POST /credit_note_provider_refund_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void creditNoteProviderRefundFailure(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteProviderRefundFailureRequest creditNoteProviderRefundFailureRequest);

  /**
   * The refund of a credit note has failed on a payment provider
   * Similar to <code>creditNoteProviderRefundFailure</code> but it also returns the http response headers .
   * The refund of a credit note has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param creditNoteProviderRefundFailureRequest Details of the credit note and of the provider error (optional)
   */
  @RequestLine("POST /credit_note_provider_refund_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> creditNoteProviderRefundFailureWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CreditNoteProviderRefundFailureRequest creditNoteProviderRefundFailureRequest);



  /**
   * A customer was created on an accouting integration
   * A customer was created on an accouting integration
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerAccountingProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_accounting_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerAccountingProviderCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerAccountingProviderCreatedRequest customerAccountingProviderCreatedRequest);

  /**
   * A customer was created on an accouting integration
   * Similar to <code>customerAccountingProviderCreated</code> but it also returns the http response headers .
   * A customer was created on an accouting integration
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerAccountingProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_accounting_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerAccountingProviderCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerAccountingProviderCreatedRequest customerAccountingProviderCreatedRequest);



  /**
   * An error was encountered while syncing a customer to an accounting provider
   * An error was encountered while syncing a customer to an accounting provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerAccountingProviderErrorRequest Details of the customer and of the provider error (optional)
   */
  @RequestLine("POST /customer_accounting_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerAccountingProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerAccountingProviderErrorRequest customerAccountingProviderErrorRequest);

  /**
   * An error was encountered while syncing a customer to an accounting provider
   * Similar to <code>customerAccountingProviderError</code> but it also returns the http response headers .
   * An error was encountered while syncing a customer to an accounting provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerAccountingProviderErrorRequest Details of the customer and of the provider error (optional)
   */
  @RequestLine("POST /customer_accounting_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerAccountingProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerAccountingProviderErrorRequest customerAccountingProviderErrorRequest);



  /**
   * A checkout URL was generated for a customer
   * A checkout URL was generated for a customer
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCheckoutUrlGeneratedRequest Details of the customer with the generated checkout URL (optional)
   */
  @RequestLine("POST /customer_checkout_url_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerCheckoutUrlGenerated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCheckoutUrlGeneratedRequest customerCheckoutUrlGeneratedRequest);

  /**
   * A checkout URL was generated for a customer
   * Similar to <code>customerCheckoutUrlGenerated</code> but it also returns the http response headers .
   * A checkout URL was generated for a customer
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCheckoutUrlGeneratedRequest Details of the customer with the generated checkout URL (optional)
   */
  @RequestLine("POST /customer_checkout_url_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerCheckoutUrlGeneratedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCheckoutUrlGeneratedRequest customerCheckoutUrlGeneratedRequest);



  /**
   * A new customer has been created
   * A new customer has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCreatedRequest Details of the new customer (optional)
   */
  @RequestLine("POST /customer_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCreatedRequest customerCreatedRequest);

  /**
   * A new customer has been created
   * Similar to <code>customerCreated</code> but it also returns the http response headers .
   * A new customer has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCreatedRequest Details of the new customer (optional)
   */
  @RequestLine("POST /customer_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCreatedRequest customerCreatedRequest);



  /**
   * A customer has been created in the CRM provider
   * A customer has been created in the CRM provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCrmProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_crm_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerCrmProviderCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCrmProviderCreatedRequest customerCrmProviderCreatedRequest);

  /**
   * A customer has been created in the CRM provider
   * Similar to <code>customerCrmProviderCreated</code> but it also returns the http response headers .
   * A customer has been created in the CRM provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCrmProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_crm_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerCrmProviderCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCrmProviderCreatedRequest customerCrmProviderCreatedRequest);



  /**
   * An error was encountered while syncing a customer to a CRM provider
   * An error was encountered while syncing a customer to a CRM provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCrmProviderErrorRequest Details of the customer and of the CRM provider error (optional)
   */
  @RequestLine("POST /customer_crm_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerCrmProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCrmProviderErrorRequest customerCrmProviderErrorRequest);

  /**
   * An error was encountered while syncing a customer to a CRM provider
   * Similar to <code>customerCrmProviderError</code> but it also returns the http response headers .
   * An error was encountered while syncing a customer to a CRM provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerCrmProviderErrorRequest Details of the customer and of the CRM provider error (optional)
   */
  @RequestLine("POST /customer_crm_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerCrmProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerCrmProviderErrorRequest customerCrmProviderErrorRequest);



  /**
   * A customer has been created on a payment provider
   * A customer has been created on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerPaymentProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_payment_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerPaymentProviderCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerPaymentProviderCreatedRequest customerPaymentProviderCreatedRequest);

  /**
   * A customer has been created on a payment provider
   * Similar to <code>customerPaymentProviderCreated</code> but it also returns the http response headers .
   * A customer has been created on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerPaymentProviderCreatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_payment_provider_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerPaymentProviderCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerPaymentProviderCreatedRequest customerPaymentProviderCreatedRequest);



  /**
   * An error was encountered while syncing a customer to a payment provider
   * An error was encountered while syncing a customer to a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerPaymentProviderErrorRequest Details of the customer and of the payment provider error (optional)
   */
  @RequestLine("POST /customer_payment_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerPaymentProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerPaymentProviderErrorRequest customerPaymentProviderErrorRequest);

  /**
   * An error was encountered while syncing a customer to a payment provider
   * Similar to <code>customerPaymentProviderError</code> but it also returns the http response headers .
   * An error was encountered while syncing a customer to a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerPaymentProviderErrorRequest Details of the customer and of the payment provider error (optional)
   */
  @RequestLine("POST /customer_payment_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerPaymentProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerPaymentProviderErrorRequest customerPaymentProviderErrorRequest);



  /**
   * An error was encountered while fetching taxes for a customer on a tax provider
   * An error was encountered while fetching taxes for a customer on a tax provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerTaxProviderErrorRequest Details of the customer and of the tax provider error (optional)
   */
  @RequestLine("POST /customer_tax_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerTaxProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerTaxProviderErrorRequest customerTaxProviderErrorRequest);

  /**
   * An error was encountered while fetching taxes for a customer on a tax provider
   * Similar to <code>customerTaxProviderError</code> but it also returns the http response headers .
   * An error was encountered while fetching taxes for a customer on a tax provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerTaxProviderErrorRequest Details of the customer and of the tax provider error (optional)
   */
  @RequestLine("POST /customer_tax_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerTaxProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerTaxProviderErrorRequest customerTaxProviderErrorRequest);



  /**
   * A customer has been updated
   * A customer has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerUpdatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerUpdated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerUpdatedRequest customerUpdatedRequest);

  /**
   * A customer has been updated
   * Similar to <code>customerUpdated</code> but it also returns the http response headers .
   * A customer has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerUpdatedRequest Details of the customer (optional)
   */
  @RequestLine("POST /customer_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerUpdatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerUpdatedRequest customerUpdatedRequest);



  /**
   * VIES VAT number has been checked for a customer
   * VIES VAT number has been checked for a customer
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerViesCheckRequest Details of the customer with the VIES VAT check status (optional)
   */
  @RequestLine("POST /customer_vies_check")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void customerViesCheck(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerViesCheckRequest customerViesCheckRequest);

  /**
   * VIES VAT number has been checked for a customer
   * Similar to <code>customerViesCheck</code> but it also returns the http response headers .
   * VIES VAT number has been checked for a customer
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param customerViesCheckRequest Details of the customer with the VIES VAT check status (optional)
   */
  @RequestLine("POST /customer_vies_check")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> customerViesCheckWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable CustomerViesCheckRequest customerViesCheckRequest);



  /**
   * An error has been detected on an event
   * An error has been detected on an event
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param eventErrorRequest Details of the event and of the error (optional)
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /event_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void eventError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable EventErrorRequest eventErrorRequest);

  /**
   * An error has been detected on an event
   * Similar to <code>eventError</code> but it also returns the http response headers .
   * An error has been detected on an event
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param eventErrorRequest Details of the event and of the error (optional)
   * @deprecated
   */
  @Deprecated
  @RequestLine("POST /event_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> eventErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable EventErrorRequest eventErrorRequest);



  /**
   * Errors were encountered while post-processing some events
   * Errors were encountered while post-processing some events
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param eventsErrorsRequest Details of the events errors (optional)
   */
  @RequestLine("POST /events_errors")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void eventsErrors(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable EventsErrorsRequest eventsErrorsRequest);

  /**
   * Errors were encountered while post-processing some events
   * Similar to <code>eventsErrors</code> but it also returns the http response headers .
   * Errors were encountered while post-processing some events
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param eventsErrorsRequest Details of the events errors (optional)
   */
  @RequestLine("POST /events_errors")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> eventsErrorsWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable EventsErrorsRequest eventsErrorsRequest);



  /**
   * A pay in advance fee has been created
   * A pay in advance fee has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param feeCreatedRequest Details of the new fee (optional)
   */
  @RequestLine("POST /fee_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void feeCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable FeeCreatedRequest feeCreatedRequest);

  /**
   * A pay in advance fee has been created
   * Similar to <code>feeCreated</code> but it also returns the http response headers .
   * A pay in advance fee has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param feeCreatedRequest Details of the new fee (optional)
   */
  @RequestLine("POST /fee_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> feeCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable FeeCreatedRequest feeCreatedRequest);



  /**
   * An error was encountered while fetching taxes for a fee on a tax provider
   * An error was encountered while fetching taxes for a fee on a tax provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param feeTaxProviderErrorRequest Details of the fee and of the tax provider error (optional)
   */
  @RequestLine("POST /fee_tax_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void feeTaxProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable FeeTaxProviderErrorRequest feeTaxProviderErrorRequest);

  /**
   * An error was encountered while fetching taxes for a fee on a tax provider
   * Similar to <code>feeTaxProviderError</code> but it also returns the http response headers .
   * An error was encountered while fetching taxes for a fee on a tax provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param feeTaxProviderErrorRequest Details of the fee and of the tax provider error (optional)
   */
  @RequestLine("POST /fee_tax_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> feeTaxProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable FeeTaxProviderErrorRequest feeTaxProviderErrorRequest);



  /**
   * An error was encountered while processing data on an integration
   * An error was encountered while processing data on an integration
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param integrationProviderErrorRequest Details of the integration and of the integration error (optional)
   */
  @RequestLine("POST /integration_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void integrationProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable IntegrationProviderErrorRequest integrationProviderErrorRequest);

  /**
   * An error was encountered while processing data on an integration
   * Similar to <code>integrationProviderError</code> but it also returns the http response headers .
   * An error was encountered while processing data on an integration
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param integrationProviderErrorRequest Details of the integration and of the integration error (optional)
   */
  @RequestLine("POST /integration_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> integrationProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable IntegrationProviderErrorRequest integrationProviderErrorRequest);



  /**
   * A new add on invoice has been emitted
   * A new add on invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceAddOnAddedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_add_on_added")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceAddOnAdded(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceAddOnAddedRequest invoiceAddOnAddedRequest);

  /**
   * A new add on invoice has been emitted
   * Similar to <code>invoiceAddOnAdded</code> but it also returns the http response headers .
   * A new add on invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceAddOnAddedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_add_on_added")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceAddOnAddedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceAddOnAddedRequest invoiceAddOnAddedRequest);



  /**
   * A new invoice has been emitted
   * A new invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceCreatedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceCreatedRequest invoiceCreatedRequest);

  /**
   * A new invoice has been emitted
   * Similar to <code>invoiceCreated</code> but it also returns the http response headers .
   * A new invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceCreatedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceCreatedRequest invoiceCreatedRequest);



  /**
   * A new draft invoice has been emitted
   * A new draft invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceDraftedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_drafted")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceDrafted(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceDraftedRequest invoiceDraftedRequest);

  /**
   * A new draft invoice has been emitted
   * Similar to <code>invoiceDrafted</code> but it also returns the http response headers .
   * A new draft invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceDraftedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_drafted")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceDraftedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceDraftedRequest invoiceDraftedRequest);



  /**
   * A new invoice PDF has been generated
   * A new invoice PDF has been generated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceGeneratedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceGenerated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceGeneratedRequest invoiceGeneratedRequest);

  /**
   * A new invoice PDF has been generated
   * Similar to <code>invoiceGenerated</code> but it also returns the http response headers .
   * A new invoice PDF has been generated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceGeneratedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_generated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceGeneratedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceGeneratedRequest invoiceGeneratedRequest);



  /**
   * A new one off invoice has been emitted
   * A new one off invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceOneOffCreatedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_one_off_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceOneOffCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceOneOffCreatedRequest invoiceOneOffCreatedRequest);

  /**
   * A new one off invoice has been emitted
   * Similar to <code>invoiceOneOffCreated</code> but it also returns the http response headers .
   * A new one off invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceOneOffCreatedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_one_off_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceOneOffCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceOneOffCreatedRequest invoiceOneOffCreatedRequest);



  /**
   * A new prepaid credit invoice has been emitted
   * A new prepaid credit invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaidCreditAddedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_paid_credit_added")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoicePaidCreditAdded(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaidCreditAddedRequest invoicePaidCreditAddedRequest);

  /**
   * A new prepaid credit invoice has been emitted
   * Similar to <code>invoicePaidCreditAdded</code> but it also returns the http response headers .
   * A new prepaid credit invoice has been emitted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaidCreditAddedRequest Details of the new invoice (optional)
   */
  @RequestLine("POST /invoice_paid_credit_added")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoicePaidCreditAddedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaidCreditAddedRequest invoicePaidCreditAddedRequest);



  /**
   * A payment dispute has been lost for an invoice payment
   * A payment dispute has been lost for an invoice payment
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentDisputeLostRequest Details of the invoice and of the payment dispute (optional)
   */
  @RequestLine("POST /invoice_payment_dispute_lost")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoicePaymentDisputeLost(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentDisputeLostRequest invoicePaymentDisputeLostRequest);

  /**
   * A payment dispute has been lost for an invoice payment
   * Similar to <code>invoicePaymentDisputeLost</code> but it also returns the http response headers .
   * A payment dispute has been lost for an invoice payment
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentDisputeLostRequest Details of the invoice and of the payment dispute (optional)
   */
  @RequestLine("POST /invoice_payment_dispute_lost")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoicePaymentDisputeLostWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentDisputeLostRequest invoicePaymentDisputeLostRequest);



  /**
   * A payment attempt for an invoice has failed on a payment provider
   * A payment attempt for an invoice has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentFailureRequest Details of the invoice and of the payment provider error (optional)
   */
  @RequestLine("POST /invoice_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoicePaymentFailure(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentFailureRequest invoicePaymentFailureRequest);

  /**
   * A payment attempt for an invoice has failed on a payment provider
   * Similar to <code>invoicePaymentFailure</code> but it also returns the http response headers .
   * A payment attempt for an invoice has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentFailureRequest Details of the invoice and of the payment provider error (optional)
   */
  @RequestLine("POST /invoice_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoicePaymentFailureWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentFailureRequest invoicePaymentFailureRequest);



  /**
   * An invoice payment is overdue
   * An invoice payment is overdue
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentOverdueRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_payment_overdue")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoicePaymentOverdue(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentOverdueRequest invoicePaymentOverdueRequest);

  /**
   * An invoice payment is overdue
   * Similar to <code>invoicePaymentOverdue</code> but it also returns the http response headers .
   * An invoice payment is overdue
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentOverdueRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_payment_overdue")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoicePaymentOverdueWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentOverdueRequest invoicePaymentOverdueRequest);



  /**
   * The payment status of an invoice has been updated
   * The payment status of an invoice has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentStatusUpdatedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_payment_status_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoicePaymentStatusUpdated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentStatusUpdatedRequest invoicePaymentStatusUpdatedRequest);

  /**
   * The payment status of an invoice has been updated
   * Similar to <code>invoicePaymentStatusUpdated</code> but it also returns the http response headers .
   * The payment status of an invoice has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoicePaymentStatusUpdatedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_payment_status_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoicePaymentStatusUpdatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoicePaymentStatusUpdatedRequest invoicePaymentStatusUpdatedRequest);



  /**
   * An invoice has been resynced with salesforce
   * An invoice has been resynced with salesforce
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceResyncedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_resynced")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceResynced(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceResyncedRequest invoiceResyncedRequest);

  /**
   * An invoice has been resynced with salesforce
   * Similar to <code>invoiceResynced</code> but it also returns the http response headers .
   * An invoice has been resynced with salesforce
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceResyncedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_resynced")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceResyncedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceResyncedRequest invoiceResyncedRequest);



  /**
   * An invoice has been voided
   * An invoice has been voided
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceVoidedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_voided")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void invoiceVoided(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceVoidedRequest invoiceVoidedRequest);

  /**
   * An invoice has been voided
   * Similar to <code>invoiceVoided</code> but it also returns the http response headers .
   * An invoice has been voided
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param invoiceVoidedRequest Details of the invoice (optional)
   */
  @RequestLine("POST /invoice_voided")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> invoiceVoidedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable InvoiceVoidedRequest invoiceVoidedRequest);



  /**
   * An error was raised by a payment provider
   * An error was raised by a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentProviderErrorRequest Details of the payment provider and of the error (optional)
   */
  @RequestLine("POST /payment_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void paymentProviderError(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentProviderErrorRequest paymentProviderErrorRequest);

  /**
   * An error was raised by a payment provider
   * Similar to <code>paymentProviderError</code> but it also returns the http response headers .
   * An error was raised by a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentProviderErrorRequest Details of the payment provider and of the error (optional)
   */
  @RequestLine("POST /payment_provider_error")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> paymentProviderErrorWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentProviderErrorRequest paymentProviderErrorRequest);



  /**
   * An new payment request has been created
   * An new payment request has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestCreatedRequest Details of the new payment request (optional)
   */
  @RequestLine("POST /payment_request_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void paymentRequestCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestCreatedRequest paymentRequestCreatedRequest);

  /**
   * An new payment request has been created
   * Similar to <code>paymentRequestCreated</code> but it also returns the http response headers .
   * An new payment request has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestCreatedRequest Details of the new payment request (optional)
   */
  @RequestLine("POST /payment_request_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> paymentRequestCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestCreatedRequest paymentRequestCreatedRequest);



  /**
   * A payment attempt for a payment request has failed on a payment provider
   * A payment attempt for a payment request has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestPaymentFailureRequest Details of the payment request and of the provider error (optional)
   */
  @RequestLine("POST /payment_request_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void paymentRequestPaymentFailure(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestPaymentFailureRequest paymentRequestPaymentFailureRequest);

  /**
   * A payment attempt for a payment request has failed on a payment provider
   * Similar to <code>paymentRequestPaymentFailure</code> but it also returns the http response headers .
   * A payment attempt for a payment request has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestPaymentFailureRequest Details of the payment request and of the provider error (optional)
   */
  @RequestLine("POST /payment_request_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> paymentRequestPaymentFailureWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestPaymentFailureRequest paymentRequestPaymentFailureRequest);



  /**
   * The payment status of an invoice has been updated
   * The payment status of an invoice has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestPaymentStatusUpdatedRequest Details of the payment request (optional)
   */
  @RequestLine("POST /payment_request_payment_status_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void paymentRequestPaymentStatusUpdated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestPaymentStatusUpdatedRequest paymentRequestPaymentStatusUpdatedRequest);

  /**
   * The payment status of an invoice has been updated
   * Similar to <code>paymentRequestPaymentStatusUpdated</code> but it also returns the http response headers .
   * The payment status of an invoice has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequestPaymentStatusUpdatedRequest Details of the payment request (optional)
   */
  @RequestLine("POST /payment_request_payment_status_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> paymentRequestPaymentStatusUpdatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequestPaymentStatusUpdatedRequest paymentRequestPaymentStatusUpdatedRequest);



  /**
   * An action is required to process a payment
   * An action is required to process a payment
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequiresActionRequest Details of the payment and of the required action (optional)
   */
  @RequestLine("POST /payment_requires_action")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void paymentRequiresAction(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequiresActionRequest paymentRequiresActionRequest);

  /**
   * An action is required to process a payment
   * Similar to <code>paymentRequiresAction</code> but it also returns the http response headers .
   * An action is required to process a payment
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param paymentRequiresActionRequest Details of the payment and of the required action (optional)
   */
  @RequestLine("POST /payment_requires_action")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> paymentRequiresActionWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable PaymentRequiresActionRequest paymentRequiresActionRequest);



  /**
   * An subscription has started
   * An subscription has started
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionStartedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_started")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void subscriptionStarted(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionStartedRequest subscriptionStartedRequest);

  /**
   * An subscription has started
   * Similar to <code>subscriptionStarted</code> but it also returns the http response headers .
   * An subscription has started
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionStartedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_started")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> subscriptionStartedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionStartedRequest subscriptionStartedRequest);



  /**
   * A subscription has been terminated
   * A subscription has been terminated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTerminatedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_terminated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void subscriptionTerminated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTerminatedRequest subscriptionTerminatedRequest);

  /**
   * A subscription has been terminated
   * Similar to <code>subscriptionTerminated</code> but it also returns the http response headers .
   * A subscription has been terminated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTerminatedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_terminated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> subscriptionTerminatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTerminatedRequest subscriptionTerminatedRequest);



  /**
   * A subscription will be terminated in the future
   * A subscription will be terminated in the future
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTerminationAlertRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_termination_alert")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void subscriptionTerminationAlert(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTerminationAlertRequest subscriptionTerminationAlertRequest);

  /**
   * A subscription will be terminated in the future
   * Similar to <code>subscriptionTerminationAlert</code> but it also returns the http response headers .
   * A subscription will be terminated in the future
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTerminationAlertRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_termination_alert")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> subscriptionTerminationAlertWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTerminationAlertRequest subscriptionTerminationAlertRequest);



  /**
   * A subscription trial period has ended
   * A subscription trial period has ended
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTrialEndedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_trial_ended")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void subscriptionTrialEnded(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTrialEndedRequest subscriptionTrialEndedRequest);

  /**
   * A subscription trial period has ended
   * Similar to <code>subscriptionTrialEnded</code> but it also returns the http response headers .
   * A subscription trial period has ended
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionTrialEndedRequest Details of the subscription (optional)
   */
  @RequestLine("POST /subscription_trial_ended")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> subscriptionTrialEndedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionTrialEndedRequest subscriptionTrialEndedRequest);



  /**
   * A usage threshold has been reached by a subscription
   * A usage threshold has been reached by a subscription
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionUsageThresholdReachedRequest Details of the subscription and of the reached threshold (optional)
   */
  @RequestLine("POST /subscription_usage_threshold_reached")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void subscriptionUsageThresholdReached(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionUsageThresholdReachedRequest subscriptionUsageThresholdReachedRequest);

  /**
   * A usage threshold has been reached by a subscription
   * Similar to <code>subscriptionUsageThresholdReached</code> but it also returns the http response headers .
   * A usage threshold has been reached by a subscription
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param subscriptionUsageThresholdReachedRequest Details of the subscription and of the reached threshold (optional)
   */
  @RequestLine("POST /subscription_usage_threshold_reached")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> subscriptionUsageThresholdReachedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable SubscriptionUsageThresholdReachedRequest subscriptionUsageThresholdReachedRequest);



  /**
   * The balance of a wallet has been depleted
   * The balance of a wallet has been depleted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletDepletedOngoingBalanceRequest Details of the wallet (optional)
   */
  @RequestLine("POST /wallet_depleted_ongoing_balance")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void walletDepletedOngoingBalance(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletDepletedOngoingBalanceRequest walletDepletedOngoingBalanceRequest);

  /**
   * The balance of a wallet has been depleted
   * Similar to <code>walletDepletedOngoingBalance</code> but it also returns the http response headers .
   * The balance of a wallet has been depleted
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletDepletedOngoingBalanceRequest Details of the wallet (optional)
   */
  @RequestLine("POST /wallet_depleted_ongoing_balance")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> walletDepletedOngoingBalanceWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletDepletedOngoingBalanceRequest walletDepletedOngoingBalanceRequest);



  /**
   * A new wallet transaction has been created
   * A new wallet transaction has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionCreatedRequest Details of the wallet transaction (optional)
   */
  @RequestLine("POST /wallet_transaction_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void walletTransactionCreated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionCreatedRequest walletTransactionCreatedRequest);

  /**
   * A new wallet transaction has been created
   * Similar to <code>walletTransactionCreated</code> but it also returns the http response headers .
   * A new wallet transaction has been created
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionCreatedRequest Details of the wallet transaction (optional)
   */
  @RequestLine("POST /wallet_transaction_created")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> walletTransactionCreatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionCreatedRequest walletTransactionCreatedRequest);



  /**
   * A payment attempt for a wallet transaction has failed on a payment provider
   * A payment attempt for a wallet transaction has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionPaymentFailureRequest Details of the wallet transaction and of the provider error (optional)
   */
  @RequestLine("POST /wallet_transaction_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void walletTransactionPaymentFailure(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionPaymentFailureRequest walletTransactionPaymentFailureRequest);

  /**
   * A payment attempt for a wallet transaction has failed on a payment provider
   * Similar to <code>walletTransactionPaymentFailure</code> but it also returns the http response headers .
   * A payment attempt for a wallet transaction has failed on a payment provider
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionPaymentFailureRequest Details of the wallet transaction and of the provider error (optional)
   */
  @RequestLine("POST /wallet_transaction_payment_failure")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> walletTransactionPaymentFailureWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionPaymentFailureRequest walletTransactionPaymentFailureRequest);



  /**
   * A wallet transaction has been updated
   * A wallet transaction has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionUpdatedRequest Details of the wallet transaction (optional)
   */
  @RequestLine("POST /wallet_transaction_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  void walletTransactionUpdated(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionUpdatedRequest walletTransactionUpdatedRequest);

  /**
   * A wallet transaction has been updated
   * Similar to <code>walletTransactionUpdated</code> but it also returns the http response headers .
   * A wallet transaction has been updated
   * @param xLagoSignature Signature of the webhook payload (required)
   * @param xLagoSignatureAlgorithm Algorithm used to generate the signature (required)
   * @param xLagoUniqueKey Unique id of the webhook. It can be used for idempotency (required)
   * @param walletTransactionUpdatedRequest Details of the wallet transaction (optional)
   */
  @RequestLine("POST /wallet_transaction_updated")
  @Headers({
    "Accept: ",
    "X-Lago-Signature: {xLagoSignature}",
    
    "X-Lago-Signature-Algorithm: {xLagoSignatureAlgorithm}",
    
    "X-Lago-Unique-Key: {xLagoUniqueKey}"
  })
  ApiResponse<Void> walletTransactionUpdatedWithHttpInfo(@Param("xLagoSignature") @javax.annotation.Nonnull String xLagoSignature, @Param("xLagoSignatureAlgorithm") @javax.annotation.Nonnull String xLagoSignatureAlgorithm, @Param("xLagoUniqueKey") @javax.annotation.Nonnull UUID xLagoUniqueKey, @javax.annotation.Nullable WalletTransactionUpdatedRequest walletTransactionUpdatedRequest);


}
