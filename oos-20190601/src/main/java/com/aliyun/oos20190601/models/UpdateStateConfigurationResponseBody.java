// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateStateConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StateConfiguration")
    public java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> stateConfiguration;

    public static UpdateStateConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStateConfigurationResponseBody self = new UpdateStateConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStateConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStateConfigurationResponseBody setStateConfiguration(java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> stateConfiguration) {
        this.stateConfiguration = stateConfiguration;
        return this;
    }
    public java.util.List<UpdateStateConfigurationResponseBodyStateConfiguration> getStateConfiguration() {
        return this.stateConfiguration;
    }

    public static class UpdateStateConfigurationResponseBodyStateConfiguration extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

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
        public String parameters;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("TemplateId")
        public String templateId;

        public static UpdateStateConfigurationResponseBodyStateConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateStateConfigurationResponseBodyStateConfiguration self = new UpdateStateConfigurationResponseBodyStateConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTargets(String targets) {
            this.targets = targets;
            return this;
        }
        public String getTargets() {
            return this.targets;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setStateConfigurationId(String stateConfigurationId) {
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setConfigureMode(String configureMode) {
            this.configureMode = configureMode;
            return this;
        }
        public String getConfigureMode() {
            return this.configureMode;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateStateConfigurationResponseBodyStateConfiguration setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
