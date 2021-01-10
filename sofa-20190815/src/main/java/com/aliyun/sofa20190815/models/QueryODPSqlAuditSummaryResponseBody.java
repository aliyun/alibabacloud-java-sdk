// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPSqlAuditSummaryResponseBodyData> data;

    public static QueryODPSqlAuditSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditSummaryResponseBody self = new QueryODPSqlAuditSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSqlAuditSummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSqlAuditSummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSqlAuditSummaryResponseBody setData(java.util.List<QueryODPSqlAuditSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPSqlAuditSummaryResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPSqlAuditSummaryResponseBodyDataMetricsValues extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("From")
        public Long from;

        @NameInMap("To")
        public Long to;

        public static QueryODPSqlAuditSummaryResponseBodyDataMetricsValues build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditSummaryResponseBodyDataMetricsValues self = new QueryODPSqlAuditSummaryResponseBodyDataMetricsValues();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditSummaryResponseBodyDataMetricsValues setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryODPSqlAuditSummaryResponseBodyDataMetricsValues setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public QueryODPSqlAuditSummaryResponseBodyDataMetricsValues setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

    public static class QueryODPSqlAuditSummaryResponseBodyData extends TeaModel {
        @NameInMap("Schema")
        public String schema;

        @NameInMap("MetricsValues")
        public java.util.List<QueryODPSqlAuditSummaryResponseBodyDataMetricsValues> metricsValues;

        public static QueryODPSqlAuditSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSqlAuditSummaryResponseBodyData self = new QueryODPSqlAuditSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSqlAuditSummaryResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public QueryODPSqlAuditSummaryResponseBodyData setMetricsValues(java.util.List<QueryODPSqlAuditSummaryResponseBodyDataMetricsValues> metricsValues) {
            this.metricsValues = metricsValues;
            return this;
        }
        public java.util.List<QueryODPSqlAuditSummaryResponseBodyDataMetricsValues> getMetricsValues() {
            return this.metricsValues;
        }

    }

}
