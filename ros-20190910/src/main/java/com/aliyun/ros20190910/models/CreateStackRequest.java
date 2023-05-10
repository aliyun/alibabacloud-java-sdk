// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreateOption")
    public String createOption;

    /**
     * <p>创建选项列表。</p>
     */
    @NameInMap("CreateOptions")
    public java.util.List<String> createOptions;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("Parallelism")
    public Long parallelism;

    @NameInMap("Parameters")
    public java.util.List<CreateStackRequestParameters> parameters;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("Tags")
    public java.util.List<CreateStackRequestTags> tags;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    @NameInMap("TemplateScratchRegionId")
    public String templateScratchRegionId;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static CreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackRequest self = new CreateStackRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackRequest setCreateOption(String createOption) {
        this.createOption = createOption;
        return this;
    }
    public String getCreateOption() {
        return this.createOption;
    }

    public CreateStackRequest setCreateOptions(java.util.List<String> createOptions) {
        this.createOptions = createOptions;
        return this;
    }
    public java.util.List<String> getCreateOptions() {
        return this.createOptions;
    }

    public CreateStackRequest setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateStackRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public CreateStackRequest setParameters(java.util.List<CreateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateStackRequest setTags(java.util.List<CreateStackRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateStackRequestTags> getTags() {
        return this.tags;
    }

    public CreateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateStackRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public CreateStackRequest setTemplateScratchRegionId(String templateScratchRegionId) {
        this.templateScratchRegionId = templateScratchRegionId;
        return this;
    }
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    public CreateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateStackRequestParameters self = new CreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateStackRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateStackRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateStackRequestTags self = new CreateStackRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateStackRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateStackRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
