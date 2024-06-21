// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
     * <blockquote>
     * <p>If you want to update stacks in self-managed permission mode, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;151266687691****&quot;,&quot;141261387191****&quot;]</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\
     * The token can contain letters, digits, hyphens (-), and underscores (_), and cannot exceed 64 characters in length.\
     * For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The folders in which you want to deploy stacks in service-managed mode.</p>
     * <blockquote>
     * <p>If you want to update stacks in service-managed permission mode, you must specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("DeploymentTargets")
    public UpdateStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The description of the update operation.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Update stack instances in hangzhou and beijing</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preference settings of the update operation.</p>
     * <p>The following parameters are available:</p>
     * <ul>
     * <li><p>{&quot;FailureToleranceCount&quot;: N}</p>
     * <p> The number of accounts within which stack operation failures are allowed in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region. If ROS stops the operation in one region, ROS stops the operation in other regions.</p>
     * <p> Valid values of N: 0 to 20.</p>
     * <p> If you do not specify FailureToleranceCount, 0 is used as the default value.</p>
     * </li>
     * <li><p>{&quot;FailureTolerancePercentage&quot;: N}</p>
     * <p> The percentage of the number of accounts within which stack operation failures are allowed to the total number of accounts in each region. If the value of this parameter is exceeded, ROS stops the operation in the region.</p>
     * <p> Valid values of N: 0 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <p> If you do not specify FailureTolerancePercentage, 0 is used as the default value.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentCount&quot;: N}</p>
     * <p> The maximum number of accounts within which multiple stacks are deployed at the same time in each region.</p>
     * <p> Valid values of N: 1 to 20.</p>
     * <p> If you do not specify MaxConcurrentCount, 1 is used as the default value.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentPercentage&quot;: N}</p>
     * <p>  The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
     * <p>  Valid values: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the value down to the nearest integer.</p>
     * <p>  If you do not specify MaxConcurrentPercentage, 1 is used as the default value.</p>
     * </li>
     * <li><p>{&quot;RegionConcurrencyType&quot;: N}</p>
     * <p>The mode that you want to use to deploy stacks across regions. Valid values:</p>
     * <ul>
     * <li><p>SEQUENTIAL (default): deploys stacks in the specified regions one by one in sequence. This way, ROS deploys stacks in only one region at a time. </p>
     * </li>
     * <li><p>PARALLEL: deploys stacks in all the specified regions in parallel.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Separate multiple parameters with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>You can specify only one of the following parameters: MaxConcurrentCount and MaxConcurrentPercentage.</li>
     * <li>You can specify only one of the following parameters: FailureToleranceCount and FailureTolerancePercentage.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1,&quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The parameters that are used to override specific parameters.</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<UpdateStackInstancesRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where you want to update the stacks. You can specify up to 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique within a region.\
     * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The timeout period for the update operation.</p>
     * <ul>
     * <li>Default value: 60.</li>
     * <li>Unit: minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The IDs of the member accounts in the resource directory. You can specify up to 20 member account IDs.</p>
         * <blockquote>
         * <p>To view the member account IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111624.html">View the details of a member</a>.</p>
         * </blockquote>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The folder IDs of the resource directory.</p>
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
         * <p>The key of parameter N that you want to use to override a specific parameter. If you do not specify this parameter, ROS uses the name that you specified when you created the stack group.</p>
         * <p>Maximum value of N: 200.</p>
         * <blockquote>
         * <ul>
         * <li>ParameterOverrides is optional.</li>
         * <li>If you specify ParameterOverrides, you must specify ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Amount</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N that you want to use to override a specific parameter. If you do not specify this parameter, ROS uses the value that you specified when you created the stack group.</p>
         * <p>Maximum value of N: 200.</p>
         * <blockquote>
         * <ul>
         * <li>ParameterOverrides is optional.</li>
         * <li>If you specify ParameterOverrides, you must specify ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
