// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttribueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAttribueResponseBody body;

    public static DescribeInstanceAttribueResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttribueResponse self = new DescribeInstanceAttribueResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttribueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAttribueResponse setBody(DescribeInstanceAttribueResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAttribueResponseBody getBody() {
        return this.body;
    }

}
