// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetConfigs")
    public java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> targetConfigs;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetConfigResponseBody self = new DescribeVulTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulTargetConfigResponseBody setTargetConfigs(java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> targetConfigs) {
        this.targetConfigs = targetConfigs;
        return this;
    }
    public java.util.List<DescribeVulTargetConfigResponseBodyTargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    public DescribeVulTargetConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulTargetConfigResponseBodyTargetConfigs extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("OverAllConfig")
        public String overAllConfig;

        @NameInMap("Type")
        public String type;

        public static DescribeVulTargetConfigResponseBodyTargetConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulTargetConfigResponseBodyTargetConfigs self = new DescribeVulTargetConfigResponseBodyTargetConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setOverAllConfig(String overAllConfig) {
            this.overAllConfig = overAllConfig;
            return this;
        }
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        public DescribeVulTargetConfigResponseBodyTargetConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
