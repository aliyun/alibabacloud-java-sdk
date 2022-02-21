// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAIEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAIEventListResponseBody body;

    public static DescribeAIEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIEventListResponse self = new DescribeAIEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIEventListResponse setBody(DescribeAIEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIEventListResponseBody getBody() {
        return this.body;
    }

}
