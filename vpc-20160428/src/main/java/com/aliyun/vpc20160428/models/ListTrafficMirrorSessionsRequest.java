// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tags")
    public java.util.List<ListTrafficMirrorSessionsRequestTags> tags;

    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    @NameInMap("TrafficMirrorSessionIds")
    public java.util.List<String> trafficMirrorSessionIds;

    @NameInMap("TrafficMirrorSessionName")
    public String trafficMirrorSessionName;

    @NameInMap("TrafficMirrorSourceId")
    public String trafficMirrorSourceId;

    @NameInMap("TrafficMirrorTargetId")
    public String trafficMirrorTargetId;

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
        @NameInMap("Key")
        public String key;

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
