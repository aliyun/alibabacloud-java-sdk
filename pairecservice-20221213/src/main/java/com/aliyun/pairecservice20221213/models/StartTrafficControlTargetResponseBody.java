// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StartTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTrafficControlTargetResponseBody self = new StartTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
