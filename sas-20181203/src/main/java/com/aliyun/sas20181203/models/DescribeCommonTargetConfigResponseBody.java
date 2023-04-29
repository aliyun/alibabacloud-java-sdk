// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TargetList")
    public java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> targetList;

    public static DescribeCommonTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetConfigResponseBody self = new DescribeCommonTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonTargetConfigResponseBody setTargetList(java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> targetList) {
        this.targetList = targetList;
        return this;
    }
    public java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> getTargetList() {
        return this.targetList;
    }

    public static class DescribeCommonTargetConfigResponseBodyTargetList extends TeaModel {
        @NameInMap("Flag")
        public String flag;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeCommonTargetConfigResponseBodyTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonTargetConfigResponseBodyTargetList self = new DescribeCommonTargetConfigResponseBodyTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
