// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationRolesResponseBody body;

    public static ListOrganizationRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRolesResponse self = new ListOrganizationRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationRolesResponse setBody(ListOrganizationRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationRolesResponseBody getBody() {
        return this.body;
    }

}
