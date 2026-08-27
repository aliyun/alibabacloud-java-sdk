// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the accounts from which to delete stack instances. This parameter applies only to stack groups that use self-managed permissions. You can specify up to 50 account IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;151266687691****&quot;]</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use your client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can be up to 64 characters long and can contain letters, digits, hyphens (-), and underscores (_).<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment targets from which to delete stack instances. This parameter applies only to stack groups that use service-managed permissions.</p>
     */
    @NameInMap("DeploymentTargets")
    public DeleteStackInstancesRequestDeploymentTargets deploymentTargets;

    /**
     * <p>The description of the operation to delete stack instances.</p>
     * <p>The description can be 1 to 256 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Delete stack instances in hangzhou and beijing</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>The preferences for the operation to delete stack instances.</p>
     * <p>This parameter contains the following subparameters:</p>
     * <ul>
     * <li><p>{&quot;FailureToleranceCount&quot;: N}</p>
     * <p>The number of accounts in each region for which the deletion of stack instances can fail. If the number of failures in a region exceeds this value, the operation stops in that region. If the operation stops in one region, it does not continue in other regions.</p>
     * <p>The value of N must be an integer from 0 to 20.</p>
     * <p>If you do not specify FailureToleranceCount, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;FailureTolerancePercentage&quot;: N}</p>
     * <p>The percentage of accounts in each region for which the deletion of stack instances can fail. If the percentage of failures in a region exceeds this value, the operation stops in that region.</p>
     * <p>The value of N must be an integer from 0 to 100. If the calculated percentage is not an integer, ROS rounds it down to the nearest integer.</p>
     * <p>If you do not specify FailureTolerancePercentage, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentCount&quot;: N}</p>
     * <p>The maximum number of accounts in each region for which stack instances can be deleted at the same time.</p>
     * <p>The value of N must be an integer from 1 to 20.</p>
     * <p>If you do not specify MaxConcurrentCount, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentPercentage&quot;: N}</p>
     * <p>The maximum percentage of accounts in each region for which stack instances can be deleted at the same time.</p>
     * <p>The value of N must be an integer from 1 to 100. If the calculated percentage is not an integer, ROS rounds it down to the nearest integer.</p>
     * <p>If you do not specify MaxConcurrentPercentage, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;RegionConcurrencyType&quot;: N}
     * The concurrency model for deleting stack instances in different regions. Valid values:</p>
     * <ul>
     * <li><p>SEQUENTIAL (default): Deletes stack instances in each specified region sequentially. At any given time, the operation deletes stack instances in only one region.</p>
     * </li>
     * <li><p>PARALLEL: Deletes stack instances in all specified regions in parallel.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Separate multiple parameters with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li><p>You cannot specify both MaxConcurrentCount and MaxConcurrentPercentage.</p>
     * </li>
     * <li><p>You cannot specify both FailureToleranceCount and FailureTolerancePercentage.</p>
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
     * <p>The region ID of the stack group. Call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the regions where the stack instances are deployed. You can specify up to 20 region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;, &quot;cn-beijing&quot;]</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>Specifies whether to retain the stacks.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: The stacks are retained.</p>
     * </li>
     * <li><p>false: The stacks are deleted.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RetainStacks")
    public Boolean retainStacks;

    /**
     * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters long. It must start with a letter or a digit and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
         * <p>The IDs of member accounts in the resource directory. You can specify up to 30 member account IDs.</p>
         * <blockquote>
         * <p>You can find the member account IDs on the Overview page in the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/111624.html">View the details of a member</a>.</p>
         * </blockquote>
         */
        @NameInMap("AccountIds")
        public java.util.List<String> accountIds;

        /**
         * <p>The IDs of folders in the resource directory. You can specify up to 20 folder IDs.</p>
         * <p>Stack instances are deleted from all member accounts in the specified folders. If you specify the Root folder, stack instances are deleted from all member accounts in your resource directory.</p>
         * <blockquote>
         * <p>You can find the folder IDs on the Overview page in the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information of a folder</a>.</p>
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
