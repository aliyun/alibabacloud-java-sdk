// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvInstanceHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppEnvInstanceHealthResponseBody body;

    public static DescribeAppEnvInstanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvInstanceHealthResponse self = new DescribeAppEnvInstanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvInstanceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppEnvInstanceHealthResponse setBody(DescribeAppEnvInstanceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppEnvInstanceHealthResponseBody getBody() {
        return this.body;
    }

}
