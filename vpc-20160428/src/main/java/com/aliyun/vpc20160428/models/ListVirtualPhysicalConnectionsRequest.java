// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsRequest extends TeaModel {
    /**
     * <p>Specifies whether the hosted connection is accepted by the tenant. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no subsequent query is to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the Express Connect circuit over which the hosted connection is created.</p>
     * <br>
     * <p>Express Connect circuits in this topic refer to Express Connect circuits over which hosted connections are created.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListVirtualPhysicalConnectionsRequestTags> tags;

    @NameInMap("VirtualPhysicalConnectionAliUids")
    public java.util.List<String> virtualPhysicalConnectionAliUids;

    /**
     * <p>The business status of the hosted connection. Valid values:</p>
     * <br>
     * <p>*   **Normal**: normal</p>
     * <p>*   **FinancialLocked**: locked due to overdue payments</p>
     * <p>*   **SecurityLocked**: locked for security reasons</p>
     */
    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    public String virtualPhysicalConnectionBusinessStatus;

    @NameInMap("VirtualPhysicalConnectionIds")
    public java.util.List<String> virtualPhysicalConnectionIds;

    @NameInMap("VirtualPhysicalConnectionStatuses")
    public java.util.List<String> virtualPhysicalConnectionStatuses;

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
         * <p>The key of the tag that is added to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.</p>
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
