// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigureMode")
    public String configureMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("StateConfigurationId")
    public String stateConfigurationId;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Targets")
    public String targets;

    public static UpdateStateConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStateConfigurationRequest self = new UpdateStateConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStateConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStateConfigurationRequest setConfigureMode(String configureMode) {
        this.configureMode = configureMode;
        return this;
    }
    public String getConfigureMode() {
        return this.configureMode;
    }

    public UpdateStateConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStateConfigurationRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpdateStateConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStateConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateStateConfigurationRequest setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public UpdateStateConfigurationRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateStateConfigurationRequest setStateConfigurationId(String stateConfigurationId) {
        this.stateConfigurationId = stateConfigurationId;
        return this;
    }
    public String getStateConfigurationId() {
        return this.stateConfigurationId;
    }

    public UpdateStateConfigurationRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public UpdateStateConfigurationRequest setTargets(String targets) {
        this.targets = targets;
        return this;
    }
    public String getTargets() {
        return this.targets;
    }

}
