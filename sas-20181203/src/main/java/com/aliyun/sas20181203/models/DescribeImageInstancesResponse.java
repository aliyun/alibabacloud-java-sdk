// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageInstancesResponseBody body;

    public static DescribeImageInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInstancesResponse self = new DescribeImageInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageInstancesResponse setBody(DescribeImageInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageInstancesResponseBody getBody() {
        return this.body;
    }

}
