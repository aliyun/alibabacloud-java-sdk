// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLCompositionResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAnomalySQLCompositionResponseBodyData> data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnomalySQLCompositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLCompositionResponseBody self = new DescribeAnomalySQLCompositionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLCompositionResponseBody setData(java.util.List<DescribeAnomalySQLCompositionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAnomalySQLCompositionResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAnomalySQLCompositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAnomalySQLCompositionResponseBodyData extends TeaModel {
        @NameInMap("AnomalySQLCount")
        public Long anomalySQLCount;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("TenantAlias")
        public String tenantAlias;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeAnomalySQLCompositionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnomalySQLCompositionResponseBodyData self = new DescribeAnomalySQLCompositionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAnomalySQLCompositionResponseBodyData setAnomalySQLCount(Long anomalySQLCount) {
            this.anomalySQLCount = anomalySQLCount;
            return this;
        }
        public Long getAnomalySQLCount() {
            return this.anomalySQLCount;
        }

        public DescribeAnomalySQLCompositionResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAnomalySQLCompositionResponseBodyData setTenantAlias(String tenantAlias) {
            this.tenantAlias = tenantAlias;
            return this;
        }
        public String getTenantAlias() {
            return this.tenantAlias;
        }

        public DescribeAnomalySQLCompositionResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
