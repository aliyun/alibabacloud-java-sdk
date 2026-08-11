// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateScriptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateScriptVersionResponseBody body;

    public static UpdateScriptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptVersionResponse self = new UpdateScriptVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScriptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScriptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScriptVersionResponse setBody(UpdateScriptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScriptVersionResponseBody getBody() {
        return this.body;
    }

}
