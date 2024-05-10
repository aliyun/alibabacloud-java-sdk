// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
     * <br>
     * <p>> You must specify one of the following parameters: `AccountIds` and `DeploymentTargets`.</p>
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
     * <p>The folders in which ROS deploy stacks in service-managed permission model.</p>
     * <br>
     * <p>> You must specify one of the following parameters: `AccountIds` and `DeploymentTargets`.</p>
     */
    @NameInMap("DeploymentTargets")
    public String deploymentTargetsShrink;

    /**
     * <p>Specifies whether to disable rollback when the stack fails to be created.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The description of the stack creation operation.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preference settings of the stack creation operation.</p>
     * <br>
     * <p>The following parameters are available:</p>
     * <br>
     * <p>-  {"FailureToleranceCount": N}</p>
     * <br>
     * <p>    The number of accounts within which stack operation failures are allowed in each region. If the value of this parameter is exceeded in a region, Resource Orchestration Service (ROS) stops the operation in the region. If ROS stops the operation in one region, ROS stops the operation in other regions.</p>
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
     * <p>   The maximum number of accounts within which multiple stacks are deployed at the same time in each region.</p>
     * <br>
     * <p>   Valid values of N: 1 to 20.</p>
     * <br>
     * <p>   If you do not specify MaxConcurrentCount, 1 is used as the default value.</p>
     * <br>
     * <p>-  {"MaxConcurrentPercentage": N}</p>
     * <br>
     * <p>    The percentage of the maximum number of accounts within which multiple stacks are deployed at the same time to the total number of accounts in each region.</p>
     * <br>
     * <p>    Valid values: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the number down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify MaxConcurrentPercentage, 1 is used as the default value.</p>
     * <br>
     * <p>-  {"RegionConcurrencyType": N}\\</p>
     * <p>    The mode that you want to use to deploy stacks across regions. Valid values: </p>
     * <p>   - SEQUENTIAL (default): deploys stacks in each specified region based on the specified sequence of regions. ROS deploys stacks in one region at a time. </p>
     * <p>   - PARALLEL: deploys stacks in parallel across all specified regions.</p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>>-  You can specify only one of the following parameters: MaxConcurrentCount and MaxConcurrentPercentage.</p>
     * <p>>-  You can specify only one of the following parameters: FailureToleranceCount and FailureTolerancePercentage.</p>
     */
    @NameInMap("OperationPreferences")
    public String operationPreferencesShrink;

    /**
     * <p>The parameters that are used to override specific parameters.</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where you want to create the stacks. You can specify up to 20 region IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionIds")
    public String regionIdsShrink;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\\</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The timeout period within which you can create the stack.</p>
     * <br>
     * <p>*   Default value: 60.</p>
     * <p>*   Unit: minutes.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static CreateStackInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesShrinkRequest self = new CreateStackInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public CreateStackInstancesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackInstancesShrinkRequest setDeploymentTargetsShrink(String deploymentTargetsShrink) {
        this.deploymentTargetsShrink = deploymentTargetsShrink;
        return this;
    }
    public String getDeploymentTargetsShrink() {
        return this.deploymentTargetsShrink;
    }

    public CreateStackInstancesShrinkRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
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

    public CreateStackInstancesShrinkRequest setParameterOverrides(java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<CreateStackInstancesShrinkRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public CreateStackInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackInstancesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

    public CreateStackInstancesShrinkRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public CreateStackInstancesShrinkRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateStackInstancesShrinkRequestParameterOverrides extends TeaModel {
        /**
         * <p>The key of parameter N that you want to use to override a specific parameter. If you do not specify this parameter, ROS uses the name that you specified when you created the stack group.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>-   ParameterOverrides is optional.</p>
         * <p>>-   If you specify ParameterOverrides, you must specify ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N that you want to use to override a specific parameter. If you do not specify this parameter, ROS uses the value that you specify when you create the stack group.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>-  ParameterOverrides is optional.</p>
         * <p>>-  If you specify ParameterOverrides, you must specify ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
