// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLaboratoryResponseBody body;

    public static UpdateLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLaboratoryResponse self = new UpdateLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLaboratoryResponse setBody(UpdateLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLaboratoryResponseBody getBody() {
        return this.body;
    }

}
