// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class RemoveImageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static RemoveImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageResponseBody self = new RemoveImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
