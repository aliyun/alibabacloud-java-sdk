// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SplitTrafficControlTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SplitTrafficControlTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SplitTrafficControlTargetResponseBody self = new SplitTrafficControlTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public SplitTrafficControlTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
