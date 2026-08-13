// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GrantAgentUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantAgentUsersResponseBody body;

    public static GrantAgentUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAgentUsersResponse self = new GrantAgentUsersResponse();
        return TeaModel.build(map, self);
    }

    public GrantAgentUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantAgentUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantAgentUsersResponse setBody(GrantAgentUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantAgentUsersResponseBody getBody() {
        return this.body;
    }

}
