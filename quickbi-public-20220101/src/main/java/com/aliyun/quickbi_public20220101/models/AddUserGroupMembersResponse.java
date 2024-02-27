// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserGroupMembersResponseBody body;

    public static AddUserGroupMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMembersResponse self = new AddUserGroupMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserGroupMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserGroupMembersResponse setBody(AddUserGroupMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserGroupMembersResponseBody getBody() {
        return this.body;
    }

}
