// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopClientIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopClientIpResponseBody body;

    public static DescribeRuleHitsTopClientIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopClientIpResponse self = new DescribeRuleHitsTopClientIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopClientIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopClientIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopClientIpResponse setBody(DescribeRuleHitsTopClientIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopClientIpResponseBody getBody() {
        return this.body;
    }

}
