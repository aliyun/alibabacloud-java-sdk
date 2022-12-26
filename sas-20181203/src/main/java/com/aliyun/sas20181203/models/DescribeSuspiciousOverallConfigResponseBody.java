// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigResponseBody extends TeaModel {
    @NameInMap("OverallConfig")
    public DescribeSuspiciousOverallConfigResponseBodyOverallConfig overallConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSuspiciousOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousOverallConfigResponseBody self = new DescribeSuspiciousOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousOverallConfigResponseBody setOverallConfig(DescribeSuspiciousOverallConfigResponseBodyOverallConfig overallConfig) {
        this.overallConfig = overallConfig;
        return this;
    }
    public DescribeSuspiciousOverallConfigResponseBodyOverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    public DescribeSuspiciousOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSuspiciousOverallConfigResponseBodyOverallConfig extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("Type")
        public String type;

        public static DescribeSuspiciousOverallConfigResponseBodyOverallConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspiciousOverallConfigResponseBodyOverallConfig self = new DescribeSuspiciousOverallConfigResponseBodyOverallConfig();
            return TeaModel.build(map, self);
        }

        public DescribeSuspiciousOverallConfigResponseBodyOverallConfig setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeSuspiciousOverallConfigResponseBodyOverallConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
