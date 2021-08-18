// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurSummaryOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIceDurSummaryOverviewResponseBody body;

    public static DescribeIceDurSummaryOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurSummaryOverviewResponse self = new DescribeIceDurSummaryOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurSummaryOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIceDurSummaryOverviewResponse setBody(DescribeIceDurSummaryOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIceDurSummaryOverviewResponseBody getBody() {
        return this.body;
    }

}
