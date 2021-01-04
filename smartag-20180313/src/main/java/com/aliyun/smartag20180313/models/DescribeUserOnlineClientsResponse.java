// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserOnlineClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserOnlineClientsResponseBody body;

    public static DescribeUserOnlineClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserOnlineClientsResponse self = new DescribeUserOnlineClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserOnlineClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserOnlineClientsResponse setBody(DescribeUserOnlineClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserOnlineClientsResponseBody getBody() {
        return this.body;
    }

}
