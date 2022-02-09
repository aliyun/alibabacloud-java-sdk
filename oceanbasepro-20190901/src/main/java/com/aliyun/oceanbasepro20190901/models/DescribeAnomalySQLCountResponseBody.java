// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLCountResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAnomalySQLCountResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnomalySQLCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLCountResponseBody self = new DescribeAnomalySQLCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLCountResponseBody setData(java.util.List<DescribeAnomalySQLCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAnomalySQLCountResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAnomalySQLCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAnomalySQLCountResponseBodyData extends TeaModel {
        @NameInMap("AnomalySQLCount")
        public String anomalySQLCount;

        public static DescribeAnomalySQLCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLCountResponseBodyData self = new DescribeAnomalySQLCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLCountResponseBodyData setAnomalySQLCount(String anomalySQLCount) {
            this.anomalySQLCount = anomalySQLCount;
            return this;
        }
        public String getAnomalySQLCount() {
            return this.anomalySQLCount;
        }

    }

}
