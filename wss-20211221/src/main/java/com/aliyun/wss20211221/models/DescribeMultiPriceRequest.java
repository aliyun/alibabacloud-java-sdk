// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceRequest extends TeaModel {
    /**
     * <p>The order items.</p>
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
     * <p>The package code. This parameter is not required for non-package types.</p>
     * 
     * <strong>example:</strong>
     * <p>pacakge</p>
     */
    @NameInMap("PackageCode")
    public String packageCode;

    /**
     * <p>The ID of the user who owns the resource in the reseller model. This parameter is not required in non-reseller mode.</p>
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
         * <p>The key of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the component.</p>
         * <p>The following are the keys and their sample or enumerated values for a monthly duration package of the enterprise edition:</p>
         * <ul>
         * <li><p><code>RegionId</code>: cn-shanghai</p>
         * </li>
         * <li><p><code>InstanceType</code>: eds.enterprise_office.4c8g</p>
         * </li>
         * <li><p><code>DurationType</code> (in hours): [enum]</p>
         * <ul>
         * <li><p>120</p>
         * </li>
         * <li><p>250</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>OsType</code>: [enum]</p>
         * <ul>
         * <li><p>Windows</p>
         * </li>
         * <li><p>Linux</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>RootDiskSize</code> (in GiB): 80</p>
         * </li>
         * <li><p><code>RootDiskCategory</code>: [enum]</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code> (Ultra Cloud Disk)</p>
         * </li>
         * <li><p><code>cloud_auto</code> (AutoPL Cloud Disk)</p>
         * </li>
         * <li><p><code>cloud_essd</code> (Enhanced SSD (ESSD), available only for specific instance types)</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>RootPerformanceLevel</code>: [enum]</p>
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
         * <li><p><code>DataDiskSize</code> (in GiB): Same as <code>RootDiskSize</code>.</p>
         * </li>
         * <li><p><code>DataDiskCategory</code>: Same as <code>RootDiskCategory</code>.</p>
         * </li>
         * <li><p><code>DataPerformanceLevel</code>: Same as <code>RootPerformanceLevel</code>.</p>
         * </li>
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
         * <p>The quantity to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>A list of components.</p>
         */
        @NameInMap("Components")
        public java.util.List<DescribeMultiPriceRequestOrderItemsComponents> components;

        @NameInMap("Data")
        public String data;

        /**
         * <p>A list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li><p>If <code>PeriodUnit</code> is <code>Year</code>, the valid values are 1, 2, and 3.</p>
         * </li>
         * <li><p>If <code>PeriodUnit</code> is <code>Month</code>, the valid values are 1, 2, 3, and 6.</p>
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
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <p>A list of resource IDs.</p>
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>The value is case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SavingPlanPeriod")
        public String savingPlanPeriod;

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

    }

}
