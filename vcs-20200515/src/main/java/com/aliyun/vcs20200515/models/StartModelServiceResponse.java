// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartModelServiceResponseBody body;

    public static StartModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartModelServiceResponse self = new StartModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartModelServiceResponse setBody(StartModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartModelServiceResponseBody getBody() {
        return this.body;
    }

}
