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
     * <p>The user ID for resource ownership in the reseller pattern. You do not need to specify this parameter in the non-reseller pattern.</p>
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
         * <p>The following example values and valid values are for the Enterprise Edition monthly duration package:</p>
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
         * <li>cloud_efficiency: ultra cloud disk</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk</li>
         * <li>cloud_essd: enhanced standard SSD. Only specific instance types support this value.</li>
         * </ul>
         * </li>
         * <li>RootPerformanceLevel: Valid values: <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * </li>
         * <li>DataDiskSize (GiB): same as RootDiskSize</li>
         * <li>DataDiskCategory: same as RootDiskCategory</li>
         * <li>DataPerformanceLevel: same as RootPerformanceLevel</li>
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

        @NameInMap("Data")
        public String data;

        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li><p>If PeriodUnit is set to Year: 1, 2, or 3.</p>
         * </li>
         * <li><p>If PeriodUnit is set to Month: 1, 2, 3, or 6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription duration.</p>
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
