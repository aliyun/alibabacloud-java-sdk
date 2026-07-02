// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthorizationByUserIdResponseBody body;

    public static DeleteAuthorizationByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationByUserIdResponse self = new DeleteAuthorizationByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationByUserIdResponse setBody(DeleteAuthorizationByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationByUserIdResponseBody getBody() {
        return this.body;
    }

}
