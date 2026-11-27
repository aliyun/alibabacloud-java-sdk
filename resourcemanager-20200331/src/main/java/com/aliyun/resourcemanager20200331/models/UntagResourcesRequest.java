// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified resource group or member of a resource directory. Valid values:</p>
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
     * <p>The ID of the resource group or the member of the resource directory.</p>
     * <p>You can specify up to 50 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>ResourceGroup (default): Removes tags from resource groups.</li>
     * <li>Account: Removes tags from members of a resource directory.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you remove tags from members of a resource directory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceGroup</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * <p>You can remove up to 20 tag keys.</p>
     * <blockquote>
     * <p>If the All parameter is set to true to remove all tags, you do not need to specify tag keys.</p>
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
