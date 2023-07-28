// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListStateConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The desired-state configurations.</p>
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
         * <p>The configuration mode.</p>
         */
        @NameInMap("ConfigureMode")
        public String configureMode;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameters.</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The schedule expression.</p>
         */
        @NameInMap("ScheduleExpression")
        public String scheduleExpression;

        /**
         * <p>The schedule type.</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The ID of the desired-state configuration.</p>
         */
        @NameInMap("StateConfigurationId")
        public String stateConfigurationId;

        /**
         * <p>The tag of the auxiliary media asset.</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The target EMR resource.</p>
         */
        @NameInMap("Targets")
        public String targets;

        /**
         * <p>The ID of the cluster template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The version of the template.</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <p>The time when the configuration is updated.</p>
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
