// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStackGroupOperationsResponseBody body;

    public static ListStackGroupOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponse self = new ListStackGroupOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackGroupOperationsResponse setBody(ListStackGroupOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupOperationsResponseBody getBody() {
        return this.body;
    }

}
