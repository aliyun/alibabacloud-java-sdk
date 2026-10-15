// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppPluginResponseBody body;

    public static GetAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginResponse self = new GetAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public GetAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppPluginResponse setBody(GetAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppPluginResponseBody getBody() {
        return this.body;
    }

}
