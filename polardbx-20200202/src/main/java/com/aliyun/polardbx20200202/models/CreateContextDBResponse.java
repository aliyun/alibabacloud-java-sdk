// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContextDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDBResponseBody body;

    public static CreateContextDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDBResponse self = new CreateContextDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDBResponse setBody(CreateContextDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDBResponseBody getBody() {
        return this.body;
    }

}
