// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobLatestMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<GetTrainingJobLatestMetricsResponseBodyMetrics> metrics;

    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainingJobLatestMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobLatestMetricsResponseBody self = new GetTrainingJobLatestMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobLatestMetricsResponseBody setMetrics(java.util.List<GetTrainingJobLatestMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<GetTrainingJobLatestMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public GetTrainingJobLatestMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainingJobLatestMetricsResponseBodyMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>loss</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T22:20:55Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <strong>example:</strong>
         * <p>0.97</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetTrainingJobLatestMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobLatestMetricsResponseBodyMetrics self = new GetTrainingJobLatestMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobLatestMetricsResponseBodyMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobLatestMetricsResponseBodyMetrics setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetTrainingJobLatestMetricsResponseBodyMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
