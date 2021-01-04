// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeACLsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeACLsResponseBody body;

    public static DescribeACLsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLsResponse self = new DescribeACLsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeACLsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeACLsResponse setBody(DescribeACLsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeACLsResponseBody getBody() {
        return this.body;
    }

}
