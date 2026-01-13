// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecallManagementTableResponseBody body;

    public static DeleteRecallManagementTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementTableResponse self = new DeleteRecallManagementTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecallManagementTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecallManagementTableResponse setBody(DeleteRecallManagementTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecallManagementTableResponseBody getBody() {
        return this.body;
    }

}
