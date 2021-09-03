// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public java.util.Map<String, ?> accountIds;

    @NameInMap("RegionIds")
    public java.util.Map<String, ?> regionIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("ParameterOverrides")
    public java.util.List<UpdateStackInstancesRequestParameterOverrides> parameterOverrides;

    @NameInMap("DeploymentTargets")
    public java.util.Map<String, ?> deploymentTargets;

    public static UpdateStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesRequest self = new UpdateStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackInstancesRequest setAccountIds(java.util.Map<String, ?> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.Map<String, ?> getAccountIds() {
        return this.accountIds;
    }

    public UpdateStackInstancesRequest setRegionIds(java.util.Map<String, ?> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.Map<String, ?> getRegionIds() {
        return this.regionIds;
    }

    public UpdateStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackInstancesRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public UpdateStackInstancesRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public UpdateStackInstancesRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateStackInstancesRequest setParameterOverrides(java.util.List<UpdateStackInstancesRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<UpdateStackInstancesRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public UpdateStackInstancesRequest setDeploymentTargets(java.util.Map<String, ?> deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public java.util.Map<String, ?> getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public static class UpdateStackInstancesRequestParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateStackInstancesRequestParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackInstancesRequestParameterOverrides self = new UpdateStackInstancesRequestParameterOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateStackInstancesRequestParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateStackInstancesRequestParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
