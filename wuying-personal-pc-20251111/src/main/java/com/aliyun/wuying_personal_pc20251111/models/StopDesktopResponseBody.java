// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StopDesktopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static StopDesktopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopResponseBody self = new StopDesktopResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDesktopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopDesktopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDesktopResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
