// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Parallelism")
    public Long parallelism;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackRequestParameters> parameters;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplacementOption")
    public String replacementOption;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("Tags")
    public java.util.List<UpdateStackRequestTags> tags;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    public static UpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackRequest self = new UpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public UpdateStackRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public UpdateStackRequest setParameters(java.util.List<UpdateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public UpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public UpdateStackRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public UpdateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public UpdateStackRequest setTags(java.util.List<UpdateStackRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateStackRequestTags> getTags() {
        return this.tags;
    }

    public UpdateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateStackRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static class UpdateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestParameters self = new UpdateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateStackRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateStackRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestTags self = new UpdateStackRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateStackRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateStackRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
