// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApikeyAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeApikeyAttributeResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>F3322AFE-083E-4D77-A074-421301******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApikeyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApikeyAttributeResponseBody self = new DescribeApikeyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApikeyAttributeResponseBody setItems(java.util.List<DescribeApikeyAttributeResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeApikeyAttributeResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeApikeyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApikeyAttributeResponseBodyItemsConsumer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>cg-bq6rcdjp02vt</p>
         */
        @NameInMap("ConsumerGroupId")
        public String consumerGroupId;

        /**
         * <strong>example:</strong>
         * <p>c-71qh3pscbd3i</p>
         */
        @NameInMap("ConsumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConsumerTag")
        public String consumerTag;

        /**
         * <strong>example:</strong>
         * <p>2021-07-18T07:32:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>pg-2ze5n62ef4s165***</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <strong>example:</strong>
         * <p>2026-04-10T01:48:25Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeApikeyAttributeResponseBodyItemsConsumer build(java.util.Map<String, ?> map) throws Exception {
            DescribeApikeyAttributeResponseBodyItemsConsumer self = new DescribeApikeyAttributeResponseBodyItemsConsumer();
            return TeaModel.build(map, self);
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApikeyAttributeResponseBodyItemsConsumer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeApikeyAttributeResponseBodyItemsUsageStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c-xxxxxx</p>
         */
        @NameInMap("DimensionRefId")
        public String dimensionRefId;

        /**
         * <strong>example:</strong>
         * <p>Consumer</p>
         */
        @NameInMap("DimensionType")
        public String dimensionType;

        /**
         * <strong>example:</strong>
         * <p>pg-bp1ln7w98yrhzz7i2</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyCacheToken")
        public String monthlyCacheToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyCostPoints")
        public String monthlyCostPoints;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyInputToken")
        public String monthlyInputToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyOutputToken")
        public String monthlyOutputToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MonthlyToken")
        public String monthlyToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCacheToken")
        public String totalCacheToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCostPoints")
        public String totalCostPoints;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalInputToken")
        public String totalInputToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalOutputToken")
        public String totalOutputToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalToken")
        public String totalToken;

        public static DescribeApikeyAttributeResponseBodyItemsUsageStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeApikeyAttributeResponseBodyItemsUsageStatistics self = new DescribeApikeyAttributeResponseBodyItemsUsageStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setDimensionRefId(String dimensionRefId) {
            this.dimensionRefId = dimensionRefId;
            return this;
        }
        public String getDimensionRefId() {
            return this.dimensionRefId;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setDimensionType(String dimensionType) {
            this.dimensionType = dimensionType;
            return this;
        }
        public String getDimensionType() {
            return this.dimensionType;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setMonthlyCacheToken(String monthlyCacheToken) {
            this.monthlyCacheToken = monthlyCacheToken;
            return this;
        }
        public String getMonthlyCacheToken() {
            return this.monthlyCacheToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setMonthlyCostPoints(String monthlyCostPoints) {
            this.monthlyCostPoints = monthlyCostPoints;
            return this;
        }
        public String getMonthlyCostPoints() {
            return this.monthlyCostPoints;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setMonthlyInputToken(String monthlyInputToken) {
            this.monthlyInputToken = monthlyInputToken;
            return this;
        }
        public String getMonthlyInputToken() {
            return this.monthlyInputToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setMonthlyOutputToken(String monthlyOutputToken) {
            this.monthlyOutputToken = monthlyOutputToken;
            return this;
        }
        public String getMonthlyOutputToken() {
            return this.monthlyOutputToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setMonthlyToken(String monthlyToken) {
            this.monthlyToken = monthlyToken;
            return this;
        }
        public String getMonthlyToken() {
            return this.monthlyToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setTotalCacheToken(String totalCacheToken) {
            this.totalCacheToken = totalCacheToken;
            return this;
        }
        public String getTotalCacheToken() {
            return this.totalCacheToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setTotalCostPoints(String totalCostPoints) {
            this.totalCostPoints = totalCostPoints;
            return this;
        }
        public String getTotalCostPoints() {
            return this.totalCostPoints;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setTotalInputToken(String totalInputToken) {
            this.totalInputToken = totalInputToken;
            return this;
        }
        public String getTotalInputToken() {
            return this.totalInputToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setTotalOutputToken(String totalOutputToken) {
            this.totalOutputToken = totalOutputToken;
            return this;
        }
        public String getTotalOutputToken() {
            return this.totalOutputToken;
        }

        public DescribeApikeyAttributeResponseBodyItemsUsageStatistics setTotalToken(String totalToken) {
            this.totalToken = totalToken;
            return this;
        }
        public String getTotalToken() {
            return this.totalToken;
        }

    }

    public static class DescribeApikeyAttributeResponseBodyItems extends TeaModel {
        @NameInMap("Consumer")
        public DescribeApikeyAttributeResponseBodyItemsConsumer consumer;

        @NameInMap("UsageStatistics")
        public java.util.List<DescribeApikeyAttributeResponseBodyItemsUsageStatistics> usageStatistics;

        public static DescribeApikeyAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApikeyAttributeResponseBodyItems self = new DescribeApikeyAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeApikeyAttributeResponseBodyItems setConsumer(DescribeApikeyAttributeResponseBodyItemsConsumer consumer) {
            this.consumer = consumer;
            return this;
        }
        public DescribeApikeyAttributeResponseBodyItemsConsumer getConsumer() {
            return this.consumer;
        }

        public DescribeApikeyAttributeResponseBodyItems setUsageStatistics(java.util.List<DescribeApikeyAttributeResponseBodyItemsUsageStatistics> usageStatistics) {
            this.usageStatistics = usageStatistics;
            return this;
        }
        public java.util.List<DescribeApikeyAttributeResponseBodyItemsUsageStatistics> getUsageStatistics() {
            return this.usageStatistics;
        }

    }

}
