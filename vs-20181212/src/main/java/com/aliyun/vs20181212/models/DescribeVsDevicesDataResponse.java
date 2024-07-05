// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDevicesDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVsDevicesDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDevicesDataResponse setBody(DescribeVsDevicesDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDevicesDataResponseBody getBody() {
        return this.body;
    }

}
