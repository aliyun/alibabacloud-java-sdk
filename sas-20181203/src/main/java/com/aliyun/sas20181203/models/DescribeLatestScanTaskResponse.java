// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLatestScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLatestScanTaskResponseBody body;

    public static DescribeLatestScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestScanTaskResponse self = new DescribeLatestScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLatestScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLatestScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLatestScanTaskResponse setBody(DescribeLatestScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLatestScanTaskResponseBody getBody() {
        return this.body;
    }

}
