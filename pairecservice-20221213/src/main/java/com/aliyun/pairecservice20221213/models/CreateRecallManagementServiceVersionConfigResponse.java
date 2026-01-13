// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecallManagementServiceVersionConfigResponseBody body;

    public static CreateRecallManagementServiceVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionConfigResponse self = new CreateRecallManagementServiceVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecallManagementServiceVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecallManagementServiceVersionConfigResponse setBody(CreateRecallManagementServiceVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecallManagementServiceVersionConfigResponseBody getBody() {
        return this.body;
    }

}
