// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the accounts within which the self-managed permission model is used to deploy stacks. You can specify up to 20 account IDs.</p>
     * <br>
     * <p>>  This parameter is required if you use the self-managed permission model to update the stacks.</p>
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
     * <p>The folders in which the service-managed permission model is used to deploy stacks.</p>
     * <br>
     * <p>>  This parameter is required if you use the service-managed permission model to update the stacks.</p>
     */
    @NameInMap("DeploymentTargets")
    public UpdateStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The description of the operation that you want to perform to update the stacks.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length.</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The custom preferences on how Resource Orchestration Service (ROS) updates the stacks.</p>
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
     * <p>    If you do not specify a value for the FailureTolerancePercentage parameter, the default value 0 is used.</p>
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
     * <p>    *   PARALLEL: deploys stacks in parallel in all specified regions.</p>
     * <br>
     * <p>Separate multiple parameters with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   You can specify only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.</p>
     * <p>*   You can specify one of the FailureToleranceCount and FailureTolerancePercentage parameters.</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>test</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<UpdateStackInstancesRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions in which you want to update the stacks. You can specify up to 20 region IDs.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The timeout period for the update operation on the stack.</p>
     * <br>
     * <p>*   Default value: 60.</p>
     * <p>*   Unit: minutes.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    public static UpdateStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackInstancesRequest self = new UpdateStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackInstancesRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public UpdateStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateStackInstancesRequest setDeploymentTargets(UpdateStackInstancesRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public UpdateStackInstancesRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
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

    public UpdateStackInstancesRequest setParameterOverrides(java.util.List<UpdateStackInstancesRequestParameterOverrides> parameterOverrides) {
        this.parameterOverrides = parameterOverrides;
        return this;
    }
    public java.util.List<UpdateStackInstancesRequestParameterOverrides> getParameterOverrides() {
        return this.parameterOverrides;
    }

    public UpdateStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateStackInstancesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public UpdateStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public UpdateStackInstancesRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public static class UpdateStackInstancesRequestDeploymentTargets extends TeaModel {
        /**
         * <p>The IDs of the members in the resource directory. You can specify up to 20 member IDs.</p>
         * <br>
         * <p>>  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The IDs of the folders in the resource directory. You can specify up to five folder IDs.</p>
         * <br>
         * <p>You must specify at least one of the RdFolderIds and AccountIds parameters. The parameters are subject to the following rules:</p>
         * <br>
         * <p>*   If you specify only the RdFolderIds parameter, stacks are deployed within all members in the specified folders. If you select the Root folder, stacks are deployed within all members in the resource directory.</p>
         * <p>*   If you specify only the AccountIds parameter, stacks are deployed within the specified members.</p>
         * <p>*   If you specify both parameters, the accounts specified by using the AccountIds parameter must be contained in the folders specified by using the RdFolderIds parameter. In this case, stacks are deployed within the specified members that are contained in the specified folders.</p>
         * <br>
         * <p>>  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).</p>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static UpdateStackInstancesRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackInstancesRequestDeploymentTargets self = new UpdateStackInstancesRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public UpdateStackInstancesRequestDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public UpdateStackInstancesRequestDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

    public static class UpdateStackInstancesRequestParameterOverrides extends TeaModel {
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
