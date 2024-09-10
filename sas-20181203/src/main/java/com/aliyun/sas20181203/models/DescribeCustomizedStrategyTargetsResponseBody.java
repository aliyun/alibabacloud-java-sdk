// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedStrategyTargetsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the servers to which custom policies are applied.</p>
     */
    @NameInMap("StartegyTargets")
    public java.util.List<DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets> startegyTargets;

    public static DescribeCustomizedStrategyTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedStrategyTargetsResponseBody self = new DescribeCustomizedStrategyTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedStrategyTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizedStrategyTargetsResponseBody setStartegyTargets(java.util.List<DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets> startegyTargets) {
        this.startegyTargets = startegyTargets;
        return this;
    }
    public java.util.List<DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets> getStartegyTargets() {
        return this.startegyTargets;
    }

    public static class DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets extends TeaModel {
        /**
         * <p>The ID of the server group.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>14590457</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1884</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>win</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2701ad2e-0e8f-428c-8812-ebb2686e****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets self = new DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeCustomizedStrategyTargetsResponseBodyStartegyTargets setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
