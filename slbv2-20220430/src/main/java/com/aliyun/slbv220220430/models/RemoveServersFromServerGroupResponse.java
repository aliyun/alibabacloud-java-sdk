// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveServersFromServerGroupResponseBody body;

    public static RemoveServersFromServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupResponse self = new RemoveServersFromServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveServersFromServerGroupResponse setBody(RemoveServersFromServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveServersFromServerGroupResponseBody getBody() {
        return this.body;
    }

}
