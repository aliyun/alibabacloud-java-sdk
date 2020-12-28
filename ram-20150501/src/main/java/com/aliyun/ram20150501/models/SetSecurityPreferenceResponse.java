// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSecurityPreferenceResponseBody body;

    public static SetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceResponse self = new SetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSecurityPreferenceResponse setBody(SetSecurityPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

}
