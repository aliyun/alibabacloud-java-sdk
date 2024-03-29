// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDevicesDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsDevicesDataResponseBody body;

    public static DescribeVsDevicesDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDevicesDataResponse self = new DescribeVsDevicesDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDevicesDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDevicesDataResponse setBody(DescribeVsDevicesDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDevicesDataResponseBody getBody() {
        return this.body;
    }

}
