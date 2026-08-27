// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserGroupMembersResponseBody body;

    public static RemoveUserGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMembersResponse self = new RemoveUserGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserGroupMembersResponse setBody(RemoveUserGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserGroupMembersResponseBody getBody() {
        return this.body;
    }

}
