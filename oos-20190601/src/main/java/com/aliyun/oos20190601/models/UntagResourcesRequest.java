// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceIds")
    public java.util.Map<String, ?> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKeys")
    public java.util.Map<String, ?> tagKeys;

    @NameInMap("All")
    public Boolean all;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceIds(java.util.Map<String, ?> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.Map<String, ?> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(java.util.Map<String, ?> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.Map<String, ?> getTagKeys() {
        return this.tagKeys;
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

}
