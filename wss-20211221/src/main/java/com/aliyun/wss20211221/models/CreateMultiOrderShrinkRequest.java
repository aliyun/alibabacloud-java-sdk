// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderShrinkRequest extends TeaModel {
    /**
     * <p>The cookie information used for channel attribution. Specify this parameter if channel attribution information exists. Otherwise, you can leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>channel=example</p>
     */
    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The product information.</p>
     */
    @NameInMap("OrderItems")
    public java.util.List<CreateMultiOrderShrinkRequestOrderItems> orderItems;

    /**
     * <p>The order type.</p>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The extended properties.</p>
     */
    @NameInMap("Properties")
    public String propertiesShrink;

    /**
     * <p>The ID of the actual end user. This parameter is required when a reseller partner places an order.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000001</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static CreateMultiOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderShrinkRequest self = new CreateMultiOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderShrinkRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
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
         * <p>The key of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the module.</p>
         * <p>The sample values and valid values for each key of the monthly duration package for Enterprise Edition are as follows:</p>
         * <ul>
         * <li>RegionId: cn-shanghai</li>
         * <li>InstanceType: eds.enterprise_office.4c8g</li>
         * <li>DurationType (hours): [Enum] <ul>
         * <li>120</li>
         * <li>250</li>
         * </ul>
         * </li>
         * <li>OsType: [Enum] <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * </ul>
         * </li>
         * <li>RootDiskSize (GiB): 80</li>
         * <li>RootDiskCategory: [Enum] <ul>
         * <li>cloud_efficiency (ultra cloud disk)</li>
         * <li>cloud_auto (ESSD AutoPL cloud disk)</li>
         * <li>cloud_essd (enhanced standard SSD, supported only by specific instance types)</li>
         * </ul>
         * </li>
         * <li>RootPerformanceLevel: [Enum] <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * </li>
         * <li>DataDiskSize (GiB): Valid values are the same as those of RootDiskSize.</li>
         * <li>DataDiskCategory: Valid values are the same as those of RootDiskCategory.</li>
         * <li>DataPerformanceLevel: Valid values are the same as those of RootPerformanceLevel.</li>
         * </ul>
         * 
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
         * <p>The purchase quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>Specifies whether to enable automatic payment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPay")
        public Boolean autoPay;

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>Specifies whether to modify the configuration of the monthly duration package.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BuyChange")
        public Boolean buyChange;

        /**
         * <p>The product modules.</p>
         */
        @NameInMap("Components")
        public java.util.List<CreateMultiOrderShrinkRequestOrderItemsComponents> components;

        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The callback URL after the order is paid. Specify the URL to receive the payment result based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/order/paid">https://example.com/order/paid</a></p>
         */
        @NameInMap("PaidCallBackUrl")
        public String paidCallBackUrl;

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are 1, 2, 3, and 5.</p>
         * </li>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, and 6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription period for the subscription instance.</p>
         * <blockquote>
         * <p>This parameter is required only when the billing method of the instance is subscription. This parameter is case-sensitive. Make sure that the spelling is correct.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The ID of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The list of resource IDs.</p>
         * <blockquote>
         * <p>For the monthly duration package, this parameter corresponds to the cloud desktop ID. This parameter is required when OrderType is not set to <code>create</code>.</p>
         * </blockquote>
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is case-sensitive. Make sure that the spelling is correct.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The unified expiration date, which can be a day from the 1st to the 28th of a month. If this parameter is not specified, the standard renewal process is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("UnifiedExpireDay")
        public Integer unifiedExpireDay;

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

        public CreateMultiOrderShrinkRequestOrderItems setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public CreateMultiOrderShrinkRequestOrderItems setPaidCallBackUrl(String paidCallBackUrl) {
            this.paidCallBackUrl = paidCallBackUrl;
            return this;
        }
        public String getPaidCallBackUrl() {
            return this.paidCallBackUrl;
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

        public CreateMultiOrderShrinkRequestOrderItems setUnifiedExpireDay(Integer unifiedExpireDay) {
            this.unifiedExpireDay = unifiedExpireDay;
            return this;
        }
        public Integer getUnifiedExpireDay() {
            return this.unifiedExpireDay;
        }

    }

}
