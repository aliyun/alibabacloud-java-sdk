// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesResponseBody extends TeaModel {
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

    public static ListAutoScalingActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesResponseBody self = new ListAutoScalingActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingActivitiesResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListAutoScalingActivitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingActivitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
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

        // InProgress/Failed/Rejected/Successful/
        @NameInMap("scalingActivityState")
        public String scalingActivityState;

        // 伸缩活动类型
        @NameInMap("scalingActivityType")
        public String scalingActivityType;

        // 伸缩策略Id
        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        // 伸缩规则id
        @NameInMap("scalingRuleName")
        public String scalingRuleName;

        // 伸缩启动时间
        @NameInMap("startTime")
        public Long startTime;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Items setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Items setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Items setExpectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }
        public Integer getExpectNum() {
            return this.expectNum;
        }

        public Items setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Items setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public Items setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public Items setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public Items setScalingActivityState(String scalingActivityState) {
            this.scalingActivityState = scalingActivityState;
            return this;
        }
        public String getScalingActivityState() {
            return this.scalingActivityState;
        }

        public Items setScalingActivityType(String scalingActivityType) {
            this.scalingActivityType = scalingActivityType;
            return this;
        }
        public String getScalingActivityType() {
            return this.scalingActivityType;
        }

        public Items setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Items setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public Items setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
