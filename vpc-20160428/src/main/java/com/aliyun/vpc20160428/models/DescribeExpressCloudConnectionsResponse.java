// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressCloudConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExpressCloudConnectionsResponseBody body;

    public static DescribeExpressCloudConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressCloudConnectionsResponse self = new DescribeExpressCloudConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressCloudConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressCloudConnectionsResponse setBody(DescribeExpressCloudConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressCloudConnectionsResponseBody getBody() {
        return this.body;
    }

}
