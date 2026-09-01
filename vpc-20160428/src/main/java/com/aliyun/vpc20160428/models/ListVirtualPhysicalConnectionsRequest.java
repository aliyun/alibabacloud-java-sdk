// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsRequest extends TeaModel {
    /**
     * <p>Specifies whether the shared Express Connect circuits have been confirmed and accepted by the tenant. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    /**
     * <p>The number of entries per page when you query results by page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether a next query token exists. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first query or if no next query exists.</li>
     * <li>If a next query exists, set this parameter to the NextToken value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the Express Connect circuit associated with the shared Express Connect circuits.</p>
     * <p>In the following content of this topic, the Express Connect circuit associated with the shared Express Connect circuits is referred to as the Express Connect circuit, to distinguish it from the shared Express Connect circuits.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1ciz7ekd2grn1as****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the shared Express Connect circuits.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the shared Express Connect circuits belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListVirtualPhysicalConnectionsRequestTags> tags;

    /**
     * <p>The Alibaba Cloud account information of the shared Express Connect circuits owner.</p>
     * 
     * <strong>example:</strong>
     * <p>189xxx</p>
     */
    @NameInMap("VirtualPhysicalConnectionAliUids")
    public java.util.List<String> virtualPhysicalConnectionAliUids;

    /**
     * <p>The business status of the shared Express Connect circuits. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Normal.</li>
     * <li><strong>FinancialLocked</strong>: Locked due to overdue payment.</li>
     * <li><strong>SecurityLocked</strong>: Locked for security reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    public String virtualPhysicalConnectionBusinessStatus;

    /**
     * <p>The shared Express Connect circuits information.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("VirtualPhysicalConnectionIds")
    public java.util.List<String> virtualPhysicalConnectionIds;

    /**
     * <p>The business status information of the shared Express Connect circuits.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("VirtualPhysicalConnectionStatuses")
    public java.util.List<String> virtualPhysicalConnectionStatuses;

    /**
     * <p>The VLAN ID of the shared Express Connect circuits.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("VlanIds")
    public java.util.List<String> vlanIds;

    public static ListVirtualPhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsRequest self = new ListVirtualPhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsRequest setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
        return this;
    }
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    public ListVirtualPhysicalConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVirtualPhysicalConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualPhysicalConnectionsRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public ListVirtualPhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVirtualPhysicalConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVirtualPhysicalConnectionsRequest setTags(java.util.List<ListVirtualPhysicalConnectionsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListVirtualPhysicalConnectionsRequestTags> getTags() {
        return this.tags;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionAliUids(java.util.List<String> virtualPhysicalConnectionAliUids) {
        this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionAliUids() {
        return this.virtualPhysicalConnectionAliUids;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
        this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
        return this;
    }
    public String getVirtualPhysicalConnectionBusinessStatus() {
        return this.virtualPhysicalConnectionBusinessStatus;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionIds(java.util.List<String> virtualPhysicalConnectionIds) {
        this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    public ListVirtualPhysicalConnectionsRequest setVirtualPhysicalConnectionStatuses(java.util.List<String> virtualPhysicalConnectionStatuses) {
        this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
        return this;
    }
    public java.util.List<String> getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    public ListVirtualPhysicalConnectionsRequest setVlanIds(java.util.List<String> vlanIds) {
        this.vlanIds = vlanIds;
        return this;
    }
    public java.util.List<String> getVlanIds() {
        return this.vlanIds;
    }

    public static class ListVirtualPhysicalConnectionsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVirtualPhysicalConnectionsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualPhysicalConnectionsRequestTags self = new ListVirtualPhysicalConnectionsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListVirtualPhysicalConnectionsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVirtualPhysicalConnectionsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
