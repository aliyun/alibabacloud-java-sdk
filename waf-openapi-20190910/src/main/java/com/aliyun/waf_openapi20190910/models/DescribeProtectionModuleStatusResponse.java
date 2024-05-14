// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtectionModuleStatusResponseBody body;

    public static DescribeProtectionModuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleStatusResponse self = new DescribeProtectionModuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtectionModuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtectionModuleStatusResponse setBody(DescribeProtectionModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleStatusResponseBody getBody() {
        return this.body;
    }

}
