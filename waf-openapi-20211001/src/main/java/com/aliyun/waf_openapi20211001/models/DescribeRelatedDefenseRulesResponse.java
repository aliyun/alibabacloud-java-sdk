// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRelatedDefenseRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRelatedDefenseRulesResponseBody body;

    public static DescribeRelatedDefenseRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedDefenseRulesResponse self = new DescribeRelatedDefenseRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedDefenseRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRelatedDefenseRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRelatedDefenseRulesResponse setBody(DescribeRelatedDefenseRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRelatedDefenseRulesResponseBody getBody() {
        return this.body;
    }

}
