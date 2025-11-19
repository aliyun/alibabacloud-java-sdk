// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StartDesktopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static StartDesktopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopResponseBody self = new StartDesktopResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDesktopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartDesktopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDesktopResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
