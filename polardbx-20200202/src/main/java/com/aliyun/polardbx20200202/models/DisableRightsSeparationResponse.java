// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableRightsSeparationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableRightsSeparationResponseBody body;

    public static DisableRightsSeparationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableRightsSeparationResponse self = new DisableRightsSeparationResponse();
        return TeaModel.build(map, self);
    }

    public DisableRightsSeparationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableRightsSeparationResponse setBody(DisableRightsSeparationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRightsSeparationResponseBody getBody() {
        return this.body;
    }

}
