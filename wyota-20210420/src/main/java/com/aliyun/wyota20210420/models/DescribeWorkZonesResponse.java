// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeWorkZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWorkZonesResponseBody body;

    public static DescribeWorkZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkZonesResponse self = new DescribeWorkZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkZonesResponse setBody(DescribeWorkZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkZonesResponseBody getBody() {
        return this.body;
    }

}
