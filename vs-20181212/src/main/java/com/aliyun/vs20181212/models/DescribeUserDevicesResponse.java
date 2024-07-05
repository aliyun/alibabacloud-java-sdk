// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeUserDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeUserDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserDevicesResponse setBody(DescribeUserDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserDevicesResponseBody getBody() {
        return this.body;
    }

}
