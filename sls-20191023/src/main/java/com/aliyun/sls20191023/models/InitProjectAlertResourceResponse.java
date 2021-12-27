// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class InitProjectAlertResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitProjectAlertResourceResponseBody body;

    public static InitProjectAlertResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitProjectAlertResourceResponse self = new InitProjectAlertResourceResponse();
        return TeaModel.build(map, self);
    }

    public InitProjectAlertResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitProjectAlertResourceResponse setBody(InitProjectAlertResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitProjectAlertResourceResponseBody getBody() {
        return this.body;
    }

}
