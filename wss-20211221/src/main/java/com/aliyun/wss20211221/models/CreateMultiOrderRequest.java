// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class CreateMultiOrderRequest extends TeaModel {
    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The items in the order.</p>
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
         * <p>The key of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the component.</p>
         * <p>Example and valid values for the keys of a monthly duration package (Enterprise Edition):</p>
         * <ul>
         * <li><p>RegionId: cn-shanghai</p>
         * </li>
         * <li><p>InstanceType: eds.enterprise_office.4c8g</p>
         * </li>
         * <li><p>DurationType (in hours): Valid values:</p>
         * <ul>
         * <li><p>120</p>
         * </li>
         * <li><p>250</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>OsType: Valid values:</p>
         * <ul>
         * <li><p>Windows</p>
         * </li>
         * <li><p>Linux</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>RootDiskSize (in GiB): 80</p>
         * </li>
         * <li><p>RootDiskCategory: Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency (Ultra Disk)</p>
         * </li>
         * <li><p>cloud_auto (ESSD AutoPL Disk)</p>
         * </li>
         * <li><p><code>cloud_essd</code> (Enhanced SSD). This value is supported only by specific instance types.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>RootPerformanceLevel: Valid values:</p>
         * <ul>
         * <li><p>PL0</p>
         * </li>
         * <li><p>PL1</p>
         * </li>
         * <li><p>PL2</p>
         * </li>
         * <li><p>PL3</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>DataDiskSize (in GiB): Same as <code>RootDiskSize</code>.</p>
         * </li>
         * <li><p>DataDiskCategory: Same as <code>RootDiskCategory</code>.</p>
         * </li>
         * <li><p>DataPerformanceLevel: Same as <code>RootPerformanceLevel</code>.</p>
         * </li>
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
         * <p>The number of resources to purchase.</p>
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

        @NameInMap("BuyChange")
        public Boolean buyChange;

        /**
         * <p>The components that define the resource.</p>
         */
        @NameInMap("Components")
        public java.util.List<CreateMultiOrderRequestOrderItemsComponents> components;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, the valid values are 1, 2, 3, and 5.</p>
         * </li>
         * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, the valid values are 1, 2, 3, and 6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The time unit of the subscription duration.</p>
         * <blockquote>
         * <p>This parameter is required for prepaid instances and is case-sensitive.</p>
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
         * <p>A list of resource IDs.</p>
         * <blockquote>
         * <p>For a monthly duration package, this parameter specifies the IDs of the cloud desktops. This parameter is required unless the <code>OrderType</code> is <code>create</code>.</p>
         * </blockquote>
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The type of the resource.</p>
         * <blockquote>
         * <p>This parameter is case-sensitive.</p>
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
