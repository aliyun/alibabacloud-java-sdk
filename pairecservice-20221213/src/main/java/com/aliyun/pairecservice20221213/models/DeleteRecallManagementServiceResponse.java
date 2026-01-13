// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecallManagementServiceResponseBody body;

    public static DeleteRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecallManagementServiceResponse self = new DeleteRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecallManagementServiceResponse setBody(DeleteRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
