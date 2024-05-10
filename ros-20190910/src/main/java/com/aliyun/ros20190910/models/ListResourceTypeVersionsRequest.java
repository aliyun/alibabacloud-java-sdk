// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeVersionsRequest extends TeaModel {
    /**
     * <p>The resource type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourceTypeVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeVersionsRequest self = new ListResourceTypeVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeVersionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
