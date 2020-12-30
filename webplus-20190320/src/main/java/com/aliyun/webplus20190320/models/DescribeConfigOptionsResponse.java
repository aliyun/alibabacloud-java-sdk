// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigOptionsResponseBody body;

    public static DescribeConfigOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOptionsResponse self = new DescribeConfigOptionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigOptionsResponse setBody(DescribeConfigOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigOptionsResponseBody getBody() {
        return this.body;
    }

}
