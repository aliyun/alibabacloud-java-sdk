// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecRulesResponseBody body;

    public static DescribeApisecRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecRulesResponse self = new DescribeApisecRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecRulesResponse setBody(DescribeApisecRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecRulesResponseBody getBody() {
        return this.body;
    }

}
