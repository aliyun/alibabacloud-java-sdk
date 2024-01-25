// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

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

    public UntagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
