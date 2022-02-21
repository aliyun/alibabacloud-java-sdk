// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIEventListRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Feature")
    public String feature;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Triggered")
    public Boolean triggered;

    public static DescribeAIEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIEventListRequest self = new DescribeAIEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIEventListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAIEventListRequest setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

    public DescribeAIEventListRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeAIEventListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeAIEventListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAIEventListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeAIEventListRequest setTriggered(Boolean triggered) {
        this.triggered = triggered;
        return this;
    }
    public Boolean getTriggered() {
        return this.triggered;
    }

}
