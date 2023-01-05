// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTagHitsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagHitsSummaryResponseBody body;

    public static DescribeTagHitsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagHitsSummaryResponse self = new DescribeTagHitsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagHitsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagHitsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagHitsSummaryResponse setBody(DescribeTagHitsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagHitsSummaryResponseBody getBody() {
        return this.body;
    }

}
