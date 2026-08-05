// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCredentialsResponseBody body;

    public static DeleteCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialsResponse self = new DeleteCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCredentialsResponse setBody(DeleteCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCredentialsResponseBody getBody() {
        return this.body;
    }

}
