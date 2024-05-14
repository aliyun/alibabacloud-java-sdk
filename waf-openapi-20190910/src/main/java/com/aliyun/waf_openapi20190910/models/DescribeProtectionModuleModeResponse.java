// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtectionModuleModeResponseBody body;

    public static DescribeProtectionModuleModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleModeResponse self = new DescribeProtectionModuleModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtectionModuleModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtectionModuleModeResponse setBody(DescribeProtectionModuleModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleModeResponseBody getBody() {
        return this.body;
    }

}
