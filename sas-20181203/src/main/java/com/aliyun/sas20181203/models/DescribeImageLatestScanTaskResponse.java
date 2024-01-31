// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageLatestScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageLatestScanTaskResponseBody body;

    public static DescribeImageLatestScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLatestScanTaskResponse self = new DescribeImageLatestScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageLatestScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageLatestScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageLatestScanTaskResponse setBody(DescribeImageLatestScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageLatestScanTaskResponseBody getBody() {
        return this.body;
    }

}
