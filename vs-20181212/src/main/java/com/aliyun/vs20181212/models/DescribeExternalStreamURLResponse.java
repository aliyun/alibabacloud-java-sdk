// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeExternalStreamURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExternalStreamURLResponseBody body;

    public static DescribeExternalStreamURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalStreamURLResponse self = new DescribeExternalStreamURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExternalStreamURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExternalStreamURLResponse setBody(DescribeExternalStreamURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExternalStreamURLResponseBody getBody() {
        return this.body;
    }

}
