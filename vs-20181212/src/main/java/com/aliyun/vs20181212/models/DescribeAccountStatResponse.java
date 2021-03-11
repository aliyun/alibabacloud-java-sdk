// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountStatResponseBody body;

    public static DescribeAccountStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountStatResponse self = new DescribeAccountStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountStatResponse setBody(DescribeAccountStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountStatResponseBody getBody() {
        return this.body;
    }

}
