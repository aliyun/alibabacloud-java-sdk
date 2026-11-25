// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginConfigForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppPluginConfigForAdminResponseBody body;

    public static GetAppPluginConfigForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginConfigForAdminResponse self = new GetAppPluginConfigForAdminResponse();
        return TeaModel.build(map, self);
    }

    public GetAppPluginConfigForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPluginConfigForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppPluginConfigForAdminResponse setBody(GetAppPluginConfigForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppPluginConfigForAdminResponseBody getBody() {
        return this.body;
    }

}
