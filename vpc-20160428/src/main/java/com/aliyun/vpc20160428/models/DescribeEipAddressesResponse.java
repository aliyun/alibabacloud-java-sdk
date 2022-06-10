// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEipAddressesResponseBody body;

    public static DescribeEipAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesResponse self = new DescribeEipAddressesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipAddressesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipAddressesResponse setBody(DescribeEipAddressesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipAddressesResponseBody getBody() {
        return this.body;
    }

}
