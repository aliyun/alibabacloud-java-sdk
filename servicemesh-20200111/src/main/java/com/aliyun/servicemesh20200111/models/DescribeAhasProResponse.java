// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAhasProResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAhasProResponseBody body;

    public static DescribeAhasProResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAhasProResponse self = new DescribeAhasProResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAhasProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAhasProResponse setBody(DescribeAhasProResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAhasProResponseBody getBody() {
        return this.body;
    }

}
