// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppInstanceFileResponseBody body;

    public static DeleteAppInstanceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceFileResponse self = new DeleteAppInstanceFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppInstanceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppInstanceFileResponse setBody(DeleteAppInstanceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppInstanceFileResponseBody getBody() {
        return this.body;
    }

}
