// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SetServiceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetServiceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetServiceSettingsResponse setBody(SetServiceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetServiceSettingsResponseBody getBody() {
        return this.body;
    }

}
