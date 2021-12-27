// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class EnableAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAlertResponseBody body;

    public static EnableAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAlertResponse self = new EnableAlertResponse();
        return TeaModel.build(map, self);
    }

    public EnableAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAlertResponse setBody(EnableAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAlertResponseBody getBody() {
        return this.body;
    }

}
