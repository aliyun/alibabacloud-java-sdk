// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnRefreshQuotaResponseBody body;

    public static DescribeScdnRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnRefreshQuotaResponse self = new DescribeScdnRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnRefreshQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnRefreshQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnRefreshQuotaResponse setBody(DescribeScdnRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
