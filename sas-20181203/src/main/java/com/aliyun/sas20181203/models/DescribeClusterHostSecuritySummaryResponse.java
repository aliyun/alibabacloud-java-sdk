// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterHostSecuritySummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterHostSecuritySummaryResponseBody body;

    public static DescribeClusterHostSecuritySummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterHostSecuritySummaryResponse self = new DescribeClusterHostSecuritySummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterHostSecuritySummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterHostSecuritySummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterHostSecuritySummaryResponse setBody(DescribeClusterHostSecuritySummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterHostSecuritySummaryResponseBody getBody() {
        return this.body;
    }

}
