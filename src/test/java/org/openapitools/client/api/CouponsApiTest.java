package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.AppliedCoupon;
import org.openapitools.client.model.AppliedCouponInput;
import org.openapitools.client.model.AppliedCouponsPaginated;
import org.openapitools.client.model.Coupon;
import org.openapitools.client.model.CouponCreateInput;
import org.openapitools.client.model.CouponUpdateInput;
import org.openapitools.client.model.CouponsPaginated;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CouponsApi
 */
class CouponsApiTest {

    private CouponsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(CouponsApi.class);
    }

    
    /**
     * Apply a coupon to a customer
     *
     * This endpoint is used to apply a specific coupon to a customer, before or during a subscription.
     */
    @Test
    void applyCouponTest() {
        AppliedCouponInput appliedCouponInput = null;
        // AppliedCoupon response = api.applyCoupon(appliedCouponInput);

        // TODO: test validations
    }

    
    /**
     * Create a coupon
     *
     * This endpoint is used to create a coupon that can be then attached to a customer to create a discount.
     */
    @Test
    void createCouponTest() {
        CouponCreateInput couponCreateInput = null;
        // Coupon response = api.createCoupon(couponCreateInput);

        // TODO: test validations
    }

    
    /**
     * Delete an applied coupon
     *
     * This endpoint is used to delete a specific coupon that has been applied to a customer.
     */
    @Test
    void deleteAppliedCouponTest() {
        String externalCustomerId = null;
        UUID appliedCouponId = null;
        // AppliedCoupon response = api.deleteAppliedCoupon(externalCustomerId, appliedCouponId);

        // TODO: test validations
    }

    
    /**
     * Delete a coupon
     *
     * This endpoint is used to delete a coupon.
     */
    @Test
    void destroyCouponTest() {
        String code = null;
        // Coupon response = api.destroyCoupon(code);

        // TODO: test validations
    }

    
    /**
     * List all applied coupons
     *
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     */
    @Test
    void findAllAppliedCouponsTest() {
        Integer page = null;
        Integer perPage = null;
        String status = null;
        String externalCustomerId = null;
        // AppliedCouponsPaginated response = api.findAllAppliedCoupons(page, perPage, status, externalCustomerId);

        // TODO: test validations
    }

    /**
     * List all applied coupons
     *
     * This endpoint is used to list all applied coupons. You can filter by coupon status and by customer.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllAppliedCouponsTestQueryMap() {
        CouponsApi.FindAllAppliedCouponsQueryParams queryParams = new CouponsApi.FindAllAppliedCouponsQueryParams()
            .page(null)
            .perPage(null)
            .status(null)
            .externalCustomerId(null);
        // AppliedCouponsPaginated response = api.findAllAppliedCoupons(queryParams);

    // TODO: test validations
    }
    
    /**
     * List all coupons
     *
     * This endpoint is used to list all existing coupons.
     */
    @Test
    void findAllCouponsTest() {
        Integer page = null;
        Integer perPage = null;
        // CouponsPaginated response = api.findAllCoupons(page, perPage);

        // TODO: test validations
    }

    /**
     * List all coupons
     *
     * This endpoint is used to list all existing coupons.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void findAllCouponsTestQueryMap() {
        CouponsApi.FindAllCouponsQueryParams queryParams = new CouponsApi.FindAllCouponsQueryParams()
            .page(null)
            .perPage(null);
        // CouponsPaginated response = api.findAllCoupons(queryParams);

    // TODO: test validations
    }
    
    /**
     * Retrieve a coupon
     *
     * This endpoint is used to retrieve a specific coupon.
     */
    @Test
    void findCouponTest() {
        String code = null;
        // Coupon response = api.findCoupon(code);

        // TODO: test validations
    }

    
    /**
     * Update a coupon
     *
     * This endpoint is used to update a coupon that can be then attached to a customer to create a discount.
     */
    @Test
    void updateCouponTest() {
        String code = null;
        CouponUpdateInput couponUpdateInput = null;
        // Coupon response = api.updateCoupon(code, couponUpdateInput);

        // TODO: test validations
    }

    
}
