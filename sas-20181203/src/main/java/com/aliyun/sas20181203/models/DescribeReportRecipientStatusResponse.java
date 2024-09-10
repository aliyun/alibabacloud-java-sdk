// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeReportRecipientStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReportRecipientStatusResponseBody body;

    public static DescribeReportRecipientStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportRecipientStatusResponse self = new DescribeReportRecipientStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReportRecipientStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReportRecipientStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReportRecipientStatusResponse setBody(DescribeReportRecipientStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReportRecipientStatusResponseBody getBody() {
        return this.body;
    }

}
