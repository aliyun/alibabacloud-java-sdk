// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackRequest extends TeaModel {
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    @NameInMap("CreateOption")
    public String createOption;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<CreateStackRequestParameters> parameters;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("Tags")
    public java.util.List<CreateStackRequestTags> tags;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Parallelism")
    public Long parallelism;

    public static CreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackRequest self = new CreateStackRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateStackRequest setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateStackRequest setCreateOption(String createOption) {
        this.createOption = createOption;
        return this;
    }
    public String getCreateOption() {
        return this.createOption;
    }

    public CreateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateStackRequest setParameters(java.util.List<CreateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateStackRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateStackRequest setTags(java.util.List<CreateStackRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateStackRequestTags> getTags() {
        return this.tags;
    }

    public CreateStackRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public static class ContinueCreateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static ContinueCreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ContinueCreateStackRequestParameters self = new ContinueCreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public ContinueCreateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public ContinueCreateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

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
