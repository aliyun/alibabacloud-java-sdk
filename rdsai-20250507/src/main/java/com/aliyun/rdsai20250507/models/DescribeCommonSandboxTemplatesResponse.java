// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeCommonSandboxTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonSandboxTemplatesResponseBody body;

    public static DescribeCommonSandboxTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonSandboxTemplatesResponse self = new DescribeCommonSandboxTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonSandboxTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonSandboxTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonSandboxTemplatesResponse setBody(DescribeCommonSandboxTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonSandboxTemplatesResponseBody getBody() {
        return this.body;
    }

}
