// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeReplicationJobsRequest extends TeaModel {
    /**
     * <p>The business status of the migration job. Valid values:</p>
     * <ul>
     * <li>Preparing: The migration is being prepared.</li>
     * <li>Syncing: Data is being synchronized.</li>
     * <li>Processing: The migration is in progress.</li>
     * <li>Cleaning: Intermediate resources are being released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Preparing</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The IDs of the destination Elastic Compute Service (ECS) instances.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The IDs of the migration jobs. You can specify a maximum of 50 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>j-bp19vlwm0tyigbmj****</p>
     */
    @NameInMap("JobId")
    public java.util.List<String> jobId;

    /**
     * <p>The type of the migration job. Valid values:</p>
     * <ul>
     * <li>0: server migration.</li>
     * <li>1: operating system migration.</li>
     * <li>2: cross-zone migration.</li>
     * <li>3: agentless migration for a VMware VM.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("JobType")
    public Integer jobType;

    /**
     * <p>The name of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>testMigrationTaskName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Alibaba Cloud region to which you want to migrate the source server.</p>
     * <p>For example, if you want to migrate a source server to the China (Hangzhou) region, set this parameter to <code>cn-hangzhou</code>. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the latest regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw3ty5y7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The IDs of the source servers. You can specify a maximum of 50 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1e2fsl57knvuug****</p>
     */
    @NameInMap("SourceId")
    public java.util.List<String> sourceId;

    /**
     * <p>The status of the migration job. Valid values:</p>
     * <ul>
     * <li>Ready: The migration job is not started.</li>
     * <li>Running: The migration job is running.</li>
     * <li>Stopped: The migration job is paused.</li>
     * <li>InError: An error occurs in the migration job.</li>
     * <li>Finished: The migration job is complete.</li>
     * <li>Waiting: The migration job is waiting to run.</li>
     * <li>Expired: The migration job has expired.</li>
     * <li>Deleting: The migration job is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The information about tags that are attached to the SMC resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeReplicationJobsRequestTag> tag;

    public static DescribeReplicationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationJobsRequest self = new DescribeReplicationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationJobsRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeReplicationJobsRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeReplicationJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public DescribeReplicationJobsRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public DescribeReplicationJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeReplicationJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeReplicationJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReplicationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicationJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeReplicationJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeReplicationJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeReplicationJobsRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public DescribeReplicationJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeReplicationJobsRequest setTag(java.util.List<DescribeReplicationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeReplicationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeReplicationJobsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag key can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.<a href="http://https://%E3%80%82"></a></p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeReplicationJobsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicationJobsRequestTag self = new DescribeReplicationJobsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeReplicationJobsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeReplicationJobsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
