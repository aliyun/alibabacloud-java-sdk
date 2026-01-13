// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecallManagementServiceVersionConfigResponseBody body;

    public static DeleteRecallManagementServiceVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceVersionConfigResponse self = new DeleteRecallManagementServiceVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecallManagementServiceVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecallManagementServiceVersionConfigResponse setBody(DeleteRecallManagementServiceVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecallManagementServiceVersionConfigResponseBody getBody() {
        return this.body;
    }

}
