// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTaskResponseBody self = new DeleteTrafficControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
