// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>001BAB34-D70A-54B0-B1D7-91B76DCDD8E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the assets to which the baseline check policy is applied.</p>
     */
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
        /**
         * <p>The number of the assets that belong to the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("BindUuidCount")
        public Integer bindUuidCount;

        /**
         * <p>Indicates whether the baseline check policy is applied to the asset group. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: The baseline check policy is applied to the asset group.</li>
         * <li><strong>del</strong>: the baseline check policy is not applied to the asset group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The ID of the asset group to which the assets belong or the UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>9165712</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The method that is used to add the assets to the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: the ID of the asset group</li>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>groupId</p>
         */
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
