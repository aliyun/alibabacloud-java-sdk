// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteExtendServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteExtendServiceResponseBody body;

    public static ExecuteExtendServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteExtendServiceResponse self = new ExecuteExtendServiceResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteExtendServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteExtendServiceResponse setBody(ExecuteExtendServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteExtendServiceResponseBody getBody() {
        return this.body;
    }

}
