// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterGrafanaResponseBody body;

    public static DescribeClusterGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaResponse self = new DescribeClusterGrafanaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterGrafanaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterGrafanaResponse setBody(DescribeClusterGrafanaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterGrafanaResponseBody getBody() {
        return this.body;
    }

}
