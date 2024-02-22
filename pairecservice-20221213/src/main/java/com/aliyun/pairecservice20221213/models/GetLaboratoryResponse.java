// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLaboratoryResponseBody body;

    public static GetLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLaboratoryResponse self = new GetLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public GetLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLaboratoryResponse setBody(GetLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLaboratoryResponseBody getBody() {
        return this.body;
    }

}
