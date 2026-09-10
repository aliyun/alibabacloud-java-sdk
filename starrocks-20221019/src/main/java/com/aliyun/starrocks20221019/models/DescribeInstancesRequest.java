// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
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
     * <p>Retrieves instances by instance status. Separate multiple instance statuses with commas. Valid values:</p>
     * <ul>
     * <li>unpaid: Pending payment.</li>
     * <li>paid: Paid.</li>
     * <li>creating: Being created.</li>
     * <li>running: Running.</li>
     * <li>updating: Being upgraded.</li>
     * <li>disable: Unavailable.</li>
     * <li>deleting: Being deleted.</li>
     * <li>scaling_out: Scaling out.</li>
     * <li>scaling_in: Scaling in.</li>
     * <li>scaling_up: Specifications are being upgraded.</li>
     * <li>scaling_down: Specifications are being used to decrease the quota.</li>
     * <li>upgrading: Version is being upgraded.</li>
     * <li>modifying_config: Configuration is being updated.</li>
     * <li>enable_public_network: Public network access is being enabled.</li>
     * <li>disable_public_network: Public network access is being shutdown.</li>
     * <li>convert_from_trial_to_official: The instance edition is being upgraded.</li>
     * <li>restarting: The cluster is restarting.</li>
     * <li>migration_cluster_to_serverless: The cluster is being migrated.</li>
     * <li>actively_disabled: The instance is stopped.</li>
     * <li>enabling: The instance is being recovered.</li>
     * <li>agent_creating: The agent is being created.</li>
     * <li>agent_scaling_up: The agent specifications are being upgraded.</li>
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
     * <p>The number of entries per page for a paged query.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
