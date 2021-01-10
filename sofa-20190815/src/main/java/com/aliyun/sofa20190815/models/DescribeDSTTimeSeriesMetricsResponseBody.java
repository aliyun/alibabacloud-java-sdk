// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTimeSeriesMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResults> results;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTTimeSeriesMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTimeSeriesMetricsResponseBody self = new DescribeDSTTimeSeriesMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTimeSeriesMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTTimeSeriesMetricsResponseBody setResults(java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResults> getResults() {
        return this.results;
    }

    public DescribeDSTTimeSeriesMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTTimeSeriesMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue self = new DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTimeSeriesMetricsResponseBodyResultsValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue> value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeDSTTimeSeriesMetricsResponseBodyResultsValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsResponseBodyResultsValues self = new DescribeDSTTimeSeriesMetricsResponseBodyResultsValues();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsValues setValue(java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValuesValue> getValue() {
            return this.value;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsValues setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeDSTTimeSeriesMetricsResponseBodyResultsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTimeSeriesMetricsResponseBodyResultsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsResponseBodyResultsTags self = new DescribeDSTTimeSeriesMetricsResponseBodyResultsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResultsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTimeSeriesMetricsResponseBodyResults extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Values")
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValues> values;

        @NameInMap("Tags")
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsTags> tags;

        public static DescribeDSTTimeSeriesMetricsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsResponseBodyResults self = new DescribeDSTTimeSeriesMetricsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResults setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResults setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResults setValues(java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsValues> getValues() {
            return this.values;
        }

        public DescribeDSTTimeSeriesMetricsResponseBodyResults setTags(java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDSTTimeSeriesMetricsResponseBodyResultsTags> getTags() {
            return this.tags;
        }

    }

}
