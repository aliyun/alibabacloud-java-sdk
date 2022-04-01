// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOrdersResponseBody body;

    public static ListClusterOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOrdersResponse self = new ListClusterOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOrdersResponse setBody(ListClusterOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOrdersResponseBody getBody() {
        return this.body;
    }

}
