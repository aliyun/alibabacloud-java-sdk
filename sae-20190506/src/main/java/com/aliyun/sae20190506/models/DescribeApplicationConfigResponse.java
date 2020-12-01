// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationConfigResponseBody body;

    public static DescribeApplicationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigResponse self = new DescribeApplicationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationConfigResponse setBody(DescribeApplicationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationConfigResponseBody getBody() {
        return this.body;
    }

}
