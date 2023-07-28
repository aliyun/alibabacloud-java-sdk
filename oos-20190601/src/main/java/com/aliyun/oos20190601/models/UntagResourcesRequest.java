// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>Specifies whether to delete all tags. This parameter takes effect only when the TagKeys parameter is not specified. Valid values: true and false. Default value: false. The TagKeys parameter is required when this parameter is set to false.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>You can call this operation to delete tags that are attached to one or more resources.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.Map<String, ?> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKeys")
    public java.util.Map<String, ?> tagKeys;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
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

}
