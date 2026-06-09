// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppFileResponseBody body;

    public static DeleteAppFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFileResponse self = new DeleteAppFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppFileResponse setBody(DeleteAppFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppFileResponseBody getBody() {
        return this.body;
    }

}
