// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the traffic mirror session. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: does not enable the traffic mirror session.</li>
     * <li><strong>true</strong>: enables the traffic mirror session.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The maximum number of entries to return. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If this is your first query and no next queries are to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</li>
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
     * <p>The priority of the traffic mirror session. Valid values: <strong>1</strong> to <strong>32766</strong>.</p>
     * <p>A smaller value indicates a higher priority. You cannot specify identical priorities for traffic mirror sessions that are created in the same region by using the same account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the region to which the traffic mirror session belongs. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list. For more information about regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Overview of traffic mirroring</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
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
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTrafficMirrorSessionsRequestTags> tags;

    /**
     * <p>The ID of the traffic mirror filter.</p>
     * 
     * <strong>example:</strong>
     * <p>tmf-j6cmls82xnc86vtpe****</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    /**
     * <p>The IDs of the traffic mirror session. The maximum value of N is 100, which indicates that you can query up to 100 traffic mirror sessions at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>tms-j6cla50buc44ap8tu****</p>
     */
    @NameInMap("TrafficMirrorSessionIds")
    public java.util.List<String> trafficMirrorSessionIds;

    /**
     * <p>The name of the traffic mirror session.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    /**
     * <p>The ID of the traffic mirror source. You can specify only an elastic network interface (ENI) as the mirror source.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c8znm5l1yt4sox*****</p>
     */
    @NameInMap("TrafficMirrorSourceId")
    public String trafficMirrorSourceId;

    /**
     * <p>The ID of the traffic mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a traffic mirror destination.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-j6c2fp57q8rr47rp****</p>
     */
    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

    /**
     * <p>The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: <strong>0</strong> to <strong>16777215</strong>. You can use VNIs to identify mirrored traffic from different sessions at the traffic mirror destination. You can specify a custom VNI or use a random VNI that is allocated by the system. If you want the system to randomly allocate a VNI, ignore this parameter.</p>
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
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value cannot exceed 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
