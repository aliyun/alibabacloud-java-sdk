// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationRequest extends TeaModel {
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
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ECS-InventoryDataCollection</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;policy&quot;: { &quot;ACS:Application&quot;: { &quot;Collection&quot;: &quot;Enabled&quot; }, &quot;ACS:Network&quot;: { &quot;Collection&quot;: &quot;Enabled&quot; } } }</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

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
     * <p>The schedule expression.</p>
     * 
     * <strong>example:</strong>
     * <p>1 hour</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The schedule type.</p>
     * 
     * <strong>example:</strong>
     * <p>rate</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The ID of the desired-state configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-asfgdhj12345</p>
     */
    @NameInMap("StateConfigurationId")
    public String stateConfigurationId;

    /**
     * <p>The tags to be added to the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;sc&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The resources to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Filters&quot;: [ { &quot;Type&quot;: &quot;All&quot;, &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Parameters&quot;: { &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Status&quot;: &quot;Running&quot; } } ] }</p>
     */
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
