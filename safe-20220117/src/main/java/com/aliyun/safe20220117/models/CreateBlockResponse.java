// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBlockResponseBody body;

    public static CreateBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockResponse self = new CreateBlockResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBlockResponse setBody(CreateBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBlockResponseBody getBody() {
        return this.body;
    }

}
