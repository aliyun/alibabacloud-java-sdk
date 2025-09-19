// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePluginSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginSummaryResponseBody body;

    public static DescribePluginSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSummaryResponse self = new DescribePluginSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginSummaryResponse setBody(DescribePluginSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginSummaryResponseBody getBody() {
        return this.body;
    }

}
