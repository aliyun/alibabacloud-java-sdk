// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableRightsSeparationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DisableRightsSeparationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableRightsSeparationResponse setBody(DisableRightsSeparationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRightsSeparationResponseBody getBody() {
        return this.body;
    }

}
