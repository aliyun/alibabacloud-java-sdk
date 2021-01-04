// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("Description")
    public String description;

    @NameInMap("AccountIds")
    public java.util.Map<String, ?> accountIds;

    @NameInMap("RegionIds")
    public java.util.Map<String, ?> regionIds;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackGroupRequestParameters> parameters;

    public static UpdateStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupRequest self = new UpdateStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStackGroupRequest setAccountIds(java.util.Map<String, ?> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.Map<String, ?> getAccountIds() {
        return this.accountIds;
    }

    public UpdateStackGroupRequest setRegionIds(java.util.Map<String, ?> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.Map<String, ?> getRegionIds() {
        return this.regionIds;
    }

    public UpdateStackGroupRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateStackGroupRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackGroupRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackGroupRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public UpdateStackGroupRequest setAdministrationRoleName(String administrationRoleName) {
        this.administrationRoleName = administrationRoleName;
        return this;
    }
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    public UpdateStackGroupRequest setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    public UpdateStackGroupRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStackGroupRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateStackGroupRequest setParameters(java.util.List<UpdateStackGroupRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<UpdateStackGroupRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class UpdateStackGroupRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackGroupRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackGroupRequestParameters self = new UpdateStackGroupRequestParameters();
            return TeaModel.build(map, self);
        }

        public UpdateStackGroupRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackGroupRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
