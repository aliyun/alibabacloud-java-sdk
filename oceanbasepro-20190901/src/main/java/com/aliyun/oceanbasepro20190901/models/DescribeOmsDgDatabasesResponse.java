// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsDgDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsDgDatabasesResponseBody body;

    public static DescribeOmsDgDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsDgDatabasesResponse self = new DescribeOmsDgDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsDgDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsDgDatabasesResponse setBody(DescribeOmsDgDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsDgDatabasesResponseBody getBody() {
        return this.body;
    }

}
