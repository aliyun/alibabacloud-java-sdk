// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleFluctuationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHitRuleFluctuationResponseBody body;

    public static DescribeHitRuleFluctuationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleFluctuationResponse self = new DescribeHitRuleFluctuationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleFluctuationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHitRuleFluctuationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHitRuleFluctuationResponse setBody(DescribeHitRuleFluctuationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHitRuleFluctuationResponseBody getBody() {
        return this.body;
    }

}
