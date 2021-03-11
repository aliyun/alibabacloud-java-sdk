// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDeviceChannelsResponse setBody(DescribeDeviceChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceChannelsResponseBody getBody() {
        return this.body;
    }

}
