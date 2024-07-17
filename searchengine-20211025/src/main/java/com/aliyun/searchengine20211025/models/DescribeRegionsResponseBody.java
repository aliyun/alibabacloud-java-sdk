// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result.</p>
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
         * <p>The endpoint of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The ID of the region. Valid values:</p>
         * <p>cn-hangzhou: China (Hangzhou)</p>
         * <p>cn-shanghai: China (Shanghai)</p>
         * <p>cn-qingdao: China (Qingdao)</p>
         * <p>cn-beijing: China (Beijing)</p>
         * <p>cn-zhangjiakou: China (Zhangjiakou)</p>
         * <p>cn-shenzhen: China (Shenzhen)</p>
         * <p>ap-southeast-1: Singapore (Singapore)</p>
         * <p>cn-internal: Internal Center</p>
         * <p>cn-zhangbei-in: Internal Center (Zhangjiakou)</p>
         * <p>us-west-1-in: Internal Center (US)</p>
         * <p>rus-west-1-in: Internal Center (Russia)</p>
         * <p>cn-daily: Daily Environment</p>
         * <p>cn-test: Joint Debugging</p>
         * <p>pre-hangzhou: China (Hangzhou)-Staging</p>
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
