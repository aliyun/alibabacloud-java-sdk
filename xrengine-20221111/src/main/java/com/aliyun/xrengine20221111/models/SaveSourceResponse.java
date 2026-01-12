// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class SaveSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSourceResponseBody body;

    public static SaveSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSourceResponse self = new SaveSourceResponse();
        return TeaModel.build(map, self);
    }

    public SaveSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSourceResponse setBody(SaveSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSourceResponseBody getBody() {
        return this.body;
    }

}
