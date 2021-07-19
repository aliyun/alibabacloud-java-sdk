// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateStateConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Targets")
        public String targets;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        @NameInMap("StateConfigurationId")
        public String stateConfigurationId;

        @NameInMap("ScheduleExpression")
        public String scheduleExpression;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("ConfigureMode")
        public String configureMode;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("Parameters")
        public java.util.Map<String, ?> parameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("TemplateId")
        public String templateId;

        public static CreateStateConfigurationResponseBodyStateConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateStateConfigurationResponseBodyStateConfiguration self = new CreateStateConfigurationResponseBodyStateConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
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

        public CreateStateConfigurationResponseBodyStateConfiguration setConfigureMode(String configureMode) {
            this.configureMode = configureMode;
            return this;
        }
        public String getConfigureMode() {
            return this.configureMode;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateStateConfigurationResponseBodyStateConfiguration setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
