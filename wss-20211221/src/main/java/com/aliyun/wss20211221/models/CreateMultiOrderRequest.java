// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderRequest extends TeaModel {
    /**
     * <p>The channel cookie information.</p>
     */
    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The product information.</p>
     */
    @NameInMap("OrderItems")
    public java.util.List<CreateMultiOrderRequestOrderItems> orderItems;

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
    public java.util.Map<String, String> properties;

    /**
     * <p>The UID of the reseller owner.</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static CreateMultiOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderRequest self = new CreateMultiOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
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
         * <p>The key of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the module.</p>
         * <p>The following section describes the sample values and valid values for each key of the Enterprise Edition monthly duration package:</p>
         * <ul>
         * <li>RegionId: ap-southeast-1</li>
         * <li>InstanceType: eds.enterprise_office.4c8g</li>
         * <li>DurationType (hours): Valid values: <ul>
         * <li>120</li>
         * <li>250</li>
         * </ul>
         * </li>
         * <li>OsType: Valid values: <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * </ul>
         * </li>
         * <li>RootDiskSize (GiB): 80</li>
         * <li>RootDiskCategory: Valid values: <ul>
         * <li>cloud_efficiency (ultra cloud disk)</li>
         * <li>cloud_auto (ultra-fast cloud disk)</li>
         * <li>cloud_essd (enhanced standard SSD. Only specific instance types support this value.)</li>
         * </ul>
         * </li>
         * <li>RootPerformanceLevel: Valid values: <ul>
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
         * <p>The quantity to purchase.</p>
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
         * <p>Specifies whether this is a change purchase.</p>
         */
        @NameInMap("BuyChange")
        public Boolean buyChange;

        /**
         * <p>The product modules.</p>
         */
        @NameInMap("Components")
        public java.util.List<CreateMultiOrderRequestOrderItemsComponents> components;

        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The callback URL after the payment is completed.</p>
         */
        @NameInMap("PaidCallBackUrl")
        public String paidCallBackUrl;

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li><p>If PeriodUnit is set to Year: 1, 2, 3, and 5.</p>
         * </li>
         * <li><p>If PeriodUnit is set to Month: 1, 2, 3, and 6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription duration for a subscription instance.</p>
         * <blockquote>
         * <p>This parameter is required only when the billing method of the instance is subscription. This parameter is case-sensitive. Make sure that the value is spelled correctly.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>The list of resource IDs.</p>
         * <blockquote>
         * <p>For monthly duration packages, this parameter corresponds to the cloud desktop ID. This parameter is required when OrderType is not set to create.</p>
         * </blockquote>
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is case-sensitive. Make sure that the value is spelled correctly.</p>
         * </blockquote>
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

        public CreateMultiOrderRequestOrderItems setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public CreateMultiOrderRequestOrderItems setPaidCallBackUrl(String paidCallBackUrl) {
            this.paidCallBackUrl = paidCallBackUrl;
            return this;
        }
        public String getPaidCallBackUrl() {
            return this.paidCallBackUrl;
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
