// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSourcesResponseBody body;

    public static DescribeDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcesResponse self = new DescribeDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourcesResponse setBody(DescribeDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourcesResponseBody getBody() {
        return this.body;
    }

}
