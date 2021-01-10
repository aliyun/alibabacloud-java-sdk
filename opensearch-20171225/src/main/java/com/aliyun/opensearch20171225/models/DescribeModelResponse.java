// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModelResponseBody body;

    public static DescribeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelResponse self = new DescribeModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelResponse setBody(DescribeModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelResponseBody getBody() {
        return this.body;
    }

}
