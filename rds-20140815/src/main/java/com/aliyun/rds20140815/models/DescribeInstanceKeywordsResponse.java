// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceKeywordsResponseBody body;

    public static DescribeInstanceKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeywordsResponse self = new DescribeInstanceKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceKeywordsResponse setBody(DescribeInstanceKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceKeywordsResponseBody getBody() {
        return this.body;
    }

}
