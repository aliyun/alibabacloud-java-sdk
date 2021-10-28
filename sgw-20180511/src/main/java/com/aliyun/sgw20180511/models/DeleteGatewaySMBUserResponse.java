// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewaySMBUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewaySMBUserResponseBody body;

    public static DeleteGatewaySMBUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySMBUserResponse self = new DeleteGatewaySMBUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySMBUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewaySMBUserResponse setBody(DeleteGatewaySMBUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewaySMBUserResponseBody getBody() {
        return this.body;
    }

}
