// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseRuleResponseBody body;

    public static DescribeDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleResponse self = new DescribeDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseRuleResponse setBody(DescribeDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
