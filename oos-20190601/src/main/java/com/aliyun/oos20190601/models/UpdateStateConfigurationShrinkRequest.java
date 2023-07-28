// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationShrinkRequest extends TeaModel {
    /**
     * <p>The schedule type.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the desired-state configuration.</p>
     */
    @NameInMap("ConfigureMode")
    public String configureMode;

    /**
     * <p>The schedule expression.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The configuration mode.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the template.</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The ID of the desired-state configuration.</p>
     */
    @NameInMap("StateConfigurationId")
    public String stateConfigurationId;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The required resources.</p>
     */
    @NameInMap("Targets")
    public String targets;

    public static UpdateStateConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStateConfigurationShrinkRequest self = new UpdateStateConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStateConfigurationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStateConfigurationShrinkRequest setConfigureMode(String configureMode) {
        this.configureMode = configureMode;
        return this;
    }
    public String getConfigureMode() {
        return this.configureMode;
    }

    public UpdateStateConfigurationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStateConfigurationShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpdateStateConfigurationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStateConfigurationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateStateConfigurationShrinkRequest setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public UpdateStateConfigurationShrinkRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateStateConfigurationShrinkRequest setStateConfigurationId(String stateConfigurationId) {
        this.stateConfigurationId = stateConfigurationId;
        return this;
    }
    public String getStateConfigurationId() {
        return this.stateConfigurationId;
    }

    public UpdateStateConfigurationShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateStateConfigurationShrinkRequest setTargets(String targets) {
        this.targets = targets;
        return this;
    }
    public String getTargets() {
        return this.targets;
    }

}
