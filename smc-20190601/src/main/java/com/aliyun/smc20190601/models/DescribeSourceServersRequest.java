// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeSourceServersRequest extends TeaModel {
    /**
     * <p>The migration job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>j-bp19vlwm0tyigbmj****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the migration source. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>testSourceServerName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     * <p>Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The types of migration jobs that are associated with migration sources.</p>
     */
    @NameInMap("RelatedJobType")
    public java.util.List<String> relatedJobType;

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
     * <p>The migration source IDs. You can specify multiple IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1e2fsl57knvuug****</p>
     */
    @NameInMap("SourceId")
    public java.util.List<String> sourceId;

    /**
     * <p>The state of the migration source. Valid Values:</p>
     * <ul>
     * <li>Unavailable: The migration source is inactive, or an error occurs in the migration source.</li>
     * <li>Available: The migration source is active.</li>
     * <li>InUse: The migration source is being migrated.</li>
     * <li>Deleting: The migration source is being deleted from Server Migration Center (SMC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSourceServersRequestTag> tag;

    /**
     * <p>工作组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>w-bp1ja22kdqphehlj****</p>
     */
    @NameInMap("WorkgroupId")
    public String workgroupId;

    public static DescribeSourceServersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceServersRequest self = new DescribeSourceServersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSourceServersRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeSourceServersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSourceServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSourceServersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSourceServersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSourceServersRequest setRelatedJobType(java.util.List<String> relatedJobType) {
        this.relatedJobType = relatedJobType;
        return this;
    }
    public java.util.List<String> getRelatedJobType() {
        return this.relatedJobType;
    }

    public DescribeSourceServersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSourceServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSourceServersRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public DescribeSourceServersRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeSourceServersRequest setTag(java.util.List<DescribeSourceServersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSourceServersRequestTag> getTag() {
        return this.tag;
    }

    public DescribeSourceServersRequest setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

    public static class DescribeSourceServersRequestTag extends TeaModel {
        /**
         * <p>The key of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag key cannot be an empty string. It can be up to 64 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the SMC resource. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. It can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSourceServersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceServersRequestTag self = new DescribeSourceServersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSourceServersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSourceServersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
