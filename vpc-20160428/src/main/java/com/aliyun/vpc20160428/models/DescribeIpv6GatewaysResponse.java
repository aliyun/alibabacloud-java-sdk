// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpv6GatewaysResponseBody body;

    public static DescribeIpv6GatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewaysResponse self = new DescribeIpv6GatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv6GatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpv6GatewaysResponse setBody(DescribeIpv6GatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv6GatewaysResponseBody getBody() {
        return this.body;
    }

}
