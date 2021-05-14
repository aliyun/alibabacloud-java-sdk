// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCheckWarningSummaryResponse setBody(DescribeCheckWarningSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningSummaryResponseBody getBody() {
        return this.body;
    }

}
