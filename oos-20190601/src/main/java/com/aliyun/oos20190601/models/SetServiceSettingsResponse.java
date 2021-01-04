// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetServiceSettingsResponseBody body;

    public static SetServiceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetServiceSettingsResponse self = new SetServiceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public SetServiceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetServiceSettingsResponse setBody(SetServiceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetServiceSettingsResponseBody getBody() {
        return this.body;
    }

}
