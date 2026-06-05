// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteHiveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHiveResponseBody body;

    public static DeleteHiveResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHiveResponse self = new DeleteHiveResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHiveResponse setBody(DeleteHiveResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHiveResponseBody getBody() {
        return this.body;
    }

}
