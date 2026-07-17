// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
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
    public java.util.List<String> resourceId;

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
