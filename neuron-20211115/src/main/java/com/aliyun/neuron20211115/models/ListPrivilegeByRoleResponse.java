// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPrivilegeByRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PrivilegePageResult body;

    public static ListPrivilegeByRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegeByRoleResponse self = new ListPrivilegeByRoleResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivilegeByRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivilegeByRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivilegeByRoleResponse setBody(PrivilegePageResult body) {
        this.body = body;
        return this;
    }
    public PrivilegePageResult getBody() {
        return this.body;
    }

}
