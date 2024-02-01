// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorFiltersRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return.</p>
     * <br>
     * <p>Valid values: **1** to **100**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region to which the mirrored traffic belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list. For more information about regions that support traffic mirroring, see [Overview of traffic mirroring](~~207513~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTrafficMirrorFiltersRequestTags> tags;

    /**
     * <p>The ID of the traffic mirror filter. The maximum value of **N** is **100**, which specifies that you can query up to 100 filters at a time.</p>
     */
    @NameInMap("TrafficMirrorFilterIds")
    public java.util.List<String> trafficMirrorFilterIds;

    /**
     * <p>The name of the filter.</p>
     */
    @NameInMap("TrafficMirrorFilterName")
    public String trafficMirrorFilterName;

    public static ListTrafficMirrorFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorFiltersRequest self = new ListTrafficMirrorFiltersRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorFiltersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrafficMirrorFiltersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrafficMirrorFiltersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTrafficMirrorFiltersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTrafficMirrorFiltersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTrafficMirrorFiltersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTrafficMirrorFiltersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTrafficMirrorFiltersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTrafficMirrorFiltersRequest setTags(java.util.List<ListTrafficMirrorFiltersRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTrafficMirrorFiltersRequestTags> getTags() {
        return this.tags;
    }

    public ListTrafficMirrorFiltersRequest setTrafficMirrorFilterIds(java.util.List<String> trafficMirrorFilterIds) {
        this.trafficMirrorFilterIds = trafficMirrorFilterIds;
        return this;
    }
    public java.util.List<String> getTrafficMirrorFilterIds() {
        return this.trafficMirrorFilterIds;
    }

    public ListTrafficMirrorFiltersRequest setTrafficMirrorFilterName(String trafficMirrorFilterName) {
        this.trafficMirrorFilterName = trafficMirrorFilterName;
        return this;
    }
    public String getTrafficMirrorFilterName() {
        return this.trafficMirrorFilterName;
    }

    public static class ListTrafficMirrorFiltersRequestTags extends TeaModel {
        /**
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTrafficMirrorFiltersRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTrafficMirrorFiltersRequestTags self = new ListTrafficMirrorFiltersRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTrafficMirrorFiltersRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrafficMirrorFiltersRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
