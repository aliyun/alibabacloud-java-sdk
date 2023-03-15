// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeRequest extends TeaModel {
    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about resource types supported by Resource Orchestration Service (ROS), see [List of resource types by service](~~127039~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeRequest self = new GetResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
