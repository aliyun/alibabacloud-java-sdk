// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLaboratoryResponseBody body;

    public static DeleteLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaboratoryResponse self = new DeleteLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLaboratoryResponse setBody(DeleteLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLaboratoryResponseBody getBody() {
        return this.body;
    }

}
