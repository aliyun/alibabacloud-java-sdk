// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeNvrsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNvrsResponseBody body;

    public static DescribeNvrsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNvrsResponse self = new DescribeNvrsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNvrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNvrsResponse setBody(DescribeNvrsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNvrsResponseBody getBody() {
        return this.body;
    }

}
