// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("Parallelism")
    public Long parallelism;

    @NameInMap("Parameters")
    public java.util.List<PreviewStackShrinkRequestParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceConfigRules")
    public String resourceConfigRulesShrink;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

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

    public static PreviewStackShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackShrinkRequest self = new PreviewStackShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PreviewStackShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreviewStackShrinkRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public PreviewStackShrinkRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public PreviewStackShrinkRequest setParameters(java.util.List<PreviewStackShrinkRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<PreviewStackShrinkRequestParameters> getParameters() {
        return this.parameters;
    }

    public PreviewStackShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreviewStackShrinkRequest setResourceConfigRulesShrink(String resourceConfigRulesShrink) {
        this.resourceConfigRulesShrink = resourceConfigRulesShrink;
        return this;
    }
    public String getResourceConfigRulesShrink() {
        return this.resourceConfigRulesShrink;
    }

    public PreviewStackShrinkRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public PreviewStackShrinkRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public PreviewStackShrinkRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public PreviewStackShrinkRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public PreviewStackShrinkRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public PreviewStackShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PreviewStackShrinkRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public PreviewStackShrinkRequest setTemplateScratchRegionId(String templateScratchRegionId) {
        this.templateScratchRegionId = templateScratchRegionId;
        return this;
    }
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
    }

    public PreviewStackShrinkRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public PreviewStackShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public PreviewStackShrinkRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class PreviewStackShrinkRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static PreviewStackShrinkRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackShrinkRequestParameters self = new PreviewStackShrinkRequestParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackShrinkRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackShrinkRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
