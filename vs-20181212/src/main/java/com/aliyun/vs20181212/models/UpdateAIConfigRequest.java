// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateAIConfigRequest extends TeaModel {
    @NameInMap("CaptureInterval")
    public Integer captureInterval;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("Configs")
    public String configs;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Features")
    public String features;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    public static UpdateAIConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIConfigRequest self = new UpdateAIConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAIConfigRequest setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }
    public Integer getCaptureInterval() {
        return this.captureInterval;
    }

    public UpdateAIConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateAIConfigRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public UpdateAIConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAIConfigRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateAIConfigRequest setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public UpdateAIConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAIConfigRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateAIConfigRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
