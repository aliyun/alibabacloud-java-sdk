// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterPriceResponseBody body;

    public static DescribeDBClusterPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPriceResponse self = new DescribeDBClusterPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterPriceResponse setBody(DescribeDBClusterPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterPriceResponseBody getBody() {
        return this.body;
    }

}
