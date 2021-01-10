// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteHighPriorityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHighPriorityIpResponseBody body;

    public static DeleteHighPriorityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHighPriorityIpResponse self = new DeleteHighPriorityIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHighPriorityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHighPriorityIpResponse setBody(DeleteHighPriorityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHighPriorityIpResponseBody getBody() {
        return this.body;
    }

}
