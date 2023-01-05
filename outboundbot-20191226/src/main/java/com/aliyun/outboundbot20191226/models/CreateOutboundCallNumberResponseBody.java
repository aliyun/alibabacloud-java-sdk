// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateOutboundCallNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutboundCallNumberId")
    public String outboundCallNumberId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOutboundCallNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallNumberResponseBody self = new CreateOutboundCallNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOutboundCallNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateOutboundCallNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOutboundCallNumberResponseBody setOutboundCallNumberId(String outboundCallNumberId) {
        this.outboundCallNumberId = outboundCallNumberId;
        return this;
    }
    public String getOutboundCallNumberId() {
        return this.outboundCallNumberId;
    }

    public CreateOutboundCallNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOutboundCallNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
