// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Targets")
    public java.util.List<DescribeTargetResponseBodyTargets> targets;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTargetResponseBody self = new DescribeTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTargetResponseBody setTargets(java.util.List<DescribeTargetResponseBodyTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<DescribeTargetResponseBodyTargets> getTargets() {
        return this.targets;
    }

    public DescribeTargetResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTargetResponseBodyTargets extends TeaModel {
        @NameInMap("Flag")
        public String flag;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeTargetResponseBodyTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeTargetResponseBodyTargets self = new DescribeTargetResponseBodyTargets();
            return TeaModel.build(map, self);
        }

        public DescribeTargetResponseBodyTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeTargetResponseBodyTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeTargetResponseBodyTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
