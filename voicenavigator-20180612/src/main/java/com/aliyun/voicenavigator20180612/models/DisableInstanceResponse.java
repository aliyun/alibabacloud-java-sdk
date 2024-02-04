// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DisableInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInstanceResponseBody body;

    public static DisableInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceResponse self = new DisableInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DisableInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInstanceResponse setBody(DisableInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInstanceResponseBody getBody() {
        return this.body;
    }

}
