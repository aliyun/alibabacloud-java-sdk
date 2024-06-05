// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BaseRoleMemberResponse body;

    public static ListIdentityRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityRoleResponse self = new ListIdentityRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityRoleResponse setBody(BaseRoleMemberResponse body) {
        this.body = body;
        return this;
    }
    public BaseRoleMemberResponse getBody() {
        return this.body;
    }

}
