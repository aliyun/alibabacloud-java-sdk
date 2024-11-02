// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeParamTagsResponseBody extends TeaModel {
    /**
     * <p>The configuration of the recommended path.</p>
     */
    @NameInMap("ParamReferredPaths")
    public java.util.List<DescribeNodeParamTagsResponseBodyParamReferredPaths> paramReferredPaths;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BE94351-712A-505D-A40A-BC77CC8254A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodeParamTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeParamTagsResponseBody self = new DescribeNodeParamTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeParamTagsResponseBody setParamReferredPaths(java.util.List<DescribeNodeParamTagsResponseBodyParamReferredPaths> paramReferredPaths) {
        this.paramReferredPaths = paramReferredPaths;
        return this;
    }
    public java.util.List<DescribeNodeParamTagsResponseBodyParamReferredPaths> getParamReferredPaths() {
        return this.paramReferredPaths;
    }

    public DescribeNodeParamTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNodeParamTagsResponseBodyParamReferredPaths extends TeaModel {
        /**
         * <p>The name of the upstream node.</p>
         * 
         * <strong>example:</strong>
         * <p>DataFormat_1</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The paths.</p>
         */
        @NameInMap("ReferredPath")
        public java.util.List<String> referredPath;

        public static DescribeNodeParamTagsResponseBodyParamReferredPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeParamTagsResponseBodyParamReferredPaths self = new DescribeNodeParamTagsResponseBodyParamReferredPaths();
            return TeaModel.build(map, self);
        }

        public DescribeNodeParamTagsResponseBodyParamReferredPaths setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeNodeParamTagsResponseBodyParamReferredPaths setReferredPath(java.util.List<String> referredPath) {
            this.referredPath = referredPath;
            return this;
        }
        public java.util.List<String> getReferredPath() {
            return this.referredPath;
        }

    }

}
