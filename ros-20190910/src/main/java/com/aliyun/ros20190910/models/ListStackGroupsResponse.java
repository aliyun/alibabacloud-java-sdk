// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStackGroupsResponseBody body;

    public static ListStackGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponse self = new ListStackGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackGroupsResponse setBody(ListStackGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupsResponseBody getBody() {
        return this.body;
    }

}
