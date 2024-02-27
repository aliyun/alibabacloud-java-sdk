// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserGroupMemberResponseBody body;

    public static AddUserGroupMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberResponse self = new AddUserGroupMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserGroupMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserGroupMemberResponse setBody(AddUserGroupMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserGroupMemberResponseBody getBody() {
        return this.body;
    }

}
