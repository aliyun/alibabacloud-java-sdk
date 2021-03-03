// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeProtectionModuleModeResponse setBody(DescribeProtectionModuleModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleModeResponseBody getBody() {
        return this.body;
    }

}
