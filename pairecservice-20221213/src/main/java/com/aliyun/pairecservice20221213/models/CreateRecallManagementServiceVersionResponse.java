// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecallManagementServiceVersionResponseBody body;

    public static CreateRecallManagementServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionResponse self = new CreateRecallManagementServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecallManagementServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecallManagementServiceVersionResponse setBody(CreateRecallManagementServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecallManagementServiceVersionResponseBody getBody() {
        return this.body;
    }

}
