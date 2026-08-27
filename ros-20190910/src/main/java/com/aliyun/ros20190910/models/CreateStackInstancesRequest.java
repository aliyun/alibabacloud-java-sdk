// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the destination accounts where you want to create stacks using self-managed permissions. You can specify up to 50 account IDs.</p>
     * <blockquote>
     * <p>You can specify only one of the <code>AccountIds</code> and <code>DeploymentTargets</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;151266687691****&quot;,&quot;141261387191****&quot;]</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates the token, which must be globally unique.<br>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment options for deploying stacks in service-managed permission mode. You can specify up to one deployment option.</p>
     */
    @NameInMap("DeploymentOptions")
    public java.util.List<String> deploymentOptions;

    /**
     * <p>The deployment targets for deploying stacks in service-managed permission mode.</p>
     * <blockquote>
     * <p>You can specify only one of the <code>AccountIds</code> and <code>DeploymentTargets</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RdFolderId&quot;: &quot;fd-4PvlVLOL8v&quot;}</p>
     */
    @NameInMap("DeploymentTargets")
    public CreateStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>Indicates whether to disable rollback when a stack fails to be created.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Disables rollback.</p>
     * </li>
     * <li><p>false (default): Enables rollback.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The description of the operation to create the stacks.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Create stack instances in hangzhou and beijing</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preferences for the operation.</p>
     * <p>The following parameters are available:</p>
     * <ul>
     * <li><p>{&quot;FailureToleranceCount&quot;: N}</p>
     * <p>The number of accounts per region in which the operation can fail. If the number of failed operations in a region exceeds this value, Resource Orchestration Service (ROS) stops the operation in that region. If the operation is stopped in a region, the operation is not performed in other regions.</p>
     * <p>The value of N can be an integer from 0 to 20.</p>
     * <p>If you do not specify this parameter, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;FailureTolerancePercentage&quot;: N}</p>
     * <p>The percentage of accounts per region in which the operation can fail, relative to the total number of accounts. If the percentage of failed operations in a region exceeds this value, ROS stops the operation in that region.</p>
     * <p>The value of N can be an integer from 0 to 100. If the percentage is not an integer, ROS rounds down the value.</p>
     * <p>If you do not specify this parameter, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentCount&quot;: N}</p>
     * <p>The maximum number of accounts in each region where stacks can be deployed at the same time.</p>
     * <p>The value of N can be an integer from 1 to 20.</p>
     * <p>If you do not specify this parameter, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentPercentage&quot;: N}</p>
     * <p>The percentage of accounts in each region where stacks can be deployed at the same time, relative to the total number of accounts.</p>
     * <p>The value of N can be an integer from 1 to 100. If the percentage is not an integer, ROS rounds down the value.</p>
     * <p>If you do not specify this parameter, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;RegionConcurrencyType&quot;: N}<br>The concurrency type of deployment regions. Valid values:</p>
     * <ul>
     * <li><p>SEQUENTIAL (default): Deploys stacks in the specified regions one by one. Stacks are deployed in only one region at a time.</p>
     * </li>
     * <li><p>PARALLEL: Deploys stacks in all specified regions at the same time.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Separate multiple parameters with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>You cannot specify MaxConcurrentCount and MaxConcurrentPercentage at the same time.</p>
     * </li>
     * <li><p>You cannot specify FailureToleranceCount and FailureTolerancePercentage at the same time.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1, &quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>A list of parameters that overwrite the template parameters.</p>
     */
    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides;

    /**
     * <p>The region ID of the stack group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the destination regions. You can specify up to 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters in length. It must start with a letter or a digit and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The timeout period for creating the stacks.</p>
     * <ul>
     * <li><p>Default value: 60.</p>
     * </li>
     * <li><p>Unit: minutes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

    public CreateStackInstancesRequest setDeploymentOptions(java.util.List<String> deploymentOptions) {
        this.deploymentOptions = deploymentOptions;
        return this;
    }
    public java.util.List<String> getDeploymentOptions() {
        return this.deploymentOptions;
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
         * <p>The IDs of the member accounts in the resource directory. You can specify up to 30 member account IDs.</p>
         * <blockquote>
         * <p>You can view the member account IDs on the Overview page in the Resource Management console. For more information, see View the details of a member.</p>
         * </blockquote>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The IDs of the folders in the resource directory. You can specify up to 20 folder IDs.</p>
         * <p>You can create stacks in all the member accounts in the specified folders. If you select the root folder, stacks are created in all the member accounts in the resource directory.</p>
         * <blockquote>
         * <p>You can view the folder IDs on the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information of a folder</a>.</p>
         * </blockquote>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static CreateStackInstancesRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateStackInstancesRequestDeploymentTargets self = new CreateStackInstancesRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public CreateStackInstancesRequestDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
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
         * <p>The name of the parameter to overwrite. If you do not specify this parameter, ROS uses the parameter name that was specified when the stack group was created.</p>
         * <p>You can specify up to 200 parameters.</p>
         * <blockquote>
         * <ul>
         * <li><p>ParameterOverrides is optional.</p>
         * </li>
         * <li><p>If you specify ParameterOverrides, you must specify both ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</p>
         * </li>
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
         * <p>The value of the parameter to overwrite. If you do not specify this parameter, ROS uses the parameter value that was specified when the stack group was created.</p>
         * <p>You can specify up to 200 parameters.</p>
         * <blockquote>
         * <ul>
         * <li><p>ParameterOverrides is optional.</p>
         * </li>
         * <li><p>If you specify ParameterOverrides, you must specify both ParameterOverrides.N.ParameterKey and ParameterOverrides.N.ParameterValue.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
