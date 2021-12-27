// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class InitUserAlertResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitUserAlertResourceResponseBody body;

    public static InitUserAlertResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitUserAlertResourceResponse self = new InitUserAlertResourceResponse();
        return TeaModel.build(map, self);
    }

    public InitUserAlertResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitUserAlertResourceResponse setBody(InitUserAlertResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitUserAlertResourceResponseBody getBody() {
        return this.body;
    }

}
