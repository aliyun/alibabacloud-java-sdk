// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B7E42BD-1D63-2F6B-C8E0-41BACEA76EEB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     */
    @NameInMap("result")
    public java.util.List<DescribeRegionsResponseBodyResult> result;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setResult(java.util.List<DescribeRegionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeRegionsResponseBodyResult extends TeaModel {
        /**
         * <p>The console URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://opensearch-cn-hangzhou.console.aliyun.com">https://opensearch-cn-hangzhou.console.aliyun.com</a></p>
         */
        @NameInMap("consoleUrl")
        public String consoleUrl;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>opensearch.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static DescribeRegionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyResult self = new DescribeRegionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyResult setConsoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        public DescribeRegionsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeRegionsResponseBodyResult setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
