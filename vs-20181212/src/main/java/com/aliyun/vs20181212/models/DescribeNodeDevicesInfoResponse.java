// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeNodeDevicesInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeDevicesInfoResponseBody body;

    public static DescribeNodeDevicesInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeDevicesInfoResponse self = new DescribeNodeDevicesInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeDevicesInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeDevicesInfoResponse setBody(DescribeNodeDevicesInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeDevicesInfoResponseBody getBody() {
        return this.body;
    }

}
