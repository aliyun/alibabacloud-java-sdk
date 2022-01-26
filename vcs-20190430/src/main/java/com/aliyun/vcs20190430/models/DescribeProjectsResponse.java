// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectsResponseBody body;

    public static DescribeProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectsResponse self = new DescribeProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectsResponse setBody(DescribeProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectsResponseBody getBody() {
        return this.body;
    }

}
