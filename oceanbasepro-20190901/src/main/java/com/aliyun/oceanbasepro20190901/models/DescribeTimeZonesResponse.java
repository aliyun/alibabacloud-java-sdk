// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTimeZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTimeZonesResponseBody body;

    public static DescribeTimeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimeZonesResponse self = new DescribeTimeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTimeZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTimeZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTimeZonesResponse setBody(DescribeTimeZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTimeZonesResponseBody getBody() {
        return this.body;
    }

}
