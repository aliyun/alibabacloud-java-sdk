// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResolverAvailableZonesResponseBody body;

    public static DescribeResolverAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverAvailableZonesResponse self = new DescribeResolverAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResolverAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResolverAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResolverAvailableZonesResponse setBody(DescribeResolverAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResolverAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
