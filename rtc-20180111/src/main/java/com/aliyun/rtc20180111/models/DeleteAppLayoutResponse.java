// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteAppLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppLayoutResponseBody body;

    public static DeleteAppLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppLayoutResponse self = new DeleteAppLayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppLayoutResponse setBody(DeleteAppLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppLayoutResponseBody getBody() {
        return this.body;
    }

}
