// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // endTime
    @NameInMap("endTime")
    public Long endTime;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // pageNumber
    @NameInMap("pageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Integer pageSize;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // scalingActivityStates
    @NameInMap("scalingActivityStates")
    public java.util.List<String> scalingActivityStates;

    // scalingActivityType
    @NameInMap("scalingActivityType")
    public String scalingActivityType;

    // scalingPolicyId
    @NameInMap("scalingPolicyId")
    public String scalingPolicyId;

    // startTime
    @NameInMap("startTime")
    public Long startTime;

    public static ListAutoScalingActivitiesParam build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesParam self = new ListAutoScalingActivitiesParam();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAutoScalingActivitiesParam setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAutoScalingActivitiesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ListAutoScalingActivitiesParam setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAutoScalingActivitiesParam setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutoScalingActivitiesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ListAutoScalingActivitiesParam setScalingActivityStates(java.util.List<String> scalingActivityStates) {
        this.scalingActivityStates = scalingActivityStates;
        return this;
    }
    public java.util.List<String> getScalingActivityStates() {
        return this.scalingActivityStates;
    }

    public ListAutoScalingActivitiesParam setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ListAutoScalingActivitiesParam setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    public ListAutoScalingActivitiesParam setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
