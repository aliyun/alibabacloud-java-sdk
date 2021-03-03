// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeLogServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogServiceStatusResponseBody body;

    public static DescribeLogServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogServiceStatusResponse self = new DescribeLogServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogServiceStatusResponse setBody(DescribeLogServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogServiceStatusResponseBody getBody() {
        return this.body;
    }

}
