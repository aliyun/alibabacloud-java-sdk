// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgFaultToleranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgFaultToleranceResponseBody body;

    public static UpdateMsSgFaultToleranceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgFaultToleranceResponse self = new UpdateMsSgFaultToleranceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgFaultToleranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgFaultToleranceResponse setBody(UpdateMsSgFaultToleranceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgFaultToleranceResponseBody getBody() {
        return this.body;
    }

}
