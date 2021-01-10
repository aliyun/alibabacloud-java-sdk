// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgFaultToleranceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgFaultToleranceResponseBody body;

    public static AddMsSgFaultToleranceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgFaultToleranceResponse self = new AddMsSgFaultToleranceResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgFaultToleranceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgFaultToleranceResponse setBody(AddMsSgFaultToleranceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgFaultToleranceResponseBody getBody() {
        return this.body;
    }

}
