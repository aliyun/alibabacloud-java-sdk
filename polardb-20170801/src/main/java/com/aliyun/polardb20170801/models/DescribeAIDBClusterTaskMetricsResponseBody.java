// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-2zejpr***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2026-01-15T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Items")
    public DescribeAIDBClusterTaskMetricsResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>pc-2zejpr***</p>
     */
    @NameInMap("RelativeDbClusterId")
    public String relativeDbClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2026-01-15T14:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAIDBClusterTaskMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskMetricsResponseBody self = new DescribeAIDBClusterTaskMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setItems(DescribeAIDBClusterTaskMetricsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAIDBClusterTaskMetricsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setRelativeDbClusterId(String relativeDbClusterId) {
        this.relativeDbClusterId = relativeDbClusterId;
        return this;
    }
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterTaskMetricsResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("CurrentStep")
        public Integer currentStep;

        /**
         * <strong>example:</strong>
         * <p>0.23</p>
         */
        @NameInMap("Epoch")
        public Double epoch;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GlobalStep")
        public Integer globalStep;

        /**
         * <strong>example:</strong>
         * <p>2026-01-15T14:16:49.52140317Z</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;memory(GiB)&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Metric")
        public java.util.Map<String, ?> metric;

        /**
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <strong>example:</strong>
         * <p>1742090703</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems self = new DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setCurrentStep(Integer currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public Integer getCurrentStep() {
            return this.currentStep;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setEpoch(Double epoch) {
            this.epoch = epoch;
            return this;
        }
        public Double getEpoch() {
            return this.epoch;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setGlobalStep(Integer globalStep) {
            this.globalStep = globalStep;
            return this;
        }
        public Integer getGlobalStep() {
            return this.globalStep;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setMetric(java.util.Map<String, ?> metric) {
            this.metric = metric;
            return this;
        }
        public java.util.Map<String, ?> getMetric() {
            return this.metric;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeAIDBClusterTaskMetricsResponseBodyItems extends TeaModel {
        @NameInMap("SlsMetricsItems")
        public java.util.List<DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems> slsMetricsItems;

        public static DescribeAIDBClusterTaskMetricsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterTaskMetricsResponseBodyItems self = new DescribeAIDBClusterTaskMetricsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterTaskMetricsResponseBodyItems setSlsMetricsItems(java.util.List<DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems> slsMetricsItems) {
            this.slsMetricsItems = slsMetricsItems;
            return this;
        }
        public java.util.List<DescribeAIDBClusterTaskMetricsResponseBodyItemsSlsMetricsItems> getSlsMetricsItems() {
            return this.slsMetricsItems;
        }

    }

}
