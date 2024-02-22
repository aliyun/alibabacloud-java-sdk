// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineLaboratoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineLaboratoryResponseBody body;

    public static OfflineLaboratoryResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineLaboratoryResponse self = new OfflineLaboratoryResponse();
        return TeaModel.build(map, self);
    }

    public OfflineLaboratoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineLaboratoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineLaboratoryResponse setBody(OfflineLaboratoryResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineLaboratoryResponseBody getBody() {
        return this.body;
    }

}
