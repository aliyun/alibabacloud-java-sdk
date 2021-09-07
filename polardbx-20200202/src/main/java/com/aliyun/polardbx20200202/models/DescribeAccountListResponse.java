// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeAccountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountListResponseBody body;

    public static DescribeAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountListResponse self = new DescribeAccountListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountListResponse setBody(DescribeAccountListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountListResponseBody getBody() {
        return this.body;
    }

}
