// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTargetResponseBody self = new StopTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
