// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class QueryMetricRequest extends TeaModel {
    /**
     * <p>The dimensions of the metric that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>RT</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<String> dimensions;

    /**
     * <p>The timestamp of the end time of the time range to query. The timestamp is accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1575622455686</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<QueryMetricRequestFilters> filters;

    /**
     * <p>The time interval at which you want to query metric data. Unit: milliseconds. Minimum value: 60000. </p>
     * <blockquote>
     * <p>If you set this parameter to 2147483647, all data in the specified time interval is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("IntervalInSec")
    public Integer intervalInSec;

    /**
     * <p>The maximum number of entries that you want to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The measures of the metric that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("Measures")
    public java.util.List<String> measures;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li><code>appstat.incall</code>: trace statistics </li>
     * <li><code>appstat.sql</code>: SQL statistics</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.incall</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The order in which you want to sort the returned entries. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order </li>
     * <li>DESC: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field based on which you want to sort the returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the proxy user.</p>
     * 
     * <strong>example:</strong>
     * <p>testefgag12</p>
     */
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    /**
     * <p>The timestamp of the start time of the time range to query. The timestamp is accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1575561600000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static QueryMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricRequest self = new QueryMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricRequest setDimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    public QueryMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricRequest setFilters(java.util.List<QueryMetricRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<QueryMetricRequestFilters> getFilters() {
        return this.filters;
    }

    public QueryMetricRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public QueryMetricRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryMetricRequest setMeasures(java.util.List<String> measures) {
        this.measures = measures;
        return this;
    }
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    public QueryMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryMetricRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryMetricRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class QueryMetricRequestFilters extends TeaModel {
        /**
         * <p>The key of the field that you want to use to filter the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status_code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the field that you want to use to filter the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryMetricRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricRequestFilters self = new QueryMetricRequestFilters();
            return TeaModel.build(map, self);
        }

        public QueryMetricRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMetricRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
