// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetServicerSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServicerSettingsResponseBody body;

    public static GetServicerSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServicerSettingsResponse self = new GetServicerSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetServicerSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServicerSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServicerSettingsResponse setBody(GetServicerSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServicerSettingsResponseBody getBody() {
        return this.body;
    }

}
