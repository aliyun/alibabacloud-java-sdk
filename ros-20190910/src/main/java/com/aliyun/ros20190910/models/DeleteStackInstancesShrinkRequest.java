// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the accounts within the self-managed permission model is used to deploy stacks. You can specify up to 20 account IDs.</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The folders in which the service-managed permission model is used to deploy stacks.</p>
     */
    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    /**
     * <p>The description of the operation that you want to perform to delete the stacks.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The settings that you configure to delete the stacks.</p>
     * <br>
     * <p>The following parameters are included:</p>
     * <br>
     * <p>*   {"FailureToleranceCount": N}</p>
     * <br>
     * <p>    The number of accounts within which stack operation failures can occur in each region. If the value of this parameter is exceeded in a region, Resource Orchestration Service (ROS) stops the operation in the region. If the operation is stopped in one region, the operation is no longer performed in other regions.</p>
     * <br>
     * <p>    Valid values of N: 0 to 20.</p>
     * <br>
     * <p>    If you do not specify the FailureToleranceCount parameter, the default value 0 is used.</p>
     * <br>
     * <p>*   {"FailureTolerancePercentage": N}</p>
     * <br>
     * <p>    The percentage of the number of accounts within which stack operation failures can occur to the total number of accounts in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region.</p>
     * <br>
     * <p>    Valid values of N: 0 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify the FailureTolerancePercentage parameter, the default value 0 is used.</p>
     * <br>
     * <p>*   {"MaxConcurrentCount": N}</p>
     * <br>
     * <p>    The maximum number of accounts within which stacks are deployed at the same time in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 20.</p>
     * <br>
     * <p>    If you do not specify the MaxConcurrentCount parameter, the default value 1 is used.</p>
     * <br>
     * <p>*   {"MaxConcurrentPercentage": N}</p>
     * <br>
     * <p>    The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify the MaxConcurrentPercentage parameter, the default value 1 is used.</p>
     * <br>
     * <p>*   {"RegionConcurrencyType": N}</p>
     * <br>
     * <p>    The mode that you want to use to deploy stacks across regions. Default value: SEQUENTIAL. Valid values:</p>
     * <br>
     * <p>    *   SEQUENTIAL: deploys stacks in each specified region based on the specified sequence of regions. ROS deploys stacks in one region at a time.</p>
     * <p>    *   PARALLEL: deploys stacks in parallel in all specified regions.</p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   You can specify only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.</p>
     * <p>*   You can specify only one of the FailureToleranceCount and FailureTolerancePercentage parameters.</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions from which you want to delete the stacks. You can specify up to 20 region IDs.</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>Specifies whether to retain the stacks.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: retains the stacks.</p>
     * <p>*   false: deletes the stacks.</p>
     */
    @NameInMap("RetainStacks")
    public Boolean retainStacks;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static DeleteStackInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesShrinkRequest self = new DeleteStackInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public DeleteStackInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteStackInstancesShrinkRequest setDeploymentTargetsShrink(String deploymentTargetsShrink) {
        this.deploymentTargetsShrink = deploymentTargetsShrink;
        return this;
    }
    public String getDeploymentTargetsShrink() {
        return this.deploymentTargetsShrink;
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

    public DeleteStackInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DeleteStackInstancesShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
