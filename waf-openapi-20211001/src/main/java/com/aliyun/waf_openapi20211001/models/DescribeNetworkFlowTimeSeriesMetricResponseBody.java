// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTimeSeriesMetricResponseBody extends TeaModel {
    /**
     * <p>The returned time sequence data. Time sequence data of multiple values can be returned.</p>
     */
    @NameInMap("NetworkFlowTimeSeries")
    public java.util.List<DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries> networkFlowTimeSeries;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-D33C8B4*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the returned data.</p>
     */
    @NameInMap("TimeSeriesMetaData")
    public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData timeSeriesMetaData;

    public static DescribeNetworkFlowTimeSeriesMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTimeSeriesMetricResponseBody self = new DescribeNetworkFlowTimeSeriesMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTimeSeriesMetricResponseBody setNetworkFlowTimeSeries(java.util.List<DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries> networkFlowTimeSeries) {
        this.networkFlowTimeSeries = networkFlowTimeSeries;
        return this;
    }
    public java.util.List<DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries> getNetworkFlowTimeSeries() {
        return this.networkFlowTimeSeries;
    }

    public DescribeNetworkFlowTimeSeriesMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkFlowTimeSeriesMetricResponseBody setTimeSeriesMetaData(DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData timeSeriesMetaData) {
        this.timeSeriesMetaData = timeSeriesMetaData;
        return this;
    }
    public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData getTimeSeriesMetaData() {
        return this.timeSeriesMetaData;
    }

    public static class DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries extends TeaModel {
        /**
         * <p>The returned data content. The meaning is consistent with the Metric parameter in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>total_requests</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The time series. Each point represents the start time of a time range.</p>
         */
        @NameInMap("Timestamps")
        public java.util.List<String> timestamps;

        /**
         * <p>The data series. Each point represents the statistical count within a specific time range.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Values")
        public java.util.List<Long> values;

        public static DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries self = new DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries setTimestamps(java.util.List<String> timestamps) {
            this.timestamps = timestamps;
            return this;
        }
        public java.util.List<String> getTimestamps() {
            return this.timestamps;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyNetworkFlowTimeSeries setValues(java.util.List<Long> values) {
            this.values = values;
            return this;
        }
        public java.util.List<Long> getValues() {
            return this.values;
        }

    }

    public static class DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange extends TeaModel {
        /**
         * <p>The end time used for the query, represented as a UNIX timestamp in seconds. This value is the same as the EndDate parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The start time used for the query, represented as a UNIX timestamp in seconds. This value is the same as the StartDate parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange self = new DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData extends TeaModel {
        /**
         * <p>The statistical time granularity of each data point in the returned time sequence data. For example, &quot;15m&quot; indicates that each returned data point is the statistical data for every 15 minutes. For the time granularity of the returned data, see <strong>Description of the time granularity of time sequence data points</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
         */
        @NameInMap("AggregateInterval")
        public String aggregateInterval;

        /**
         * <p>The time range used for the query.</p>
         */
        @NameInMap("DateRange")
        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange dateRange;

        /**
         * <p>The unit of the returned statistical data. Default value: requests.</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Units")
        public String units;

        public static DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData self = new DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData setAggregateInterval(String aggregateInterval) {
            this.aggregateInterval = aggregateInterval;
            return this;
        }
        public String getAggregateInterval() {
            return this.aggregateInterval;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData setDateRange(DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange getDateRange() {
            return this.dateRange;
        }

        public DescribeNetworkFlowTimeSeriesMetricResponseBodyTimeSeriesMetaData setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

}
