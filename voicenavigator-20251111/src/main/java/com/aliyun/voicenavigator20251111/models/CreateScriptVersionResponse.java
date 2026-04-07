// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateScriptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScriptVersionResponseBody body;

    public static CreateScriptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptVersionResponse self = new CreateScriptVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateScriptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScriptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScriptVersionResponse setBody(CreateScriptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScriptVersionResponseBody getBody() {
        return this.body;
    }

}
