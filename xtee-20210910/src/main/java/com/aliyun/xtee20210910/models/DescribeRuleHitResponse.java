// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleHitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitResponseBody body;

    public static DescribeRuleHitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitResponse self = new DescribeRuleHitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitResponse setBody(DescribeRuleHitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitResponseBody getBody() {
        return this.body;
    }

}
