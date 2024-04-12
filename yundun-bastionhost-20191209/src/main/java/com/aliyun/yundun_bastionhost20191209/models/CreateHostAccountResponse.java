// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHostAccountResponseBody body;

    public static CreateHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponse self = new CreateHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHostAccountResponse setBody(CreateHostAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostAccountResponseBody getBody() {
        return this.body;
    }

}
