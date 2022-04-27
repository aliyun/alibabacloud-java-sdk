// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServerGroupServersResponseBody body;

    public static ListServerGroupServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersResponse self = new ListServerGroupServersResponse();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerGroupServersResponse setBody(ListServerGroupServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerGroupServersResponseBody getBody() {
        return this.body;
    }

}
