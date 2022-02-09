// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopSQLListResponseBody body;

    public static DescribeTopSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopSQLListResponse self = new DescribeTopSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopSQLListResponse setBody(DescribeTopSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopSQLListResponseBody getBody() {
        return this.body;
    }

}
