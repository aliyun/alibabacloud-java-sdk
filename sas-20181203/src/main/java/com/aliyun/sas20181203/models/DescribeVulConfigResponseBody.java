// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetConfigs")
    public java.util.List<DescribeVulConfigResponseBodyTargetConfigs> targetConfigs;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulConfigResponseBody self = new DescribeVulConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulConfigResponseBody setTargetConfigs(java.util.List<DescribeVulConfigResponseBodyTargetConfigs> targetConfigs) {
        this.targetConfigs = targetConfigs;
        return this;
    }
    public java.util.List<DescribeVulConfigResponseBodyTargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    public DescribeVulConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulConfigResponseBodyTargetConfigs extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("OverAllConfig")
        public String overAllConfig;

        @NameInMap("Type")
        public String type;

        public static DescribeVulConfigResponseBodyTargetConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulConfigResponseBodyTargetConfigs self = new DescribeVulConfigResponseBodyTargetConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVulConfigResponseBodyTargetConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeVulConfigResponseBodyTargetConfigs setOverAllConfig(String overAllConfig) {
            this.overAllConfig = overAllConfig;
            return this;
        }
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        public DescribeVulConfigResponseBodyTargetConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
