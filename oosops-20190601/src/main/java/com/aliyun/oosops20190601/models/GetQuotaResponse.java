// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuotaResponseBody body;

    public static GetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponse self = new GetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaResponse setBody(GetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaResponseBody getBody() {
        return this.body;
    }

}
