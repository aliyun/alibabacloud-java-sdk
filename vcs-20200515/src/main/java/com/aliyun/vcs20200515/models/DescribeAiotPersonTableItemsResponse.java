// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotPersonTableItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAiotPersonTableItemsResponseBody body;

    public static DescribeAiotPersonTableItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotPersonTableItemsResponse self = new DescribeAiotPersonTableItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiotPersonTableItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiotPersonTableItemsResponse setBody(DescribeAiotPersonTableItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiotPersonTableItemsResponseBody getBody() {
        return this.body;
    }

}
