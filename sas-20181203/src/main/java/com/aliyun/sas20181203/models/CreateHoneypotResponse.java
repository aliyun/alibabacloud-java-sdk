// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHoneypotResponseBody body;

    public static CreateHoneypotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotResponse self = new CreateHoneypotResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoneypotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoneypotResponse setBody(CreateHoneypotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoneypotResponseBody getBody() {
        return this.body;
    }

}
