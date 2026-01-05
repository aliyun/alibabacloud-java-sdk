// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociateTagOptionWithResourceRequest extends TeaModel {
    /**
     * <p>The ID of the resource with which the tag option is associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp15p96922****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the tag option.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag-bp1u6mdf3d****</p>
     */
    @NameInMap("TagOptionId")
    public String tagOptionId;

    public static AssociateTagOptionWithResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateTagOptionWithResourceRequest self = new AssociateTagOptionWithResourceRequest();
        return TeaModel.build(map, self);
    }

    public AssociateTagOptionWithResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AssociateTagOptionWithResourceRequest setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }
    public String getTagOptionId() {
        return this.tagOptionId;
    }

}
