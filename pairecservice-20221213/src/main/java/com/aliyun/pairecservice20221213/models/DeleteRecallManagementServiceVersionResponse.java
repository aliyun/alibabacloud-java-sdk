// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecallManagementServiceVersionResponseBody body;

    public static DeleteRecallManagementServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceVersionResponse self = new DeleteRecallManagementServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecallManagementServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecallManagementServiceVersionResponse setBody(DeleteRecallManagementServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecallManagementServiceVersionResponseBody getBody() {
        return this.body;
    }

}
