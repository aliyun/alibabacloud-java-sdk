// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigMapResponseBody body;

    public static DescribeConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigMapResponse self = new DescribeConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigMapResponse setBody(DescribeConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigMapResponseBody getBody() {
        return this.body;
    }

}
