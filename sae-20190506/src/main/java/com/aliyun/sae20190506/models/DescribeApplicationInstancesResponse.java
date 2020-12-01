// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationInstancesResponseBody body;

    public static DescribeApplicationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesResponse self = new DescribeApplicationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationInstancesResponse setBody(DescribeApplicationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationInstancesResponseBody getBody() {
        return this.body;
    }

}
