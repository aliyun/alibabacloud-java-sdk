// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to unbind all tags. Default value: false. Valid values:</p>
     * <ul>
     * <li>false: unbinds only the tags that match the value of tags.</li>
     * <li>true: unbinds all tags that are bound to the resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>The resource IDs. Each time you call this operation, you can unbind tags only from a single resource. Therefore, you can enter only one resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-project</p>
     */
    @NameInMap("resourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>project</li>
     * <li>logstore</li>
     * <li>dashboard</li>
     * <li>machinegroup</li>
     * <li>logtailconfig</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tag keys. If you set all to false, only the tags that match the value of this parameter are unbound.</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

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

    public UntagResourcesRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
