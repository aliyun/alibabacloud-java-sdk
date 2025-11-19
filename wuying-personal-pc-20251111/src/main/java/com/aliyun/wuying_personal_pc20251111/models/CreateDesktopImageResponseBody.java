// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateDesktopImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateDesktopImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopImageResponseBody self = new CreateDesktopImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDesktopImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDesktopImageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateDesktopImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDesktopImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDesktopImageResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
