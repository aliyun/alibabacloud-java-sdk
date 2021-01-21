// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("RecreatingResources")
    public java.util.List<String> recreatingResources;

    @NameInMap("Parameters")
    public java.util.List<ContinueCreateStackRequestParameters> parameters;

    public static ContinueCreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackRequest self = new ContinueCreateStackRequest();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ContinueCreateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ContinueCreateStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ContinueCreateStackRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ContinueCreateStackRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public ContinueCreateStackRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public ContinueCreateStackRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ContinueCreateStackRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ContinueCreateStackRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public ContinueCreateStackRequest setRecreatingResources(java.util.List<String> recreatingResources) {
        this.recreatingResources = recreatingResources;
        return this;
    }
    public java.util.List<String> getRecreatingResources() {
        return this.recreatingResources;
    }

    public ContinueCreateStackRequest setParameters(java.util.List<ContinueCreateStackRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ContinueCreateStackRequestParameters> getParameters() {
        return this.parameters;
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

}
