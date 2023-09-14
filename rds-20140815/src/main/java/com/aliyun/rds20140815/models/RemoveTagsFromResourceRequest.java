// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<RemoveTagsFromResourceRequestTag> tag;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A set of a TagKey and a TagValue that you use to unbind the tag. Format: {"key1":"value1"}.</p>
     * <br>
     * <p>>  You cannot specify an empty string for TagKey. You can specify an empty string for TagValue.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the proxy mode.</p>
     */
    @NameInMap("proxyId")
    public String proxyId;

    public static RemoveTagsFromResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromResourceRequest self = new RemoveTagsFromResourceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagsFromResourceRequest setTag(java.util.List<RemoveTagsFromResourceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RemoveTagsFromResourceRequestTag> getTag() {
        return this.tag;
    }

    public RemoveTagsFromResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveTagsFromResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RemoveTagsFromResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveTagsFromResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveTagsFromResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveTagsFromResourceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RemoveTagsFromResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveTagsFromResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveTagsFromResourceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public RemoveTagsFromResourceRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public static class RemoveTagsFromResourceRequestTag extends TeaModel {
        /**
         * <p>The TagKey of the first tag that you want to unbind. Each tag consists of a TagKey and a TagValue. You can specify up to five tags in a single request. You cannot specify an empty string as the tag key. You can specify an empty string as the tag value.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The TagValue of the first tag that you want to unbind. Each tag consists of a TagKey and a TagValue. You can specify up to five tags in a single request. You cannot specify an empty string as the tag key. You can specify an empty string as the tag value.</p>
         */
        @NameInMap("value")
        public String value;

        public static RemoveTagsFromResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsFromResourceRequestTag self = new RemoveTagsFromResourceRequestTag();
            return TeaModel.build(map, self);
        }

        public RemoveTagsFromResourceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RemoveTagsFromResourceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
