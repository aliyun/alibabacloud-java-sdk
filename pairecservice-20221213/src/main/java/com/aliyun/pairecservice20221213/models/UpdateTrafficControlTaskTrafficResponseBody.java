// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficControlTaskTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskTrafficResponseBody self = new UpdateTrafficControlTaskTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
