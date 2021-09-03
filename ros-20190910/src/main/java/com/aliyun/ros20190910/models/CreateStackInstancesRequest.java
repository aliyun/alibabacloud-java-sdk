// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides;

    @NameInMap("DeploymentTargets")
    public CreateStackInstancesRequestDeploymentTargets deploymentTargets;

    public static CreateStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesRequest self = new CreateStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public CreateStackInstancesRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public CreateStackInstancesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public CreateStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackInstancesRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public CreateStackInstancesRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public CreateStackInstancesRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateStackInstancesRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateStackInstancesRequest setParameterOverrides(java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<CreateStackInstancesRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public CreateStackInstancesRequest setDeploymentTargets(CreateStackInstancesRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public CreateStackInstancesRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public static class CreateStackInstancesRequestParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateStackInstancesRequestParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateStackInstancesRequestParameterOverrides self = new CreateStackInstancesRequestParameterOverrides();
            return TeaModel.build(map, self);
        }

        public CreateStackInstancesRequestParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateStackInstancesRequestParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateStackInstancesRequestDeploymentTargets extends TeaModel {
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static CreateStackInstancesRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateStackInstancesRequestDeploymentTargets self = new CreateStackInstancesRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public CreateStackInstancesRequestDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

}
