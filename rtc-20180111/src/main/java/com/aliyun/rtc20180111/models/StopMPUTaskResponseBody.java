// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopMPUTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopMPUTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopMPUTaskResponseBody self = new StopMPUTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopMPUTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
