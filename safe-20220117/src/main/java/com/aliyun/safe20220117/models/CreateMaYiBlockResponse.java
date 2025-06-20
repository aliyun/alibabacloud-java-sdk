// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateMaYiBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMaYiBlockResponseBody body;

    public static CreateMaYiBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaYiBlockResponse self = new CreateMaYiBlockResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaYiBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaYiBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaYiBlockResponse setBody(CreateMaYiBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaYiBlockResponseBody getBody() {
        return this.body;
    }

}
