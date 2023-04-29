// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigResponseBody extends TeaModel {
    @NameInMap("OverallConfig")
    public DescribeCommonOverallConfigResponseBodyOverallConfig overallConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCommonOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigResponseBody self = new DescribeCommonOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigResponseBody setOverallConfig(DescribeCommonOverallConfigResponseBodyOverallConfig overallConfig) {
        this.overallConfig = overallConfig;
        return this;
    }
    public DescribeCommonOverallConfigResponseBodyOverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    public DescribeCommonOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCommonOverallConfigResponseBodyOverallConfig extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Type")
        public String type;

        public static DescribeCommonOverallConfigResponseBodyOverallConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonOverallConfigResponseBodyOverallConfig self = new DescribeCommonOverallConfigResponseBodyOverallConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCommonOverallConfigResponseBodyOverallConfig setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeCommonOverallConfigResponseBodyOverallConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
