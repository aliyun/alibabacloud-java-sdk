// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationRequest extends TeaModel {
    /**
     * <p>The description of the desired-state configuration.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>收集Inventory数据</p>
     */
    @NameInMap("ConfigureMode")
    public String configureMode;

    /**
     * <p>The configuration mode.</p>
     * <br>
     * <p>ApplyOnce: The configuration is applied only once. After a configuration is updated, the new configuration is applied.</p>
     * <br>
     * <p>ApplyAndMonitor: The configuration is applied only once. After the configuration is applied, the system only checks whether the configuration is migrated in the future.</p>
     * <br>
     * <p>ApplyAndAutoCorrect: The configuration is always applied.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of resource group.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the template.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the schedule. Valid value: rate.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description.</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The schedule expression.</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The schedule expression. The interval between two schedules must be a minimum of 30 minutes.</p>
     */
    @NameInMap("Targets")
    public String targets;

    /**
     * <p>The version of the template.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The required resources.</p>
     */
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
