// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class EnableControlPlaneLogAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableControlPlaneLogAlertResponseBody body;

    public static EnableControlPlaneLogAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableControlPlaneLogAlertResponse self = new EnableControlPlaneLogAlertResponse();
        return TeaModel.build(map, self);
    }

    public EnableControlPlaneLogAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableControlPlaneLogAlertResponse setBody(EnableControlPlaneLogAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableControlPlaneLogAlertResponseBody getBody() {
        return this.body;
    }

}
