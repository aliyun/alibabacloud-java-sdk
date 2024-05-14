// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtectionModuleRulesResponseBody body;

    public static DescribeProtectionModuleRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleRulesResponse self = new DescribeProtectionModuleRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtectionModuleRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtectionModuleRulesResponse setBody(DescribeProtectionModuleRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleRulesResponseBody getBody() {
        return this.body;
    }

}
