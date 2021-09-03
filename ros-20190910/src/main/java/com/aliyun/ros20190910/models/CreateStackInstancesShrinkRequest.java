// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> parameterOverrides;

    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    public static CreateStackInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesShrinkRequest self = new CreateStackInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackInstancesShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public CreateStackInstancesShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public CreateStackInstancesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public CreateStackInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackInstancesShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public CreateStackInstancesShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public CreateStackInstancesShrinkRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateStackInstancesShrinkRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateStackInstancesShrinkRequest setParameterOverrides(java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public CreateStackInstancesShrinkRequest setDeploymentTargetsShrink(String deploymentTargetsShrink) {
        this.deploymentTargetsShrink = deploymentTargetsShrink;
        return this;
    }
    public String getDeploymentTargetsShrink() {
        return this.deploymentTargetsShrink;
    }

    public static class CreateStackInstancesShrinkRequestParameterOverrides extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateStackInstancesShrinkRequestParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateStackInstancesShrinkRequestParameterOverrides self = new CreateStackInstancesShrinkRequestParameterOverrides();
            return TeaModel.build(map, self);
        }

        public CreateStackInstancesShrinkRequestParameterOverrides setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateStackInstancesShrinkRequestParameterOverrides setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
