// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRenderingInstanceConfigurationResponseBody body;

    public static DeleteRenderingInstanceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceConfigurationResponse self = new DeleteRenderingInstanceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRenderingInstanceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRenderingInstanceConfigurationResponse setBody(DeleteRenderingInstanceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRenderingInstanceConfigurationResponseBody getBody() {
        return this.body;
    }

}
