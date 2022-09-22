// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateFileTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFileTransResponseBody body;

    public static CreateFileTransResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileTransResponse self = new CreateFileTransResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileTransResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileTransResponse setBody(CreateFileTransResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileTransResponseBody getBody() {
        return this.body;
    }

}
