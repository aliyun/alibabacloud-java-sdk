// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<AddTagsToResourceRequestTag> tag;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can enter up to 30 instance IDs in a single request. If you enter more than one instance ID, you must separate the instance IDs with commas (,).</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The logon name of the RAM user.</p>
     */
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags that you want to bind. Each tag consists of a TagKey and a TagValue. You can specify up to five tags in a single request. Format: {"key1":"value1","key2":"value2"...}.</p>
     * <br>
     * <p>>  The TagKey is required, and the TagValue is optional.</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The ID of the proxy pattern.</p>
     */
    @NameInMap("proxyId")
    public String proxyId;

    public static AddTagsToResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceRequest self = new AddTagsToResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsToResourceRequest setTag(java.util.List<AddTagsToResourceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddTagsToResourceRequestTag> getTag() {
        return this.tag;
    }

    public AddTagsToResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddTagsToResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AddTagsToResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddTagsToResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTagsToResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsToResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTagsToResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTagsToResourceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddTagsToResourceRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public static class AddTagsToResourceRequestTag extends TeaModel {
        /**
         * <p>The TagKey of the first tag that you want to bind. Each tag consists of a TagKey and a TagValue. You can specify up to five tags in a single request. The TagKey is required, and the TagValue is optional.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The TagValue of the first tag that you want to bind. Each tag consists of a TagKey and a TagValue. You can specify up to five tags in a single request. The TagKey is required, and the TagValue is optional.</p>
         */
        @NameInMap("value")
        public String value;

        public static AddTagsToResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsToResourceRequestTag self = new AddTagsToResourceRequestTag();
            return TeaModel.build(map, self);
        }

        public AddTagsToResourceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddTagsToResourceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
