// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupResponseBody body;

    public static DescribeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupResponse self = new DescribeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupResponse setBody(DescribeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupResponseBody getBody() {
        return this.body;
    }

}
