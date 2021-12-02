// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVirtualPhysicalConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVirtualPhysicalConnectionsResponseBody body;

    public static ListVirtualPhysicalConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualPhysicalConnectionsResponse self = new ListVirtualPhysicalConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualPhysicalConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualPhysicalConnectionsResponse setBody(ListVirtualPhysicalConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualPhysicalConnectionsResponseBody getBody() {
        return this.body;
    }

}
