// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetProductQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetProductQuotaResponse setBody(GetProductQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductQuotaResponseBody getBody() {
        return this.body;
    }

}
