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
     * <p>The returned result.</p>
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

    public static class DescribeResourceLogStatusResponseBodyResult extends TeaModel {
        /**
         * <p>The protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-wewbb23dfsetetcic****</p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>Indicates whether the log collection feature is enabled for the protected object. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> The log collection feature is enabled.</li>
         * <li><strong>false:</strong> The log collection feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

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

    }

}
