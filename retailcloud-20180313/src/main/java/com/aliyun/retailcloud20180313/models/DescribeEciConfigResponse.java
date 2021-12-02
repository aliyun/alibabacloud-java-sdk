// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEciConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEciConfigResponseBody body;

    public static DescribeEciConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciConfigResponse self = new DescribeEciConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEciConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEciConfigResponse setBody(DescribeEciConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEciConfigResponseBody getBody() {
        return this.body;
    }

}
