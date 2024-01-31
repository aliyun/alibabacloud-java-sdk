// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductQuotaResponseBody body;

    public static GetProductQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaResponse self = new GetProductQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductQuotaResponse setBody(GetProductQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductQuotaResponseBody getBody() {
        return this.body;
    }

}
