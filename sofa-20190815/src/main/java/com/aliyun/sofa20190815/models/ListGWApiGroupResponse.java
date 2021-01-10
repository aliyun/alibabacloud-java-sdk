// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGWApiGroupResponseBody body;

    public static ListGWApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiGroupResponse self = new ListGWApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListGWApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGWApiGroupResponse setBody(ListGWApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGWApiGroupResponseBody getBody() {
        return this.body;
    }

}
