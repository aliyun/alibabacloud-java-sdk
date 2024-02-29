// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ScaleQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleQuotaResponseBody body;

    public static ScaleQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleQuotaResponse self = new ScaleQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ScaleQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleQuotaResponse setBody(ScaleQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleQuotaResponseBody getBody() {
        return this.body;
    }

}
