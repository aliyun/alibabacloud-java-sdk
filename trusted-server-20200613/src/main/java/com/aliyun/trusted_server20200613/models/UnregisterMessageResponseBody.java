// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class UnregisterMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnregisterMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterMessageResponseBody self = new UnregisterMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
