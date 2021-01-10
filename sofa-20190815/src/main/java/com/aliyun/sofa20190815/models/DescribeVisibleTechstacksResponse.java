// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeVisibleTechstacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVisibleTechstacksResponseBody body;

    public static DescribeVisibleTechstacksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisibleTechstacksResponse self = new DescribeVisibleTechstacksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVisibleTechstacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVisibleTechstacksResponse setBody(DescribeVisibleTechstacksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVisibleTechstacksResponseBody getBody() {
        return this.body;
    }

}
