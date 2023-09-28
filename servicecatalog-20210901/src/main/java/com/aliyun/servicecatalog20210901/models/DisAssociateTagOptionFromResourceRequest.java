// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisAssociateTagOptionFromResourceRequest extends TeaModel {
    /**
     * <p>The ID of the resource with which the tag option is associated.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the tag option.</p>
     */
    @NameInMap("TagOptionId")
    public String tagOptionId;

    public static DisAssociateTagOptionFromResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisAssociateTagOptionFromResourceRequest self = new DisAssociateTagOptionFromResourceRequest();
        return TeaModel.build(map, self);
    }

    public DisAssociateTagOptionFromResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DisAssociateTagOptionFromResourceRequest setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }
    public String getTagOptionId() {
        return this.tagOptionId;
    }

}
