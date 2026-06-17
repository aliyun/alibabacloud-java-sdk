// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskMetricsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-2zejpr***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list.</p>
     */
    @NameInMap("Items")
    public DescribeAIDBClusterTaskMetricsResponseBodyItems items;

    /**
     * <p>The metric type.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The page number of the returned page. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The total number of entries that match the query conditions. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the associated PolarDB cluster.</p>
     * 
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
     * <p>The start time of the query. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format in UTC.</p>
     * 
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
         * <p>The current step.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("CurrentStep")
        public Integer currentStep;

        /**
         * <p>The epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>0.23</p>
         */
        @NameInMap("Epoch")
        public Double epoch;

        /**
         * <p>The total number of steps.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GlobalStep")
        public Integer globalStep;

        /**
         * <p>The log time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-15T14:16:49.52140317Z</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The metric details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;memory(GiB)&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Metric")
        public java.util.Map<String, ?> metric;

        /**
         * <p>The metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("MetricType")
        public String metricType;

        /**
         * <p>The specific point in time when the monitoring metric was collected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
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
        /**
         * <p>The list of metrics.</p>
         */
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
