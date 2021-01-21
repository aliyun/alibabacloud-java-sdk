// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceTypes")
    @Validation(required = true)
    public java.util.List<String> resourceTypes;

    public static ListResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponse self = new ListResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponse setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

}
