// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyTargets")
    public java.util.List<DescribeStrategyTargetResponseBodyStrategyTargets> strategyTargets;

    public static DescribeStrategyTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyTargetResponseBody self = new DescribeStrategyTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyTargetResponseBody setStrategyTargets(java.util.List<DescribeStrategyTargetResponseBodyStrategyTargets> strategyTargets) {
        this.strategyTargets = strategyTargets;
        return this;
    }
    public java.util.List<DescribeStrategyTargetResponseBodyStrategyTargets> getStrategyTargets() {
        return this.strategyTargets;
    }

    public static class DescribeStrategyTargetResponseBodyStrategyTargets extends TeaModel {
        @NameInMap("BindUuidCount")
        public Integer bindUuidCount;

        @NameInMap("Flag")
        public String flag;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeStrategyTargetResponseBodyStrategyTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyTargetResponseBodyStrategyTargets self = new DescribeStrategyTargetResponseBodyStrategyTargets();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyTargetResponseBodyStrategyTargets setBindUuidCount(Integer bindUuidCount) {
            this.bindUuidCount = bindUuidCount;
            return this;
        }
        public Integer getBindUuidCount() {
            return this.bindUuidCount;
        }

        public DescribeStrategyTargetResponseBodyStrategyTargets setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeStrategyTargetResponseBodyStrategyTargets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeStrategyTargetResponseBodyStrategyTargets setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
