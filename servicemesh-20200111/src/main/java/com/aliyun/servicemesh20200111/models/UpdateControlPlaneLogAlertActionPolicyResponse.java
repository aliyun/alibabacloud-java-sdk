// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogAlertActionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateControlPlaneLogAlertActionPolicyResponseBody body;

    public static UpdateControlPlaneLogAlertActionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogAlertActionPolicyResponse self = new UpdateControlPlaneLogAlertActionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogAlertActionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateControlPlaneLogAlertActionPolicyResponse setBody(UpdateControlPlaneLogAlertActionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateControlPlaneLogAlertActionPolicyResponseBody getBody() {
        return this.body;
    }

}
