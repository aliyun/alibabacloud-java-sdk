// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDevicesResponseBody body;

    public static DescribeDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponse self = new DescribeDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDevicesResponse setBody(DescribeDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDevicesResponseBody getBody() {
        return this.body;
    }

}
