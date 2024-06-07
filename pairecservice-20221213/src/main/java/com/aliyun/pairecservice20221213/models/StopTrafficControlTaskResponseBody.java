// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTaskResponseBody self = new StopTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
