// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecallManagementTableResponseBody body;

    public static CreateRecallManagementTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementTableResponse self = new CreateRecallManagementTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecallManagementTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecallManagementTableResponse setBody(CreateRecallManagementTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecallManagementTableResponseBody getBody() {
        return this.body;
    }

}
