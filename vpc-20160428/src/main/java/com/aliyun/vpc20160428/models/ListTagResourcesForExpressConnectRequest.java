// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTagResourcesForExpressConnectRequest extends TeaModel {
    /**
     * <p>The number of entries to return per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of **NextToken** that is returned in the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Set the value to **PHYSICALCONNECTION**, which specifies the Express Connect circuit.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<ListTagResourcesForExpressConnectRequestTag> tag;

    public static ListTagResourcesForExpressConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesForExpressConnectRequest self = new ListTagResourcesForExpressConnectRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesForExpressConnectRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagResourcesForExpressConnectRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesForExpressConnectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTagResourcesForExpressConnectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTagResourcesForExpressConnectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesForExpressConnectRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesForExpressConnectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagResourcesForExpressConnectRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTagResourcesForExpressConnectRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesForExpressConnectRequest setTag(java.util.List<ListTagResourcesForExpressConnectRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesForExpressConnectRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesForExpressConnectRequestTag extends TeaModel {
        /**
         * <p>The key of tag N that is added to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesForExpressConnectRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesForExpressConnectRequestTag self = new ListTagResourcesForExpressConnectRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesForExpressConnectRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesForExpressConnectRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
