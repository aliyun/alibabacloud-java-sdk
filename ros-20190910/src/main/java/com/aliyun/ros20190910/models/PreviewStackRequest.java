// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("Parallelism")
    public Long parallelism;

    @NameInMap("Parameters")
    public java.util.List<PreviewStackRequestParameters> parameters;

    @NameInMap("RegionId")
    public String regionId;

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

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static PreviewStackRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackRequest self = new PreviewStackRequest();
        return TeaModel.build(map, self);
    }

    public PreviewStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreviewStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public PreviewStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public PreviewStackRequest setParameters(java.util.List<PreviewStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<PreviewStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public PreviewStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreviewStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public PreviewStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public PreviewStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public PreviewStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public PreviewStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PreviewStackRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public PreviewStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public PreviewStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public PreviewStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class PreviewStackRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static PreviewStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackRequestParameters self = new PreviewStackRequestParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
