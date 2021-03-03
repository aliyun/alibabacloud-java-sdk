// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleCodeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeProtectionModuleCodeConfigResponse setBody(DescribeProtectionModuleCodeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProtectionModuleCodeConfigResponseBody getBody() {
        return this.body;
    }

}
