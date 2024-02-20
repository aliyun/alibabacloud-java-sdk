// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleHitsTopResourceResponseBody body;

    public static DescribeRuleHitsTopResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopResourceResponse self = new DescribeRuleHitsTopResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleHitsTopResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleHitsTopResourceResponse setBody(DescribeRuleHitsTopResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleHitsTopResourceResponseBody getBody() {
        return this.body;
    }

}
