// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteMessageContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageContactResponseBody body;

    public static DeleteMessageContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageContactResponse self = new DeleteMessageContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageContactResponse setBody(DeleteMessageContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageContactResponseBody getBody() {
        return this.body;
    }

}
