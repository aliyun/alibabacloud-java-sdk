// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeAsyncTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAsyncTaskStatusResponseBody body;

    public static DescribeAsyncTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTaskStatusResponse self = new DescribeAsyncTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAsyncTaskStatusResponse setBody(DescribeAsyncTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAsyncTaskStatusResponseBody getBody() {
        return this.body;
    }

}
