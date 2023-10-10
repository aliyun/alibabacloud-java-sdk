// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
     * <br>
     * <p>> You must specify one of the following parameters: `AccountIds` and `DeploymentTargets`.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\</p>
     * <p>The token can contain letters, digits, hyphens (-), and underscores (\_), and cannot exceed 64 characters in length.\</p>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The folders in which ROS deploy stacks in service-managed permission model.</p>
     * <br>
     * <p>> You must specify one of the following parameters: `AccountIds` and `DeploymentTargets`.</p>
     */
    @NameInMap("DeploymentTargets")
    public CreateStackInstancesRequestDeploymentTargets deploymentTargets;

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
     * <p>-  {"RegionConcurrencyType": N}\</p>
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
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The parameters that are used to override specific parameters.</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where you want to create the stacks. You can specify up to 20 region IDs.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or a letter.</p>
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

    public static CreateStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesRequest self = new CreateStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public CreateStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStackInstancesRequest setDeploymentTargets(CreateStackInstancesRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public CreateStackInstancesRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public CreateStackInstancesRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
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

    public CreateStackInstancesRequest setParameterOverrides(java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<CreateStackInstancesRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public CreateStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStackInstancesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public CreateStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public CreateStackInstancesRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class CreateStackInstancesRequestDeploymentTargets extends TeaModel {
        /**
         * <p>The folder IDs of the resource directory. You can add up to five folder IDs.</p>
         * <br>
         * <p>You can create stacks within all the member accounts in the specified folders. If you create stacks in the Root folder, the stacks are created within all member accounts in the resource directory.</p>
         * <br>
         * <p>> To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information about a folder](~~111223~~).</p>
         */
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

    public static class CreateStackInstancesRequestParameterOverrides extends TeaModel {
        /**
         * <p>The key of parameter N that you want to use to override a specific parameter. If you do not specify this parameter, ROS uses the name that you specified when you created the stack group.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>>-   ParameterOverrides is optional.</p>
         * <p>>-   If you specify ParameterOverrides, you must specify ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</p>
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
         */
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

}
