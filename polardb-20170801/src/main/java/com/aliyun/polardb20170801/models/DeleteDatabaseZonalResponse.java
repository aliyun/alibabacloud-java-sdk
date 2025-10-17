// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDatabaseZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatabaseZonalResponseBody body;

    public static DeleteDatabaseZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseZonalResponse self = new DeleteDatabaseZonalResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabaseZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatabaseZonalResponse setBody(DeleteDatabaseZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabaseZonalResponseBody getBody() {
        return this.body;
    }

}
