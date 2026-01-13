// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRecallManagementServiceResponseBody body;

    public static CreateRecallManagementServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceResponse self = new CreateRecallManagementServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRecallManagementServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRecallManagementServiceResponse setBody(CreateRecallManagementServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRecallManagementServiceResponseBody getBody() {
        return this.body;
    }

}
