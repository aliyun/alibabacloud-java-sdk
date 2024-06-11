// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetSecurityPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSecurityPreferenceResponse setBody(SetSecurityPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

}
