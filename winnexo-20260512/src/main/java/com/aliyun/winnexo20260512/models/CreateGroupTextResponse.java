// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGroupTextResponseBody body;

    public static CreateGroupTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupTextResponse self = new CreateGroupTextResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupTextResponse setBody(CreateGroupTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGroupTextResponseBody getBody() {
        return this.body;
    }

}
