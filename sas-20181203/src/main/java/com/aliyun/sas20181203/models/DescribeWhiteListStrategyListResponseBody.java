// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListStrategyListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the policies.</p>
     */
    @NameInMap("Strategies")
    public java.util.List<DescribeWhiteListStrategyListResponseBodyStrategies> strategies;

    public static DescribeWhiteListStrategyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListStrategyListResponseBody self = new DescribeWhiteListStrategyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListStrategyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListStrategyListResponseBody setStrategies(java.util.List<DescribeWhiteListStrategyListResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<DescribeWhiteListStrategyListResponseBodyStrategies> getStrategies() {
        return this.strategies;
    }

    public static class DescribeWhiteListStrategyListResponseBodyStrategies extends TeaModel {
        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: learning</li>
         * <li><strong>2</strong>: paused</li>
         * <li><strong>3</strong>: learning completed</li>
         * <li><strong>4</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>8795555</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The intelligent learning duration. Unit: hour.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("StudyTime")
        public Integer studyTime;

        public static DescribeWhiteListStrategyListResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteListStrategyListResponseBodyStrategies self = new DescribeWhiteListStrategyListResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteListStrategyListResponseBodyStrategies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeWhiteListStrategyListResponseBodyStrategies setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeWhiteListStrategyListResponseBodyStrategies setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeWhiteListStrategyListResponseBodyStrategies setStudyTime(Integer studyTime) {
            this.studyTime = studyTime;
            return this;
        }
        public Integer getStudyTime() {
            return this.studyTime;
        }

    }

}
