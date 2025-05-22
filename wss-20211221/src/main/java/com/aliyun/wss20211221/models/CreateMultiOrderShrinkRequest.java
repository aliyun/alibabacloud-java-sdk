// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderShrinkRequest extends TeaModel {
    @NameInMap("OrderItems")
    public java.util.List<CreateMultiOrderShrinkRequestOrderItems> orderItems;

    /**
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Properties")
    public String propertiesShrink;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static CreateMultiOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderShrinkRequest self = new CreateMultiOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderShrinkRequest setOrderItems(java.util.List<CreateMultiOrderShrinkRequestOrderItems> orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public java.util.List<CreateMultiOrderShrinkRequestOrderItems> getOrderItems() {
        return this.orderItems;
    }

    public CreateMultiOrderShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateMultiOrderShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public CreateMultiOrderShrinkRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static class CreateMultiOrderShrinkRequestOrderItemsComponents extends TeaModel {
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

        public static CreateMultiOrderShrinkRequestOrderItemsComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiOrderShrinkRequestOrderItemsComponents self = new CreateMultiOrderShrinkRequestOrderItemsComponents();
            return TeaModel.build(map, self);
        }

        public CreateMultiOrderShrinkRequestOrderItemsComponents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateMultiOrderShrinkRequestOrderItemsComponents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMultiOrderShrinkRequestOrderItems extends TeaModel {
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
        public java.util.List<CreateMultiOrderShrinkRequestOrderItemsComponents> components;

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

        public static CreateMultiOrderShrinkRequestOrderItems build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiOrderShrinkRequestOrderItems self = new CreateMultiOrderShrinkRequestOrderItems();
            return TeaModel.build(map, self);
        }

        public CreateMultiOrderShrinkRequestOrderItems setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateMultiOrderShrinkRequestOrderItems setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public CreateMultiOrderShrinkRequestOrderItems setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateMultiOrderShrinkRequestOrderItems setBuyChange(Boolean buyChange) {
            this.buyChange = buyChange;
            return this;
        }
        public Boolean getBuyChange() {
            return this.buyChange;
        }

        public CreateMultiOrderShrinkRequestOrderItems setComponents(java.util.List<CreateMultiOrderShrinkRequestOrderItemsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<CreateMultiOrderShrinkRequestOrderItemsComponents> getComponents() {
            return this.components;
        }

        public CreateMultiOrderShrinkRequestOrderItems setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateMultiOrderShrinkRequestOrderItems setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateMultiOrderShrinkRequestOrderItems setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public CreateMultiOrderShrinkRequestOrderItems setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public CreateMultiOrderShrinkRequestOrderItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
