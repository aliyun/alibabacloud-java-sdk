// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceSeatsResponseBody body;

    public static DescribeDeviceSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceSeatsResponse self = new DescribeDeviceSeatsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceSeatsResponse setBody(DescribeDeviceSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceSeatsResponseBody getBody() {
        return this.body;
    }

}
