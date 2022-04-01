// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetAutoScalingActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityResponseBody self = new GetAutoScalingActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoScalingActivityResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetAutoScalingActivityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScalingActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingActivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ScalingActivityResults extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        public static ScalingActivityResults build(java.util.Map<String, ?> map) throws Exception {
            ScalingActivityResults self = new ScalingActivityResults();
            return TeaModel.build(map, self);
        }

        public ScalingActivityResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class Data extends TeaModel {
        // 集群Id
        @NameInMap("clusterId")
        public String clusterId;

        // 本次伸缩活动描述 如果状态为 FAILED 则为失败原因
        @NameInMap("description")
        public String description;

        // 伸缩结束时间
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("expectNum")
        public Integer expectNum;

        // 节点组Id
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // 节点组Id
        @NameInMap("nodeGroupName")
        public String nodeGroupName;

        // 异步操作时的操作Id
        @NameInMap("operationId")
        public String operationId;

        // 伸缩活动id
        @NameInMap("scalingActivityId")
        public String scalingActivityId;

        @NameInMap("scalingActivityResults")
        public java.util.List<ScalingActivityResults> scalingActivityResults;

        // InProgress/Failed/Rejected/Successful/
        @NameInMap("scalingActivityState")
        public String scalingActivityState;

        // 伸缩活动类型
        @NameInMap("scalingActivityType")
        public String scalingActivityType;

        // 伸缩策略Id
        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        @NameInMap("scalingRuleDetail")
        public ScalingRule scalingRuleDetail;

        // 伸缩规则id
        @NameInMap("scalingRuleName")
        public String scalingRuleName;

        // 伸缩启动时间
        @NameInMap("startTime")
        public Long startTime;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Data setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Data setExpectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Integer getExpectNum() {
            return this.expectNum;
        }

        public Data setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Data setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public Data setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public Data setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public Data setScalingActivityResults(java.util.List<ScalingActivityResults> scalingActivityResults) {
            this.scalingActivityResults = scalingActivityResults;
            return this;
        }
        public java.util.List<ScalingActivityResults> getScalingActivityResults() {
            return this.scalingActivityResults;
        }

        public Data setScalingActivityState(String scalingActivityState) {
            this.scalingActivityState = scalingActivityState;
            return this;
        }
        public String getScalingActivityState() {
            return this.scalingActivityState;
        }

        public Data setScalingActivityType(String scalingActivityType) {
            this.scalingActivityType = scalingActivityType;
            return this;
        }
        public String getScalingActivityType() {
            return this.scalingActivityType;
        }

        public Data setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Data setScalingRuleDetail(ScalingRule scalingRuleDetail) {
            this.scalingRuleDetail = scalingRuleDetail;
            return this;
        }
        public ScalingRule getScalingRuleDetail() {
            return this.scalingRuleDetail;
        }

        public Data setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public Data setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
