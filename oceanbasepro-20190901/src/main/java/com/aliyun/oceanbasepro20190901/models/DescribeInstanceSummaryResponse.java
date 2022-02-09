// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSummaryResponseBody body;

    public static DescribeInstanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSummaryResponse self = new DescribeInstanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSummaryResponse setBody(DescribeInstanceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSummaryResponseBody getBody() {
        return this.body;
    }

}
