// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StartTrafficControlTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTrafficControlTaskResponseBody self = new StartTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
