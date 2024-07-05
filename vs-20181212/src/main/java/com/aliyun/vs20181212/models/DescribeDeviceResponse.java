// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceResponseBody body;

    public static DescribeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceResponse self = new DescribeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceResponse setBody(DescribeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceResponseBody getBody() {
        return this.body;
    }

}
