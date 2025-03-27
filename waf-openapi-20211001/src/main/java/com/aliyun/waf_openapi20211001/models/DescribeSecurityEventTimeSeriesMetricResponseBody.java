// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTimeSeriesMetricResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time series data returned. This operation can return time series for multiple metrics.</p>
     */
    @NameInMap("SecurityEventTimeSeries")
    public java.util.List<DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries> securityEventTimeSeries;

    /**
     * <p>The metadata of the time series data returned.</p>
     */
    @NameInMap("TimeSeriesMetaData")
    public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData timeSeriesMetaData;

    public static DescribeSecurityEventTimeSeriesMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTimeSeriesMetricResponseBody self = new DescribeSecurityEventTimeSeriesMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTimeSeriesMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventTimeSeriesMetricResponseBody setSecurityEventTimeSeries(java.util.List<DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries> securityEventTimeSeries) {
        this.securityEventTimeSeries = securityEventTimeSeries;
        return this;
    }
    public java.util.List<DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries> getSecurityEventTimeSeries() {
        return this.securityEventTimeSeries;
    }

    public DescribeSecurityEventTimeSeriesMetricResponseBody setTimeSeriesMetaData(DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData timeSeriesMetaData) {
        this.timeSeriesMetaData = timeSeriesMetaData;
        return this;
    }
    public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData getTimeSeriesMetaData() {
        return this.timeSeriesMetaData;
    }

    public static class DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries extends TeaModel {
        /**
         * <p>The metric. This value is the same as the value of Metric in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>monitored_requests</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The time points. Each point represents a time range.</p>
         */
        @NameInMap("Timestamps")
        public java.util.List<String> timestamps;

        /**
         * <p>The data points. Each point represents a count for a time range.</p>
         */
        @NameInMap("Values")
        public java.util.List<Long> values;

        public static DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries self = new DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries setTimestamps(java.util.List<String> timestamps) {
            this.timestamps = timestamps;
            return this;
        }
        public java.util.List<String> getTimestamps() {
            return this.timestamps;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodySecurityEventTimeSeries setValues(java.util.List<Long> values) {
            this.values = values;
            return this;
        }
        public java.util.List<Long> getValues() {
            return this.values;
        }

    }

    public static class DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange extends TeaModel {
        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of EndDate in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of StartDate in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange self = new DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData extends TeaModel {
        /**
         * <p>The time granularity of data points in the time series data returned. For example, a value of 15m indicates that data points are collected at 15-minute intervals. For more information about the supported time granularities, see the &quot;<strong>Time granularities for data points in time series records</strong>&quot; section of the <strong>DescribeNetworkFlowTimeSeriesMetric</strong> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>1m</p>
         */
        @NameInMap("AggregateInterval")
        public String aggregateInterval;

        /**
         * <p>The time range that is used for the query.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange dateRange;

        /**
         * <p>The unit of the returned data. Defaults to the value: request.</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Units")
        public String units;

        public static DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData self = new DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData setAggregateInterval(String aggregateInterval) {
            this.aggregateInterval = aggregateInterval;
            return this;
        }
        public String getAggregateInterval() {
            return this.aggregateInterval;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData setDateRange(DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaDataDateRange getDateRange() {
            return this.dateRange;
        }

        public DescribeSecurityEventTimeSeriesMetricResponseBodyTimeSeriesMetaData setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

}
