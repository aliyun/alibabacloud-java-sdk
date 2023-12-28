// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class SetFlowControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetFlowControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetFlowControlResponseBody self = new SetFlowControlResponseBody();
        return TeaModel.build(map, self);
    }

    public SetFlowControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
