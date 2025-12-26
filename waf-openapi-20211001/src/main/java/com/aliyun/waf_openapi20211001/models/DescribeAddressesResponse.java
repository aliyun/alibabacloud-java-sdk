// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAddressesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAddressesResponseBody body;

    public static DescribeAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressesResponse self = new DescribeAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddressesResponse setBody(DescribeAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddressesResponseBody getBody() {
        return this.body;
    }

}
