// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetObjectTotalResponseBody extends TeaModel {
    @NameInMap("ObjectCount")
    public Long objectCount;

    @NameInMap("RequestId")
    public String requestId;

    public static GetObjectTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTotalResponseBody self = new GetObjectTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetObjectTotalResponseBody setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }
    public Long getObjectCount() {
        return this.objectCount;
    }

    public GetObjectTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
