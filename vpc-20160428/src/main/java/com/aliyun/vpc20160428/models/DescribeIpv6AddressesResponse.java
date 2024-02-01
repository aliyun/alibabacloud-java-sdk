// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIpv6AddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpv6AddressesResponseBody body;

    public static DescribeIpv6AddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6AddressesResponse self = new DescribeIpv6AddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6AddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpv6AddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpv6AddressesResponse setBody(DescribeIpv6AddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpv6AddressesResponseBody getBody() {
        return this.body;
    }

}
