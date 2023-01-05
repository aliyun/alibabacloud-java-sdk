// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScriptResponseBody body;

    public static CreateScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptResponse self = new CreateScriptResponse();
        return TeaModel.build(map, self);
    }

    public CreateScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScriptResponse setBody(CreateScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScriptResponseBody getBody() {
        return this.body;
    }

}
