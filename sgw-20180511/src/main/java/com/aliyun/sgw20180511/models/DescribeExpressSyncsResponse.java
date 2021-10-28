// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExpressSyncsResponseBody body;

    public static DescribeExpressSyncsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncsResponse self = new DescribeExpressSyncsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressSyncsResponse setBody(DescribeExpressSyncsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressSyncsResponseBody getBody() {
        return this.body;
    }

}
