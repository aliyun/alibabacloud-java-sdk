// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderRequest extends TeaModel {
    @NameInMap("OrderItems")
    public java.util.List<CreateMultiOrderRequestOrderItems> orderItems;

    /**
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Properties")
    public java.util.Map<String, String> properties;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static CreateMultiOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderRequest self = new CreateMultiOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderRequest setOrderItems(java.util.List<CreateMultiOrderRequestOrderItems> orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public java.util.List<CreateMultiOrderRequestOrderItems> getOrderItems() {
        return this.orderItems;
    }

    public CreateMultiOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateMultiOrderRequest setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public CreateMultiOrderRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static class CreateMultiOrderRequestOrderItemsComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateMultiOrderRequestOrderItemsComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiOrderRequestOrderItemsComponents self = new CreateMultiOrderRequestOrderItemsComponents();
            return TeaModel.build(map, self);
        }

        public CreateMultiOrderRequestOrderItemsComponents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateMultiOrderRequestOrderItemsComponents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMultiOrderRequestOrderItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("BuyChange")
        public Boolean buyChange;

        @NameInMap("Components")
        public java.util.List<CreateMultiOrderRequestOrderItemsComponents> components;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateMultiOrderRequestOrderItems build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiOrderRequestOrderItems self = new CreateMultiOrderRequestOrderItems();
            return TeaModel.build(map, self);
        }

        public CreateMultiOrderRequestOrderItems setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateMultiOrderRequestOrderItems setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public CreateMultiOrderRequestOrderItems setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateMultiOrderRequestOrderItems setBuyChange(Boolean buyChange) {
            this.buyChange = buyChange;
            return this;
        }
        public Boolean getBuyChange() {
            return this.buyChange;
        }

        public CreateMultiOrderRequestOrderItems setComponents(java.util.List<CreateMultiOrderRequestOrderItemsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<CreateMultiOrderRequestOrderItemsComponents> getComponents() {
            return this.components;
        }

        public CreateMultiOrderRequestOrderItems setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateMultiOrderRequestOrderItems setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateMultiOrderRequestOrderItems setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public CreateMultiOrderRequestOrderItems setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public CreateMultiOrderRequestOrderItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
