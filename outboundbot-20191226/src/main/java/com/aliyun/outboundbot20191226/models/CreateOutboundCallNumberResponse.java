// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateOutboundCallNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOutboundCallNumberResponseBody body;

    public static CreateOutboundCallNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallNumberResponse self = new CreateOutboundCallNumberResponse();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOutboundCallNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOutboundCallNumberResponse setBody(CreateOutboundCallNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOutboundCallNumberResponseBody getBody() {
        return this.body;
    }

}
