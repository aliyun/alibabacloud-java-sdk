// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeDeviceVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceVersionDetailResponseBody body;

    public static DescribeDeviceVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceVersionDetailResponse self = new DescribeDeviceVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceVersionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceVersionDetailResponse setBody(DescribeDeviceVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceVersionDetailResponseBody getBody() {
        return this.body;
    }

}
