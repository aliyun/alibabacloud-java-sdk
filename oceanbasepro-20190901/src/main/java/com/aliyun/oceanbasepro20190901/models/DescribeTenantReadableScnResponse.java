// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantReadableScnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTenantReadableScnResponseBody body;

    public static DescribeTenantReadableScnResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantReadableScnResponse self = new DescribeTenantReadableScnResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantReadableScnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantReadableScnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantReadableScnResponse setBody(DescribeTenantReadableScnResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantReadableScnResponseBody getBody() {
        return this.body;
    }

}
