// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result that was returned.</p>
     */
    @NameInMap("result")
    public DescribeRegionResponseBodyResult result;

    public static DescribeRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResponseBody self = new DescribeRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionResponseBody setResult(DescribeRegionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeRegionResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeRegionResponseBodyResult extends TeaModel {
        /**
         * <p>The configurations.</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The ID of the region. Valid values:</p>
         * <br>
         * <p>cn-hangzhou: China (Hangzhou)</p>
         * <br>
         * <p>cn-shanghai: China (Shanghai)</p>
         * <br>
         * <p>cn-qingdao: China (Qingdao)</p>
         * <br>
         * <p>cn-beijing: China (Beijing)</p>
         * <br>
         * <p>cn-zhangjiakou: China (Zhangjiakou)</p>
         * <br>
         * <p>cn-shenzhen: China (Shenzhen)</p>
         * <br>
         * <p>ap-southeast-1: Singapore (Singapore)</p>
         * <br>
         * <p>cn-internal: Internal Center</p>
         * <br>
         * <p>cn-zhangbei-in: Internal Center (Zhangjiakou)</p>
         * <br>
         * <p>us-west-1-in: Internal Center (US)</p>
         * <br>
         * <p>rus-west-1-in: Internal Center (Russia)</p>
         * <br>
         * <p>cn-daily: Daily Environment</p>
         * <br>
         * <p>cn-test: Joint Debugging</p>
         * <br>
         * <p>pre-hangzhou: China (Hangzhou)-Staging</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static DescribeRegionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResponseBodyResult self = new DescribeRegionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResponseBodyResult setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public DescribeRegionResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
