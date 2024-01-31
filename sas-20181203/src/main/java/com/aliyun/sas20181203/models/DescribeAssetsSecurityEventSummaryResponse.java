// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetsSecurityEventSummaryResponseBody body;

    public static DescribeAssetsSecurityEventSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsSecurityEventSummaryResponse self = new DescribeAssetsSecurityEventSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsSecurityEventSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetsSecurityEventSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetsSecurityEventSummaryResponse setBody(DescribeAssetsSecurityEventSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetsSecurityEventSummaryResponseBody getBody() {
        return this.body;
    }

}
