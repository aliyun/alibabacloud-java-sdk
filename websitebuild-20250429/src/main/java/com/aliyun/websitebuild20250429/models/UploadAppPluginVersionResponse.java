// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadAppPluginVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAppPluginVersionResponseBody body;

    public static UploadAppPluginVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAppPluginVersionResponse self = new UploadAppPluginVersionResponse();
        return TeaModel.build(map, self);
    }

    public UploadAppPluginVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAppPluginVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAppPluginVersionResponse setBody(UploadAppPluginVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAppPluginVersionResponseBody getBody() {
        return this.body;
    }

}
