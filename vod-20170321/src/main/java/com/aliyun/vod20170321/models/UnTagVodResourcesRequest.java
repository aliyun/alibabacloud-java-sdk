// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UnTagVodResourcesRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UnTagVodResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagVodResourcesRequest self = new UnTagVodResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UnTagVodResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagVodResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnTagVodResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UnTagVodResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagVodResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
