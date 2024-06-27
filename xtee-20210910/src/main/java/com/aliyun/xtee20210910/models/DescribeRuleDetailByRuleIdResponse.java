// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleDetailByRuleIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleDetailByRuleIdResponseBody body;

    public static DescribeRuleDetailByRuleIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleDetailByRuleIdResponse self = new DescribeRuleDetailByRuleIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleDetailByRuleIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleDetailByRuleIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleDetailByRuleIdResponse setBody(DescribeRuleDetailByRuleIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleDetailByRuleIdResponseBody getBody() {
        return this.body;
    }

}
