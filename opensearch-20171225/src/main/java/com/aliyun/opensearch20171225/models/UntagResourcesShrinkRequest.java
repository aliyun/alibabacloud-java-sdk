// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resources. This parameter takes effect only if you do not specify \<code>tagKey\\</code>. Valid values: \<code>true\\</code> and \<code>false\\</code>. Default value: \<code>false\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The IDs of the resources. You can specify a maximum of 50 resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductVersion</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>A list of tag keys. You can specify a maximum of 20 tag keys.</p>
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
