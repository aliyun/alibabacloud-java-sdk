// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigIndexResponseBody body;

    public static DescribeConfigIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigIndexResponse self = new DescribeConfigIndexResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigIndexResponse setBody(DescribeConfigIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigIndexResponseBody getBody() {
        return this.body;
    }

}
