// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTopNMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Results")
    public java.util.List<ListDSTTopNMetricsResponseBodyResults> results;

    public static ListDSTTopNMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTopNMetricsResponseBody self = new ListDSTTopNMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSTTopNMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSTTopNMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDSTTopNMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDSTTopNMetricsResponseBody setResults(java.util.List<ListDSTTopNMetricsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<ListDSTTopNMetricsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class ListDSTTopNMetricsResponseBodyResultsValuesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTTopNMetricsResponseBodyResultsValuesTags build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTopNMetricsResponseBodyResultsValuesTags self = new ListDSTTopNMetricsResponseBodyResultsValuesTags();
            return TeaModel.build(map, self);
        }

        public ListDSTTopNMetricsResponseBodyResultsValuesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTTopNMetricsResponseBodyResultsValuesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTTopNMetricsResponseBodyResultsValues extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Tags")
        public java.util.List<ListDSTTopNMetricsResponseBodyResultsValuesTags> tags;

        public static ListDSTTopNMetricsResponseBodyResultsValues build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTopNMetricsResponseBodyResultsValues self = new ListDSTTopNMetricsResponseBodyResultsValues();
            return TeaModel.build(map, self);
        }

        public ListDSTTopNMetricsResponseBodyResultsValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListDSTTopNMetricsResponseBodyResultsValues setTags(java.util.List<ListDSTTopNMetricsResponseBodyResultsValuesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDSTTopNMetricsResponseBodyResultsValuesTags> getTags() {
            return this.tags;
        }

    }

    public static class ListDSTTopNMetricsResponseBodyResults extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public java.util.List<ListDSTTopNMetricsResponseBodyResultsValues> values;

        public static ListDSTTopNMetricsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTopNMetricsResponseBodyResults self = new ListDSTTopNMetricsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public ListDSTTopNMetricsResponseBodyResults setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListDSTTopNMetricsResponseBodyResults setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public ListDSTTopNMetricsResponseBodyResults setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListDSTTopNMetricsResponseBodyResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDSTTopNMetricsResponseBodyResults setValues(java.util.List<ListDSTTopNMetricsResponseBodyResultsValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ListDSTTopNMetricsResponseBodyResultsValues> getValues() {
            return this.values;
        }

    }

}
