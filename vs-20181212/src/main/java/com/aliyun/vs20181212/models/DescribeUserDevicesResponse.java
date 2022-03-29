// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeUserDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserDevicesResponseBody body;

    public static DescribeUserDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDevicesResponse self = new DescribeUserDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserDevicesResponse setBody(DescribeUserDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDevicesResponseBody getBody() {
        return this.body;
    }

}
