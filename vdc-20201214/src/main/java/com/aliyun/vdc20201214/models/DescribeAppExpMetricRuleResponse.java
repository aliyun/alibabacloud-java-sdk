// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppExpMetricRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppExpMetricRuleResponseBody body;

    public static DescribeAppExpMetricRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppExpMetricRuleResponse self = new DescribeAppExpMetricRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppExpMetricRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppExpMetricRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppExpMetricRuleResponse setBody(DescribeAppExpMetricRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppExpMetricRuleResponseBody getBody() {
        return this.body;
    }

}
