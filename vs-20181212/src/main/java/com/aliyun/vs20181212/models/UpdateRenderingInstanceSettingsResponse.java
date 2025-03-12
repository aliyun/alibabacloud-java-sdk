// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRenderingInstanceSettingsResponseBody body;

    public static UpdateRenderingInstanceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceSettingsResponse self = new UpdateRenderingInstanceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRenderingInstanceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRenderingInstanceSettingsResponse setBody(UpdateRenderingInstanceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRenderingInstanceSettingsResponseBody getBody() {
        return this.body;
    }

}
