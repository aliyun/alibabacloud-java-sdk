// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DisableResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public java.util.Map<String, ?> resourceType;

    public static DisableResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableResourceTypeResponseBody self = new DisableResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableResourceTypeResponseBody setResourceType(java.util.Map<String, ?> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.Map<String, ?> getResourceType() {
        return this.resourceType;
    }

}
