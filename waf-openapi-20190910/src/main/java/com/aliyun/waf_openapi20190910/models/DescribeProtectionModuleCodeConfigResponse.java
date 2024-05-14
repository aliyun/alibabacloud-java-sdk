// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleCodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProtectionModuleCodeConfigResponseBody body;

    public static DescribeProtectionModuleCodeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleCodeConfigResponse self = new DescribeProtectionModuleCodeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleCodeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProtectionModuleCodeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProtectionModuleCodeConfigResponse setBody(DescribeProtectionModuleCodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleCodeConfigResponseBody getBody() {
        return this.body;
    }

}
