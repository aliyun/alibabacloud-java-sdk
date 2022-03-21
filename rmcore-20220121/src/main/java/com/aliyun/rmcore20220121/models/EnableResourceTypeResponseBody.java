// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class EnableResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public java.util.Map<String, ?> resourceType;

    public static EnableResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableResourceTypeResponseBody self = new EnableResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableResourceTypeResponseBody setResourceType(java.util.Map<String, ?> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.Map<String, ?> getResourceType() {
        return this.resourceType;
    }

}
