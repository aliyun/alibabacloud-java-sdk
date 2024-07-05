// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRenderingInstanceConfigurationResponseBody body;

    public static UpdateRenderingInstanceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceConfigurationResponse self = new UpdateRenderingInstanceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRenderingInstanceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRenderingInstanceConfigurationResponse setBody(UpdateRenderingInstanceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRenderingInstanceConfigurationResponseBody getBody() {
        return this.body;
    }

}
