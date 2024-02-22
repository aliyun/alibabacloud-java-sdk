// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLaboratoryResponseBody body;

    public static CreateLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLaboratoryResponse self = new CreateLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLaboratoryResponse setBody(CreateLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLaboratoryResponseBody getBody() {
        return this.body;
    }

}
