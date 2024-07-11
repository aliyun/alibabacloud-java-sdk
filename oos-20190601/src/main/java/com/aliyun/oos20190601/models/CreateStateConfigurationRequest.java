// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DASKJJLKADS-AHKLJHJSAKL-AJK</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration mode. Valid values: ApplyOnce: The configuration is applied only once. After a configuration is updated, the new configuration is applied. ApplyAndMonitor: The configuration is applied only once. After the configuration is applied, the system only checks whether the configuration is migrated in the future. ApplyAndAutoCorrect: The configuration is always applied.</p>
     * 
     * <strong>example:</strong>
     * <p>ApplyOnce</p>
     */
    @NameInMap("ConfigureMode")
    public String configureMode;

    /**
     * <p>The description of the desired-state configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>The region ID.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;policy&quot;: {       &quot;ACS:Application&quot;: {         &quot;Collection&quot;: &quot;Enabled&quot;       },       &quot;ACS:Network&quot;: {         &quot;Collection&quot;: &quot;Enabled&quot;       }     }   }</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The schedule expression. The interval between two schedules must be a minimum of 30 minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The schedule type. Set the value to rate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rate</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The tags to be added to the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;inventory&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The resources to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;,     &quot;Filters&quot;: [       {         &quot;Type&quot;: &quot;All&quot;,         &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,         &quot;Parameters&quot;: {           &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,           &quot;Status&quot;: &quot;Running&quot;         }       }     ]   }</p>
     */
    @NameInMap("Targets")
    public String targets;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ECS-InventoryDataCollection</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version number of the template. If you do not specify this parameter, the latest version of the template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
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
