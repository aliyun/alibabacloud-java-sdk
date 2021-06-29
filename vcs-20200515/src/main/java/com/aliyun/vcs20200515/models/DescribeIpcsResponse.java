// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeIpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpcsResponseBody body;

    public static DescribeIpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpcsResponse self = new DescribeIpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpcsResponse setBody(DescribeIpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpcsResponseBody getBody() {
        return this.body;
    }

}
