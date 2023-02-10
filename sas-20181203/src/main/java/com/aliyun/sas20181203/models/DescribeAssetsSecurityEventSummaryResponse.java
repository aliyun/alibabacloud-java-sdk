// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
