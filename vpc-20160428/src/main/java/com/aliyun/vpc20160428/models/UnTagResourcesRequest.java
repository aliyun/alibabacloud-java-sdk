// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    @NameInMap("Tag")
    public java.util.List<UnTagResourcesRequestTag> tag;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnTagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnTagResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnTagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnTagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public UnTagResourcesRequest setTag(java.util.List<UnTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UnTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class UnTagResourcesRequestTag extends TeaModel {
        public static UnTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UnTagResourcesRequestTag self = new UnTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
