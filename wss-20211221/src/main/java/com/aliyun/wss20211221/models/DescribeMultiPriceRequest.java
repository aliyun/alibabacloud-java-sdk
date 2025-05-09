// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeMultiPriceRequest extends TeaModel {
    @NameInMap("OrderItems")
    public java.util.List<DescribeMultiPriceRequestOrderItems> orderItems;

    /**
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>pacakge</p>
     */
    @NameInMap("PackageCode")
    public String packageCode;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("Components")
        public java.util.List<DescribeMultiPriceRequestOrderItemsComponents> components;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

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
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

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

    }

}
