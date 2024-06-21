// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;151266687691****&quot;]</p>
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
     */
    @NameInMap("DeploymentTargets")
    public DeleteStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The description of the delete operation.</p>
     * <p>The description must be 1 to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Delete stack instances in hangzhou and beijing</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preference settings of the delete operation.</p>
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
     * <p> The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
     * <p> Valid values of N: 1 to 100. If the numeric value in the percentage is not an integer, ROS rounds the number down to the nearest integer.</p>
     * <p> If you do not specify MaxConcurrentPercentage, 1 is used as the default value.</p>
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
     * <p>{&quot;FailureToleranceCount&quot;: 1, &quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

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
     * <p>The IDs of the regions where you want to delete the stacks. You can specify up to 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>Specifies whether to delete the stacks.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: retains the stacks.</li>
     * <li>false: deletes the stacks.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RetainStacks")
    public Boolean retainStacks;

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

    public static DeleteStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesRequest self = new DeleteStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackInstancesRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public DeleteStackInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteStackInstancesRequest setDeploymentTargets(DeleteStackInstancesRequestDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }
    public DeleteStackInstancesRequestDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    public DeleteStackInstancesRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public DeleteStackInstancesRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public DeleteStackInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackInstancesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public DeleteStackInstancesRequest setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
        return this;
    }
    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    public DeleteStackInstancesRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public static class DeleteStackInstancesRequestDeploymentTargets extends TeaModel {
        /**
         * <p>The IDs of the execution accounts within which you want to deploy stacks in self-managed mode. You can specify up to 20 execution account IDs.</p>
         * <blockquote>
         * <p>To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information about a folder</a>.</p>
         * </blockquote>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The IDs of the folders in the resource directory. You can add up to five folder IDs.</p>
         * <p>You can create stacks within all the member accounts in the specified folders. If you create stacks in the Root folder, the stacks are created within all member accounts in the resource directory.</p>
         * <blockquote>
         * <p>To view the folder IDs, go to the <strong>Overview</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information about a folder</a>.</p>
         * </blockquote>
         */
        @NameInMap("RdFolderIds")
        public java.util.List<String> rdFolderIds;

        public static DeleteStackInstancesRequestDeploymentTargets build(java.util.Map<String, ?> map) throws Exception {
            DeleteStackInstancesRequestDeploymentTargets self = new DeleteStackInstancesRequestDeploymentTargets();
            return TeaModel.build(map, self);
        }

        public DeleteStackInstancesRequestDeploymentTargets setAccountIds(java.util.List<String> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        public DeleteStackInstancesRequestDeploymentTargets setRdFolderIds(java.util.List<String> rdFolderIds) {
            this.rdFolderIds = rdFolderIds;
            return this;
        }
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

    }

}
