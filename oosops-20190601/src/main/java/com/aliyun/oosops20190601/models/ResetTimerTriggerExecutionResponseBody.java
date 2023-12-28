// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ResetTimerTriggerExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetTimerTriggerExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetTimerTriggerExecutionResponseBody self = new ResetTimerTriggerExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetTimerTriggerExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
