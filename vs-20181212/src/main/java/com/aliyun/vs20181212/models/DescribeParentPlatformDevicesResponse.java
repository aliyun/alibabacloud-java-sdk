// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParentPlatformDevicesResponseBody body;

    public static DescribeParentPlatformDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformDevicesResponse self = new DescribeParentPlatformDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParentPlatformDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParentPlatformDevicesResponse setBody(DescribeParentPlatformDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

}
