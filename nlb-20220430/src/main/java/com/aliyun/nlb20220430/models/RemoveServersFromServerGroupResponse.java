// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveServersFromServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveServersFromServerGroupResponse setBody(RemoveServersFromServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveServersFromServerGroupResponseBody getBody() {
        return this.body;
    }

}
