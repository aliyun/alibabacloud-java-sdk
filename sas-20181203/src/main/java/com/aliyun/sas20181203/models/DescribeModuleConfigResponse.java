// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModuleConfigResponseBody body;

    public static DescribeModuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleConfigResponse self = new DescribeModuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModuleConfigResponse setBody(DescribeModuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModuleConfigResponseBody getBody() {
        return this.body;
    }

}
