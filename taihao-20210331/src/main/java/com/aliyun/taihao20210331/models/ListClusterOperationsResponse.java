// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationsResponseBody body;

    public static ListClusterOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationsResponse self = new ListClusterOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationsResponse setBody(ListClusterOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationsResponseBody getBody() {
        return this.body;
    }

}
