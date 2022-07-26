// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIndexResponseBody body;

    public static DeleteIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexResponse self = new DeleteIndexResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndexResponse setBody(DeleteIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndexResponseBody getBody() {
        return this.body;
    }

}
