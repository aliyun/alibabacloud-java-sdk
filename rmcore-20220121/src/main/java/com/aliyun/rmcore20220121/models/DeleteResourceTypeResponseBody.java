// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public java.util.Map<String, ?> resourceType;

    public static DeleteResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceTypeResponseBody self = new DeleteResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceTypeResponseBody setResourceType(java.util.Map<String, ?> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.Map<String, ?> getResourceType() {
        return this.resourceType;
    }

}
