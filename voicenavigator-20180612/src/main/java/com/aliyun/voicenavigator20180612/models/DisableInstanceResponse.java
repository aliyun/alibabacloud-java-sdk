// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DisableInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableInstanceResponse setBody(DisableInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInstanceResponseBody getBody() {
        return this.body;
    }

}
