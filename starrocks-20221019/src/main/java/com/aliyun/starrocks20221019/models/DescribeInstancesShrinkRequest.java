// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-a0cb1c8ad6d35XXX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>starrocks_1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance status to filter by. You can specify multiple statuses, separated by commas. Valid values:</p>
     * <ul>
     * <li><p>unpaid</p>
     * </li>
     * <li><p>paid</p>
     * </li>
     * <li><p>creating</p>
     * </li>
     * <li><p>running</p>
     * </li>
     * <li><p>updating</p>
     * </li>
     * <li><p>disable</p>
     * </li>
     * <li><p>deleting</p>
     * </li>
     * <li><p>scaling_out</p>
     * </li>
     * <li><p>scaling_in</p>
     * </li>
     * <li><p>scaling_up</p>
     * </li>
     * <li><p>scaling_down</p>
     * </li>
     * <li><p>upgrading</p>
     * </li>
     * <li><p>modifying_config</p>
     * </li>
     * <li><p>enable_public_network</p>
     * </li>
     * <li><p>disable_public_network</p>
     * </li>
     * <li><p>convert_from_trial_to_official</p>
     * </li>
     * <li><p>restarting</p>
     * </li>
     * <li><p>migration_cluster_to_serverless</p>
     * </li>
     * <li><p>actively_disabled</p>
     * </li>
     * <li><p>enabling</p>
     * </li>
     * <li><p>agent_creating</p>
     * </li>
     * <li><p>agent_scaling_up</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running,creating</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmygmtrcenXXX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    public static DescribeInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesShrinkRequest self = new DescribeInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesShrinkRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
