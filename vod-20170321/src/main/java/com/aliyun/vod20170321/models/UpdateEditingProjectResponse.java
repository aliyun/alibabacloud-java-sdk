// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEditingProjectResponseBody body;

    public static UpdateEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectResponse self = new UpdateEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEditingProjectResponse setBody(UpdateEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEditingProjectResponseBody getBody() {
        return this.body;
    }

}
