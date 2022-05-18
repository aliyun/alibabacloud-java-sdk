// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetGrantedRoleIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGrantedRoleIdsResponseBody body;

    public static GetGrantedRoleIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrantedRoleIdsResponse self = new GetGrantedRoleIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetGrantedRoleIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGrantedRoleIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGrantedRoleIdsResponse setBody(GetGrantedRoleIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGrantedRoleIdsResponseBody getBody() {
        return this.body;
    }

}
