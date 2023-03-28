// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the accounts within which you want to use the self-managed permission model to deploy stacks. You can specify up to 20 account IDs.</p>
     * <br>
     * <p>>  You must specify only one of the `AccountIds` and `DeploymentTargets` parameters.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

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
     * <p>The folders in which you want to use the service-managed permission model to deploy stacks.</p>
     * <br>
     * <p>>  You must specify only one of the `AccountIds` and `DeploymentTargets` parameters.</p>
     */
    @NameInMap("DeploymentTargets")
    public CreateStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>Specifies whether to disable rollback when the stacks fail to be created.</p>
     * <br>
     * <p>Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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
     * <p>The custom preferences on how Resource Orchestration Service (ROS) creates the stacks.</p>
     * <br>
     * <p>The following parameters are included:</p>
     * <br>
     * <p>*   {"FailureToleranceCount": N}</p>
     * <br>
     * <p>    The number of accounts within which stack operation failures can occur in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region. If the operation is stopped in one region, the operation is no longer performed in other regions.</p>
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
     * <p>    Valid values: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <br>
     * <p>    If you do not specify the MaxConcurrentPercentage parameter, the default value 1 is used.</p>
     * <br>
     * <p>*   {"RegionConcurrencyType": N}</p>
     * <br>
     * <p>    The mode that you want to use to deploy stacks across regions. Default value: SEQUENTIAL. Valid values:</p>
     * <br>
     * <p>    *   SEQUENTIAL: deploys stacks in each specified region based on the specified sequence of regions. ROS deploys stacks in one region at a time.</p>
     * <p>    *   PARALLEL: deploys stacks in parallel across all specified regions.</p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   You can specify one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.</p>
     * <p>*   You can specify one of the FailureToleranceCount and FailureTolerancePercentage parameters.</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions in which you want to create the stacks. You can specify up to 20 region IDs.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique within a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The timeout period that is allowed to create the stack.</p>
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
         * <p>The IDs of the folders in the resource directory. You can add up to five folder IDs.</p>
         * <br>
         * <p>You can create stacks within all members in the specified folders. If you create stacks in the Root folder, the stacks are created within all members in the resource directory.</p>
         * <br>
         * <p>>  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).</p>
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
         * <p>The name of parameter N that you want to use to override a specific parameter. If you do not specify the name of parameter N, ROS uses the name that you specify when you create the stack group.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>> </p>
         * <p>*   The ParameterOverrides parameter is optional.</p>
         * <p>*   If you specify the ParameterOverrides parameter, you must specify the ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue parameters.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N that you want to use to override a specific parameter. If you do not specify the name and value of parameter N, ROS uses the name and value that you specify when you create the stack group.</p>
         * <br>
         * <p>Maximum value of N: 200.</p>
         * <br>
         * <p>> </p>
         * <p>*   The ParameterOverrides parameter is optional.</p>
         * <p>*   If you specify the ParameterOverrides parameter, you must specify the ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue parameters.</p>
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
