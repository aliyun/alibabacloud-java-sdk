// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

}
