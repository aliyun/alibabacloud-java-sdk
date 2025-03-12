// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRenderingInstanceSettingsResponseBody body;

    public static DeleteRenderingInstanceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceSettingsResponse self = new DeleteRenderingInstanceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingInstanceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRenderingInstanceSettingsResponse setBody(DeleteRenderingInstanceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingInstanceSettingsResponseBody getBody() {
        return this.body;
    }

}
