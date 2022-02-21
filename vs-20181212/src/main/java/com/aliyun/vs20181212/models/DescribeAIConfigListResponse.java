// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAIConfigListResponseBody body;

    public static DescribeAIConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIConfigListResponse self = new DescribeAIConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIConfigListResponse setBody(DescribeAIConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIConfigListResponseBody getBody() {
        return this.body;
    }

}
