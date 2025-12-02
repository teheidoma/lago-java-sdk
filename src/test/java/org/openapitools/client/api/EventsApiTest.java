package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventBatchInput;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.EventsPaginated;
import org.openapitools.client.model.Fees;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
class EventsApiTest {

    private EventsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(EventsApi.class);
    }

    
    /**
     * Batch multiple events
     *
     * This endpoint can be used to send a batch of usage records. Each request may include up to 100 events.
     */
    @Test
    void createBatchEventsTest() {
        EventBatchInput eventBatchInput = null;
        // api.createBatchEvents(eventBatchInput);

        // TODO: test validations
    }

    
    /**
     * Send usage events
     *
     * This endpoint is used for transmitting usage measurement events to either a designated customer or a specific subscription.
     */
    @Test
    void createEventTest() {
        EventInput eventInput = null;
        // Event response = api.createEvent(eventInput);

        // TODO: test validations
    }

    
    /**
     * Estimate fees for a pay in advance charge
     *
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple pay in advance charges
     */
    @Test
    void eventEstimateFeesTest() {
        EventEstimateFeesInput eventEstimateFeesInput = null;
        // Fees response = api.eventEstimateFees(eventEstimateFeesInput);

        // TODO: test validations
    }

    
    /**
     * List all events
     *
     * This endpoint is used for retrieving all events.
     */
    @Test
    void findAllEventsTest() {
        Integer page = null;
        Integer perPage = null;
        String externalSubscriptionId = null;
        String code = null;
        OffsetDateTime timestampFrom = null;
        OffsetDateTime timestampTo = null;
        // EventsPaginated response = api.findAllEvents(page, perPage, externalSubscriptionId, code, timestampFrom, timestampTo);

        // TODO: test validations
    }

    /**
     * List all events
     *
     * This endpoint is used for retrieving all events.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllEventsTestQueryMap() {
        EventsApi.FindAllEventsQueryParams queryParams = new EventsApi.FindAllEventsQueryParams()
            .page(null)
            .perPage(null)
            .externalSubscriptionId(null)
            .code(null)
            .timestampFrom(null)
            .timestampTo(null);
        // EventsPaginated response = api.findAllEvents(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a specific event
     *
     * This endpoint is used for retrieving a specific usage measurement event that has been sent to a customer or a subscription.
     */
    @Test
    void findEventTest() {
        String transactionId = null;
        // Event response = api.findEvent(transactionId);

        // TODO: test validations
    }

    
}
