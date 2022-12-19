// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the assets to which the baseline check policy is applied.
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
        // The number of the assets that belong to the asset group.
        @NameInMap("BindUuidCount")
        public Integer bindUuidCount;

        // Indicates whether the baseline check policy is applied to the asset group. Valid values:
        // 
        // *   **add**: yes
        // *   **del**: no
        @NameInMap("Flag")
        public String flag;

        // The ID of the asset group to which the assets belong or the UUID of the asset.
        @NameInMap("Target")
        public String target;

        // The method that is used to add the assets to the baseline check policy. Valid values:
        // 
        // *   **groupId**: the ID of the asset group
        // *   **uuid**: the UUID of the asset
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
