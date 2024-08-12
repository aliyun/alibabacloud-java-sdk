// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DeleteAppOtaVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppOtaVersionsResponseBody body;

    public static DeleteAppOtaVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppOtaVersionsResponse self = new DeleteAppOtaVersionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppOtaVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppOtaVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppOtaVersionsResponse setBody(DeleteAppOtaVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppOtaVersionsResponseBody getBody() {
        return this.body;
    }

}
