// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeSandboxTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSandboxTemplatesResponseBody body;

    public static DescribeSandboxTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxTemplatesResponse self = new DescribeSandboxTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSandboxTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSandboxTemplatesResponse setBody(DescribeSandboxTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSandboxTemplatesResponseBody getBody() {
        return this.body;
    }

}
