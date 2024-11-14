// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecProtectionResourcesResponseBody extends TeaModel {
    /**
     * <p>The protected objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecProtectionResourcesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecProtectionResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecProtectionResourcesResponseBody self = new DescribeApisecProtectionResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecProtectionResourcesResponseBody setData(java.util.List<DescribeApisecProtectionResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecProtectionResourcesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecProtectionResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecProtectionResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecProtectionResourcesResponseBodyData extends TeaModel {
        /**
         * <p>The switch of the API security module.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApisecStatus")
        public Long apisecStatus;

        /**
         * <p>The switch of the compliance check feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReportStatus")
        public Long reportStatus;

        /**
         * <p>The protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>cwaf-***-waf</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The switch of the tracing and auditing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TraceStatus")
        public Long traceStatus;

        public static DescribeApisecProtectionResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecProtectionResourcesResponseBodyData self = new DescribeApisecProtectionResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecProtectionResourcesResponseBodyData setApisecStatus(Long apisecStatus) {
            this.apisecStatus = apisecStatus;
            return this;
        }
        public Long getApisecStatus() {
            return this.apisecStatus;
        }

        public DescribeApisecProtectionResourcesResponseBodyData setReportStatus(Long reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public Long getReportStatus() {
            return this.reportStatus;
        }

        public DescribeApisecProtectionResourcesResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeApisecProtectionResourcesResponseBodyData setTraceStatus(Long traceStatus) {
            this.traceStatus = traceStatus;
            return this;
        }
        public Long getTraceStatus() {
            return this.traceStatus;
        }

    }

}
