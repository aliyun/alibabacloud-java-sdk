// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetGrantedRoleIdsByServicerIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGrantedRoleIdsByServicerIdResponseBody body;

    public static GetGrantedRoleIdsByServicerIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGrantedRoleIdsByServicerIdResponse self = new GetGrantedRoleIdsByServicerIdResponse();
        return TeaModel.build(map, self);
    }

    public GetGrantedRoleIdsByServicerIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGrantedRoleIdsByServicerIdResponse setBody(GetGrantedRoleIdsByServicerIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGrantedRoleIdsByServicerIdResponseBody getBody() {
        return this.body;
    }

}
