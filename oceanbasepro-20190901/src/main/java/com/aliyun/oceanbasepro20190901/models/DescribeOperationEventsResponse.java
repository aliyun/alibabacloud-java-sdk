// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOperationEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOperationEventsResponseBody body;

    public static DescribeOperationEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationEventsResponse self = new DescribeOperationEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperationEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperationEventsResponse setBody(DescribeOperationEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperationEventsResponseBody getBody() {
        return this.body;
    }

}
