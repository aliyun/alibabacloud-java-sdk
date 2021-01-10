// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceidMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsResourceidMetricsResponseBodyResponse response;

    public static QueryRmsResourceidMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceidMetricsResponseBody self = new QueryRmsResourceidMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceidMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsResourceidMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsResourceidMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsResourceidMetricsResponseBody setResponse(QueryRmsResourceidMetricsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsResourceidMetricsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas extends TeaModel {
        @NameInMap("Average")
        public Long average;

        @NameInMap("Maximum")
        public Long maximum;

        @NameInMap("Minimum")
        public Long minimum;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas self = new QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas setAverage(Long average) {
            this.average = average;
            return this;
        }
        public Long getAverage() {
            return this.average;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas setMaximum(Long maximum) {
            this.maximum = maximum;
            return this;
        }
        public Long getMaximum() {
            return this.maximum;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas setMinimum(Long minimum) {
            this.minimum = minimum;
            return this;
        }
        public Long getMinimum() {
            return this.minimum;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics extends TeaModel {
        @NameInMap("Metric")
        public String metric;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Datas")
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas> datas;

        public static QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics self = new QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics setDatas(java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetricsDatas> getDatas() {
            return this.datas;
        }

    }

    public static class QueryRmsResourceidMetricsResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Cursor")
        public String cursor;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Message")
        public String message;

        @NameInMap("OptionKey")
        public String optionKey;

        @NameInMap("PaasId")
        public String paasId;

        @NameInMap("Period")
        public String period;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Metrics")
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics> metrics;

        public static QueryRmsResourceidMetricsResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceidMetricsResponseBodyResponseEntityData self = new QueryRmsResourceidMetricsResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        public String getCursor() {
            return this.cursor;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setOptionKey(String optionKey) {
            this.optionKey = optionKey;
            return this;
        }
        public String getOptionKey() {
            return this.optionKey;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setPaasId(String paasId) {
            this.paasId = paasId;
            return this;
        }
        public String getPaasId() {
            return this.paasId;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntityData setMetrics(java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityDataMetrics> getMetrics() {
            return this.metrics;
        }

    }

    public static class QueryRmsResourceidMetricsResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityData> data;

        public static QueryRmsResourceidMetricsResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceidMetricsResponseBodyResponseEntity self = new QueryRmsResourceidMetricsResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceidMetricsResponseBodyResponseEntity setData(java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsResourceidMetricsResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsResourceidMetricsResponseBodyResponse extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsResourceidMetricsResponseBodyResponseEntity entity;

        public static QueryRmsResourceidMetricsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsResourceidMetricsResponseBodyResponse self = new QueryRmsResourceidMetricsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsResourceidMetricsResponseBodyResponse setEntity(QueryRmsResourceidMetricsResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsResourceidMetricsResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
