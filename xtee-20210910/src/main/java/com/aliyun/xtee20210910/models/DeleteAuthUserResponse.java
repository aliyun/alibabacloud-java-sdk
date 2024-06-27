// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteAuthUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthUserResponseBody body;

    public static DeleteAuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthUserResponse self = new DeleteAuthUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthUserResponse setBody(DeleteAuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthUserResponseBody getBody() {
        return this.body;
    }

}
