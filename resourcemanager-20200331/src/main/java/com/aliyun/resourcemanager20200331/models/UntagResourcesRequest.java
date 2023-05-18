// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the specified resource groups or members. Valid values:</p>
     * <br>
     * <p>*   false (default value)</p>
     * <p>*   true</p>
     */
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the objects from which you want to remove tags. Valid values:</p>
     * <br>
     * <p>*   ResourceGroup: resource group. This is the default value.</p>
     * <p>*   Account: member.</p>
     * <br>
     * <p>>  This parameter is required if you remove tags from members in a resource directory.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

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
