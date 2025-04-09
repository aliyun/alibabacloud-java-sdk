// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTenantBindNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
