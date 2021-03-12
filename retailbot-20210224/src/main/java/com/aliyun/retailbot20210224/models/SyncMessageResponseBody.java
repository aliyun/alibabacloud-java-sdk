// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncMessageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SyncMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncMessageResponseBody self = new SyncMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
