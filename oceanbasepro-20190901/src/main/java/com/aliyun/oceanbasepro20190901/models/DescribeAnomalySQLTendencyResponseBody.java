// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLTendencyResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAnomalySQLTendencyResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnomalySQLTendencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLTendencyResponseBody self = new DescribeAnomalySQLTendencyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLTendencyResponseBody setData(java.util.List<DescribeAnomalySQLTendencyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAnomalySQLTendencyResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAnomalySQLTendencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL extends TeaModel {
        @NameInMap("AnomalySQLCount")
        public Long anomalySQLCount;

        @NameInMap("BatchTime")
        public String batchTime;

        public static DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL self = new DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL setAnomalySQLCount(Long anomalySQLCount) {
            this.anomalySQLCount = anomalySQLCount;
            return this;
        }
        public Long getAnomalySQLCount() {
            return this.anomalySQLCount;
        }

        public DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL setBatchTime(String batchTime) {
            this.batchTime = batchTime;
            return this;
        }
        public String getBatchTime() {
            return this.batchTime;
        }

    }

    public static class DescribeAnomalySQLTendencyResponseBodyData extends TeaModel {
        @NameInMap("AnomalySQL")
        public java.util.List<DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL> anomalySQL;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeAnomalySQLTendencyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLTendencyResponseBodyData self = new DescribeAnomalySQLTendencyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLTendencyResponseBodyData setAnomalySQL(java.util.List<DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL> anomalySQL) {
            this.anomalySQL = anomalySQL;
            return this;
        }
        public java.util.List<DescribeAnomalySQLTendencyResponseBodyDataAnomalySQL> getAnomalySQL() {
            return this.anomalySQL;
        }

        public DescribeAnomalySQLTendencyResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
