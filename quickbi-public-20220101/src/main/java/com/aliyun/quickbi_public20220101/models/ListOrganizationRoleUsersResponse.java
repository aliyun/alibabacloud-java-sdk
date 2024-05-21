// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRoleUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationRoleUsersResponseBody body;

    public static ListOrganizationRoleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRoleUsersResponse self = new ListOrganizationRoleUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRoleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationRoleUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationRoleUsersResponse setBody(ListOrganizationRoleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationRoleUsersResponseBody getBody() {
        return this.body;
    }

}
