// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkMetricsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetNisNetworkMetricsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNisNetworkMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkMetricsResponseBody self = new GetNisNetworkMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkMetricsResponseBody setData(GetNisNetworkMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNisNetworkMetricsResponseBodyData getData() {
        return this.data;
    }

    public GetNisNetworkMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNisNetworkMetricsResponseBodyDataMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1690684091100</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetNisNetworkMetricsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkMetricsResponseBodyDataMetrics self = new GetNisNetworkMetricsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkMetricsResponseBodyDataMetrics setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public GetNisNetworkMetricsResponseBodyDataMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetNisNetworkMetricsResponseBodyData extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<GetNisNetworkMetricsResponseBodyDataMetrics> metrics;

        /**
         * <strong>example:</strong>
         * <p>Bits/Second</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static GetNisNetworkMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkMetricsResponseBodyData self = new GetNisNetworkMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkMetricsResponseBodyData setMetrics(java.util.List<GetNisNetworkMetricsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetNisNetworkMetricsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public GetNisNetworkMetricsResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
