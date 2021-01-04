// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetServiceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetServiceSettingsResponse setBody(GetServiceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceSettingsResponseBody getBody() {
        return this.body;
    }

}
