// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ApplySidecarCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplySidecarCertResponseBody body;

    public static ApplySidecarCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplySidecarCertResponse self = new ApplySidecarCertResponse();
        return TeaModel.build(map, self);
    }

    public ApplySidecarCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplySidecarCertResponse setBody(ApplySidecarCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplySidecarCertResponseBody getBody() {
        return this.body;
    }

}
