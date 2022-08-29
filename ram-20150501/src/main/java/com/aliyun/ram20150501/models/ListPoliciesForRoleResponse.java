// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPoliciesForRoleResponseBody body;

    public static ListPoliciesForRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForRoleResponse self = new ListPoliciesForRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesForRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPoliciesForRoleResponse setBody(ListPoliciesForRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesForRoleResponseBody getBody() {
        return this.body;
    }

}
