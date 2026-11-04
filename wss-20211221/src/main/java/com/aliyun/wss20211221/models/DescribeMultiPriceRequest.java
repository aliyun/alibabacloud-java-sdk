// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceRequest extends TeaModel {
    /**
     * <p>The product information.</p>
     */
    @NameInMap("OrderItems")
    public java.util.List<DescribeMultiPriceRequestOrderItems> orderItems;

    /**
     * <p>The order type.</p>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The package code. You do not need to specify this parameter for non-package types.</p>
     * 
     * <strong>example:</strong>
     * <p>pacakge</p>
     */
    @NameInMap("PackageCode")
    public String packageCode;

    /**
     * <p>The user ID for resource ownership in the reseller pattern. You do not need to specify this parameter for non-reseller patterns.</p>
     * 
     * <strong>example:</strong>
     * <p>182864463481****</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    public static DescribeMultiPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiPriceRequest self = new DescribeMultiPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiPriceRequest setOrderItems(java.util.List<DescribeMultiPriceRequestOrderItems> orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public java.util.List<DescribeMultiPriceRequestOrderItems> getOrderItems() {
        return this.orderItems;
    }

    public DescribeMultiPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeMultiPriceRequest setPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }
    public String getPackageCode() {
        return this.packageCode;
    }

    public DescribeMultiPriceRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static class DescribeMultiPriceRequestOrderItemsComponents extends TeaModel {
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
         * <p>The following section describes the sample values and valid values of each key for the Enterprise Edition monthly package:</p>
         * <ul>
         * <li>RegionId: cn-shanghai</li>
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
         * <li>cloud_auto (ESSD AutoPL cloud disk)</li>
         * <li>cloud_essd (enhanced standard SSD, supported only by specific instance types)</li>
         * </ul>
         * </li>
         * <li>RootPerformanceLevel: Valid values: <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * </li>
         * <li>DataDiskSize (GiB): Same as RootDiskSize.</li>
         * <li>DataDiskCategory: Same as RootDiskCategory.</li>
         * <li>DataPerformanceLevel: Same as RootPerformanceLevel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMultiPriceRequestOrderItemsComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceRequestOrderItemsComponents self = new DescribeMultiPriceRequestOrderItemsComponents();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceRequestOrderItemsComponents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMultiPriceRequestOrderItemsComponents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMultiPriceRequestOrderItems extends TeaModel {
        /**
         * <p>The purchase quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The list of product modules.</p>
         */
        @NameInMap("Components")
        public java.util.List<DescribeMultiPriceRequestOrderItemsComponents> components;

        /**
         * <p>The extended data of the order item, which is passed as a JSON string. The structure varies based on the order scenario. For the billing method change scenario, you can pass the instance and the list of target billing methods. If no extended data is required, you can leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;resourceType&quot;:&quot;Desktop&quot;,&quot;chargeType&quot;:&quot;POSTPAY&quot;,&quot;instanceId&quot;:&quot;ecd-6wye9optu0kag****&quot;}]</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li><p>When <code>PeriodUnit</code> is set to <code>Year</code>: 1, 2, and 3.</p>
         * </li>
         * <li><p>When <code>PeriodUnit</code> is set to <code>Month</code>: 1, 2, 3, and 6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription period.</p>
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
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is case-sensitive. Make sure that the spelling is correct.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The subscription period of the savings plan. For example, 1Year indicates one year.</p>
         * 
         * <strong>example:</strong>
         * <p>1Year</p>
         */
        @NameInMap("SavingPlanPeriod")
        public String savingPlanPeriod;

        /**
         * <p>The unified expiration date, which can be a day from the 1st to the 28th of a month. If you do not specify this parameter, the instance is renewed in the standard way.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("UnifiedExpireDay")
        public Integer unifiedExpireDay;

        public static DescribeMultiPriceRequestOrderItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiPriceRequestOrderItems self = new DescribeMultiPriceRequestOrderItems();
            return TeaModel.build(map, self);
        }

        public DescribeMultiPriceRequestOrderItems setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeMultiPriceRequestOrderItems setComponents(java.util.List<DescribeMultiPriceRequestOrderItemsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<DescribeMultiPriceRequestOrderItemsComponents> getComponents() {
            return this.components;
        }

        public DescribeMultiPriceRequestOrderItems setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeMultiPriceRequestOrderItems setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeMultiPriceRequestOrderItems setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeMultiPriceRequestOrderItems setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeMultiPriceRequestOrderItems setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public DescribeMultiPriceRequestOrderItems setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public DescribeMultiPriceRequestOrderItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeMultiPriceRequestOrderItems setSavingPlanPeriod(String savingPlanPeriod) {
            this.savingPlanPeriod = savingPlanPeriod;
            return this;
        }
        public String getSavingPlanPeriod() {
            return this.savingPlanPeriod;
        }

        public DescribeMultiPriceRequestOrderItems setUnifiedExpireDay(Integer unifiedExpireDay) {
            this.unifiedExpireDay = unifiedExpireDay;
            return this;
        }
        public Integer getUnifiedExpireDay() {
            return this.unifiedExpireDay;
        }

    }

}
