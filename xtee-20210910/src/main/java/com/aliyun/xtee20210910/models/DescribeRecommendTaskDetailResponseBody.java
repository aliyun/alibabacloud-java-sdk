// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskDetailResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result</p>
     */
    @NameInMap("resultObject")
    public DescribeRecommendTaskDetailResponseBodyResultObject resultObject;

    public static DescribeRecommendTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendTaskDetailResponseBody self = new DescribeRecommendTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecommendTaskDetailResponseBody setResultObject(DescribeRecommendTaskDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRecommendTaskDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules extends TeaModel {
        /**
         * <p>Left variable</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("left")
        public String left;

        /**
         * <p>Operator</p>
         * 
         * <strong>example:</strong>
         * <p>equals</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Right variable</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("right")
        public String right;

        public static DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules self = new DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules setRight(String right) {
            this.right = right;
            return this;
        }
        public String getRight() {
            return this.right;
        }

    }

    public static class DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs extends TeaModel {
        /**
         * <p>Calculation path</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2</p>
         */
        @NameInMap("computeExpression")
        public String computeExpression;

        /**
         * <p>Number of hit samples</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("hitSample")
        public Long hitSample;

        /**
         * <p>Primary key ID of the rule</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Number of unhit samples</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("notHitSample")
        public Long notHitSample;

        /**
         * <p>List of candidate rules</p>
         */
        @NameInMap("recommendRules")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules> recommendRules;

        /**
         * <p>Strategy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102224</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>Rule name</p>
         * 
         * <strong>example:</strong>
         * <p>营销风险识别评分_高风险_拒绝_副本</p>
         */
        @NameInMap("ruleName")
        public String ruleName;

        /**
         * <p>Status</p>
         * 
         * <strong>example:</strong>
         * <p>NO_RULE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>List of indicators in JSON string format</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;dxkkLw8fe18&quot;,&quot;value&quot;:&quot;2&quot;}]</p>
         */
        @NameInMap("velocities")
        public String velocities;

        public static DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs self = new DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setComputeExpression(String computeExpression) {
            this.computeExpression = computeExpression;
            return this;
        }
        public String getComputeExpression() {
            return this.computeExpression;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setHitSample(Long hitSample) {
            this.hitSample = hitSample;
            return this;
        }
        public Long getHitSample() {
            return this.hitSample;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setNotHitSample(Long notHitSample) {
            this.notHitSample = notHitSample;
            return this;
        }
        public Long getNotHitSample() {
            return this.notHitSample;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setRecommendRules(java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules> recommendRules) {
            this.recommendRules = recommendRules;
            return this;
        }
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules> getRecommendRules() {
            return this.recommendRules;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs setVelocities(String velocities) {
            this.velocities = velocities;
            return this;
        }
        public String getVelocities() {
            return this.velocities;
        }

    }

    public static class DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs extends TeaModel {
        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>手机号</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs self = new DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeRecommendTaskDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Comparison indicators</p>
         */
        @NameInMap("expectVelocities")
        public java.util.List<String> expectVelocities;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Number of normal samples</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("normalSize")
        public Long normalSize;

        /**
         * <p>Recommended strategy list</p>
         */
        @NameInMap("recommendRuleDTOs")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs> recommendRuleDTOs;

        /**
         * <p>Selected variable list</p>
         */
        @NameInMap("recommendVariableDTOs")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs> recommendVariableDTOs;

        /**
         * <p>Number of risk samples</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("riskSize")
        public Long riskSize;

        /**
         * <p>Sample name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        @NameInMap("sampleName")
        public String sampleName;

        /**
         * <p>Sample scenario</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse_detection</p>
         */
        @NameInMap("sampleScene")
        public String sampleScene;

        /**
         * <p>Sample scenario name</p>
         * 
         * <strong>example:</strong>
         * <p>防虚假账号</p>
         */
        @NameInMap("sampleSceneName")
        public String sampleSceneName;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>887</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>Task name</p>
         * 
         * <strong>example:</strong>
         * <p>策略推荐任务</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static DescribeRecommendTaskDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecommendTaskDetailResponseBodyResultObject self = new DescribeRecommendTaskDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setExpectVelocities(java.util.List<String> expectVelocities) {
            this.expectVelocities = expectVelocities;
            return this;
        }
        public java.util.List<String> getExpectVelocities() {
            return this.expectVelocities;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setNormalSize(Long normalSize) {
            this.normalSize = normalSize;
            return this;
        }
        public Long getNormalSize() {
            return this.normalSize;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setRecommendRuleDTOs(java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs> recommendRuleDTOs) {
            this.recommendRuleDTOs = recommendRuleDTOs;
            return this;
        }
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs> getRecommendRuleDTOs() {
            return this.recommendRuleDTOs;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setRecommendVariableDTOs(java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs> recommendVariableDTOs) {
            this.recommendVariableDTOs = recommendVariableDTOs;
            return this;
        }
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs> getRecommendVariableDTOs() {
            return this.recommendVariableDTOs;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setRiskSize(Long riskSize) {
            this.riskSize = riskSize;
            return this;
        }
        public Long getRiskSize() {
            return this.riskSize;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setSampleScene(String sampleScene) {
            this.sampleScene = sampleScene;
            return this;
        }
        public String getSampleScene() {
            return this.sampleScene;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setSampleSceneName(String sampleSceneName) {
            this.sampleSceneName = sampleSceneName;
            return this;
        }
        public String getSampleSceneName() {
            return this.sampleSceneName;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeRecommendTaskDetailResponseBodyResultObject setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
