// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified one or more resources. This parameter takes effect only if the tagKey parameter is not specified. Valid values: true and false. Default value: false.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The resource IDs. You can specify a maximum number of 50 IDs.</p>
     */
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The keys of tags. You can specify a maximum number of 20 keys.</p>
     */
    @NameInMap("tagKey")
    public java.util.List<String> tagKey;

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

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
