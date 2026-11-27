// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class MetricData extends TeaModel {
    /**
     * <p>The end time of the time series query, exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:02:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The group keys used for this query. An empty array is returned if no grouping is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;teamID&quot;]</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>The data point interval used for this query, in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("period")
    public Integer period;

    /**
     * <p>The result corresponding to each requested metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;metricName&quot;:&quot;cpuUsedCores&quot;,&quot;unit&quot;:&quot;Core&quot;,&quot;series&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]}]</p>
     */
    @NameInMap("results")
    public java.util.List<MetricDataResults> results;

    /**
     * <p>The start time of the time series query, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The time of the query. Returned only for single-point queries.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:01:00Z</p>
     */
    @NameInMap("time")
    public String time;

    public static MetricData build(java.util.Map<String, ?> map) throws Exception {
        MetricData self = new MetricData();
        return TeaModel.build(map, self);
    }

    public MetricData setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MetricData setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public MetricData setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public MetricData setResults(java.util.List<MetricDataResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MetricDataResults> getResults() {
        return this.results;
    }

    public MetricData setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MetricData setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class MetricDataResultsSeriesPoints extends TeaModel {
        /**
         * <p>The time corresponding to the metric value, in UTC seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <p>The metric value at this time. The unit is specified in unit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("value")
        public Double value;

        public static MetricDataResultsSeriesPoints build(java.util.Map<String, ?> map) throws Exception {
            MetricDataResultsSeriesPoints self = new MetricDataResultsSeriesPoints();
            return TeaModel.build(map, self);
        }

        public MetricDataResultsSeriesPoints setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public MetricDataResultsSeriesPoints setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class MetricDataResultsSeries extends TeaModel {
        /**
         * <p>The team, template, or other grouping values corresponding to this series.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;}</p>
         */
        @NameInMap("dimensions")
        public java.util.Map<String, String> dimensions;

        /**
         * <p>The data points arranged in chronological order, listing only the times when metric values are available.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]</p>
         */
        @NameInMap("points")
        public java.util.List<MetricDataResultsSeriesPoints> points;

        public static MetricDataResultsSeries build(java.util.Map<String, ?> map) throws Exception {
            MetricDataResultsSeries self = new MetricDataResultsSeries();
            return TeaModel.build(map, self);
        }

        public MetricDataResultsSeries setDimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        public MetricDataResultsSeries setPoints(java.util.List<MetricDataResultsSeriesPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<MetricDataResultsSeriesPoints> getPoints() {
            return this.points;
        }

    }

    public static class MetricDataResults extends TeaModel {
        /**
         * <p>The name of the metric corresponding to the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpuUsedCores</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The time series for the metric. An empty array is returned if there are no data points.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]</p>
         */
        @NameInMap("series")
        public java.util.List<MetricDataResultsSeries> series;

        /**
         * <p>The unit of the metric value, such as Core for CPU cores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Core</p>
         */
        @NameInMap("unit")
        public String unit;

        public static MetricDataResults build(java.util.Map<String, ?> map) throws Exception {
            MetricDataResults self = new MetricDataResults();
            return TeaModel.build(map, self);
        }

        public MetricDataResults setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public MetricDataResults setSeries(java.util.List<MetricDataResultsSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<MetricDataResultsSeries> getSeries() {
            return this.series;
        }

        public MetricDataResults setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
