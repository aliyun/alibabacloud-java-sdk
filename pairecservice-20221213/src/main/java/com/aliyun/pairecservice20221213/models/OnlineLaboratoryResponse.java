// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineLaboratoryResponseBody body;

    public static OnlineLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineLaboratoryResponse self = new OnlineLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public OnlineLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineLaboratoryResponse setBody(OnlineLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineLaboratoryResponseBody getBody() {
        return this.body;
    }

}
