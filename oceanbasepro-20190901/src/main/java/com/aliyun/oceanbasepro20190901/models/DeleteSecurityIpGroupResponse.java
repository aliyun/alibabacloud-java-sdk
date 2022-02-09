// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteSecurityIpGroupResponse setBody(DeleteSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
