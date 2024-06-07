// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTargetResponseBody self = new UpdateTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
