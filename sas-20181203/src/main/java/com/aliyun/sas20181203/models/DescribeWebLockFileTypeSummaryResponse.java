// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockFileTypeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockFileTypeSummaryResponseBody body;

    public static DescribeWebLockFileTypeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockFileTypeSummaryResponse self = new DescribeWebLockFileTypeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockFileTypeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockFileTypeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockFileTypeSummaryResponse setBody(DescribeWebLockFileTypeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockFileTypeSummaryResponseBody getBody() {
        return this.body;
    }

}
