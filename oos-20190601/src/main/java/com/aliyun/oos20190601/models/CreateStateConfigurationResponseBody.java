// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1306108F-610C-40FD-AAD5-DA13E8B00BE9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the desired-state configuration.</p>
     */
    @NameInMap("StateConfiguration")
    public CreateStateConfigurationResponseBodyStateConfiguration stateConfiguration;

    public static CreateStateConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStateConfigurationResponseBody self = new CreateStateConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStateConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStateConfigurationResponseBody setStateConfiguration(CreateStateConfigurationResponseBodyStateConfiguration stateConfiguration) {
        this.stateConfiguration = stateConfiguration;
        return this;
    }
    public CreateStateConfigurationResponseBodyStateConfiguration getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static class CreateStateConfigurationResponseBodyStateConfiguration extends TeaModel {
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
         * <p>collect inventory data</p>
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
        public java.util.Map<String, ?> parameters;

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
         * <p>{     &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;,     &quot;Filters&quot;: [       {         &quot;Type&quot;: &quot;All&quot;,         &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,         &quot;Parameters&quot;: {           &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,           &quot;Status&quot;: &quot;Running&quot;         }       }     ]   }</p>
         */
        @NameInMap("Targets")
        public String targets;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-1234asadf</p>
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
         * <p>The name of the template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        public static CreateStateConfigurationResponseBodyStateConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateStateConfigurationResponseBodyStateConfiguration self = new CreateStateConfigurationResponseBodyStateConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setConfigureMode(String configureMode) {
            this.configureMode = configureMode;
            return this;
        }
        public String getConfigureMode() {
            return this.configureMode;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

    }

}
