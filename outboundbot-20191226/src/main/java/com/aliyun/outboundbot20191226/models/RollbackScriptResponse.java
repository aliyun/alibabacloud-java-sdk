// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class RollbackScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackScriptResponseBody body;

    public static RollbackScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackScriptResponse self = new RollbackScriptResponse();
        return TeaModel.build(map, self);
    }

    public RollbackScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackScriptResponse setBody(RollbackScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackScriptResponseBody getBody() {
        return this.body;
    }

}
