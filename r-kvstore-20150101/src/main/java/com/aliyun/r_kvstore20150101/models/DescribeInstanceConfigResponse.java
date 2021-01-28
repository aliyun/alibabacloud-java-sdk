// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceConfigResponseBody body;

    public static DescribeInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponse self = new DescribeInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceConfigResponse setBody(DescribeInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
