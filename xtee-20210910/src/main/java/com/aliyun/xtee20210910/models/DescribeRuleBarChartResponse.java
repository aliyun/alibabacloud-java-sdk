// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleBarChartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleBarChartResponseBody body;

    public static DescribeRuleBarChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleBarChartResponse self = new DescribeRuleBarChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleBarChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleBarChartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleBarChartResponse setBody(DescribeRuleBarChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleBarChartResponseBody getBody() {
        return this.body;
    }

}
