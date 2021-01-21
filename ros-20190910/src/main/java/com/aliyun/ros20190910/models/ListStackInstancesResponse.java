// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStackInstancesResponseBody body;

    public static ListStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponse self = new ListStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackInstancesResponse setBody(ListStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackInstancesResponseBody getBody() {
        return this.body;
    }

}
