// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsRequest extends TeaModel {
    /**
     * <p>Specifies whether the traffic mirror session is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): The traffic mirror session is not enabled.</p>
     * </li>
     * <li><p><strong>true</strong>: The traffic mirror session is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The maximum number of entries to return in this query. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request or if no next query exists.</li>
     * <li>If a next query exists, set the value to the NextToken value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority of traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.</p>
     * <p>A smaller value indicates a higher priority. The priority of traffic mirror session created by the same account in the same region must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID of the traffic mirror session. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID. For information about the regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the traffic mirroring session belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTrafficMirrorSessionsRequestTags> tags;

    /**
     * <p>The instance ID of the traffic mirror filter.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    /**
     * <p>The instance IDs of traffic mirror sessions. The maximum value of <strong>N</strong> is <strong>100</strong>, which means you can query up to 100 traffic mirror sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>tms-j6cla50buc44ap8tu****</p>
     */
    @NameInMap("TrafficMirrorSessionIds")
    public java.util.List<String> trafficMirrorSessionIds;

    /**
     * <p>The name of the traffic mirror session.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    /**
     * <p>The instance ID of the traffic mirror source. Currently, elastic network interfaces (ENIs) are supported as traffic mirror sources.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c8znm5l1yt4sox*****</p>
     */
    @NameInMap("TrafficMirrorSourceId")
    public String trafficMirrorSourceId;

    /**
     * <p>The instance ID of the traffic mirror destination. Currently, elastic network interfaces (ENIs) and internal-facing SLB instances are supported as traffic mirror destinations. Elastic network interfaces are also referred to as network interface controllers (NICs).</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c2fp57q8rr47rp****</p>
     */
    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    /**
     * <p>The Virtual Network Identifier (VNI) used to distinguish different mirrored data. Valid values: <strong>0</strong> to <strong>16777215</strong>. You can use the VNI to identify mirrored data from different sessions at the traffic mirror destination. You can specify a custom VNI value or let the system randomly assign one. To let the system randomly assign a value, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VirtualNetworkId")
    public Integer virtualNetworkId;

    public static ListTrafficMirrorSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorSessionsRequest self = new ListTrafficMirrorSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorSessionsRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListTrafficMirrorSessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrafficMirrorSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMirrorSessionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTrafficMirrorSessionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTrafficMirrorSessionsRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ListTrafficMirrorSessionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTrafficMirrorSessionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTrafficMirrorSessionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTrafficMirrorSessionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTrafficMirrorSessionsRequest setTags(java.util.List<ListTrafficMirrorSessionsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTrafficMirrorSessionsRequestTags> getTags() {
        return this.tags;
    }

    public ListTrafficMirrorSessionsRequest setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    public ListTrafficMirrorSessionsRequest setTrafficMirrorSessionIds(java.util.List<String> trafficMirrorSessionIds) {
        this.trafficMirrorSessionIds = trafficMirrorSessionIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorSessionIds() {
        return this.trafficMirrorSessionIds;
    }

    public ListTrafficMirrorSessionsRequest setTrafficMirrorSessionName(String trafficMirrorSessionName) {
        this.trafficMirrorSessionName = trafficMirrorSessionName;
        return this;
    }
    public String getTrafficMirrorSessionName() {
        return this.trafficMirrorSessionName;
    }

    public ListTrafficMirrorSessionsRequest setTrafficMirrorSourceId(String trafficMirrorSourceId) {
        this.trafficMirrorSourceId = trafficMirrorSourceId;
        return this;
    }
    public String getTrafficMirrorSourceId() {
        return this.trafficMirrorSourceId;
    }

    public ListTrafficMirrorSessionsRequest setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }
    public String getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId;
    }

    public ListTrafficMirrorSessionsRequest setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }
    public Integer getVirtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static class ListTrafficMirrorSessionsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrafficMirrorSessionsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorSessionsRequestTags self = new ListTrafficMirrorSessionsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorSessionsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrafficMirrorSessionsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
