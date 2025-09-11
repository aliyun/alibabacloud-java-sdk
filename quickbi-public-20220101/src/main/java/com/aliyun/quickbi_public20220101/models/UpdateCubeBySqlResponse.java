// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateCubeBySqlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCubeBySqlResponseBody body;

    public static UpdateCubeBySqlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCubeBySqlResponse self = new UpdateCubeBySqlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCubeBySqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCubeBySqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCubeBySqlResponse setBody(UpdateCubeBySqlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCubeBySqlResponseBody getBody() {
        return this.body;
    }

}
