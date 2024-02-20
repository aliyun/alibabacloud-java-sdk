// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopRuleIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopRuleIdResponseBody body;

    public static DescribeRuleHitsTopRuleIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopRuleIdResponse self = new DescribeRuleHitsTopRuleIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopRuleIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopRuleIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopRuleIdResponse setBody(DescribeRuleHitsTopRuleIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopRuleIdResponseBody getBody() {
        return this.body;
    }

}
