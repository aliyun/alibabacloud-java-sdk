// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ImportStacksToStackGroupRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. This value is generated by the client and must be globally unique. 
     * It cannot exceed 64 characters and can include letters, numbers, hyphens (-), and underscores (_). 
     * For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to Ensure Idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Description of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Import ops stacks to stack group</p>
     */
    @NameInMap("OperationDescription")
    public String operationDescription;

    /**
     * <p>Operation settings for importing stacks into the stack group.</p>
     * <p>Includes the following parameters:</p>
     * <ul>
     * <li><p>{&quot;FailureToleranceCount&quot;: N}</p>
     * <p>Failure tolerance count. The number of accounts in which the stack can fail in each region. If this number is exceeded, the operation in that region will stop. If the operation in one region stops, it will not continue in other regions.</p>
     * <p> The range of N: 0~20.</p>
     * <p> If FailureToleranceCount is not specified, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;FailureTolerancePercentage&quot;: N}</p>
     * <p> Failure tolerance percentage. The percentage of total accounts in which the stack can fail in each region. If this percentage is exceeded, the operation in that region will stop.</p>
     * <p> The range of N: 0~100. If the percentage is not an integer, ROS will round down.</p>
     * <p> If FailureTolerancePercentage is not specified, the default value is 0.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentCount&quot;: N}</p>
     * <p> Maximum concurrent account count. The number of accounts in which the stack can be deployed simultaneously in each region.</p>
     * <p> The range of N: 1~20.</p>
     * <p> If MaxConcurrentCount is not specified, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;MaxConcurrentPercentage&quot;: N} Maximum concurrent account percentage.</p>
     * <p> The percentage of total accounts in which the stack can be deployed simultaneously in each region.</p>
     * <p> The range of N: 1~100. If the percentage is not an integer, ROS will round down.</p>
     * <p> If MaxConcurrentPercentage is not specified, the default value is 1.</p>
     * </li>
     * <li><p>{&quot;RegionConcurrencyType&quot;: N}
     * Region-level concurrency type for deploying stack instances, values:</p>
     * <ul>
     * <li><p>SEQUENTIAL (default): Deploy sequentially in each specified region, only one region at a time.</p>
     * </li>
     * <li><p>PARALLEL: Deploy in parallel across all specified regions.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>Multiple parameters are separated by commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>Do not specify both MaxConcurrentCount and MaxConcurrentPercentage.  </li>
     * <li>Do not specify both FailureToleranceCount and FailureTolerancePercentage.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FailureToleranceCount&quot;: 1,&quot;MaxConcurrentCount&quot;: 2}</p>
     */
    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    /**
     * <p>The region ID of the stack group. You can call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A list of resource directory folder IDs for the stacks to be imported. A maximum of 10 folders can be added.</p>
     */
    @NameInMap("ResourceDirectoryFolderIds")
    public java.util.List<String> resourceDirectoryFolderIds;

    /**
     * <p>A list of ARNs for the stacks to be imported into the stack group, in the format <code>acs:ros:${RegionId}:${AccountId}:stack/${StackId}</code>. A maximum of 10 stacks can be added.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StackArns")
    public java.util.List<String> stackArns;

    /**
     * <p>The name of the stack group. The name must be unique within a single region. It cannot exceed 255 characters and must start with a letter or number, and can include letters, numbers, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStackGroup</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static ImportStacksToStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportStacksToStackGroupRequest self = new ImportStacksToStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public ImportStacksToStackGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ImportStacksToStackGroupRequest setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
        return this;
    }
    public String getOperationDescription() {
        return this.operationDescription;
    }

    public ImportStacksToStackGroupRequest setOperationPreferences(java.util.Map<String, ?> operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }
    public java.util.Map<String, ?> getOperationPreferences() {
        return this.operationPreferences;
    }

    public ImportStacksToStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportStacksToStackGroupRequest setResourceDirectoryFolderIds(java.util.List<String> resourceDirectoryFolderIds) {
        this.resourceDirectoryFolderIds = resourceDirectoryFolderIds;
        return this;
    }
    public java.util.List<String> getResourceDirectoryFolderIds() {
        return this.resourceDirectoryFolderIds;
    }

    public ImportStacksToStackGroupRequest setStackArns(java.util.List<String> stackArns) {
        this.stackArns = stackArns;
        return this;
    }
    public java.util.List<String> getStackArns() {
        return this.stackArns;
    }

    public ImportStacksToStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
