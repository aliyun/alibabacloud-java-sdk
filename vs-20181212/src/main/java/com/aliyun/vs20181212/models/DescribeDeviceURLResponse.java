// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceURLResponseBody body;

    public static DescribeDeviceURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceURLResponse self = new DescribeDeviceURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceURLResponse setBody(DescribeDeviceURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceURLResponseBody getBody() {
        return this.body;
    }

}
