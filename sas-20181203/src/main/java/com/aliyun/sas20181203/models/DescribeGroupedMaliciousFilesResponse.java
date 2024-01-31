// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupedMaliciousFilesResponseBody body;

    public static DescribeGroupedMaliciousFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedMaliciousFilesResponse self = new DescribeGroupedMaliciousFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedMaliciousFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedMaliciousFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupedMaliciousFilesResponse setBody(DescribeGroupedMaliciousFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedMaliciousFilesResponseBody getBody() {
        return this.body;
    }

}
