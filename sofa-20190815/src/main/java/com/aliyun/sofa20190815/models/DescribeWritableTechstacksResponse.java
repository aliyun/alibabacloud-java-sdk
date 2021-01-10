// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWritableTechstacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWritableTechstacksResponseBody body;

    public static DescribeWritableTechstacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWritableTechstacksResponse self = new DescribeWritableTechstacksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWritableTechstacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWritableTechstacksResponse setBody(DescribeWritableTechstacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWritableTechstacksResponseBody getBody() {
        return this.body;
    }

}
