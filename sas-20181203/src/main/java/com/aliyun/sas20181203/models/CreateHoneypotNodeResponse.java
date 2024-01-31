// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHoneypotNodeResponseBody body;

    public static CreateHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotNodeResponse self = new CreateHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoneypotNodeResponse setBody(CreateHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
