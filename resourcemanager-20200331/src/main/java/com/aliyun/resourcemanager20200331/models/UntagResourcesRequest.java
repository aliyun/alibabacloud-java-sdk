// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags from the specified resource group or resource directory member. Valid values:</p>
     * <ul>
     * <li>false (default): No.</li>
     * <li>true: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The ID of the resource group or resource directory member.</p>
     * <p>You can specify up to 50 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>ResourceGroup (default): Unbinds tags from a resource group.</li>
     * <li>Account: Unbinds tags from a resource directory member.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you unbind tags from a resource directory member.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceGroup</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * <p>You can unbind up to 20 tag keys.</p>
     * <blockquote>
     * <p>If the <code>All</code> parameter for unbinding all tags is set to <code>true</code>, you do not need to specify tag keys.</p>
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
