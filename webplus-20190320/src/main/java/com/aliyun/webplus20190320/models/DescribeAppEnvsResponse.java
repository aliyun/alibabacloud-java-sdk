// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppEnvsResponseBody body;

    public static DescribeAppEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvsResponse self = new DescribeAppEnvsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppEnvsResponse setBody(DescribeAppEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppEnvsResponseBody getBody() {
        return this.body;
    }

}
