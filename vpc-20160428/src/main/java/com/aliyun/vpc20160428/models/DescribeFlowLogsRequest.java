// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFlowLogsRequest extends TeaModel {
    /**
     * <p>The description of the flow log.</p>
     * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my Flowlog.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the flow log.</p>
     * 
     * <strong>example:</strong>
     * <p>fl-bp1f6qqhsrc2c12ta****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The name of the flow log.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The Logstore that stores the captured traffic data.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowLogStore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project that manages the captured traffic data.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowLogProject</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID of the flow log.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the flow log belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource from which traffic is captured.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-askldfas****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of resource from which traffic is captured. Valid values:</p>
     * <ul>
     * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
     * <li><strong>VSwitch</strong>: all ENIs in a vSwitch</li>
     * <li><strong>VPC</strong>: all ENIs in a virtual private cloud (VPC)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NetworkInterface</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The status of the flow log. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong></li>
     * <li><strong>Activating</strong></li>
     * <li><strong>Inactive</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeFlowLogsRequestTags> tags;

    /**
     * <p>The type of traffic that is captured. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all traffic</li>
     * <li><strong>Allow</strong>: traffic that is allowed by access control</li>
     * <li><strong>Drop</strong>: traffic that is denied by access control</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    /**
     * <p>The ID of the VPC to which the flow log belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nwd16gvo1wgs****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeFlowLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowLogsRequest self = new DescribeFlowLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowLogsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowLogsRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public DescribeFlowLogsRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public DescribeFlowLogsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeFlowLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeFlowLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeFlowLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFlowLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFlowLogsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeFlowLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowLogsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeFlowLogsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeFlowLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeFlowLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeFlowLogsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeFlowLogsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFlowLogsRequest setTags(java.util.List<DescribeFlowLogsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeFlowLogsRequestTags> getTags() {
        return this.tags;
    }

    public DescribeFlowLogsRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

    public DescribeFlowLogsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeFlowLogsRequestTags extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be at most 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFlowLogsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowLogsRequestTags self = new DescribeFlowLogsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeFlowLogsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFlowLogsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
