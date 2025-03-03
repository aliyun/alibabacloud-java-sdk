// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified resource groups or members. Valid values:</p>
     * <ul>
     * <li>false (default value)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of a resource group or member.</p>
     * <p>You can specify a maximum of 50 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the objects from which you want to remove tags. Valid values:</p>
     * <ul>
     * <li>ResourceGroup: resource group. This is the default value.</li>
     * <li>Account: member.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if you remove tags from members in a resource directory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceGroup</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A tag key.</p>
     * <p>You can specify a maximum of 20 tag keys.</p>
     * <blockquote>
     * <p> If you set the <code>All</code> parameter to <code>true</code>, you do not need to configure this parameter.</p>
     * </blockquote>
     */
    @NameInMap("TagKey")
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
