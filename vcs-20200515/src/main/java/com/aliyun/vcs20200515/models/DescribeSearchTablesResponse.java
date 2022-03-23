// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSearchTablesResponseBody body;

    public static DescribeSearchTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchTablesResponse self = new DescribeSearchTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchTablesResponse setBody(DescribeSearchTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchTablesResponseBody getBody() {
        return this.body;
    }

}
