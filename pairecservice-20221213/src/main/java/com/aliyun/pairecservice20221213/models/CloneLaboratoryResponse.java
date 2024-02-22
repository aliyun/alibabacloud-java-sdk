// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneLaboratoryResponseBody body;

    public static CloneLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneLaboratoryResponse self = new CloneLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public CloneLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneLaboratoryResponse setBody(CloneLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneLaboratoryResponseBody getBody() {
        return this.body;
    }

}
