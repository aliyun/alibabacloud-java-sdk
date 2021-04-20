// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAiotDevicesResponseBody body;

    public static DescribeAiotDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotDevicesResponse self = new DescribeAiotDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiotDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiotDevicesResponse setBody(DescribeAiotDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiotDevicesResponseBody getBody() {
        return this.body;
    }

}
