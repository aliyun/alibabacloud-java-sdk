// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePublicIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePublicIpAddressResponseBody body;

    public static DescribePublicIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicIpAddressResponse self = new DescribePublicIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublicIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePublicIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePublicIpAddressResponse setBody(DescribePublicIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePublicIpAddressResponseBody getBody() {
        return this.body;
    }

}
