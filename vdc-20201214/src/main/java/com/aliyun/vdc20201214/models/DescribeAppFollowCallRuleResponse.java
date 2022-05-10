// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppFollowCallRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppFollowCallRuleResponseBody body;

    public static DescribeAppFollowCallRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppFollowCallRuleResponse self = new DescribeAppFollowCallRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppFollowCallRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppFollowCallRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppFollowCallRuleResponse setBody(DescribeAppFollowCallRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppFollowCallRuleResponseBody getBody() {
        return this.body;
    }

}
