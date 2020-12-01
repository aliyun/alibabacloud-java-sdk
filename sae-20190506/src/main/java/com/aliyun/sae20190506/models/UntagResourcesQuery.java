// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UntagResourcesQuery extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("ResourceIds")
    @Validation(required = true)
    public String resourceIds;

    @NameInMap("TagKeys")
    public String tagKeys;

    @NameInMap("DeleteAll")
    public Boolean deleteAll;

    public static UntagResourcesQuery build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesQuery self = new UntagResourcesQuery();
        return TeaModel.build(map, self);
    }

    public UntagResourcesQuery setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesQuery setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesQuery setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesQuery setTagKeys(String tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public String getTagKeys() {
        return this.tagKeys;
    }

    public UntagResourcesQuery setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

}
