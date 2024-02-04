// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGlobalSecurityIPGroupResponseBody body;

    public static DeleteGlobalSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalSecurityIPGroupResponse self = new DeleteGlobalSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGlobalSecurityIPGroupResponse setBody(DeleteGlobalSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
