// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DeleteDesktopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopResponseBody self = new DeleteDesktopResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDesktopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDesktopResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
