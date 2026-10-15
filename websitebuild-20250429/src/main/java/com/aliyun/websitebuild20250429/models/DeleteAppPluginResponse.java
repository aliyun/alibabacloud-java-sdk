// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppPluginResponseBody body;

    public static DeleteAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppPluginResponse self = new DeleteAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppPluginResponse setBody(DeleteAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppPluginResponseBody getBody() {
        return this.body;
    }

}
