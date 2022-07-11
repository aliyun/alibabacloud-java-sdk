// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteAgingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAgingResponseBody body;

    public static DeleteAgingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgingResponse self = new DeleteAgingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgingResponse setBody(DeleteAgingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgingResponseBody getBody() {
        return this.body;
    }

}
