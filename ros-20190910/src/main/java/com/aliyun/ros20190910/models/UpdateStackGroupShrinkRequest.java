// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("Description")
    public String description;

    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupShrinkRequestParameters> parameters;

    public static UpdateStackGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupShrinkRequest self = new UpdateStackGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackGroupShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackGroupShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public UpdateStackGroupShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public UpdateStackGroupShrinkRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackGroupShrinkRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackGroupShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackGroupShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public UpdateStackGroupShrinkRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public UpdateStackGroupShrinkRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public UpdateStackGroupShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackGroupShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateStackGroupShrinkRequest setParameters(java.util.List<UpdateStackGroupShrinkRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackGroupShrinkRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class UpdateStackGroupShrinkRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackGroupShrinkRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupShrinkRequestParameters self = new UpdateStackGroupShrinkRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupShrinkRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackGroupShrinkRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
