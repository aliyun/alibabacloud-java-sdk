// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEditingProjectResponseBody body;

    public static AddEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectResponse self = new AddEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEditingProjectResponse setBody(AddEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEditingProjectResponseBody getBody() {
        return this.body;
    }

}
