// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeDeviceURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDeviceURLResponse setBody(DescribeDeviceURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeviceURLResponseBody getBody() {
        return this.body;
    }

}
