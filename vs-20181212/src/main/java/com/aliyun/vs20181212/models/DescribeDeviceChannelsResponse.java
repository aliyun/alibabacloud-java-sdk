// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeviceChannelsResponseBody body;

    public static DescribeDeviceChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceChannelsResponse self = new DescribeDeviceChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeviceChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeviceChannelsResponse setBody(DescribeDeviceChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceChannelsResponseBody getBody() {
        return this.body;
    }

}
