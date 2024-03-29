// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubscribeResponseBody body;

    public static CreateSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeResponse self = new CreateSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscribeResponse setBody(CreateSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscribeResponseBody getBody() {
        return this.body;
    }

}
