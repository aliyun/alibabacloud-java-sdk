// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetConfig")
    public DescribeCommonTargetResultListResponseBodyTargetConfig targetConfig;

    public static DescribeCommonTargetResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetResultListResponseBody self = new DescribeCommonTargetResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonTargetResultListResponseBody setTargetConfig(DescribeCommonTargetResultListResponseBodyTargetConfig targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }
    public DescribeCommonTargetResultListResponseBodyTargetConfig getTargetConfig() {
        return this.targetConfig;
    }

    public static class DescribeCommonTargetResultListResponseBodyTargetConfig extends TeaModel {
        @NameInMap("Flag")
        public String flag;

        @NameInMap("TargetDefault")
        public String targetDefault;

        @NameInMap("TargetList")
        public java.util.List<String> targetList;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TotalCount")
        public String totalCount;

        @NameInMap("Type")
        public String type;

        public static DescribeCommonTargetResultListResponseBodyTargetConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonTargetResultListResponseBodyTargetConfig self = new DescribeCommonTargetResultListResponseBodyTargetConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetDefault(String targetDefault) {
            this.targetDefault = targetDefault;
            return this;
        }
        public String getTargetDefault() {
            return this.targetDefault;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetList(java.util.List<String> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<String> getTargetList() {
            return this.targetList;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public DescribeCommonTargetResultListResponseBodyTargetConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
