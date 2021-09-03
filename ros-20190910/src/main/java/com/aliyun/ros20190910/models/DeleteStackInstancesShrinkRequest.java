// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackGroupName")
    public String stackGroupName;

    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("RegionIds")
    public String regionIdsShrink;

    @NameInMap("RetainStacks")
    public Boolean retainStacks;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    public static DeleteStackInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesShrinkRequest self = new DeleteStackInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackInstancesShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public DeleteStackInstancesShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public DeleteStackInstancesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public DeleteStackInstancesShrinkRequest setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
        return this;
    }
    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    public DeleteStackInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteStackInstancesShrinkRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public DeleteStackInstancesShrinkRequest setOperationPreferencesShrink(String operationPreferencesShrink) {
        this.operationPreferencesShrink = operationPreferencesShrink;
        return this;
    }
    public String getOperationPreferencesShrink() {
        return this.operationPreferencesShrink;
    }

    public DeleteStackInstancesShrinkRequest setDeploymentTargetsShrink(String deploymentTargetsShrink) {
        this.deploymentTargetsShrink = deploymentTargetsShrink;
        return this;
    }
    public String getDeploymentTargetsShrink() {
        return this.deploymentTargetsShrink;
    }

}
