// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RevokeAgentUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeAgentUsersResponseBody body;

    public static RevokeAgentUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAgentUsersResponse self = new RevokeAgentUsersResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAgentUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAgentUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeAgentUsersResponse setBody(RevokeAgentUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeAgentUsersResponseBody getBody() {
        return this.body;
    }

}
