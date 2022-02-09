// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagResourcesResponseBody body;

    public static DescribeTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesResponse self = new DescribeTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagResourcesResponse setBody(DescribeTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagResourcesResponseBody getBody() {
        return this.body;
    }

}
