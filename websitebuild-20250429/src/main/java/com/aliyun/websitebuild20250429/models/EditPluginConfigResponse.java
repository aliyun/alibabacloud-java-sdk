// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class EditPluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditPluginConfigResponseBody body;

    public static EditPluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        EditPluginConfigResponse self = new EditPluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public EditPluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditPluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditPluginConfigResponse setBody(EditPluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public EditPluginConfigResponseBody getBody() {
        return this.body;
    }

}
