// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackRequest extends TeaModel {
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<PreviewStackRequestParameters> parameters;

    @NameInMap("Parallelism")
    public Long parallelism;

    public static PreviewStackRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackRequest self = new PreviewStackRequest();
        return TeaModel.build(map, self);
    }

    public PreviewStackRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public PreviewStackRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public PreviewStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public PreviewStackRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public PreviewStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreviewStackRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public PreviewStackRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public PreviewStackRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PreviewStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public PreviewStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PreviewStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public PreviewStackRequest setParameters(java.util.List<PreviewStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<PreviewStackRequestParameters> getParameters() {
        return this.parameters;
    }

    public PreviewStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
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
