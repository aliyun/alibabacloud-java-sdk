// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     * <br>
     * <p>You can call the [ListResourceTypes](~~133957~~) operation to query the resource type.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceTypeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateRequest self = new GetResourceTypeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
