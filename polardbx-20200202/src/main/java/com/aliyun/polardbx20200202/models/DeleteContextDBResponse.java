// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteContextDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContextDBResponseBody body;

    public static DeleteContextDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextDBResponse self = new DeleteContextDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContextDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContextDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContextDBResponse setBody(DeleteContextDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContextDBResponseBody getBody() {
        return this.body;
    }

}
