// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterImageSecuritySummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterImageSecuritySummaryResponseBody body;

    public static DescribeClusterImageSecuritySummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterImageSecuritySummaryResponse self = new DescribeClusterImageSecuritySummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterImageSecuritySummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterImageSecuritySummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterImageSecuritySummaryResponse setBody(DescribeClusterImageSecuritySummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterImageSecuritySummaryResponseBody getBody() {
        return this.body;
    }

}
