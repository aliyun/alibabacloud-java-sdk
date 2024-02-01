// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6GatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpv6GatewayAttributeResponseBody body;

    public static DescribeIpv6GatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6GatewayAttributeResponse self = new DescribeIpv6GatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6GatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv6GatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpv6GatewayAttributeResponse setBody(DescribeIpv6GatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv6GatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
