// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConfigTemplatesResponseBody body;

    public static DescribeConfigTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigTemplatesResponse self = new DescribeConfigTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigTemplatesResponse setBody(DescribeConfigTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigTemplatesResponseBody getBody() {
        return this.body;
    }

}
