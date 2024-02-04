// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTenantResponseBody body;

    public static DescribeTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantResponse self = new DescribeTenantResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantResponse setBody(DescribeTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantResponseBody getBody() {
        return this.body;
    }

}
