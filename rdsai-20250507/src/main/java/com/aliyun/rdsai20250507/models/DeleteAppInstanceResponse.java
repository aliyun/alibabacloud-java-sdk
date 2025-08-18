// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppInstanceResponseBody body;

    public static DeleteAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceResponse self = new DeleteAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppInstanceResponse setBody(DeleteAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppInstanceResponseBody getBody() {
        return this.body;
    }

}
