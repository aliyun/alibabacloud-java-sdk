// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTenantBindNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTenantBindNumberResponseBody body;

    public static DescribeTenantBindNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantBindNumberResponse self = new DescribeTenantBindNumberResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantBindNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantBindNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantBindNumberResponse setBody(DescribeTenantBindNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantBindNumberResponseBody getBody() {
        return this.body;
    }

}
