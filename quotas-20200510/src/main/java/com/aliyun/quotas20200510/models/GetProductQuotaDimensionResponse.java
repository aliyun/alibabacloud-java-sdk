// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaDimensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductQuotaDimensionResponseBody body;

    public static GetProductQuotaDimensionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductQuotaDimensionResponse self = new GetProductQuotaDimensionResponse();
        return TeaModel.build(map, self);
    }

    public GetProductQuotaDimensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductQuotaDimensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductQuotaDimensionResponse setBody(GetProductQuotaDimensionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductQuotaDimensionResponseBody getBody() {
        return this.body;
    }

}
