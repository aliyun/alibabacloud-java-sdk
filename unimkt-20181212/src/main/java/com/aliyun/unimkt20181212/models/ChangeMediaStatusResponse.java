// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeMediaStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeMediaStatusResponseBody body;

    public static ChangeMediaStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMediaStatusResponse self = new ChangeMediaStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMediaStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMediaStatusResponse setBody(ChangeMediaStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMediaStatusResponseBody getBody() {
        return this.body;
    }

}
