// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteCSGClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCSGClientsResponseBody body;

    public static DeleteCSGClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCSGClientsResponse self = new DeleteCSGClientsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCSGClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCSGClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCSGClientsResponse setBody(DeleteCSGClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCSGClientsResponseBody getBody() {
        return this.body;
    }

}
