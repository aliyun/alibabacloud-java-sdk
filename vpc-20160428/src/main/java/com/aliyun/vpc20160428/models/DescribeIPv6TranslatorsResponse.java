// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPv6TranslatorsResponseBody body;

    public static DescribeIPv6TranslatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorsResponse self = new DescribeIPv6TranslatorsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPv6TranslatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPv6TranslatorsResponse setBody(DescribeIPv6TranslatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPv6TranslatorsResponseBody getBody() {
        return this.body;
    }

}
