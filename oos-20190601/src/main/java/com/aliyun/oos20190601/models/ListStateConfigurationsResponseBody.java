// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListStateConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that was used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASO3cL82+b5iji7bfPNpMh8=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1306108F-610C-40FD-AAD5-DA13E8B00BE9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the desired-state configurations.</p>
     */
    @NameInMap("StateConfigurations")
    public java.util.List<ListStateConfigurationsResponseBodyStateConfigurations> stateConfigurations;

    public static ListStateConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStateConfigurationsResponseBody self = new ListStateConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStateConfigurationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStateConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStateConfigurationsResponseBody setStateConfigurations(java.util.List<ListStateConfigurationsResponseBodyStateConfigurations> stateConfigurations) {
        this.stateConfigurations = stateConfigurations;
        return this;
    }
    public java.util.List<ListStateConfigurationsResponseBodyStateConfigurations> getStateConfigurations() {
        return this.stateConfigurations;
    }

    public static class ListStateConfigurationsResponseBodyStateConfigurations extends TeaModel {
        /**
         * <p>The configuration mode. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ApplyAndAutoCorrect</p>
         */
        @NameInMap("ConfigureMode")
        public String configureMode;

        /**
         * <p>The time when the desired-state configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-22T03:13:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Collect inventory data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;policy&quot;: {&quot;ACS:Network&quot;: {&quot;Collection&quot;: &quot;Enabled&quot;}, &quot;ACS:Application&quot;: {&quot;Collection&quot;: &quot;Enabled&quot;}}}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

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
         * 
         * <strong>example:</strong>
         * <p>sc-a538febe18fabcdef</p>
         */
        @NameInMap("StateConfigurationId")
        public String stateConfigurationId;

        /**
         * <p>The tags added to the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;inventory&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The queried resources.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Filters&quot;: [ { &quot;Type&quot;: &quot;All&quot;, &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Parameters&quot;: { &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Status&quot;: &quot;Running&quot; } } ] }</p>
         */
        @NameInMap("Targets")
        public String targets;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ajshjalscfhjk2214</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-InventoryDataCollection</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the configuration was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-22T03:13:32Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStateConfigurationsResponseBodyStateConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ListStateConfigurationsResponseBodyStateConfigurations self = new ListStateConfigurationsResponseBodyStateConfigurations();
            return TeaModel.build(map, self);
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setConfigureMode(String configureMode) {
            this.configureMode = configureMode;
            return this;
        }
        public String getConfigureMode() {
            return this.configureMode;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListStateConfigurationsResponseBodyStateConfigurations setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
