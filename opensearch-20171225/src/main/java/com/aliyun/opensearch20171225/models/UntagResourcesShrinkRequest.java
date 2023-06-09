// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified one or more resources. This parameter takes effect only if the tagKey parameter is not specified. Valid values: true and false. Default value: false.</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The resource IDs. You can specify a maximum number of 50 IDs.</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The keys of tags. You can specify a maximum number of 20 keys.</p>
     */
    @NameInMap("tagKey")
    public String tagKeyShrink;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeyShrink(String tagKeyShrink) {
        this.tagKeyShrink = tagKeyShrink;
        return this;
    }
    public String getTagKeyShrink() {
        return this.tagKeyShrink;
    }

}
