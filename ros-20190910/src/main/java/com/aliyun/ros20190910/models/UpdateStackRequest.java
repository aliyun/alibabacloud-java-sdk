// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackRequestParameters> parameters;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ReplacementOption")
    public String replacementOption;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackRequest self = new UpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public UpdateStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackRequest setParameters(java.util.List<UpdateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public UpdateStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public UpdateStackRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public UpdateStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public UpdateStackRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public UpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public UpdateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public UpdateStackRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public UpdateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class UpdateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static UpdateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestParameters self = new UpdateStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public UpdateStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

    }

}
