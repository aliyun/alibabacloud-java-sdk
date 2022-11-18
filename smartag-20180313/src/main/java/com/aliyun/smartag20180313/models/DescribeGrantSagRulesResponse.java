// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantSagRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGrantSagRulesResponseBody body;

    public static DescribeGrantSagRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantSagRulesResponse self = new DescribeGrantSagRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantSagRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGrantSagRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGrantSagRulesResponse setBody(DescribeGrantSagRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGrantSagRulesResponseBody getBody() {
        return this.body;
    }

}
