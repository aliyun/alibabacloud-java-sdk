// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigureMode")
    public String configureMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Targets")
    public String targets;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static CreateStateConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStateConfigurationRequest self = new CreateStateConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateStateConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStateConfigurationRequest setConfigureMode(String configureMode) {
        this.configureMode = configureMode;
        return this;
    }
    public String getConfigureMode() {
        return this.configureMode;
    }

    public CreateStateConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStateConfigurationRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateStateConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStateConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStateConfigurationRequest setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public CreateStateConfigurationRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateStateConfigurationRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateStateConfigurationRequest setTargets(String targets) {
        this.targets = targets;
        return this;
    }
    public String getTargets() {
        return this.targets;
    }

    public CreateStateConfigurationRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateStateConfigurationRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
