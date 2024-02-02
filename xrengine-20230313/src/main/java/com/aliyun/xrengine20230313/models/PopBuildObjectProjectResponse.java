// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildObjectProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopBuildObjectProjectResponseBody body;

    public static PopBuildObjectProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildObjectProjectResponse self = new PopBuildObjectProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildObjectProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildObjectProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildObjectProjectResponse setBody(PopBuildObjectProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildObjectProjectResponseBody getBody() {
        return this.body;
    }

}
