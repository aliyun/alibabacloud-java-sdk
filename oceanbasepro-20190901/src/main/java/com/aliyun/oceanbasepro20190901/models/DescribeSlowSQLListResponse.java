// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowSQLListResponseBody body;

    public static DescribeSlowSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLListResponse self = new DescribeSlowSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowSQLListResponse setBody(DescribeSlowSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowSQLListResponseBody getBody() {
        return this.body;
    }

}
