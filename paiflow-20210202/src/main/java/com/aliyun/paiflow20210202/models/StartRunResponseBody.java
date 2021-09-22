// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class StartRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static StartRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRunResponseBody self = new StartRunResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
