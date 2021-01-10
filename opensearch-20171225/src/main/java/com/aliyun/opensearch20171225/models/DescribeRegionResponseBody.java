// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeRegionResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeRegionResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResponseBody self = new DescribeRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResponseBody setResult(DescribeRegionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeRegionResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionResponseBodyResult extends TeaModel {
        @NameInMap("regionId")
        public String regionId;

        @NameInMap("config")
        public java.util.Map<String, ?> config;

        public static DescribeRegionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionResponseBodyResult self = new DescribeRegionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRegionResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionResponseBodyResult setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

    }

}
