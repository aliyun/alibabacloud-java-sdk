// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\\</p>
     * <p>The token can contain letters, digits, hyphens (-), and underscores (_), and cannot exceed 64 characters in length.\\</p>
     * <p>For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/134212.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The folders in which you want to deploy stacks in service-managed mode.</p>
     */
    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    /**
     * <p>The description of the delete operation.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preference settings of the delete operation.</p>
     * <br>
     * <p>The following parameters are available:</p>
     * <br>
     * <p>-  {"FailureToleranceCount": N}</p>
     * <br>
     * <p>    The number of accounts within which stack operation failures are allowed in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region. If ROS stops the operation in one region, ROS stops the operation in other regions.</p>
     * <br>
     * <p>    Valid values of N: 0 to 20.</p>
     * <br>
     * <p>    If you do not specify FailureToleranceCount, 0 is used as the default value.</p>
     * <br>
     * <p>-  {"FailureTolerancePercentage": N}</p>
     * <br>
     * <p>    The percentage of the number of accounts within which stack operation failures are allowed to the total number of accounts in each region. If the value of this parameter is exceeded, ROS stops the operation in the region.</p>
     * <br>
     * <p>    Valid values of N: 0 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify FailureTolerancePercentage, 0 is used as the default value.</p>
     * <br>
     * <p>-  {"MaxConcurrentCount": N}</p>
     * <br>
     * <p>    The maximum number of accounts within which multiple stacks are deployed at the same time in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 20.</p>
     * <br>
     * <p>    If you do not specify MaxConcurrentCount, 1 is used as the default value.</p>
     * <br>
     * <p>-  {"MaxConcurrentPercentage": N}</p>
     * <br>
     * <p>    The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
     * <br>
     * <p>    Valid values of N: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the number down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify MaxConcurrentPercentage, 1 is used as the default value.</p>
     * <br>
     * <p>-   {"RegionConcurrencyType": N}</p>
     * <br>
     * <p>    The mode that you want to use to deploy stacks across regions. Valid values:</p>
     * <p>    - SEQUENTIAL (default): deploys stacks in the specified regions one by one in sequence. This way, ROS deploys stacks in only one region at a time. </p>
     * <br>
     * <p>     - PARALLEL: deploys stacks in all the specified regions in parallel. </p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>> - You can specify only one of the following parameters: MaxConcurrentCount and MaxConcurrentPercentage.</p>
     * <p>> - You can specify only one of the following parameters: FailureToleranceCount and FailureTolerancePercentage.</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where you want to delete the stacks. You can specify up to 20 region IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>Specifies whether to delete the stacks.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: retains the stacks.</p>
     * <p>*   false: deletes the stacks.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RetainStacks")
    public Boolean retainStacks;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\\</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</p>
     * <br>
     * <p>This parameter is required.</p>
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
