// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceAvailableZonesResponseBody body;

    public static DescribeInstanceAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableZonesResponse self = new DescribeInstanceAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAvailableZonesResponse setBody(DescribeInstanceAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
