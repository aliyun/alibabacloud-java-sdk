// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ChangeVisibilityModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeVisibilityModelResponseBody body;

    public static ChangeVisibilityModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityModelResponse self = new ChangeVisibilityModelResponse();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeVisibilityModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeVisibilityModelResponse setBody(ChangeVisibilityModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeVisibilityModelResponseBody getBody() {
        return this.body;
    }

}
