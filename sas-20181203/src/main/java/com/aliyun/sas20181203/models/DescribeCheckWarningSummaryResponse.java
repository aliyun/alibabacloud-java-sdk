// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckWarningSummaryResponseBody body;

    public static DescribeCheckWarningSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningSummaryResponse self = new DescribeCheckWarningSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckWarningSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckWarningSummaryResponse setBody(DescribeCheckWarningSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningSummaryResponseBody getBody() {
        return this.body;
    }

}
