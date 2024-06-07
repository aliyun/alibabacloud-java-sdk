// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTargetResponseBody self = new DeleteTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
