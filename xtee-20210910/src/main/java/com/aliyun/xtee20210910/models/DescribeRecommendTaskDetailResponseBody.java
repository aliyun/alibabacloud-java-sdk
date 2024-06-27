// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("left")
        public String left;

        @NameInMap("operator")
        public String operator;

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
        @NameInMap("computeExpression")
        public String computeExpression;

        @NameInMap("hitSample")
        public Long hitSample;

        @NameInMap("id")
        public Long id;

        @NameInMap("notHitSample")
        public Long notHitSample;

        @NameInMap("recommendRules")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOsRecommendRules> recommendRules;

        @NameInMap("ruleId")
        public String ruleId;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("status")
        public String status;

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
        @NameInMap("id")
        public Long id;

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
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("expectVelocities")
        public java.util.List<String> expectVelocities;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("normalSize")
        public Long normalSize;

        @NameInMap("recommendRuleDTOs")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendRuleDTOs> recommendRuleDTOs;

        @NameInMap("recommendVariableDTOs")
        public java.util.List<DescribeRecommendTaskDetailResponseBodyResultObjectRecommendVariableDTOs> recommendVariableDTOs;

        @NameInMap("riskSize")
        public Long riskSize;

        @NameInMap("sampleName")
        public String sampleName;

        @NameInMap("sampleScene")
        public String sampleScene;

        @NameInMap("sampleSceneName")
        public String sampleSceneName;

        @NameInMap("taskId")
        public Long taskId;

        @NameInMap("taskName")
        public String taskName;

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
