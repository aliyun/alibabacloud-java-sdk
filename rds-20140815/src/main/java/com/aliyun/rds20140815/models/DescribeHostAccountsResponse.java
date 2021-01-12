// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostAccountsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostAccountsResponseBody body;

    public static DescribeHostAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAccountsResponse self = new DescribeHostAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostAccountsResponse setBody(DescribeHostAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostAccountsResponseBody getBody() {
        return this.body;
    }

}
