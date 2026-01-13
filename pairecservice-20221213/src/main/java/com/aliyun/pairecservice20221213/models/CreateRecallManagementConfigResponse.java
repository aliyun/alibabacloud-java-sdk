// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecallManagementConfigResponseBody body;

    public static CreateRecallManagementConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementConfigResponse self = new CreateRecallManagementConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecallManagementConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecallManagementConfigResponse setBody(CreateRecallManagementConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecallManagementConfigResponseBody getBody() {
        return this.body;
    }

}
