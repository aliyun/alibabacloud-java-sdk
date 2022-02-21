// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAIConfigResponseBody body;

    public static DescribeAIConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIConfigResponse self = new DescribeAIConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIConfigResponse setBody(DescribeAIConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIConfigResponseBody getBody() {
        return this.body;
    }

}
