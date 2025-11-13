// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterScannerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterScannerListResponseBody body;

    public static DescribeClusterScannerListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterScannerListResponse self = new DescribeClusterScannerListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterScannerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterScannerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterScannerListResponse setBody(DescribeClusterScannerListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterScannerListResponseBody getBody() {
        return this.body;
    }

}
