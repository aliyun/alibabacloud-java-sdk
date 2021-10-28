// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCSGClientsResponseBody body;

    public static DescribeCSGClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientsResponse self = new DescribeCSGClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCSGClientsResponse setBody(DescribeCSGClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCSGClientsResponseBody getBody() {
        return this.body;
    }

}
