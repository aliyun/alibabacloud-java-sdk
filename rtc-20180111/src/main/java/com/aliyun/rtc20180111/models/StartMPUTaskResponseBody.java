// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartMPUTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartMPUTaskResponseBody self = new StartMPUTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartMPUTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
