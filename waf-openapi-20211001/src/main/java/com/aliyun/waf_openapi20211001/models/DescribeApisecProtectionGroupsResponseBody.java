// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecProtectionGroupsResponseBody extends TeaModel {
    /**
     * <p>The protected object groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeApisecProtectionGroupsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of protected object groups.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeApisecProtectionGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecProtectionGroupsResponseBody self = new DescribeApisecProtectionGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecProtectionGroupsResponseBody setData(java.util.List<DescribeApisecProtectionGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeApisecProtectionGroupsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeApisecProtectionGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApisecProtectionGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApisecProtectionGroupsResponseBodyData extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("ReportStatus")
        public Long reportStatus;

        /**
         * <p>The name of the protected object group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The switch of the tracing and auditing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TraceStatus")
        public Long traceStatus;

        public static DescribeApisecProtectionGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecProtectionGroupsResponseBodyData self = new DescribeApisecProtectionGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecProtectionGroupsResponseBodyData setApisecStatus(Long apisecStatus) {
            this.apisecStatus = apisecStatus;
            return this;
        }
        public Long getApisecStatus() {
            return this.apisecStatus;
        }

        public DescribeApisecProtectionGroupsResponseBodyData setReportStatus(Long reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public Long getReportStatus() {
            return this.reportStatus;
        }

        public DescribeApisecProtectionGroupsResponseBodyData setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public DescribeApisecProtectionGroupsResponseBodyData setTraceStatus(Long traceStatus) {
            this.traceStatus = traceStatus;
            return this;
        }
        public Long getTraceStatus() {
            return this.traceStatus;
        }

    }

}
