// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteSqlFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSqlFileResponseBody body;

    public static DeleteSqlFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlFileResponse self = new DeleteSqlFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSqlFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSqlFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSqlFileResponse setBody(DeleteSqlFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSqlFileResponseBody getBody() {
        return this.body;
    }

}
