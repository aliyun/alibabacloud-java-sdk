// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ReceiveNotifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static ReceiveNotifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiveNotifyResponseBody self = new ReceiveNotifyResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiveNotifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveNotifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
