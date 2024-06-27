// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleCountByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleCountByUserIdResponseBody body;

    public static DescribeRuleCountByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleCountByUserIdResponse self = new DescribeRuleCountByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleCountByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleCountByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleCountByUserIdResponse setBody(DescribeRuleCountByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleCountByUserIdResponseBody getBody() {
        return this.body;
    }

}
