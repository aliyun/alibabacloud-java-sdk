// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<RemoveTagsFromResourceRequestTag> tag;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

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

    public RemoveTagsFromResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public RemoveTagsFromResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveTagsFromResourceRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public RemoveTagsFromResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveTagsFromResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RemoveTagsFromResourceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public RemoveTagsFromResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static class RemoveTagsFromResourceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

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
