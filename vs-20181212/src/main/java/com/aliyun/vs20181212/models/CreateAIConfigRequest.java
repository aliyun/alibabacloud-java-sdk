// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateAIConfigRequest extends TeaModel {
    @NameInMap("CaptureInterval")
    public Integer captureInterval;

    @NameInMap("Configs")
    public String configs;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Features")
    public String features;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    public static CreateAIConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIConfigRequest self = new CreateAIConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIConfigRequest setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    public CreateAIConfigRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public CreateAIConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAIConfigRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateAIConfigRequest setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public CreateAIConfigRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public CreateAIConfigRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateAIConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAIConfigRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateAIConfigRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
