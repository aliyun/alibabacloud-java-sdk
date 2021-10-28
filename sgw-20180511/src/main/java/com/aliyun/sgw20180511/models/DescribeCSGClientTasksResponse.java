// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCSGClientTasksResponseBody body;

    public static DescribeCSGClientTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientTasksResponse self = new DescribeCSGClientTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCSGClientTasksResponse setBody(DescribeCSGClientTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCSGClientTasksResponseBody getBody() {
        return this.body;
    }

}
