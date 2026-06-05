// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CopyAppPluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyAppPluginConfigResponseBody body;

    public static CopyAppPluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyAppPluginConfigResponse self = new CopyAppPluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyAppPluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyAppPluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyAppPluginConfigResponse setBody(CopyAppPluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyAppPluginConfigResponseBody getBody() {
        return this.body;
    }

}
