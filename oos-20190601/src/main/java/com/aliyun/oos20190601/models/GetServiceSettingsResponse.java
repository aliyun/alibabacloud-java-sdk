// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetServiceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceSettingsResponseBody body;

    public static GetServiceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceSettingsResponse self = new GetServiceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceSettingsResponse setBody(GetServiceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceSettingsResponseBody getBody() {
        return this.body;
    }

}
