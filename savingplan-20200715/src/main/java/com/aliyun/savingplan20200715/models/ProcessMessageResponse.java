// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class ProcessMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessMessageResponseBody body;

    public static ProcessMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessMessageResponse self = new ProcessMessageResponse();
        return TeaModel.build(map, self);
    }

    public ProcessMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessMessageResponse setBody(ProcessMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessMessageResponseBody getBody() {
        return this.body;
    }

}
