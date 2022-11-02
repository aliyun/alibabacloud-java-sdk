// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRuleGroupsResponseBody body;

    public static DescribeRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleGroupsResponse self = new DescribeRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleGroupsResponse setBody(DescribeRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
