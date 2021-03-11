// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDeviceResponse setBody(DescribeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceResponseBody getBody() {
        return this.body;
    }

}
