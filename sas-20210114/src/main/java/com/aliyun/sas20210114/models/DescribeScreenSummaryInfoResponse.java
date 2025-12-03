// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSummaryInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenSummaryInfoResponseBody body;

    public static DescribeScreenSummaryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSummaryInfoResponse self = new DescribeScreenSummaryInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSummaryInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenSummaryInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenSummaryInfoResponse setBody(DescribeScreenSummaryInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenSummaryInfoResponseBody getBody() {
        return this.body;
    }

}
