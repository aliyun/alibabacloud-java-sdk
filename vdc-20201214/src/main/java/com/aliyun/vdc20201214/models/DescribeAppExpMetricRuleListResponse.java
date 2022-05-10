// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppExpMetricRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppExpMetricRuleListResponseBody body;

    public static DescribeAppExpMetricRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppExpMetricRuleListResponse self = new DescribeAppExpMetricRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppExpMetricRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppExpMetricRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppExpMetricRuleListResponse setBody(DescribeAppExpMetricRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppExpMetricRuleListResponseBody getBody() {
        return this.body;
    }

}
