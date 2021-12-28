// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DisableControlPlaneLogAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableControlPlaneLogAlertResponseBody body;

    public static DisableControlPlaneLogAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableControlPlaneLogAlertResponse self = new DisableControlPlaneLogAlertResponse();
        return TeaModel.build(map, self);
    }

    public DisableControlPlaneLogAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableControlPlaneLogAlertResponse setBody(DisableControlPlaneLogAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableControlPlaneLogAlertResponseBody getBody() {
        return this.body;
    }

}
