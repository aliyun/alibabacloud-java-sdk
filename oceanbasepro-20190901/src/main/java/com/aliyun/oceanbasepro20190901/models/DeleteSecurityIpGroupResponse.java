// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityIpGroupResponseBody body;

    public static DeleteSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIpGroupResponse self = new DeleteSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityIpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityIpGroupResponse setBody(DeleteSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
