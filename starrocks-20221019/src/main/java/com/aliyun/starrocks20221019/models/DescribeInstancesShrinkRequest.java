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
     * <p>The instance status. You can specify multiple statuses separated by commas. Valid values:</p>
     * <ul>
     * <li>unpaid: Pending payment.</li>
     * <li>paid: Paid.</li>
     * <li>creating: Starting.</li>
     * <li>running: Running.</li>
     * <li>updating: Updating.</li>
     * <li>disable: Unavailable.</li>
     * <li>deleting: Releasing.</li>
     * <li>scaling_out: Scaling out.</li>
     * <li>scaling_in: Scaling in.</li>
     * <li>scaling_up: Scaling up.</li>
     * <li>scaling_down: Scaling down.</li>
     * <li>upgrading: Upgrading.</li>
     * <li>modifying_config: Updating configurations.</li>
     * <li>enable_public_network: Enabling public network access.</li>
     * <li>disable_public_network: Disabling public network access.</li>
     * <li>convert_from_trial_to_official: Upgrading the instance edition.</li>
     * <li>restarting: Restarting the cluster.</li>
     * <li>migration_cluster_to_serverless: Migrating the cluster.</li>
     * <li>actively_disabled: Stopped.</li>
     * <li>enabling: Resuming.</li>
     * <li>agent_creating: Creating the agent.</li>
     * <li>agent_scaling_up: Scaling up the agent.</li>
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
     * <p>The number of entries per page in a paging query.</p>
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
