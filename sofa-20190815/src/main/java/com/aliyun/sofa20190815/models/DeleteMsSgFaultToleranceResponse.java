// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgFaultToleranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgFaultToleranceResponseBody body;

    public static DeleteMsSgFaultToleranceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgFaultToleranceResponse self = new DeleteMsSgFaultToleranceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgFaultToleranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgFaultToleranceResponse setBody(DeleteMsSgFaultToleranceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgFaultToleranceResponseBody getBody() {
        return this.body;
    }

}
