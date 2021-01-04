// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteACLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteACLResponseBody body;

    public static DeleteACLResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteACLResponse self = new DeleteACLResponse();
        return TeaModel.build(map, self);
    }

    public DeleteACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteACLResponse setBody(DeleteACLResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteACLResponseBody getBody() {
        return this.body;
    }

}
