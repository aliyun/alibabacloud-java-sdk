// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class QueryResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public java.util.Map<String, ?> resourceType;

    public static QueryResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceTypeResponseBody self = new QueryResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourceTypeResponseBody setResourceType(java.util.Map<String, ?> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.Map<String, ?> getResourceType() {
        return this.resourceType;
    }

}
