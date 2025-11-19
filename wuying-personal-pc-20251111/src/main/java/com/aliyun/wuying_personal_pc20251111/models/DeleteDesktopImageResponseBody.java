// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DeleteDesktopImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopImageResponseBody self = new DeleteDesktopImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDesktopImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteDesktopImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDesktopImageResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
