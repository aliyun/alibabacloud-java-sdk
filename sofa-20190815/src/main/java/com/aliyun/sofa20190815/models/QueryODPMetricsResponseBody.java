// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPMetricsResponseBodyData> data;

    public static QueryODPMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPMetricsResponseBody self = new QueryODPMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPMetricsResponseBody setData(java.util.List<QueryODPMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPMetricsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPMetricsResponseBodyDataMertricsValues extends TeaModel {
        @NameInMap("T")
        public Long t;

        @NameInMap("V")
        public String v;

        public static QueryODPMetricsResponseBodyDataMertricsValues build(java.util.Map<String, ?> map) throws Exception {
            QueryODPMetricsResponseBodyDataMertricsValues self = new QueryODPMetricsResponseBodyDataMertricsValues();
            return TeaModel.build(map, self);
        }

        public QueryODPMetricsResponseBodyDataMertricsValues setT(Long t) {
            this.t = t;
            return this;
        }
        public Long getT() {
            return this.t;
        }

        public QueryODPMetricsResponseBodyDataMertricsValues setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class QueryODPMetricsResponseBodyData extends TeaModel {
        @NameInMap("MetricsType")
        public String metricsType;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("MertricsValues")
        public java.util.List<QueryODPMetricsResponseBodyDataMertricsValues> mertricsValues;

        public static QueryODPMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPMetricsResponseBodyData self = new QueryODPMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPMetricsResponseBodyData setMetricsType(String metricsType) {
            this.metricsType = metricsType;
            return this;
        }
        public String getMetricsType() {
            return this.metricsType;
        }

        public QueryODPMetricsResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public QueryODPMetricsResponseBodyData setMertricsValues(java.util.List<QueryODPMetricsResponseBodyDataMertricsValues> mertricsValues) {
            this.mertricsValues = mertricsValues;
            return this;
        }
        public java.util.List<QueryODPMetricsResponseBodyDataMertricsValues> getMertricsValues() {
            return this.mertricsValues;
        }

    }

}
