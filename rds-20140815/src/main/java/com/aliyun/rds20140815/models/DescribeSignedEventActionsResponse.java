// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSignedEventActionsResponseBody body;

    public static DescribeSignedEventActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsResponse self = new DescribeSignedEventActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSignedEventActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSignedEventActionsResponse setBody(DescribeSignedEventActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSignedEventActionsResponseBody getBody() {
        return this.body;
    }

}
