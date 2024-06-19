// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBResponseBody body;

    public static DeleteDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResponse self = new DeleteDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBResponse setBody(DeleteDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBResponseBody getBody() {
        return this.body;
    }

}
