// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StartNotaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartNotaryResponseBody body;

    public static StartNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNotaryResponse self = new StartNotaryResponse();
        return TeaModel.build(map, self);
    }

    public StartNotaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNotaryResponse setBody(StartNotaryResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNotaryResponseBody getBody() {
        return this.body;
    }

}
