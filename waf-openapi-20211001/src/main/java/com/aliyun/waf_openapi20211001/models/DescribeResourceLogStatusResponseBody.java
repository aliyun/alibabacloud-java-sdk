// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0DABF8AB-2321-5F8D-A8D7-922D757FBFFE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The log status information of protected objects.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeResourceLogStatusResponseBodyResult> result;

    public static DescribeResourceLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogStatusResponseBody self = new DescribeResourceLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceLogStatusResponseBody setResult(java.util.List<DescribeResourceLogStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeResourceLogStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeResourceLogStatusResponseBodyResultTraceConfig extends TeaModel {
        @NameInMap("RatePerMille")
        public Integer ratePerMille;

        @NameInMap("Workspace")
        public String workspace;

        public static DescribeResourceLogStatusResponseBodyResultTraceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceLogStatusResponseBodyResultTraceConfig self = new DescribeResourceLogStatusResponseBodyResultTraceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeResourceLogStatusResponseBodyResultTraceConfig setRatePerMille(Integer ratePerMille) {
            this.ratePerMille = ratePerMille;
            return this;
        }
        public Integer getRatePerMille() {
            return this.ratePerMille;
        }

        public DescribeResourceLogStatusResponseBodyResultTraceConfig setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class DescribeResourceLogStatusResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-wewbb23dfsetetcic****</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Indicates whether log collection is enabled for the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Log collection is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Log collection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("TraceConfig")
        public DescribeResourceLogStatusResponseBodyResultTraceConfig traceConfig;

        @NameInMap("TraceStatus")
        public Boolean traceStatus;

        public static DescribeResourceLogStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceLogStatusResponseBodyResult self = new DescribeResourceLogStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeResourceLogStatusResponseBodyResult setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeResourceLogStatusResponseBodyResult setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DescribeResourceLogStatusResponseBodyResult setTraceConfig(DescribeResourceLogStatusResponseBodyResultTraceConfig traceConfig) {
            this.traceConfig = traceConfig;
            return this;
        }
        public DescribeResourceLogStatusResponseBodyResultTraceConfig getTraceConfig() {
            return this.traceConfig;
        }

        public DescribeResourceLogStatusResponseBodyResult setTraceStatus(Boolean traceStatus) {
            this.traceStatus = traceStatus;
            return this;
        }
        public Boolean getTraceStatus() {
            return this.traceStatus;
        }

    }

}
