// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableRightsSeparationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableRightsSeparationResponseBody body;

    public static EnableRightsSeparationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRightsSeparationResponse self = new EnableRightsSeparationResponse();
        return TeaModel.build(map, self);
    }

    public EnableRightsSeparationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRightsSeparationResponse setBody(EnableRightsSeparationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRightsSeparationResponseBody getBody() {
        return this.body;
    }

}
