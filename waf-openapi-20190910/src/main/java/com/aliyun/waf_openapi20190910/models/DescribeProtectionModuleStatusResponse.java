// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeProtectionModuleStatusResponse setBody(DescribeProtectionModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleStatusResponseBody getBody() {
        return this.body;
    }

}
