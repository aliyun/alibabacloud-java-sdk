// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBaseSystemRulesResponseBody body;

    public static DescribeBaseSystemRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseSystemRulesResponse self = new DescribeBaseSystemRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBaseSystemRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBaseSystemRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBaseSystemRulesResponse setBody(DescribeBaseSystemRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBaseSystemRulesResponseBody getBody() {
        return this.body;
    }

}
