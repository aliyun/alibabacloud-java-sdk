// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetServiceIdentityRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceIdentityRoleResponseBody body;

    public static GetServiceIdentityRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceIdentityRoleResponse self = new GetServiceIdentityRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceIdentityRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceIdentityRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceIdentityRoleResponse setBody(GetServiceIdentityRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceIdentityRoleResponseBody getBody() {
        return this.body;
    }

}
