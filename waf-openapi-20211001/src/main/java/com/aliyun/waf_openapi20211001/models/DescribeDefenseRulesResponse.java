// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseRulesResponseBody body;

    public static DescribeDefenseRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRulesResponse self = new DescribeDefenseRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseRulesResponse setBody(DescribeDefenseRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseRulesResponseBody getBody() {
        return this.body;
    }

}
