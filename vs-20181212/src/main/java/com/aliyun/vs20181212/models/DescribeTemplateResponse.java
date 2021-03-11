// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTemplateResponseBody body;

    public static DescribeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResponse self = new DescribeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTemplateResponse setBody(DescribeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTemplateResponseBody getBody() {
        return this.body;
    }

}
