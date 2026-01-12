// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class SaveArEditProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveArEditProjectResponseBody body;

    public static SaveArEditProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveArEditProjectResponse self = new SaveArEditProjectResponse();
        return TeaModel.build(map, self);
    }

    public SaveArEditProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveArEditProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveArEditProjectResponse setBody(SaveArEditProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveArEditProjectResponseBody getBody() {
        return this.body;
    }

}
