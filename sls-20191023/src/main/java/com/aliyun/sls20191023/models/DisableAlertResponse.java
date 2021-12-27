// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DisableAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAlertResponseBody body;

    public static DisableAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAlertResponse self = new DisableAlertResponse();
        return TeaModel.build(map, self);
    }

    public DisableAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAlertResponse setBody(DisableAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAlertResponseBody getBody() {
        return this.body;
    }

}
