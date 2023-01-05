// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class PublishScriptForDebugResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishScriptForDebugResponseBody body;

    public static PublishScriptForDebugResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishScriptForDebugResponse self = new PublishScriptForDebugResponse();
        return TeaModel.build(map, self);
    }

    public PublishScriptForDebugResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishScriptForDebugResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishScriptForDebugResponse setBody(PublishScriptForDebugResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishScriptForDebugResponseBody getBody() {
        return this.body;
    }

}
