// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantSecurityConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantSecurityConfigsResponseBody body;

    public static DescribeTenantSecurityConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantSecurityConfigsResponse self = new DescribeTenantSecurityConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantSecurityConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantSecurityConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantSecurityConfigsResponse setBody(DescribeTenantSecurityConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantSecurityConfigsResponseBody getBody() {
        return this.body;
    }

}
