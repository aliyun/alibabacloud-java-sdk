// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPURuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMPURuleResponseBody body;

    public static DeleteMPURuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPURuleResponse self = new DeleteMPURuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMPURuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMPURuleResponse setBody(DeleteMPURuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMPURuleResponseBody getBody() {
        return this.body;
    }

}
