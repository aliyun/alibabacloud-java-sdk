// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIndexVersionResponseBody body;

    public static DeleteIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndexVersionResponse self = new DeleteIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndexVersionResponse setBody(DeleteIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndexVersionResponseBody getBody() {
        return this.body;
    }

}
