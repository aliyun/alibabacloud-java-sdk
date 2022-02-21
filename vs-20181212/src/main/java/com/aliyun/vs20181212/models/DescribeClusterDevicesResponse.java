// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClusterDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterDevicesResponseBody body;

    public static DescribeClusterDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDevicesResponse self = new DescribeClusterDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterDevicesResponse setBody(DescribeClusterDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterDevicesResponseBody getBody() {
        return this.body;
    }

}
