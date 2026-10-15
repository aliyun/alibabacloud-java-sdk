// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppPluginResponseBody body;

    public static UpdateAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPluginResponse self = new UpdateAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppPluginResponse setBody(UpdateAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppPluginResponseBody getBody() {
        return this.body;
    }

}
